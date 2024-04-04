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

import com.example.democrud.model.LT_POL_PLAN_HDR;
import com.example.democrud.reposistory.LtPolPlanHdrRepository;
import com.example.democrud.service.LtPolPlanHdrService;

@Service
public class LtPolPlanHdrServiceImpl implements LtPolPlanHdrService {

	@Autowired
	private LtPolPlanHdrRepository ltplanHdrrepo;

	private static final String JDBC_URL = "jdbc:mysql://baseapi.cr4u8emg2x3o.eu-north-1.rds.amazonaws.com:3306/baseapi";
	private static final String USERNAME = "admin";
	private static final String PASSWORD = "D3Vt3aM#92";

	@Value("${insert.message.planhrd}")
	private String getallltplanhrd;

	@Override
	public String createPolPlanhrd(LT_POL_PLAN_HDR polplanhdr) {
		if (ltplanHdrrepo.existsById(polplanhdr.getPph_tran_id())) {
			ltplanHdrrepo.save(polplanhdr);
			return "POL PLAN Updated SUCCESSFULLY";
		} else {
			ltplanHdrrepo.save(polplanhdr);
			return "Pol Plan Created Successfully";
		}

	}

	@Override
	public String getAllPlanhdrList() throws SQLException {
		String query = "SELECT pph_tran_id,pph_pol_tran_id,pph_prod_code,pph_plan_code,pph_cr_dt,pph_cr_uid,pph_upd_uid,pph_upd_dt,pph_default_yn,pph_del_flag,pph_rec_type,pph_cust_prof,pph_yr_limit FROM lt_pol_plan_hdr";

		ResultSet headerResultSet = executeQuery(query);

		JSONObject header = new JSONObject();
		ResultSetMetaData rsmd = headerResultSet.getMetaData();
		int columnCount = rsmd.getColumnCount();
		for (int i = 1; i <= columnCount; i++) {
			String columnName = rsmd.getColumnName(i);
			header.put(columnName, columnName);
		}

		List<LT_POL_PLAN_HDR> exceptions = ltplanHdrrepo.findAll();

		JSONObject response = new JSONObject();
		response.put("Status", "SUCCESS");
		response.put("Message", getallltplanhrd);
		response.put("Heading", header);
		response.put("Data", exceptions);

		return response.toString();

	}

	private ResultSet executeQuery(String query) throws SQLException {
		try {

			Class.forName("com.mysql.cj.jdbc.Driver");

		} catch (ClassNotFoundException e) {
			e.printStackTrace();
			// TODO: handle exception
		}

		Connection connection = DriverManager.getConnection(JDBC_URL, USERNAME, PASSWORD);

		// Create a statement
		Statement statement = connection.createStatement();

		// Execute the query and return the result set
		return statement.executeQuery(query);
	}

	@Override
	public String getPlanHdrById(Integer pph_tran_id) {
		LT_POL_PLAN_HDR polchager = ltplanHdrrepo.findById(pph_tran_id)
				.orElseThrow(() -> new RuntimeException("LT POL NOMINEE not found"));

		JSONObject response = new JSONObject(polchager);

		response.put("Status", "SUCCESS");
		response.put("Message", "Record with ID " + pph_tran_id + " retrived successfully");
		return response.toString();
	}

	@Override
	public String deletePlanHdrById(Integer pph_tran_id) {
		try {
			Optional<LT_POL_PLAN_HDR> optionalEntity = ltplanHdrrepo.findById(pph_tran_id);

			if (optionalEntity.isPresent()) {
				ltplanHdrrepo.deleteById(pph_tran_id);

				JSONObject response = new JSONObject();
				response.put("Status", "SUCCESS");
				response.put("Message", "Record with ID " + pph_tran_id + " deleted successfully");
				return response.toString();

			} else {
				JSONObject response = new JSONObject();
				response.put("Status", "ERROR");
				response.put("Message", "Record with ID " + pph_tran_id + " not found");
				return response.toString();
			}
		} catch (Exception e) {
			JSONObject response = new JSONObject();
			response.put("Status", "ERROR");
			response.put("Message", "Error deleting record with ID " + pph_tran_id + ": " + e.getMessage());
			return response.toString();
		}
	}
}
