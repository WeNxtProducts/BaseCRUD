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

import com.wenxt.crud.model.LT_POL_STATUS;
import com.wenxt.crud.reposistory.LtPolStatusRepository;
import com.wenxt.crud.service.LtPolStatusService;

@Service
public class LtPolStatusServiceImpl implements LtPolStatusService {

	@Autowired
	private LtPolStatusRepository polstatusrrepo;

	private static final String JDBC_URL = "jdbc:mysql://baseapi.cr4u8emg2x3o.eu-north-1.rds.amazonaws.com:3306/baseapi";
	private static final String USERNAME = "admin";
	private static final String PASSWORD = "D3Vt3aM#92";

	@Value("${insert.message.ltpolstatus}")
	private String getallltpolstatus;

	@Override
	public String createPolchage(LT_POL_STATUS polstatus) {
		if (polstatusrrepo.existsById(polstatus.getPsTranId())) {
			polstatusrrepo.save(polstatus);
			return "pol status updated successfully";
		} else {
			polstatusrrepo.save(polstatus);
			return "Pol status created successfully";
		}
	}

	@Override
	public String getAllPolStatusList() throws SQLException {
		String query = "SELECT ps_pol_tran_id,ps_end_no_idx,ps_status_dt,ps_status,ps_reason_code,ps_remarks,ps_status_uid,ps_ins_id,ps_ins_dt,ps_status_type,ps_reminder_no,ps_ri_code,PS_TRAN_ID FROM lt_pol_status";
		ResultSet headerResultSet = executeQuery(query);

		JSONObject header = new JSONObject();
		ResultSetMetaData rsmd = headerResultSet.getMetaData();
		int columnCount = rsmd.getColumnCount();
		for (int i = 1; i <= columnCount; i++) {
			String columnName = rsmd.getColumnName(i);
			header.put(columnName, columnName);
		}

		List<LT_POL_STATUS> exceptions = polstatusrrepo.findAll();

		JSONObject response = new JSONObject();
		response.put("Status", "SUCCESS");
		response.put("Message", getallltpolstatus);
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
	public String getPolStatusUserById(Integer psTranId) {
		LT_POL_STATUS polchager = polstatusrrepo.findById(psTranId)
				.orElseThrow(() -> new RuntimeException("POL CHARGER not found"));

		JSONObject response = new JSONObject(polchager);

		response.put("Status", "SUCCESS");
		response.put("Message", "Record with ID " + psTranId + " retrived successfully");
		return response.toString();
	}

	@Override
	public String deletPolStatusById(Integer psTranId) {
		try {
			Optional<LT_POL_STATUS> optionalEntity = polstatusrrepo.findById(psTranId);

			if (optionalEntity.isPresent()) {
				polstatusrrepo.deleteById(psTranId);

				JSONObject response = new JSONObject();
				response.put("Status", "SUCCESS");
				response.put("Message", "Record with ID " + psTranId + " deleted successfully");
				return response.toString();

			} else {
				JSONObject response = new JSONObject();
				response.put("Status", "ERROR");
				response.put("Message", "Record with ID " + psTranId + " not found");
				return response.toString();
			}
		} catch (Exception e) {
			JSONObject response = new JSONObject();
			response.put("Status", "ERROR");
			response.put("Message", "Error deleting record with ID " + psTranId + ": " + e.getMessage());
			return response.toString();
		}
	}

}
