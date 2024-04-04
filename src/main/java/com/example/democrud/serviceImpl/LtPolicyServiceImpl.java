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

import com.example.democrud.model.LT_POLICY;
import com.example.democrud.reposistory.LtPolicyRepository;
import com.example.democrud.service.LtPolicyService;

@Service
public class LtPolicyServiceImpl implements LtPolicyService {

	@Autowired
	private LtPolicyRepository policyrepo;

	private static final String JDBC_URL = "jdbc:mysql://baseapi.cr4u8emg2x3o.eu-north-1.rds.amazonaws.com:3306/baseapi";
	private static final String USERNAME = "admin";
	private static final String PASSWORD = "D3Vt3aM#92";

	@Value("${insert.message.ltpolicy}")
	private String getallltpolicy;

	@Override
	public String createPolicy(LT_POLICY ltpolicy) {
		if (policyrepo.existsById(ltpolicy.getPol_tran_id())) {
			policyrepo.save(ltpolicy);
			return "Policy information updated successfuly";
		}

		else {
			policyrepo.save(ltpolicy);
			return "Policy information added successfuly";
		}
	}

	@Override
	public String getAllPolicyList() throws SQLException {

		String query = "SELECT pol_tran_id,pol_prop_tran_id,pol_prop_no,pol_divn_code,pol_dept_code,pol_class_code,pol_uw_year,pol_no,pol_issue_dt,pol_start_dt,pol_expiry_dt,pol_plan_code,pol_prod_code,pol_cust_code,pol_assr_code,pol_assured_name,pol_ass_address_1,pol_ass_address_2,pol_ass_address_3,pol_ass_phone_no,pol_ass_area_code,pol_sa_curr_code,pol_sa_exch_rate,pol_cust_curr_code,pol_cust_exch_rate,pol_fc_sum_assured,pol_lc_sum_assured,pol_fc_curr_sa,pol_lc_curr_sa,pol_period,pol_basic_rate,pol_basic_rate_per,pol_fc_basic_prem,pol_lc_basic_prem,pol_fc_addl_prem,pol_lc_addl_prem,pol_fc_occ_load,pol_lc_occ_load,pol_fc_health_load,pol_lc_health_load,pol_fc_deposit_amount,pol_lc_deposit_amount,pol_mode_of_pymt,pol_mode_of_pymt_rate,pol_remarks,pol_first_inst_dt,pol_last_inst_dt,pol_no_yrs_prem_paid,pol_facin_yn,pol_fac_yn,pol_coins_yn,pol_ri_close_flag,pol_fac_close_flag,pol_status,pol_apprv_status,pol_apprv_dt,pol_end_type,pol_end_code,pol_end_no_idx,pol_end_dt,pol_end_no,pol_end_eff_from_dt,pol_end_eff_to_dt,pol_end_desc,pol_ins_dt,pol_ins_id,pol_mod_dt,pol_mod_uid,pol_prem_waive_yn,pol_cancel_dt,pol_paidup_dt,pol_cash_yn,pol_load_perc,pol_doc_type,pol_prop_quot_flag,pol_joint_life_yn,pol_joint_life_age,pol_prem_pay_yrs,pol_employer_code,pol_tariff_term_flag,pol_rate_applied_on,pol_staff_yn,pol_fc_disc_amt,pol_lc_disc_amt,pol_std_risk_yn,pol_fc_first_prem,pol_lc_first_prem,pol_no_of_inst,pol_addl_status,pol_mode_of_calc,pol_pymt_type,pol_fc_tot_sa,pol_lc_tot_sa,pol_fc_net_prem,pol_lc_net_prem,pol_frz_flag,pol_prop_recv_dt,pol_prop_stamp_dt,pol_prop_decl_dt,pol_src_of_bus,pol_postpone_days,pol_postpone_expiry_dt,pol_fac_basis,pol_ri_pool_code,pol_apprv_uid,pol_lc_modal_prem,pol_fc_modal_prem,pol_end_apprv_dt,pol_lc_min_prem,pol_fc_min_prem,pol_fc_extra_prem,pol_lc_extra_prem,pol_stp_yn FROM lt_policy";
		ResultSet headerResultSet = executeQuery(query);

		JSONObject header = new JSONObject();
		ResultSetMetaData rsmd = headerResultSet.getMetaData();
		int columnCount = rsmd.getColumnCount();
		for (int i = 1; i <= columnCount; i++) {
			String columnName = rsmd.getColumnName(i);
			header.put(columnName, columnName);
		}

		List<LT_POLICY> exceptions = policyrepo.findAll();

		JSONObject response = new JSONObject();
		response.put("Status", "SUCCESS");
		response.put("Message", getallltpolicy);
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
	public String getPolicyUserById(Long pol_tran_id) {
		LT_POLICY policy = policyrepo.findById(pol_tran_id)
			    .orElseThrow(() -> new RuntimeException("POLICY ID NOT FOUND"));

		JSONObject response = new JSONObject(policy);

		response.put("Status", "SUCCESS");
		response.put("Message", "Record with ID " + pol_tran_id + " retrived successfully");
		return response.toString();
	}
	

	@Override
	public String deletePolicyUserById(Long pol_tran_id) {
		try {
			Optional<LT_POLICY> optionalEntity = policyrepo.findById(pol_tran_id);

			if (optionalEntity.isPresent()) {
				policyrepo.deleteById(pol_tran_id);

				JSONObject response = new JSONObject();
				response.put("Status", "SUCCESS");
				response.put("Message", "Record with ID " + pol_tran_id + " deleted successfully");
				return response.toString();

			} else {
				JSONObject response = new JSONObject();
				response.put("Status", "ERROR");
				response.put("Message", "Record with ID " + pol_tran_id + " not found");
				return response.toString();
			}
		} catch (Exception e) {
			JSONObject response = new JSONObject();
			response.put("Status", "ERROR");
			response.put("Message", "Error deleting record with ID " + pol_tran_id + ": " + e.getMessage());
			return response.toString();
		}

	}

}
