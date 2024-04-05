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

import com.wenxt.crud.model.LT_POL_RIDER;
import com.wenxt.crud.reposistory.LtPolRiderRepository;
import com.wenxt.crud.service.LtPolRiderService;

@Service
public class LtPolRiderServiceImpl implements LtPolRiderService{
	
	
	@Autowired
	private LtPolRiderRepository polriderrepo;

	private static final String JDBC_URL = "jdbc:mysql://baseapi.cr4u8emg2x3o.eu-north-1.rds.amazonaws.com:3306/baseapi";
	private static final String USERNAME = "admin";
	private static final String PASSWORD = "D3Vt3aM#92";

	@Value("${insert.message.ltpolRider}")
	private String getallltpolRider;

	@Override
	public String createPolRider(LT_POL_RIDER polrider) {

		if (polriderrepo.existsById(polrider.getPrTranId())) {
			polriderrepo.save(polrider);
			return "POL Rider updated successfully";
		} else {
			polriderrepo.save(polrider);
			return "POL Rider created successfully";
		}
	}

	@Override
	public String getAllPolRiderList() throws SQLException {
		String query = "SELECT pr_tran_id,pr_pol_tran_id,pr_cover_code,pr_appl_all,pr_assr_code,pr_rate,pr_rate_per,pr_lc_prem,pr_fc_prem,pr_del_flag,pr_ins_dt,pr_ins_id,pr_mod_dt,pr_mod_id,pr_pad_tran_id,pr_period,pr_prem_pay_yrs,pr_fm_dt,pr_to_dt,pr_fc_sa,pr_lc_sa,pr_tariff_term_flag,pr_rate_applied_on,pr_wop_flag,pr_lc_med_amt,pr_no_of_unit,pr_emr_rate,pr_flex_01,pr_lc_mop_prem,pr_fc_mop_prem FROM lt_pol_rider";

		ResultSet headerResultSet = executeQuery(query);

		JSONObject header = new JSONObject();
		ResultSetMetaData rsmd = headerResultSet.getMetaData();
		int columnCount = rsmd.getColumnCount();
		for (int i = 1; i <= columnCount; i++) {
			String columnName = rsmd.getColumnName(i);
			header.put(columnName, columnName);
		}

		List<LT_POL_RIDER> exceptions = polriderrepo.findAll();

		JSONObject response = new JSONObject();
		response.put("Status", "SUCCESS");
		response.put("Message", getallltpolRider);
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
	public String getPolRiderById(Long prTranId) {
		LT_POL_RIDER polchager = polriderrepo.findById(prTranId)
				.orElseThrow(() -> new RuntimeException("POL rider not found"));

		JSONObject response = new JSONObject(polchager);

		response.put("Status", "SUCCESS");
		response.put("Message", "Record with ID " + prTranId + " retrived successfully");
		return response.toString();
	}

	@Override
	public String deletePolRiderById(Long prTranId) {
		try {
			Optional<LT_POL_RIDER> optionalEntity = polriderrepo.findById(prTranId);

			if (optionalEntity.isPresent()) {
				polriderrepo.deleteById(prTranId);

				JSONObject response = new JSONObject();
				response.put("Status", "SUCCESS");
				response.put("Message", "Record with ID " + prTranId + " deleted successfully");
				return response.toString();

			} else {
				JSONObject response = new JSONObject();
				response.put("Status", "ERROR");
				response.put("Message", "Record with ID " + prTranId + " not found");
				return response.toString();
			}
		} catch (Exception e) {
			JSONObject response = new JSONObject();
			response.put("Status", "ERROR");
			response.put("Message", "Error deleting record with ID " + prTranId + ": " + e.getMessage());
			return response.toString();
		}
	}

}
