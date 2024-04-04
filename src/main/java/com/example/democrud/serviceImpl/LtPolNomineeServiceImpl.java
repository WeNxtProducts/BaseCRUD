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

import com.example.democrud.model.LT_POL_NOMINEE;
import com.example.democrud.reposistory.LtPolNomineeRepository;
import com.example.democrud.service.LtPolNomineeService;

@Service
public class LtPolNomineeServiceImpl implements LtPolNomineeService {

	@Autowired
	private LtPolNomineeRepository polnomineerepo;

	private static final String JDBC_URL = "jdbc:mysql://baseapi.cr4u8emg2x3o.eu-north-1.rds.amazonaws.com:3306/baseapi";
	private static final String USERNAME = "admin";
	private static final String PASSWORD = "D3Vt3aM#92";

	@Value("${insert.message.polNominee}")
	private String getallltpolNominee;

	@Override
	public String createPolNominee(LT_POL_NOMINEE polnominee) {

		if (polnomineerepo.existsById(polnominee.getPN_TRAN_ID())) {
			polnomineerepo.save(polnominee);
			return "Pol Nominee updated successfully";
		} else {
			polnomineerepo.save(polnominee);
			return "Pol Nominee created successfully";
		}

	}

	@Override
	public String getAllPolNomineeList() throws SQLException {
		String query = "SELECT PN_TRAN_ID,PN_POL_TRAN_ID,PN_SR_NO,PN_NOM_TYPE,PN_NOM_NAME,PN_NOM_NAME_BL,PN_NOM_CUST_CODE,PN_CATG_CODE,PN_DOB,PN_AGE,PN_PERC,PN_RELATION,PN_ADDRESS_1,PN_ADDRESS_2,PN_ADDRESS_3,PN_ADDRESS_4,PN_ADDRESS_5,PN_ADDRESS_1_BL,PN_ADDRESS_2_BL,PN_ADDRESS_3_BL,PN_ADDRESS_4_BL,PN_ADDRESS_5_BL,PN_REMARKS,PN_REMARKS_BL,PN_INS_ID,PN_INS_DT,PN_MOD_ID,PN_MOD_DT,PN_GUARDIAN_NAME,PN_DEL_FLAG,PN_REF_ID1,PN_REF_ID2,PN_MICR_CODE,PN_ACNT_NO,PN_CITY_CODE,PN_BANK_CODE,PN_DIVISION,PN_EFF_FM_DT,PN_EFF_TO_DT,PN_GUAR_RELATION,PN_EMAIL,PN_REC_TYPE,PN_GUAR_UNIQ_ID,PN_GUAR_ID_TYPE,PN_NOM_ID_TYPE,PN_MOBILE_NO FROM lt_pol_nominee";

		ResultSet headerResultSet = executeQuery(query);

		JSONObject header = new JSONObject();
		ResultSetMetaData rsmd = headerResultSet.getMetaData();
		int columnCount = rsmd.getColumnCount();
		for (int i = 1; i <= columnCount; i++) {
			String columnName = rsmd.getColumnName(i);
			header.put(columnName, columnName);
		}

		List<LT_POL_NOMINEE> exceptions = polnomineerepo.findAll();

		JSONObject response = new JSONObject();
		response.put("Status", "SUCCESS");
		response.put("Message", getallltpolNominee);
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
	public String getPolNomineeById(Long pN_TRAN_ID) {
		LT_POL_NOMINEE polchager = polnomineerepo.findById(pN_TRAN_ID)
				.orElseThrow(() -> new RuntimeException("LT POL NOMINEE not found"));

		JSONObject response = new JSONObject(polchager);

		response.put("Status", "SUCCESS");
		response.put("Message", "Record with ID " + pN_TRAN_ID + " retrived successfully");
		return response.toString();
	}

	@Override
	public String deletePolNomineeById(Long pN_TRAN_ID) {
		try {
			Optional<LT_POL_NOMINEE> optionalEntity = polnomineerepo.findById(pN_TRAN_ID);

			if (optionalEntity.isPresent()) {
				polnomineerepo.deleteById(pN_TRAN_ID);

				JSONObject response = new JSONObject();
				response.put("Status", "SUCCESS");
				response.put("Message", "Record with ID " + pN_TRAN_ID + " deleted successfully");
				return response.toString();

			} else {
				JSONObject response = new JSONObject();
				response.put("Status", "ERROR");
				response.put("Message", "Record with ID " + pN_TRAN_ID + " not found");
				return response.toString();
			}
		} catch (Exception e) {
			JSONObject response = new JSONObject();
			response.put("Status", "ERROR");
			response.put("Message", "Error deleting record with ID " + pN_TRAN_ID + ": " + e.getMessage());
			return response.toString();
		}
	}

}
