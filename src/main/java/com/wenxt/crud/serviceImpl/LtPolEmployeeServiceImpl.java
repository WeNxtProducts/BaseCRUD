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

import com.wenxt.crud.model.LT_POL_EMPLOYEE;
import com.wenxt.crud.reposistory.LtPolEmployeeRepository;
import com.wenxt.crud.service.LtPolEmployeeService;

@Service
public class LtPolEmployeeServiceImpl implements LtPolEmployeeService {

	@Autowired
	private LtPolEmployeeRepository poldemprepo;

	private static final String JDBC_URL = "jdbc:mysql://baseapi.cr4u8emg2x3o.eu-north-1.rds.amazonaws.com:3306/baseapi";
	private static final String USERNAME = "admin";
	private static final String PASSWORD = "D3Vt3aM#92";

	@Value("${insert.message.ltpolemployee}")
	private String getallltpolemployee;

	@Override
	public String createPolemployee(LT_POL_EMPLOYEE polemployee) {

		if (poldemprepo.existsById(polemployee.getPempTranId())) {
			poldemprepo.save(polemployee);
			return "polemployee updated successfully";
		} else {
			poldemprepo.save(polemployee);
			return "polemployee created successfully";
		}

	}

	@Override
	public String getAllPolemployeeList() throws SQLException {
		String query = "SELECT PEMP_TRAN_ID, PEMP_POL_TRAN_ID, PEMP_ID, PEMP_NAME, PEMP_OCC_CATG, PEMP_CATG_CODE, PEMP_DOB, PEMP_ANB, PEMP_ENTRY_DT, PEMP_EXIT_DT, PEMP_FC_SALARY, PEMP_LC_SALARY, PEMP_FC_ANNUAL_SALARY, PEMP_LC_ANNUAL_SALARY, PEMP_FC_SA, PEMP_LC_SA, PEMP_FC_PREM, PEMP_LC_PREM, PEMP_EXTRA_PREM_PERC, PEMP_FC_EXTRA_PREM, PEMP_LC_EXTRA_PREM, PEMP_ORG_FC_SALARY, PEMP_ORG_LC_SALARY, PEMP_ORG_FC_ANN_SAL, PEMP_ORG_LC_ANN_SAL, PEMP_ORG_FC_SA, PEMP_ORG_LC_SA, PEMP_ORG_FC_PREM, PEMP_ORG_LC_PREM, PEMP_ORG_FC_EXTRA_PREM, PEMP_ORG_LC_EXTRA_PREM, PEMP_DEL_FLAG, PEMP_INS_DT, PEMP_INS_ID, PEMP_MOD_DT, PEMP_MOD_ID, PEMP_MEDI_EXAM, PEMP_MED_CLASS_CODE, PEMP_TL_RATE, PEMP_ANC_CVR_RATE, PEMP_SA_DIFF_YN, PEMP_FC_ACTUAL_SA, PEMP_LC_ACTUAL_SA, PEMP_EMPLOYEE_YN, PEMP_EMP_ID, PEMP_EMP_SYS_ID, PEMP_OCC_CODE, PEMP_LOC_CODE, PEMP_RELN_CODE, PEMP_STATUS, PEMP_REF_ID1, PEMP_REF_ID2, PEMP_TAKE_OVER_FLAG, PEMP_LC_TAKE_OVER_FCL, PEMP_FC_CL_PREM, PEMP_LC_CL_PREM, PEMP_FC_TTY_PREM, PEMP_LC_TTY_PREM, PEMP_ORG_LC_TAKE_OVER_FCL, PEMP_ORG_FC_CL_PREM, PEMP_ORG_LC_CL_PREM, PEMP_ORG_FC_TTY_PREM, PEMP_ORG_LC_TTY_PREM, PEMP_REC_TYPE, PEMP_ORG_FC_ACTUAL_SA, PEMP_ORG_LC_ACTUAL_SA, PEMP_FC_RI_PREM, PEMP_LC_RI_PREM, PEMP_FC_RET_PREM, PEMP_LC_RET_PREM, PEMP_ORG_FC_RI_PREM, PEMP_ORG_LC_RI_PREM, PEMP_ORG_FC_RET_PREM, PEMP_ORG_LC_RET_PREM, PEMP_END_EFF_DT, PEMP_CVR_UPD_YN, PEMP_MARITAL_STATUS, PEMP_UW_REMARKS, PEMP_SPOUSE_YN, PEMP_CHILD_YN, PEMP_UPLOAD_YN, PEMP_PROFIT_RATE, PEMP_PROFIT_RATE_PER, PEMP_LOAN_TERM, PEMP_PLAN_CODE, PEMP_PARENT_ID, PEMP_MEMBER_TYPE, PEMP_NO_OF_DEP, PEMP_NO_OF_CHILD, PEMP_FLEX_02, PEMP_CERT_NO, PEMP_ADDL_STATUS, PEMP_HEIGHT, PEMP_HEIGHT_UNIT, PEMP_WEIGHT, PEMP_WEIGHT_UNIT, PEMP_BMI, PEMP_EMP_NATION, PEMP_EMP_STATUS, PEMP_MOP, PEMP_INCEPTION_DT, PEMP_INCEP_END_DT, PEMP_INTEREST_RATE, PEMP_COVER_PREM_CHG_YN, PEMP_CVR_CODE1, PEMP_CVR_SA1, PEMP_CVR_CODE2, PEMP_CVR_SA2, PEMP_CVR_CODE3, PEMP_CVR_SA3, PEMP_CVR_CODE4, PEMP_CVR_SA4, PEMP_CVR_CODE5, PEMP_CVR_SA5, PEMP_FIXED_SA, PEMP_NET_SAL, PEMP_TYPE_LOAN, PEMP_BANK_NAME, PEMP_BRANCH_NAME, PEMP_ACNT_NO, PEMP_EC_DOB, PEMP_MAN_FC_PREM FROM lt_pol_employee";

		ResultSet headerResultSet = executeQuery(query);

		JSONObject header = new JSONObject();
		ResultSetMetaData rsmd = headerResultSet.getMetaData();
		int columnCount = rsmd.getColumnCount();
		for (int i = 1; i <= columnCount; i++) {
			String columnName = rsmd.getColumnName(i);
			header.put(columnName, columnName);
		}

		List<LT_POL_EMPLOYEE> exceptions = poldemprepo.findAll();

		JSONObject response = new JSONObject();
		response.put("Status", "SUCCESS");
		response.put("Message", getallltpolemployee);
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
	public String getPolemployeeListUserById(Long pempTranId) {
		LT_POL_EMPLOYEE poldisc = poldemprepo.findById(pempTranId)
				.orElseThrow(() -> new RuntimeException("POL EMPLOYEE not found"));

		JSONObject response = new JSONObject(poldisc);

		response.put("Status", "SUCCESS");
		response.put("Message", "Record with ID " + pempTranId + " retrived successfully");
		return response.toString();
	}

	@Override
	public String deletePlEmployeeUserById(Long pempTranId) {
		try {
			Optional<LT_POL_EMPLOYEE> optionalEntity = poldemprepo.findById(pempTranId);

			if (optionalEntity.isPresent()) {
				poldemprepo.deleteById(pempTranId);

				JSONObject response = new JSONObject();
				response.put("Status", "SUCCESS");
				response.put("Message", "Record with ID " + pempTranId + " deleted successfully");
				return response.toString();

			} else {
				JSONObject response = new JSONObject();
				response.put("Status", "ERROR");
				response.put("Message", "Record with ID " + pempTranId + " not found");
				return response.toString();
			}
		} catch (Exception e) {
			JSONObject response = new JSONObject();
			response.put("Status", "ERROR");
			response.put("Message", "Error deleting record with ID " + poldemprepo + ": " + e.getMessage());
			return response.toString();
		}

	}

}
