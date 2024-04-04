package com.example.democrud.serviceImpl;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.sql.Statement;
import java.time.LocalDateTime;
import java.util.List;
import java.util.Optional;

import org.json.JSONException;
import org.json.JSONObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

import com.example.democrud.model.LM_CUSTOMER;
import com.example.democrud.reposistory.CustomerRepository;
import com.example.democrud.service.CustomerMasterService;

@Service
public class CustomerMasterServiceImpl implements CustomerMasterService {

	@Autowired
	private CustomerRepository cmrepo;

	@Value("${insert.message.logs}")
	private String getallLists;

	private static final String JDBC_URL = "jdbc:mysql://baseapi.cr4u8emg2x3o.eu-north-1.rds.amazonaws.com:3306/baseapi";
	private static final String USERNAME = "admin";
	private static final String PASSWORD = "D3Vt3aM#92";

	public String createCustomer(LM_CUSTOMER lmCustomer) {

		LocalDateTime currentDate = LocalDateTime.now();
		if (lmCustomer.getCust_code() == 0) {
			// Customer is being created for the first time
			lmCustomer.setCust_ins_dt(currentDate);
			cmrepo.save(lmCustomer);
			return "LM customer created successfully";
		} else {
			// Customer already exists, update only modification date
			LM_CUSTOMER existingCustomer = cmrepo.findById(lmCustomer.getCust_code()).orElse(null);
			if (existingCustomer != null) {
				// Set only modification date
				existingCustomer.setCust_mod_dt(currentDate);
				cmrepo.save(existingCustomer);
				return "LM customer updated successfully";
			} else {
				// Customer with given ID not found
				return "Failed to update LM customer: Customer not found";
			}
		}
	}

	public String getAllCustomlist() throws JSONException, SQLException {

		String query = "SELECT cust_code,cust_class,cust_type,cust_name,cust_short_name,cust_dob,cust_catg_code,cust_addr1,cust_addr2,cust_addr3,cust_contact,cust_phone,cust_city,cust_country,cust_mar_status,cust_salutation,cust_ml_name,cust_ml_short_name,cust_ml_addr1,cust_ml_addr2,cust_ml_addr3,cust_ml_contact,cust_ml_phone,cust_ml_city,cust_ml_country,cust_frz_flag,cust_ins_dt,cust_ins_id,cust_mod_dt,cust_mod_id,cust_national_id,cust_credit_days,cust_occupation,cust_mobile_no,cust_qualfn,cust_eff_fm_dt,cust_eff_to_dt,cust_agency_name,cust_agent_rank_code,cust_lcn_no,cust_lic_start_dt,cust_lic_end_dt,cust_lcn_reg_dt,cust_lcn_status,cust_spouse_name,cust_status,cust_flex_01,cust_flex_02,cust_flex_03,cust_flex_04,cust_flex_05,cust_flex_06,cust_flex_07,cust_flex_08,cust_flex_09,cust_flex_10,cust_employer_code,cust_comp_code FROM lm_customer";

		ResultSet headerResultSet = executeQuery(query);

		// Creating the header JSONObject
		JSONObject header = new JSONObject();
		ResultSetMetaData rsmd = headerResultSet.getMetaData();
		int columnCount = rsmd.getColumnCount();
		for (int i = 1; i <= columnCount; i++) {
			String columnName = rsmd.getColumnName(i);
			header.put(columnName, columnName);
		}

		List<LM_CUSTOMER> exceptions = cmrepo.findAll();

		JSONObject response = new JSONObject();
		response.put("Status", "SUCCESS");
		response.put("Message", getallLists);
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

	public String deleteUserById(int custcode) {
		try {
			Optional<LM_CUSTOMER> optionalEntity = cmrepo.findById(custcode);

			if (optionalEntity.isPresent()) {
				cmrepo.deleteById(custcode);

				JSONObject response = new JSONObject();
				response.put("Status", "SUCCESS");
				response.put("Message", "Record with ID " + custcode + " deleted successfully");
				return response.toString();

			} else {
				JSONObject response = new JSONObject();
				response.put("Status", "ERROR");
				response.put("Message", "Record with ID " + custcode + " not found");
				return response.toString();
			}
		} catch (Exception e) {
			JSONObject response = new JSONObject();
			response.put("Status", "ERROR");
			response.put("Message", "Error deleting record with ID " + custcode + ": " + e.getMessage());
			return response.toString();
		}

	}

	public String getCustomerUserById(int custcode) {
		LM_CUSTOMER lmCustClass = cmrepo.findById(custcode)
				.orElseThrow(() -> new RuntimeException("LM CLASS not found"));

		JSONObject response = new JSONObject(lmCustClass);

		response.put("Status", "SUCCESS");
		response.put("Message", "Record with ID " + custcode + " retrived successfully");
		return response.toString();

	}
}