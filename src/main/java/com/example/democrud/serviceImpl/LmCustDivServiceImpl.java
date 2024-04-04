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
import org.springframework.stereotype.Service;

import com.example.democrud.model.LM_CUST_DIVN;
import com.example.democrud.reposistory.LmCustReposistory;
import com.example.democrud.service.LmCustDivService;

@Service
public class LmCustDivServiceImpl implements LmCustDivService {

	@Autowired
	private LmCustReposistory lmcustdivrepo;

	private static final String JDBC_URL = "jdbc:mysql://baseapi.cr4u8emg2x3o.eu-north-1.rds.amazonaws.com:3306/baseapi";
	private static final String USERNAME = "admin";
	private static final String PASSWORD = "D3Vt3aM#92";

	@Override
	public String createLmClass(LM_CUST_DIVN lM_CUST_DIVN) {

//		System.out.println(lM_CUST_DIVN.getCDIV_DIVN_CODE());
//		Optional<LM_CUST_DIVN> optionalUser = lmcustdivrepo.findById(lM_CUST_DIVN.getCDIV_DIVN_CODE());
//
//		if (optionalUser.isPresent()) {
//			return "LM CUST CLASS information updated successfully";
//		} else {
//			// If the entity doesn't exist, create it
//			lmcustdivrepo.save(lM_CUST_DIVN);
//			return "LM CUST CLASS added successfully";
//		}
		
		if (lmcustdivrepo.existsById(lM_CUST_DIVN.getCdivCustCode())) {
			lmcustdivrepo.save(lM_CUST_DIVN);
			return "lm cust div updated successfully";
		} else {
			lmcustdivrepo.save(lM_CUST_DIVN);
			return "lm cust div created successfully";
		}
	}

	@Override
	public String getAllLMClasslist() throws SQLException {

		String query = "SELECT CDIV_CUST_CODE, CDIV_DIVN_CODE, CDIV_FRZ_FLAG, CDIV_CR_DT, CDIV_CR_UID, CDIV_UPD_DT, CDIV_UPD_UID FROM lm_cust_divn";
		ResultSet headerResultSet = executeQuery(query);

		// Creating the header JSONObject
		JSONObject header = new JSONObject();
		ResultSetMetaData rsmd = headerResultSet.getMetaData();
		int columnCount = rsmd.getColumnCount();

		// Populating header with column names in the order they are selected
		for (int i = 1; i <= columnCount; i++) {
			String columnName = rsmd.getColumnName(i);
			header.put(columnName, columnName);
		}

		// Assuming LM_CUST_DIVN is a custom class with fields corresponding to your
		// database columns
		List<LM_CUST_DIVN> exceptions = lmcustdivrepo.findAll();

		JSONObject response = new JSONObject();
		response.put("Status", "SUCCESS");
		response.put("Message", "getallLmclass");
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
	public String getLMUserById(String cdivCustCode) {
		LM_CUST_DIVN lmCustClass = lmcustdivrepo.findById(cdivCustCode)
				.orElseThrow(() -> new RuntimeException("LM Cust Div not found"));

		JSONObject response = new JSONObject(lmCustClass);

		response.put("Status", "SUCCESS");
		response.put("Message", "Record with ID " + cdivCustCode + " retrived successfully");
		return response.toString();
	}

	@Override
	public String deleteLmClasss(String cdivCustCode) {
		try {
			Optional<LM_CUST_DIVN> optionalEntity = lmcustdivrepo.findById(cdivCustCode);

			if (optionalEntity.isPresent()) {
				lmcustdivrepo.deleteById(cdivCustCode);

				JSONObject response = new JSONObject();
				response.put("Status", "SUCCESS");
				response.put("Message", "Record with ID " + cdivCustCode + " deleted successfully");
				return response.toString();
			} else {
				JSONObject response = new JSONObject();
				response.put("Status", "ERROR");
				response.put("Message", "Record with ID " + cdivCustCode + " not found");
				return response.toString();
			}
		} catch (Exception e) {
			JSONObject response = new JSONObject();
			response.put("Status", "ERROR");
			response.put("Message", "Error deleting record with ID " + cdivCustCode + ": " + e.getMessage());
			return response.toString();
		}

	}
}
