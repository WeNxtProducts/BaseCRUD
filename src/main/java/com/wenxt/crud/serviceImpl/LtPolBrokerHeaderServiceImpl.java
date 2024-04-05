package com.wenxt.crud.serviceImpl;

import java.math.BigInteger;
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

import com.wenxt.crud.model.LT_POL_BROKER_HEAD;
import com.wenxt.crud.reposistory.LtPolBrokerHeaderRepository;
import com.wenxt.crud.service.LtPolBrokerHeaderService;

@Service
public class LtPolBrokerHeaderServiceImpl implements LtPolBrokerHeaderService {

	@Autowired
	private LtPolBrokerHeaderRepository ltpolbKheaderrepo;

	private static final String JDBC_URL = "jdbc:mysql://baseapi.cr4u8emg2x3o.eu-north-1.rds.amazonaws.com:3306/baseapi";
	private static final String USERNAME = "admin";
	private static final String PASSWORD = "D3Vt3aM#92";

	@Value("${insert.message.ltbrkerHD}")
	private String getallltbrkHD;

	@Override
	public String createLtpolbrokerHead(LT_POL_BROKER_HEAD lt_POL_BROKER_HEAD) {

		if (ltpolbKheaderrepo.existsById(lt_POL_BROKER_HEAD.getPobhTranId())) {
			ltpolbKheaderrepo.save(lt_POL_BROKER_HEAD);
			return "ltpol broker header updated successfully";
		} else {
			ltpolbKheaderrepo.save(lt_POL_BROKER_HEAD);
			return "ltpol broker header created successfully";
		}
	}

	@Override
	public String getAllLtPlBrokerHeader() throws SQLException {
		String query = "SELECT POBH_TRAN_ID, POBH_POL_TRAN_ID, POBH_BROKER_CODE, POBH_COVER_CODE, POBH_BROKER_CURR_CODE, POBH_REMARKS, POBH_DEL_FLAG, POBH_INS_DT, POBH_INS_ID, POBH_MOD_DT, POBH_MOD_ID, POBH_COMM_CODE, POBH_SRNO, POBH_APPLY_ON_SRNO, POBH_ACTING_AGENT_YN, POBH_AGENT_RANK_CODE, POBH_AGENT_LEVEL, POBH_MKT_CODE, POBH_UNIT_CODE, POBH_AGENCY_BRANCH_CODE, POBH_REGION_CODE, POBH_AGENCY_CODE, POBH_RECRUITER_CODE, POBH_FC_COMMISSION, POBH_LC_COMMISSION, POBH_EMAIL_ID, POBH_ORG_RATE, POBH_ORG_VALUE, POBH_RATE, POBH_VALUE, POBH_SHARE_PERC, POBH_PARENT_CODE, POBH_AGENT_HEIRCHY FROM lt_pol_broker_head";
		
		ResultSet headerResultSet = executeQuery(query);

		JSONObject header = new JSONObject();

		ResultSetMetaData rsmd = headerResultSet.getMetaData();
		int columnCount = rsmd.getColumnCount();

		for (int i = 1; i <= columnCount; i++) {
			String columnName = rsmd.getColumnName(i);
			header.put(columnName, columnName);
		}

		List<LT_POL_BROKER_HEAD> exceptions = ltpolbKheaderrepo.findAll();

		JSONObject response = new JSONObject();
		response.put("Status", "SUCCESS");
		response.put("Message", getallltbrkHD);
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
	public String getLlPolBrokerHeaderUserById(BigInteger pOBH_TRAN_ID) {

		LT_POL_BROKER_HEAD lmCustClass = ltpolbKheaderrepo.findById(pOBH_TRAN_ID)
				.orElseThrow(() -> new RuntimeException("Lt POL broker Hd TRAN ID not found"));

		JSONObject response = new JSONObject(lmCustClass);

		response.put("Status", "SUCCESS");
		response.put("Message", "Record with ID " + pOBH_TRAN_ID + " retrived successfully");
		return response.toString();
	}

	@Override
	public String deleteLlPolBrokerHeaderUserById(BigInteger pOBH_TRAN_ID) {
		try {
			Optional<LT_POL_BROKER_HEAD> optionalEntity = ltpolbKheaderrepo.findById(pOBH_TRAN_ID);

			if (optionalEntity.isPresent()) {
				ltpolbKheaderrepo.deleteById(pOBH_TRAN_ID);

				JSONObject response = new JSONObject();
				response.put("Status", "SUCCESS");
				response.put("Message", "Record with ID " + pOBH_TRAN_ID + " deleted successfully");
				return response.toString();
			} else {
				JSONObject response = new JSONObject();
				response.put("Status", "ERROR");
				response.put("Message", "Record with ID " + pOBH_TRAN_ID + " not found");
				return response.toString();
			}
		} catch (Exception e) {
			JSONObject response = new JSONObject();
			response.put("Status", "ERROR");
			response.put("Message", "Error deleting record with ID " + pOBH_TRAN_ID + ": " + e.getMessage());
			return response.toString();
		}

	}
}
