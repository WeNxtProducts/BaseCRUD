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

import com.wenxt.crud.model.LT_POL_DISCLOAD;
import com.wenxt.crud.reposistory.PolDiscLoadRepository;
import com.wenxt.crud.service.PolDiscLoadService;

@Service
public class PolDiscLoadServiceImpl implements PolDiscLoadService {

	@Autowired
	private PolDiscLoadRepository poldiscrepo;

	private static final String JDBC_URL = "jdbc:mysql://baseapi.cr4u8emg2x3o.eu-north-1.rds.amazonaws.com:3306/baseapi";
	private static final String USERNAME = "admin";
	private static final String PASSWORD = "D3Vt3aM#92";

	@Value("${insert.message.poldiscload}")
	private String getallltpoldiscload;

	@Override
	public String createPoldisc(LT_POL_DISCLOAD poldiscload) {
		if (poldiscrepo.existsById(poldiscload.getPdTranId())) {
			poldiscrepo.save(poldiscload);
			return "poldisc updated successfully";
		} else {
			poldiscrepo.save(poldiscload);
			return "poldisc created successfully";
		}

	}

	@Override
	public String getAllPoldiscList() throws SQLException {
		String query = "SELECT PD_TRAN_ID, PD_POL_TRAN_ID, PD_SR_NO, PD_DISC_LOAD_TYPE, PD_DISC_LOAD_CODE, PD_APPLIED_ON, PD_COVER_CODE, PD_RATE, PD_RATE_PER, PD_FC_DISC_LOAD_VALUE, PD_LC_DISC_LOAD_VALUE, PD_DEL_FLAG, PD_INS_DT, PD_INS_ID, PD_MOD_DT, PD_MOD_UID, PD_APPL_PERC, PD_FC_EMR_VAL, PD_LC_EMR_VAL, PD_EMR_RATE, PD_END_NO_IDX FROM lt_pol_discload";

		ResultSet headerResultSet = executeQuery(query);

		JSONObject header = new JSONObject();
		ResultSetMetaData rsmd = headerResultSet.getMetaData();
		int columnCount = rsmd.getColumnCount();
		for (int i = 1; i <= columnCount; i++) {
			String columnName = rsmd.getColumnName(i);
			header.put(columnName, columnName);
		}

		List<LT_POL_DISCLOAD> exceptions = poldiscrepo.findAll();

		JSONObject response = new JSONObject();
		response.put("Status", "SUCCESS");
		response.put("Message", getallltpoldiscload);
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
	public String getPoldiscUserById(BigInteger pdTranId) {
		LT_POL_DISCLOAD poldisc = poldiscrepo.findById(pdTranId)
				.orElseThrow(() -> new RuntimeException("POL DISC not found"));

		JSONObject response = new JSONObject(poldisc);

		response.put("Status", "SUCCESS");
		response.put("Message", "Record with ID " + pdTranId + " retrived successfully");
		return response.toString();
	}

	@Override
	public String deleteCreatePoldiscUserById(BigInteger pdTranId) {
		try {
			Optional<LT_POL_DISCLOAD> optionalEntity = poldiscrepo.findById(pdTranId);

			if (optionalEntity.isPresent()) {
				poldiscrepo.deleteById(pdTranId);

				JSONObject response = new JSONObject();
				response.put("Status", "SUCCESS");
				response.put("Message", "Record with ID " + pdTranId + " deleted successfully");
				return response.toString();

			} else {
				JSONObject response = new JSONObject();
				response.put("Status", "ERROR");
				response.put("Message", "Record with ID " + pdTranId + " not found");
				return response.toString();
			}
		} catch (Exception e) {
			JSONObject response = new JSONObject();
			response.put("Status", "ERROR");
			response.put("Message", "Error deleting record with ID " + pdTranId + ": " + e.getMessage());
			return response.toString();
		}

	}

}
