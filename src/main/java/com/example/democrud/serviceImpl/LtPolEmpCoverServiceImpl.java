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

import com.example.democrud.model.LT_POL_EMP_COVER;
import com.example.democrud.reposistory.LtPolEmpCoverRepository;
import com.example.democrud.service.LtPolEmpCoverService;

@Service
public class LtPolEmpCoverServiceImpl implements LtPolEmpCoverService{
	
	@Autowired
	private LtPolEmpCoverRepository empcoverrepo;

	private static final String JDBC_URL = "jdbc:mysql://baseapi.cr4u8emg2x3o.eu-north-1.rds.amazonaws.com:3306/baseapi";
	private static final String USERNAME = "admin";
	private static final String PASSWORD = "D3Vt3aM#92";

	@Value("${insert.message.ltempcover}")
	private String getallltempcover;

	@Override
	public String createEmpCover(LT_POL_EMP_COVER empcover) {
		
//	    if (empcoverrepo.existsById(empcover.getPecTranId())) {
//	    	
//	        Optional<LT_POL_EMP_COVER> existingEmpCover = empcoverrepo.findById(empcover.getPecTranId());
//	        
//	        if (existingEmpCover.isPresent()) {
//	            LT_POL_EMP_COVER existingEmployeeCover = existingEmpCover.get();
//	            if (existingEmployeeCover.getRecVersion() != null && existingEmployeeCover.getRecVersion().equals)) {
//	                // REC_VERSION is 0, proceed with updating the entity
//	                empcoverrepo.save(empcover);
//	                return "Pol Cover updated successfully";
//	            } else {
//	                // REC_VERSION mismatched, return appropriate message
//	                return "REC_VERSION mismatched, cannot update";
//	            }
//	        }
//	    } else {
//	        // Save the new entity
//	        empcoverrepo.save(empcover);
//	        return "Pol Cover created successfully";
//	    }
//	    return "Operation failed"; // Return a default message in case the execution flow reaches here
		
		
		if (empcoverrepo.existsById(empcover.getPecTranId())) {
			empcoverrepo.save(empcover);
			return "polemployee updated successfully";
		} else {
			empcoverrepo.save(empcover);
			return "polemployee created successfully";
		}
	}


	@Override
	public String getAllEmpCoverList() throws SQLException {
		String query = "SELECT PEC_TRAN_ID, PEC_POL_TRAN_ID, PEC_PEMP_TRAN_ID, PEC_COVER_CODE, PEC_FC_SA, PEC_LC_SA, PEC_RATE, PEC_RATE_PER, PEC_FC_PREM, PEC_LC_PREM, PEC_ORG_FC_SA, PEC_ORG_LC_SA, PEC_ORG_FC_PREM, PEC_ORG_LC_PREM, PEC_DEL_FLAG, PEC_INS_DT, PEC_INS_ID, PEC_MOD_DT, PEC_MOD_ID, PEC_FC_CL_PREM, PEC_LC_CL_PREM, PEC_FC_TTY_PREM, PEC_LC_TTY_PREM, PEC_ORG_FC_CL_PREM, PEC_ORG_LC_CL_PREM, PEC_ORG_FC_TTY_PREM, PEC_ORG_LC_TTY_PREM, PEC_REC_TYPE, PEC_FC_RET_PREM, PEC_LC_RET_PREM, PEC_FC_RI_PREM, PEC_LC_RI_PREM, PEC_LC_ACTUAL_SA, PEC_FC_ACTUAL_SA, PEC_ORG_FC_RET_PREM, PEC_ORG_LC_RET_PREM, PEC_ORG_FC_RI_PREM, PEC_ORG_LC_RI_PREM, PEC_ORG_LC_ACTUAL_SA, PEC_ORG_FC_ACTUAL_SA, PEC_EFF_FM_DT, PEC_EFF_TO_DT, PEC_CVR_LINK_SYS_ID, PEC_CVRSA_UPD_YN, PEC_CLM_APPL_YN, PEC_REF_PEMP_SYS_ID, PEC_LC_COVER_FCL, PEC_FC_COVER_FCL, PEC_MEDI_EXAM, PEC_PPD_DEPN_APPL_YN FROM lt_pol_emp_cover";

		ResultSet headerResultSet = executeQuery(query);

		JSONObject header = new JSONObject();
		ResultSetMetaData rsmd = headerResultSet.getMetaData();
		int columnCount = rsmd.getColumnCount();
		for (int i = 1; i <= columnCount; i++) {
			String columnName = rsmd.getColumnName(i);
			header.put(columnName, columnName);
		}

		List<LT_POL_EMP_COVER> exceptions = empcoverrepo.findAll();

		JSONObject response = new JSONObject();
		response.put("Status", "SUCCESS");
		response.put("Message", getallltempcover);
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
	public String getEmpCoverById(Long pecTranId) {
		LT_POL_EMP_COVER polcover = empcoverrepo.findById(pecTranId)
				.orElseThrow(() -> new RuntimeException("LT Pol Emp Cover not found"));

		JSONObject response = new JSONObject(polcover);

		response.put("Status", "SUCCESS");
		response.put("Message", "Record with ID " + pecTranId + " retrived successfully");
		return response.toString();
	}

	@Override
	public String deleteEmpCoverUserById(Long pecTranId) {
		try {
			Optional<LT_POL_EMP_COVER> optionalEntity = empcoverrepo.findById(pecTranId);

			if (optionalEntity.isPresent()) {
				empcoverrepo.deleteById(pecTranId);

				JSONObject response = new JSONObject();
				response.put("Status", "SUCCESS");
				response.put("Message", "Record with ID " + pecTranId + " deleted successfully");
				return response.toString();

			} else {
				JSONObject response = new JSONObject();
				response.put("Status", "ERROR");
				response.put("Message", "Record with ID " + pecTranId + " not found");
				return response.toString();
			}
		} catch (Exception e) {
			JSONObject response = new JSONObject();
			response.put("Status", "ERROR");
			response.put("Message", "Error deleting record with ID " + pecTranId + ": " + e.getMessage());
			return response.toString();
		}
	}
	}

	


