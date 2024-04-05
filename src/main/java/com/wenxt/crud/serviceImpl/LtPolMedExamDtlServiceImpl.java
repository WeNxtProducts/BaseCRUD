package com.wenxt.crud.serviceImpl;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.List;
import java.util.Optional;

import org.json.JSONObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

import com.wenxt.crud.model.LT_POL_MED_EXAM_DTL;
import com.wenxt.crud.reposistory.LtPolMedExamDtlRepository;
import com.wenxt.crud.service.LtPolMedExamDtlsService;

@Service
public class LtPolMedExamDtlServiceImpl implements LtPolMedExamDtlsService {

	@Autowired
	private LtPolMedExamDtlRepository medexamrepo;

	private static final String JDBC_URL = "jdbc:mysql://baseapi.cr4u8emg2x3o.eu-north-1.rds.amazonaws.com:3306/baseapi";
	private static final String USERNAME = "admin";
	private static final String PASSWORD = "D3Vt3aM#92";

	@Value("${insert.message.ltpolmedExamdtl}")
	private String getallpolmedExamdtl;

	@Override
	public String createMedExamDtl(LT_POL_MED_EXAM_DTL medExamDtl) {
		if (medexamrepo.existsById(medExamDtl.getPMED_TRAN_ID())) {
			medexamrepo.save(medExamDtl);
			return "pol med exam details updated successfully";
		} else {
			medexamrepo.save(medExamDtl);
			return "pol med exam details created successfully";
		}
	}

	@Override
	public String getAllMedExamDtlList() throws SQLException {
		String query = "SELECT PMED_TRAN_ID,PMED_POL_TRAN_ID,PMED_END_NO_IDX,PMED_POAD_TRAN_ID,PMED_EXAM_CODE,PMED_STATUS,PMED_CR_DT,PMED_CR_UID,PMED_UPD_DT,PMED_UPD_UID,PMED_CLINIC_CODE,PMED_PVT_LC_AMT,PMED_GOVT_LC_AMT,PMED_REP_REC_DT,PMED_DEL_FLAG,PMED_INVOICE_NO,PMED_MEDICAL_FEES,PMED_MEDICAL_RESULT,PMED_FLEX_01,PMED_FLEX_02,PMED_FLEX_03,PMED_FLEX_04,PMED_FLEX_05,PMED_FLEX_06,PMED_FLEX_07,PMED_FLEX_08,PMED_FLEX_09,PMED_FLEX_10,PMED_FLEX_11,PMED_FLEX_12,PMED_FLEX_13,PMED_FLEX_14,PMED_FLEX_15,PMED_FLEX_16,PMED_FLEX_17,PMED_FLEX_18,PMED_FLEX_19,PMED_FLEX_20,PMED_FLEX_21,PMED_FLEX_22,PMED_FLEX_23,PMED_FLEX_24,PMED_FLEX_25,PMED_FLEX_26,PMED_FLEX_27,PMED_FLEX_28,PMED_FLEX_29,PMED_FLEX_30,PMED_EXAM_DT,PMED_EXM_DN_DT,PMED_REFER_PROP_NO FROM lt_pol_med_exam_dtl";

		ResultSet headerResultSet = executeQuery(query);

		JSONObject header = new JSONObject();
		ResultSetMetaData rsmd = headerResultSet.getMetaData();
		int columnCount = rsmd.getColumnCount();
		for (int i = 1; i <= columnCount; i++) {
			String columnName = rsmd.getColumnName(i);
			header.put(columnName, columnName);
		}

		List<LT_POL_MED_EXAM_DTL> exceptions = medexamrepo.findAll();

		JSONObject response = new JSONObject();
		response.put("Status", "SUCCESS");
		response.put("Message", getallpolmedExamdtl);
		response.put("Heading", header);
		response.put("Data", exceptions);

		return response.toString();
	}

	private ResultSet executeQuery(String query) throws SQLException {
		try {
			// Load the MySQL JDBC driver
			Class.forName("com.mysql.cj.jdbc.Driver");
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}

		// Establish a connection
		Connection connection = DriverManager.getConnection(JDBC_URL, USERNAME, PASSWORD);

		// Create a statement
		Statement statement = connection.createStatement();

		// Execute the query and return the result set
		return statement.executeQuery(query);
	}

	@Override
	public String getMedExamDtlById(Long pMED_TRAN_ID) {

		LT_POL_MED_EXAM_DTL poldisc = medexamrepo.findById(pMED_TRAN_ID)
				.orElseThrow(() -> new RuntimeException("POL MED EXAM DTL not found"));

		JSONObject response = new JSONObject(poldisc);

		response.put("Status", "SUCCESS");
		response.put("Message", "Record with ID " + pMED_TRAN_ID + " retrived successfully");
		return response.toString();

	}

	@Override
	public String deleteMedExamDtlById(Long pMED_TRAN_ID) {
		try {
			Optional<LT_POL_MED_EXAM_DTL> optionalEntity = medexamrepo.findById(pMED_TRAN_ID);

			if (optionalEntity.isPresent()) {
				medexamrepo.deleteById(pMED_TRAN_ID);

				JSONObject response = new JSONObject();
				response.put("Status", "SUCCESS");
				response.put("Message", "Record with ID " + pMED_TRAN_ID + " deleted successfully");
				return response.toString();

			} else {
				JSONObject response = new JSONObject();
				response.put("Status", "ERROR");
				response.put("Message", "Record with ID " + pMED_TRAN_ID + " not found");
				return response.toString();
			}
		} catch (Exception e) {
			JSONObject response = new JSONObject();
			response.put("Status", "ERROR");
			response.put("Message", "Error deleting record with ID " + pMED_TRAN_ID + ": " + e.getMessage());
			return response.toString();
		}

	}

}
