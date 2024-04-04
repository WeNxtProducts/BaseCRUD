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

import com.example.democrud.model.LT_POL_OCC_COVER;
import com.example.democrud.reposistory.LtPolOccCoverRepository;
import com.example.democrud.service.LtPolOccCoverService;

@Service
public class LtPolOccCoverServiceImpl implements LtPolOccCoverService {

	@Autowired
	private LtPolOccCoverRepository polocvrrepo;

	private static final String JDBC_URL = "jdbc:mysql://baseapi.cr4u8emg2x3o.eu-north-1.rds.amazonaws.com:3306/baseapi";
	private static final String USERNAME = "admin";
	private static final String PASSWORD = "D3Vt3aM#92";

	@Value("${insert.message.ltpolOccCover}")
	private String getallltpolOccCover;

	@Override
	public String createPolOCover(LT_POL_OCC_COVER polocover) {
		if (polocvrrepo.existsById(polocover.getPocvr_tran_id())) {
			polocvrrepo.save(polocover);
			return "Pol Occ cover updated successfully";
		} else {
			polocvrrepo.save(polocover);
			return "Pol Occ cover created successfully";
		}
	}

	@Override
	public String getAllPolOCoverList() throws SQLException {
		String query = "SELECT pocvr_tran_id, pocvr_pol_tran_id, pocvr_occ_catg, pocvr_cover_code, pocvr_del_flag,pocvr_ins_dt, pocvr_ins_id, pocvr_mod_dt, pocvr_mod_id, pocvr_rate_per,pocvr_rate, pocvr_fc_limit, pocvr_lc_limit, pocvr_rec_type, pocvr_occ_code,pocvr_sal_lc_fm, pocvr_sal_lc_to, pocvr_sa_months, pocvr_default_yn FROM lt_pol_occ_cover";
		ResultSet headerResultSet = executeQuery(query);

		JSONObject header = new JSONObject();
		ResultSetMetaData rsmd = headerResultSet.getMetaData();
		int columnCount = rsmd.getColumnCount();
		for (int i = 1; i <= columnCount; i++) {
			String columnName = rsmd.getColumnName(i);
			header.put(columnName, columnName);
		}

		List<LT_POL_OCC_COVER> exceptions = polocvrrepo.findAll();

		JSONObject response = new JSONObject();
		response.put("Status", "SUCCESS");
		response.put("Message", getallltpolOccCover);
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
	public String getPolOCoverById(Long pocvr_tran_id) {
		LT_POL_OCC_COVER polchager = polocvrrepo.findById(pocvr_tran_id)
				.orElseThrow(() -> new RuntimeException("Pol Occ cover not found"));

		JSONObject response = new JSONObject(polchager);

		response.put("Status", "SUCCESS");
		response.put("Message", "Record with ID " + pocvr_tran_id + " retrived successfully");
		return response.toString();
	}

	@Override
	public String deletePolOCoverById(Long pocvr_tran_id) {
		try {
			Optional<LT_POL_OCC_COVER> optionalEntity = polocvrrepo.findById(pocvr_tran_id);

			if (optionalEntity.isPresent()) {
				polocvrrepo.deleteById(pocvr_tran_id);

				JSONObject response = new JSONObject();
				response.put("Status", "SUCCESS");
				response.put("Message", "Record with ID " + pocvr_tran_id + " deleted successfully");
				return response.toString();

			} else {
				JSONObject response = new JSONObject();
				response.put("Status", "ERROR");
				response.put("Message", "Record with ID " + pocvr_tran_id + " not found");
				return response.toString();
			}
		} catch (Exception e) {
			JSONObject response = new JSONObject();
			response.put("Status", "ERROR");
			response.put("Message", "Error deleting record with ID " + pocvr_tran_id + ": " + e.getMessage());
			return response.toString();
		}
	}

}
