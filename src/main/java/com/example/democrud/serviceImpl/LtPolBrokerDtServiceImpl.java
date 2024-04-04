package com.example.democrud.serviceImpl;

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

import com.example.democrud.model.LT_POL_BROKER_DTL;
import com.example.democrud.reposistory.LtPolBrokerDtlRepository;
import com.example.democrud.service.LtPolBrokerDtlService;

@Service
public class LtPolBrokerDtServiceImpl implements LtPolBrokerDtlService {

	@Autowired
	private LtPolBrokerDtlRepository ltpolbrokerrepo;

	private static final String JDBC_URL = "jdbc:mysql://baseapi.cr4u8emg2x3o.eu-north-1.rds.amazonaws.com:3306/baseapi";
	private static final String USERNAME = "admin";
	private static final String PASSWORD = "D3Vt3aM#92";

	@Value("${insert.message.ltbrker}")
	private String getallltbrkdtl;

	@Override
	public String createLtpolbroker(LT_POL_BROKER_DTL ll_POL_BROKER_DTL) {
		if (ltpolbrokerrepo.existsById(ll_POL_BROKER_DTL.getPobdTranId())) {
			ltpolbrokerrepo.save(ll_POL_BROKER_DTL);
			return "pol brokerdt updated successfully";
		} else {
			ltpolbrokerrepo.save(ll_POL_BROKER_DTL);
			return "pol brokerdt created successfully";
		}
	}

	@Override
	public String getAllLtPlBrokerDtl() throws SQLException {
		
		String query ="SELECT POBD_TRAN_ID, POBD_POBH_TRAN_ID, POBD_YEAR_FROM, POBD_YEAR_TO, POBD_DEL_FLAG, POBD_INS_DT, POBD_INS_ID, POBD_MOD_DT, POBD_MOD_UID, POBD_RATE, POBD_RATE_PER, POBD_ORG_COMM_RATE, POBD_COMM_VALUE, POBD_COMM_CODE, POBD_COMM_COVER_CODE FROM lt_pol_broker_dtl";

			
		ResultSet headerResultSet = executeQuery(query);

		JSONObject header = new JSONObject();

		ResultSetMetaData rsmd = headerResultSet.getMetaData();
		int columnCount = rsmd.getColumnCount();

		for (int i = 1; i <= columnCount; i++) {
			String columnName = rsmd.getColumnName(i);
			header.put(columnName, columnName);
		}

		List<LT_POL_BROKER_DTL> exceptions = ltpolbrokerrepo.findAll();

		JSONObject response = new JSONObject();
		response.put("Status", "SUCCESS");
		response.put("Message", getallltbrkdtl);
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
	public String getLlPolBrokerUserById(Long POBD_TRAN_ID) {
		LT_POL_BROKER_DTL lmCustClass = ltpolbrokerrepo.findById(POBD_TRAN_ID)
				.orElseThrow(() -> new RuntimeException("Lt POL broker Det TRAN ID not found"));

		JSONObject response = new JSONObject(lmCustClass);

		response.put("Status", "SUCCESS");
		response.put("Message", "Record with ID " + POBD_TRAN_ID + " retrived successfully");
		return response.toString();
	}

	@Override
	public String deleteLtPolBrokerdtl(Long pOBD_TRAN_ID) {
		try {
			Optional<LT_POL_BROKER_DTL> optionalEntity = ltpolbrokerrepo.findById(pOBD_TRAN_ID);

			if (optionalEntity.isPresent()) {
				ltpolbrokerrepo.deleteById(pOBD_TRAN_ID);

				JSONObject response = new JSONObject();
				response.put("Status", "SUCCESS");
				response.put("Message", "Record with ID " + pOBD_TRAN_ID + " deleted successfully");
				return response.toString();
			} else {
				JSONObject response = new JSONObject();
				response.put("Status", "ERROR");
				response.put("Message", "Record with ID " + pOBD_TRAN_ID + " not found");
				return response.toString();
			}
		} catch (Exception e) {
			JSONObject response = new JSONObject();
			response.put("Status", "ERROR");
			response.put("Message", "Error deleting record with ID " + pOBD_TRAN_ID + ": " + e.getMessage());
			return response.toString();
		}

	}
}
