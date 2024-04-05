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

import com.wenxt.crud.model.LT_POL_ASSRD_DET;
import com.wenxt.crud.reposistory.LtPlAssrdDetReposistory;
import com.wenxt.crud.service.LtPlAssrdDetService;

@Service
public class LtPlAssrdDetServiceImpl implements LtPlAssrdDetService {

	@Autowired
	private LtPlAssrdDetReposistory ltpolrepo;

	private static final String JDBC_URL = "jdbc:mysql://baseapi.cr4u8emg2x3o.eu-north-1.rds.amazonaws.com:3306/baseapi";
	private static final String USERNAME = "admin";
	private static final String PASSWORD = "D3Vt3aM#92";

	@Value("${insert.message.ltpol}")
	private String getallltpol;

	@Override
	public String createLtpolAssrd(LT_POL_ASSRD_DET ltpolAssrdDet) {

		if (ltpolrepo.existsById(ltpolAssrdDet.getPadTranId())) {
			ltpolrepo.save(ltpolAssrdDet);
			return "lt pol assrd details updated successfully";
		} else {
			ltpolrepo.save(ltpolAssrdDet);
			return "lt pol assrd details created successfully";
		}
	}

	@Override
	public String getAllLtPlAssrdDet() throws SQLException {
		String query = "SELECT PAD_TRAN_ID, PAD_POL_TRAN_ID, PAD_SERIAL_NO, PAD_ASSR_CODE, PAD_ASSURED_NAME, PAD_BIRTH_PLACE, PAD_DOB, PAD_AGE, PAD_GENDER, PAD_MAR_STATUS, PAD_NATIONALITY, PAD_OCC_CODE, PAD_NATURE_OF_WORK, PAD_HEALTH_CODE, PAD_REMARKS, PAD_INS_DT, PAD_INS_ID, PAD_MOD_DT, PAD_MOD_UID, PAD_FC_SUM_ASSURED, PAD_LC_SUM_ASSURED, PAD_HEALTH_RATE, PAD_HEIGHT, PAD_WEIGHT, PAD_DISC_AGE, PAD_AGE_PROOF_FLAG, PAD_AGE_PROOF_OTHERS, PAD_UNIQ_ID1, PAD_UNIQ_ID2, PAD_OCC_CLASS, PAD_BMI, PAD_RACE, PAD_LC_THRESHOLD_LMT, PAD_ORG_LC_THRESHOLD_LMT, PAD_RELIGION_CODE, PAD_TYPE, PAD_HEIGHT_UNIT, PAD_WEIGHT_UNIT, PAD_FC_SALARY, PAD_LC_SALARY, PAD_SMOKE_YN, PAD_NO_OF_CIGAR, PAD_RELATION_CODE, PAD_POL_OWNER_YN, PAD_ALCHOHALIC_YN, PAD_ALCOHOL_QUAN, PAD_AGE_ADMITTED, PAD_BPL, PAD_BPH, PAD_HIV_TEST_YN, PAD_PREGNENT_YN, PAD_FAMILY_YN, PAD_OCC_YN FROM lt_pol_assrd_det";

		ResultSet headerResultSet = executeQuery(query);

		JSONObject header = new JSONObject();

		ResultSetMetaData rsmd = headerResultSet.getMetaData();
		int columnCount = rsmd.getColumnCount();

		for (int i = 1; i <= columnCount; i++) {
			String columnName = rsmd.getColumnName(i);
			header.put(columnName, columnName);
		}

		List<LT_POL_ASSRD_DET> exceptions = ltpolrepo.findAll();

		JSONObject response = new JSONObject();
		response.put("Status", "SUCCESS");
		response.put("Message", getallltpol);
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
	public String deleteLtPolAssrd(Long padTranId) {

		try {
			Optional<LT_POL_ASSRD_DET> optionalEntity = ltpolrepo.findById(padTranId);

			if (optionalEntity.isPresent()) {
				ltpolrepo.deleteById(padTranId);

				JSONObject response = new JSONObject();
				response.put("Status", "SUCCESS");
				response.put("Message", "Record with ID " + padTranId + " deleted successfully");
				return response.toString();
			} else {
				JSONObject response = new JSONObject();
				response.put("Status", "ERROR");
				response.put("Message", "Record with ID " + padTranId + " not found");
				return response.toString();
			}
		} catch (Exception e) {
			JSONObject response = new JSONObject();
			response.put("Status", "ERROR");
			response.put("Message", "Error deleting record with ID " + padTranId + ": " + e.getMessage());
			return response.toString();
		}

	}

	@Override
	public String getLlPolassrdDtlUserById(Long padTranId) {
		LT_POL_ASSRD_DET lmPolArrdDtl = ltpolrepo.findById(padTranId)
				.orElseThrow(() -> new RuntimeException("Lt POL ASRRD TRAN ID not found"));

		JSONObject response = new JSONObject(lmPolArrdDtl);

		response.put("Status", "SUCCESS");
		response.put("Message", "Record with ID " + padTranId + " retrived successfully");
		return response.toString();
	}

}
