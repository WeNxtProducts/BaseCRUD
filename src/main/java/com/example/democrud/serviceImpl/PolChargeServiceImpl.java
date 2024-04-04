package com.example.democrud.serviceImpl;

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

import com.example.democrud.model.LT_POL_CHARGE;
import com.example.democrud.reposistory.PolChargeRepository;
import com.example.democrud.service.PolChargeService;

@Service
public class PolChargeServiceImpl implements PolChargeService {

	@Autowired
	private PolChargeRepository polchagerrepo;

	private static final String JDBC_URL = "jdbc:mysql://baseapi.cr4u8emg2x3o.eu-north-1.rds.amazonaws.com:3306/baseapi";
	private static final String USERNAME = "admin";
	private static final String PASSWORD = "D3Vt3aM#92";

	@Value("${insert.message.ltpolcharge}")
	private String getallltpolchager;

	@Override
	public String createPolchage(LT_POL_CHARGE polcharge) {

		if (polchagerrepo.existsById(polcharge.getPocTranId())) {
			polchagerrepo.save(polcharge);
			return "PolCharge updated successfully";
		} else {
			polchagerrepo.save(polcharge);
			return "PolCharge created successfully";
		}
	}

	@Override
	public String getAllpolchagerList() throws SQLException {
		String query = "SELECT POC_TRAN_ID, POC_POL_TRAN_ID, POC_CHRG_CODE, POC_LC_VALUE, POC_FC_VALUE, POC_DEL_FLAG, POC_INS_DT, POC_INS_ID, POC_MOD_DT, POC_MOD_ID, POC_RATE, POC_RATE_PER, POC_APPLIED_ON, POC_CUST_SHARE_PERC, POC_APPLY_PERIOD, POC_TYPE, POC_END_NO_IDX, POC_ACC_GEN_YN, POC_CHARGE_MAX_LMT FROM lt_pol_charge";

		ResultSet headerResultSet = executeQuery(query);

		JSONObject header = new JSONObject();
		ResultSetMetaData rsmd = headerResultSet.getMetaData();
		int columnCount = rsmd.getColumnCount();
		for (int i = 1; i <= columnCount; i++) {
			String columnName = rsmd.getColumnName(i);
			header.put(columnName, columnName);
		}

		List<LT_POL_CHARGE> exceptions = polchagerrepo.findAll();

		JSONObject response = new JSONObject();
		response.put("Status", "SUCCESS");
		response.put("Message", getallltpolchager);
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
	public String getpolchagerUserById(BigInteger pocTranId) {
		LT_POL_CHARGE polchager = polchagerrepo.findById(pocTranId)
				.orElseThrow(() -> new RuntimeException("POL CHARGER not found"));

		JSONObject response = new JSONObject(polchager);

		response.put("Status", "SUCCESS");
		response.put("Message", "Record with ID " + pocTranId + " retrived successfully");
		return response.toString();
	}

	@Override
	public String deletePolchagerUserById(BigInteger pocTranId) {
		try {
			Optional<LT_POL_CHARGE> optionalEntity = polchagerrepo.findById(pocTranId);

			if (optionalEntity.isPresent()) {
				polchagerrepo.deleteById(pocTranId);

				JSONObject response = new JSONObject();
				response.put("Status", "SUCCESS");
				response.put("Message", "Record with ID " + pocTranId + " deleted successfully");
				return response.toString();

			} else {
				JSONObject response = new JSONObject();
				response.put("Status", "ERROR");
				response.put("Message", "Record with ID " + pocTranId + " not found");
				return response.toString();
			}
		} catch (Exception e) {
			JSONObject response = new JSONObject();
			response.put("Status", "ERROR");
			response.put("Message", "Error deleting record with ID " + pocTranId + ": " + e.getMessage());
			return response.toString();
		}
	}
}
