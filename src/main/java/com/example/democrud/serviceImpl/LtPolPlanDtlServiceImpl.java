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

import com.example.democrud.model.LT_POL_PLAN_DTL;
import com.example.democrud.reposistory.LtPolPlanDtlRepository;
import com.example.democrud.service.LtPolPlanDtlService;

@Service
public class LtPolPlanDtlServiceImpl implements LtPolPlanDtlService {

	@Autowired
	private LtPolPlanDtlRepository planrepo;

	private static final String JDBC_URL = "jdbc:mysql://baseapi.cr4u8emg2x3o.eu-north-1.rds.amazonaws.com:3306/baseapi";
	private static final String USERNAME = "admin";
	private static final String PASSWORD = "D3Vt3aM#92";

	@Value("${insert.message.polNominee}")
	private String getallltpolNominee;

	@Override
	public String createPolPlandtl(LT_POL_PLAN_DTL polplandtl) {
		if (planrepo.existsById(polplandtl.getPPD_TRAN_ID())) {
			planrepo.save(polplandtl);
			return "POL PLAN Updated SUCCESSFULLY";

		} else {

			planrepo.save(polplandtl);
			return "Pol Plan Created Successfully";
		}
	}

	@Override
	public String getAllPlanList() throws SQLException {
		String query = "SELECT PPD_TRAN_ID,PPD_PPH_TRAN_ID,PPD_POL_TRAN_ID,PPD_PLAN_CODE,PPD_PROD_CODE,PPD_COVER_CODE,PPD_SA_TYPE,PPD_SA_PERC,PPD_SA_MONTHS,PPD_SA_LC_LIMIT,PPD_INS_DT,PPD_INS_ID,PPD_MOD_DT,PPD_MOD_ID,PPD_DEPN_APPL_YN,PPD_DEP_RATE,PPD_FC_FCL,PPD_LC_FCL,PPD_EFF_FM_DT,PPD_MAX_CLM_PERC,PPD_PRORATE_REFN_YN,PPD_PRORATE_COLL_YN,PPD_EFF_TO_DT,PPD_MANDATORY_YN,PPD_RATE_TYPE,PPD_RATE_PER,PPD_DEL_FLAG,PPD_REC_TYPE,PPD_FLEX_01,PPD_RI_RATE_TYPE,PPD_RI_RATE,PPD_FAC_RATE_TYPE,PPD_FAC_RATE,PPD_FRM_CODE,PPD_FLEX_02,PPD_MAX_SA,PPD_MIN_SA,PPD_MAX_AGE,PPD_MIN_AGE,PPD_RI_RATE_PER,PPD_FAC_RATE_PER,PPD_RATE,PPD_NET_RATE,PPD_DEDT_AMT,PPD_CUST_PREM,PPD_MAX_NO_INSTAL FROM lt_pol_plan_dtl";

		ResultSet headerResultSet = executeQuery(query);

		JSONObject header = new JSONObject();
		ResultSetMetaData rsmd = headerResultSet.getMetaData();
		int columnCount = rsmd.getColumnCount();
		for (int i = 1; i <= columnCount; i++) {
			String columnName = rsmd.getColumnName(i);
			header.put(columnName, columnName);
		}

		List<LT_POL_PLAN_DTL> exceptions = planrepo.findAll();

		JSONObject response = new JSONObject();
		response.put("Status", "SUCCESS");
		response.put("Message", getallltpolNominee);
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
	public String getPlanDtlById(Long pPD_TRAN_ID) {
		LT_POL_PLAN_DTL polchager = planrepo.findById(pPD_TRAN_ID)
				.orElseThrow(() -> new RuntimeException("LT POL NOMINEE not found"));

		JSONObject response = new JSONObject(polchager);

		response.put("Status", "SUCCESS");
		response.put("Message", "Record with ID " + pPD_TRAN_ID + " retrived successfully");
		return response.toString();
	}

	@Override
	public String deletePlandtlById(Long pPD_TRAN_ID) {
		try {
			Optional<LT_POL_PLAN_DTL> optionalEntity = planrepo.findById(pPD_TRAN_ID);

			if (optionalEntity.isPresent()) {
				planrepo.deleteById(pPD_TRAN_ID);

				JSONObject response = new JSONObject();
				response.put("Status", "SUCCESS");
				response.put("Message", "Record with ID " + pPD_TRAN_ID + " deleted successfully");
				return response.toString();

			} else {
				JSONObject response = new JSONObject();
				response.put("Status", "ERROR");
				response.put("Message", "Record with ID " + pPD_TRAN_ID + " not found");
				return response.toString();
			}
		} catch (Exception e) {
			JSONObject response = new JSONObject();
			response.put("Status", "ERROR");
			response.put("Message", "Error deleting record with ID " + pPD_TRAN_ID + ": " + e.getMessage());
			return response.toString();
		}
	}

}
