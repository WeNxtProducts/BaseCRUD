package com.wenxt.crud.serviceImpl;

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

import com.wenxt.crud.model.LM_CUST_CLASS;
import com.wenxt.crud.reposistory.LmCustomerReposistory;
import com.wenxt.crud.service.LmClassService;

@Service
public class LmClassServiceImpl implements LmClassService {

	@Autowired
	private LmCustomerReposistory lmrepo;

	@Value("${insert.message.lmclass}")
	private String getallLmclass;

	private static final String JDBC_URL = "jdbc:mysql://baseapi.cr4u8emg2x3o.eu-north-1.rds.amazonaws.com:3306/baseapi";
	private static final String USERNAME = "admin";
	private static final String PASSWORD = "D3Vt3aM#92";

	@Override
	public String createLmClass(LM_CUST_CLASS lmcustClass) {

		
	
		
		
		    LocalDateTime currentDate = LocalDateTime.now();
		    
		    
		    if (lmrepo.existsById(lmcustClass.getCclasType())) {
		        
		        LM_CUST_CLASS existingClass = lmrepo.findById(lmcustClass.getCclasType()).orElse(null);
		        if (existingClass != null) {
		            
		        	lmcustClass.setCclasModDt(currentDate); 
		           
		        	lmcustClass.setCclasInsDt(existingClass.getCclasInsDt()); 
		            lmrepo.save(lmcustClass);
		            return "LM class updated successfully";
		        } else {
		            return "Failed to update LM class: Class not found";
		        }
		    } else {
		        
		    	lmcustClass.setCclasInsDt(currentDate); 
		        lmrepo.save(lmcustClass);
		        return "LM class created successfully";
		    }
		}

		
		

	

	@Override
	public String getAllLMClasslist() throws JSONException, SQLException {

		String query = "SELECT CCLAS_TYPE,CCLAS_CODE,CCLAS_CLASS_DESC,CCLAS_SHORT_CLASS_DESC,CCLAS_BL_CLASS_DESC,CCLAS_BL_SHORT_CLASS_DESC,CCLAS_FRZ_FLAG,CCLAS_INS_DT,CCLAS_INS_ID,CCLAS_MOD_DT,CCLAS_MOD_ID,CCLAS_CTL_ACNT_CODE,CCLAS_NGS_CODE,CCLAS_VAL_IC_YN,CCLAS_BROK_AGENT_YN,CCLAS_CBC_YN,CCLAS_DOB_YN,CCLAS_MAX_COMM_PERC FROM lm_cust_class";

		ResultSet headerResultSet = executeQuery(query);

		// Creating the header JSONObject
		JSONObject header = new JSONObject();
		ResultSetMetaData rsmd = headerResultSet.getMetaData();
		int columnCount = rsmd.getColumnCount();
		for (int i = 1; i <= columnCount; i++) {
			String columnName = rsmd.getColumnName(i);
			header.put(columnName, columnName);
		}

		List<LM_CUST_CLASS> exceptions = lmrepo.findAll();

		JSONObject response = new JSONObject();
		response.put("Status", "SUCCESS");
		response.put("Message", getallLmclass);
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
	public String deleteLmClasss(String cclasType) {

		try {
			Optional<LM_CUST_CLASS> optionalEntity = lmrepo.findById(cclasType);

			if (optionalEntity.isPresent()) {
				lmrepo.deleteById(cclasType);

				JSONObject response = new JSONObject();
				response.put("Status", "SUCCESS");
				response.put("Message", "Record with ID " + cclasType + " deleted successfully");
				return response.toString();
			} else {
				JSONObject response = new JSONObject();
				response.put("Status", "ERROR");
				response.put("Message", "Record with ID " + cclasType + " not found");
				return response.toString();
			}
		} catch (Exception e) {
			JSONObject response = new JSONObject();
			response.put("Status", "ERROR");
			response.put("Message", "Error deleting record with ID " + cclasType + ": " + e.getMessage());
			return response.toString();
		}

	}

	@Override
	public String getLMUserById(String cclasType) {

		LM_CUST_CLASS lmCustClass = lmrepo.findById(cclasType)
				.orElseThrow(() -> new RuntimeException("LM CUST CLASS not found"));

		JSONObject response = new JSONObject(lmCustClass);

		response.put("Status", "SUCCESS");
		response.put("Message", "Record with ID " + cclasType + " retrived successfully");
		return response.toString();

	}
}