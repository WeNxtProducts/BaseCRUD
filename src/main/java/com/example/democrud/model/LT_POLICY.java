package com.example.democrud.model;

import java.math.BigDecimal;
import java.time.LocalDateTime;

import io.micrometer.common.lang.Nullable;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "LT_POLICY")
public class LT_POLICY {

	@Id
	private Long pol_tran_id;

	private Long pol_prop_tran_id;

	private String pol_prop_no;

	private String pol_divn_code;

	private String pol_dept_code;

	private String pol_class_code;

	private Short pol_uw_year;

	private String pol_no;

	private LocalDateTime pol_issue_dt;

	private LocalDateTime pol_start_dt;

	private LocalDateTime pol_expiry_dt;

	private String pol_plan_code;

	private String pol_prod_code;

	private String pol_cust_code;

	private String pol_assr_code;

	private String pol_assured_name;

	@Nullable
	private String pol_ass_address_1;

	@Nullable
	private String pol_ass_address_2;

	@Nullable
	private String pol_ass_address_3;

	private String pol_ass_phone_no;

	private String pol_ass_area_code;

	private String pol_sa_curr_code;

	private BigDecimal pol_sa_exch_rate;

	private String pol_cust_curr_code;

	private BigDecimal pol_cust_exch_rate;

	private BigDecimal pol_fc_sum_assured;

	private BigDecimal pol_lc_sum_assured;

	private BigDecimal pol_fc_curr_sa;

	private BigDecimal pol_lc_curr_sa;

	private Short pol_period;

	private BigDecimal pol_basic_rate;

	private Long pol_basic_rate_per;

	private BigDecimal pol_fc_basic_prem;

	private BigDecimal pol_lc_basic_prem;

	private BigDecimal pol_fc_addl_prem;

	private BigDecimal pol_lc_addl_prem;

	private BigDecimal pol_fc_occ_load;

	private BigDecimal pol_lc_occ_load;

	private BigDecimal pol_fc_health_load;

	private BigDecimal pol_lc_health_load;

	private BigDecimal pol_fc_deposit_amount;

	private BigDecimal pol_lc_deposit_amount;

	private String pol_mode_of_pymt;

	private BigDecimal pol_mode_of_pymt_rate;

	private String pol_remarks;

	private LocalDateTime pol_first_inst_dt;

	private LocalDateTime pol_last_inst_dt;

	private BigDecimal pol_no_yrs_prem_paid;

	private String pol_facin_yn;

	private String pol_fac_yn;

	private String pol_coins_yn;

	private String pol_ri_close_flag;

	private String pol_fac_close_flag;

	private String pol_status;

	private String pol_apprv_status;

	private LocalDateTime pol_apprv_dt;

	private String pol_end_type;

	private String pol_end_code;

	private Long pol_end_no_idx;

	private LocalDateTime pol_end_dt;

	private String pol_end_no;

	private LocalDateTime pol_end_eff_from_dt;

	private LocalDateTime pol_end_eff_to_dt;

	private String pol_end_desc;

	private LocalDateTime pol_ins_dt;

	private String pol_ins_id;

	private LocalDateTime pol_mod_dt;

	private String pol_mod_uid;

	private String pol_prem_waive_yn;

	private LocalDateTime pol_cancel_dt;

	private LocalDateTime pol_paidup_dt;

	private String pol_cash_yn;

	private BigDecimal pol_load_perc;

	private String pol_doc_type;

	private String pol_prop_quot_flag;

	private String pol_joint_life_yn;

	private Short pol_joint_life_age;

	private Short pol_prem_pay_yrs;

	private String pol_employer_code;

	private String pol_tariff_term_flag;

	private String pol_rate_applied_on;

	private String pol_staff_yn;

	private BigDecimal pol_fc_disc_amt;

	private BigDecimal pol_lc_disc_amt;

	private String pol_std_risk_yn;

	private BigDecimal pol_fc_first_prem;

	private BigDecimal pol_lc_first_prem;

	private Short pol_no_of_inst;

	@Nullable
	private String pol_addl_status;

	private String pol_mode_of_calc;

	private String pol_pymt_type;

	private BigDecimal pol_fc_tot_sa;

	private BigDecimal pol_lc_tot_sa;

	private BigDecimal pol_fc_net_prem;

	private BigDecimal pol_lc_net_prem;

	private String pol_frz_flag;

	private LocalDateTime pol_prop_recv_dt;

	private LocalDateTime pol_prop_stamp_dt;

	private LocalDateTime pol_prop_decl_dt;

	private String pol_src_of_bus;

	private Short pol_postpone_days;

	private LocalDateTime pol_postpone_expiry_dt;

	private String pol_fac_basis;

	private String pol_ri_pool_code;

	private String pol_apprv_uid;

	private BigDecimal pol_lc_modal_prem;

	private BigDecimal pol_fc_modal_prem;

	private LocalDateTime pol_end_apprv_dt;

	private BigDecimal pol_lc_min_prem;

	private BigDecimal pol_fc_min_prem;

	@Nullable
	private BigDecimal pol_fc_extra_prem;

	@Nullable
	private BigDecimal pol_lc_extra_prem;
	@Nullable
	private String pol_stp_yn;
	
	public Long getPol_tran_id() {
		return pol_tran_id;
	}

	public void setPol_tran_id(Long pol_tran_id) {
		this.pol_tran_id = pol_tran_id;
	}

	public Long getPol_prop_tran_id() {
		return pol_prop_tran_id;
	}

	public void setPol_prop_tran_id(Long pol_prop_tran_id) {
		this.pol_prop_tran_id = pol_prop_tran_id;
	}

	public String getPol_prop_no() {
		return pol_prop_no;
	}

	public void setPol_prop_no(String pol_prop_no) {
		this.pol_prop_no = pol_prop_no;
	}

	public String getPol_divn_code() {
		return pol_divn_code;
	}

	public void setPol_divn_code(String pol_divn_code) {
		this.pol_divn_code = pol_divn_code;
	}

	public String getPol_dept_code() {
		return pol_dept_code;
	}

	public void setPol_dept_code(String pol_dept_code) {
		this.pol_dept_code = pol_dept_code;
	}

	public String getPol_class_code() {
		return pol_class_code;
	}

	public void setPol_class_code(String pol_class_code) {
		this.pol_class_code = pol_class_code;
	}

	public Short getPol_uw_year() {
		return pol_uw_year;
	}

	public void setPol_uw_year(Short pol_uw_year) {
		this.pol_uw_year = pol_uw_year;
	}

	public String getPol_no() {
		return pol_no;
	}

	public void setPol_no(String pol_no) {
		this.pol_no = pol_no;
	}

	public LocalDateTime getPol_issue_dt() {
		return pol_issue_dt;
	}

	public void setPol_issue_dt(LocalDateTime pol_issue_dt) {
		this.pol_issue_dt = pol_issue_dt;
	}

	public LocalDateTime getPol_start_dt() {
		return pol_start_dt;
	}

	public void setPol_start_dt(LocalDateTime pol_start_dt) {
		this.pol_start_dt = pol_start_dt;
	}

	public LocalDateTime getPol_expiry_dt() {
		return pol_expiry_dt;
	}

	public void setPol_expiry_dt(LocalDateTime pol_expiry_dt) {
		this.pol_expiry_dt = pol_expiry_dt;
	}

	public String getPol_plan_code() {
		return pol_plan_code;
	}

	public void setPol_plan_code(String pol_plan_code) {
		this.pol_plan_code = pol_plan_code;
	}

	public String getPol_prod_code() {
		return pol_prod_code;
	}

	public void setPol_prod_code(String pol_prod_code) {
		this.pol_prod_code = pol_prod_code;
	}

	public String getPol_cust_code() {
		return pol_cust_code;
	}

	public void setPol_cust_code(String pol_cust_code) {
		this.pol_cust_code = pol_cust_code;
	}

	public String getPol_assr_code() {
		return pol_assr_code;
	}

	public void setPol_assr_code(String pol_assr_code) {
		this.pol_assr_code = pol_assr_code;
	}

	public String getPol_assured_name() {
		return pol_assured_name;
	}

	public void setPol_assured_name(String pol_assured_name) {
		this.pol_assured_name = pol_assured_name;
	}

	public String getPol_ass_address_1() {
		return pol_ass_address_1;
	}

	public void setPol_ass_address_1(String pol_ass_address_1) {
		this.pol_ass_address_1 = pol_ass_address_1;
	}

	public String getPol_ass_address_2() {
		return pol_ass_address_2;
	}

	public void setPol_ass_address_2(String pol_ass_address_2) {
		this.pol_ass_address_2 = pol_ass_address_2;
	}

	public String getPol_ass_address_3() {
		return pol_ass_address_3;
	}

	public void setPol_ass_address_3(String pol_ass_address_3) {
		this.pol_ass_address_3 = pol_ass_address_3;
	}

	public String getPol_ass_phone_no() {
		return pol_ass_phone_no;
	}

	public void setPol_ass_phone_no(String pol_ass_phone_no) {
		this.pol_ass_phone_no = pol_ass_phone_no;
	}

	public String getPol_ass_area_code() {
		return pol_ass_area_code;
	}

	public void setPol_ass_area_code(String pol_ass_area_code) {
		this.pol_ass_area_code = pol_ass_area_code;
	}

	public String getPol_sa_curr_code() {
		return pol_sa_curr_code;
	}

	public void setPol_sa_curr_code(String pol_sa_curr_code) {
		this.pol_sa_curr_code = pol_sa_curr_code;
	}

	public BigDecimal getPol_sa_exch_rate() {
		return pol_sa_exch_rate;
	}

	public void setPol_sa_exch_rate(BigDecimal pol_sa_exch_rate) {
		this.pol_sa_exch_rate = pol_sa_exch_rate;
	}

	public String getPol_cust_curr_code() {
		return pol_cust_curr_code;
	}

	public void setPol_cust_curr_code(String pol_cust_curr_code) {
		this.pol_cust_curr_code = pol_cust_curr_code;
	}

	public BigDecimal getPol_cust_exch_rate() {
		return pol_cust_exch_rate;
	}

	public void setPol_cust_exch_rate(BigDecimal pol_cust_exch_rate) {
		this.pol_cust_exch_rate = pol_cust_exch_rate;
	}

	public BigDecimal getPol_fc_sum_assured() {
		return pol_fc_sum_assured;
	}

	public void setPol_fc_sum_assured(BigDecimal pol_fc_sum_assured) {
		this.pol_fc_sum_assured = pol_fc_sum_assured;
	}

	public BigDecimal getPol_lc_sum_assured() {
		return pol_lc_sum_assured;
	}

	public void setPol_lc_sum_assured(BigDecimal pol_lc_sum_assured) {
		this.pol_lc_sum_assured = pol_lc_sum_assured;
	}

	public BigDecimal getPol_fc_curr_sa() {
		return pol_fc_curr_sa;
	}

	public void setPol_fc_curr_sa(BigDecimal pol_fc_curr_sa) {
		this.pol_fc_curr_sa = pol_fc_curr_sa;
	}

	public BigDecimal getPol_lc_curr_sa() {
		return pol_lc_curr_sa;
	}

	public void setPol_lc_curr_sa(BigDecimal pol_lc_curr_sa) {
		this.pol_lc_curr_sa = pol_lc_curr_sa;
	}

	public Short getPol_period() {
		return pol_period;
	}

	public void setPol_period(Short pol_period) {
		this.pol_period = pol_period;
	}

	public BigDecimal getPol_basic_rate() {
		return pol_basic_rate;
	}

	public void setPol_basic_rate(BigDecimal pol_basic_rate) {
		this.pol_basic_rate = pol_basic_rate;
	}

	public Long getPol_basic_rate_per() {
		return pol_basic_rate_per;
	}

	public void setPol_basic_rate_per(Long pol_basic_rate_per) {
		this.pol_basic_rate_per = pol_basic_rate_per;
	}

	public BigDecimal getPol_fc_basic_prem() {
		return pol_fc_basic_prem;
	}

	public void setPol_fc_basic_prem(BigDecimal pol_fc_basic_prem) {
		this.pol_fc_basic_prem = pol_fc_basic_prem;
	}

	public BigDecimal getPol_lc_basic_prem() {
		return pol_lc_basic_prem;
	}

	public void setPol_lc_basic_prem(BigDecimal pol_lc_basic_prem) {
		this.pol_lc_basic_prem = pol_lc_basic_prem;
	}

	public BigDecimal getPol_fc_addl_prem() {
		return pol_fc_addl_prem;
	}

	public void setPol_fc_addl_prem(BigDecimal pol_fc_addl_prem) {
		this.pol_fc_addl_prem = pol_fc_addl_prem;
	}

	public BigDecimal getPol_lc_addl_prem() {
		return pol_lc_addl_prem;
	}

	public void setPol_lc_addl_prem(BigDecimal pol_lc_addl_prem) {
		this.pol_lc_addl_prem = pol_lc_addl_prem;
	}

	public BigDecimal getPol_fc_occ_load() {
		return pol_fc_occ_load;
	}

	public void setPol_fc_occ_load(BigDecimal pol_fc_occ_load) {
		this.pol_fc_occ_load = pol_fc_occ_load;
	}

	public BigDecimal getPol_lc_occ_load() {
		return pol_lc_occ_load;
	}

	public void setPol_lc_occ_load(BigDecimal pol_lc_occ_load) {
		this.pol_lc_occ_load = pol_lc_occ_load;
	}

	public BigDecimal getPol_fc_health_load() {
		return pol_fc_health_load;
	}

	public void setPol_fc_health_load(BigDecimal pol_fc_health_load) {
		this.pol_fc_health_load = pol_fc_health_load;
	}

	public BigDecimal getPol_lc_health_load() {
		return pol_lc_health_load;
	}

	public void setPol_lc_health_load(BigDecimal pol_lc_health_load) {
		this.pol_lc_health_load = pol_lc_health_load;
	}

	public BigDecimal getPol_fc_deposit_amount() {
		return pol_fc_deposit_amount;
	}

	public void setPol_fc_deposit_amount(BigDecimal pol_fc_deposit_amount) {
		this.pol_fc_deposit_amount = pol_fc_deposit_amount;
	}

	public BigDecimal getPol_lc_deposit_amount() {
		return pol_lc_deposit_amount;
	}

	public void setPol_lc_deposit_amount(BigDecimal pol_lc_deposit_amount) {
		this.pol_lc_deposit_amount = pol_lc_deposit_amount;
	}

	public String getPol_mode_of_pymt() {
		return pol_mode_of_pymt;
	}

	public void setPol_mode_of_pymt(String pol_mode_of_pymt) {
		this.pol_mode_of_pymt = pol_mode_of_pymt;
	}

	public BigDecimal getPol_mode_of_pymt_rate() {
		return pol_mode_of_pymt_rate;
	}

	public void setPol_mode_of_pymt_rate(BigDecimal pol_mode_of_pymt_rate) {
		this.pol_mode_of_pymt_rate = pol_mode_of_pymt_rate;
	}

	public String getPol_remarks() {
		return pol_remarks;
	}

	public void setPol_remarks(String pol_remarks) {
		this.pol_remarks = pol_remarks;
	}

	public LocalDateTime getPol_first_inst_dt() {
		return pol_first_inst_dt;
	}

	public void setPol_first_inst_dt(LocalDateTime pol_first_inst_dt) {
		this.pol_first_inst_dt = pol_first_inst_dt;
	}

	public LocalDateTime getPol_last_inst_dt() {
		return pol_last_inst_dt;
	}

	public void setPol_last_inst_dt(LocalDateTime pol_last_inst_dt) {
		this.pol_last_inst_dt = pol_last_inst_dt;
	}

	public BigDecimal getPol_no_yrs_prem_paid() {
		return pol_no_yrs_prem_paid;
	}

	public void setPol_no_yrs_prem_paid(BigDecimal pol_no_yrs_prem_paid) {
		this.pol_no_yrs_prem_paid = pol_no_yrs_prem_paid;
	}

	public String getPol_facin_yn() {
		return pol_facin_yn;
	}

	public void setPol_facin_yn(String pol_facin_yn) {
		this.pol_facin_yn = pol_facin_yn;
	}

	public String getPol_fac_yn() {
		return pol_fac_yn;
	}

	public void setPol_fac_yn(String pol_fac_yn) {
		this.pol_fac_yn = pol_fac_yn;
	}

	public String getPol_coins_yn() {
		return pol_coins_yn;
	}

	public void setPol_coins_yn(String pol_coins_yn) {
		this.pol_coins_yn = pol_coins_yn;
	}

	public String getPol_ri_close_flag() {
		return pol_ri_close_flag;
	}

	public void setPol_ri_close_flag(String pol_ri_close_flag) {
		this.pol_ri_close_flag = pol_ri_close_flag;
	}

	public String getPol_fac_close_flag() {
		return pol_fac_close_flag;
	}

	public void setPol_fac_close_flag(String pol_fac_close_flag) {
		this.pol_fac_close_flag = pol_fac_close_flag;
	}

	public String getPol_status() {
		return pol_status;
	}

	public void setPol_status(String pol_status) {
		this.pol_status = pol_status;
	}

	public String getPol_apprv_status() {
		return pol_apprv_status;
	}

	public void setPol_apprv_status(String pol_apprv_status) {
		this.pol_apprv_status = pol_apprv_status;
	}

	public LocalDateTime getPol_apprv_dt() {
		return pol_apprv_dt;
	}

	public void setPol_apprv_dt(LocalDateTime pol_apprv_dt) {
		this.pol_apprv_dt = pol_apprv_dt;
	}

	public String getPol_end_type() {
		return pol_end_type;
	}

	public void setPol_end_type(String pol_end_type) {
		this.pol_end_type = pol_end_type;
	}

	public String getPol_end_code() {
		return pol_end_code;
	}

	public void setPol_end_code(String pol_end_code) {
		this.pol_end_code = pol_end_code;
	}

	public Long getPol_end_no_idx() {
		return pol_end_no_idx;
	}

	public void setPol_end_no_idx(Long pol_end_no_idx) {
		this.pol_end_no_idx = pol_end_no_idx;
	}

	public LocalDateTime getPol_end_dt() {
		return pol_end_dt;
	}

	public void setPol_end_dt(LocalDateTime pol_end_dt) {
		this.pol_end_dt = pol_end_dt;
	}

	public String getPol_end_no() {
		return pol_end_no;
	}

	public void setPol_end_no(String pol_end_no) {
		this.pol_end_no = pol_end_no;
	}

	public LocalDateTime getPol_end_eff_from_dt() {
		return pol_end_eff_from_dt;
	}

	public void setPol_end_eff_from_dt(LocalDateTime pol_end_eff_from_dt) {
		this.pol_end_eff_from_dt = pol_end_eff_from_dt;
	}

	public LocalDateTime getPol_end_eff_to_dt() {
		return pol_end_eff_to_dt;
	}

	public void setPol_end_eff_to_dt(LocalDateTime pol_end_eff_to_dt) {
		this.pol_end_eff_to_dt = pol_end_eff_to_dt;
	}

	public String getPol_end_desc() {
		return pol_end_desc;
	}

	public void setPol_end_desc(String pol_end_desc) {
		this.pol_end_desc = pol_end_desc;
	}

	public LocalDateTime getPol_ins_dt() {
		return pol_ins_dt;
	}

	public void setPol_ins_dt(LocalDateTime pol_ins_dt) {
		this.pol_ins_dt = pol_ins_dt;
	}

	public String getPol_ins_id() {
		return pol_ins_id;
	}

	public void setPol_ins_id(String pol_ins_id) {
		this.pol_ins_id = pol_ins_id;
	}

	public LocalDateTime getPol_mod_dt() {
		return pol_mod_dt;
	}

	public void setPol_mod_dt(LocalDateTime pol_mod_dt) {
		this.pol_mod_dt = pol_mod_dt;
	}

	public String getPol_mod_uid() {
		return pol_mod_uid;
	}

	public void setPol_mod_uid(String pol_mod_uid) {
		this.pol_mod_uid = pol_mod_uid;
	}

	public String getPol_prem_waive_yn() {
		return pol_prem_waive_yn;
	}

	public void setPol_prem_waive_yn(String pol_prem_waive_yn) {
		this.pol_prem_waive_yn = pol_prem_waive_yn;
	}

	public LocalDateTime getPol_cancel_dt() {
		return pol_cancel_dt;
	}

	public void setPol_cancel_dt(LocalDateTime pol_cancel_dt) {
		this.pol_cancel_dt = pol_cancel_dt;
	}

	public LocalDateTime getPol_paidup_dt() {
		return pol_paidup_dt;
	}

	public void setPol_paidup_dt(LocalDateTime pol_paidup_dt) {
		this.pol_paidup_dt = pol_paidup_dt;
	}

	public String getPol_cash_yn() {
		return pol_cash_yn;
	}

	public void setPol_cash_yn(String pol_cash_yn) {
		this.pol_cash_yn = pol_cash_yn;
	}

	public BigDecimal getPol_load_perc() {
		return pol_load_perc;
	}

	public void setPol_load_perc(BigDecimal pol_load_perc) {
		this.pol_load_perc = pol_load_perc;
	}

	public String getPol_doc_type() {
		return pol_doc_type;
	}

	public void setPol_doc_type(String pol_doc_type) {
		this.pol_doc_type = pol_doc_type;
	}

	public String getPol_prop_quot_flag() {
		return pol_prop_quot_flag;
	}

	public void setPol_prop_quot_flag(String pol_prop_quot_flag) {
		this.pol_prop_quot_flag = pol_prop_quot_flag;
	}

	public String getPol_joint_life_yn() {
		return pol_joint_life_yn;
	}

	public void setPol_joint_life_yn(String pol_joint_life_yn) {
		this.pol_joint_life_yn = pol_joint_life_yn;
	}

	public Short getPol_joint_life_age() {
		return pol_joint_life_age;
	}

	public void setPol_joint_life_age(Short pol_joint_life_age) {
		this.pol_joint_life_age = pol_joint_life_age;
	}

	public Short getPol_prem_pay_yrs() {
		return pol_prem_pay_yrs;
	}

	public void setPol_prem_pay_yrs(Short pol_prem_pay_yrs) {
		this.pol_prem_pay_yrs = pol_prem_pay_yrs;
	}

	public String getPol_employer_code() {
		return pol_employer_code;
	}

	public void setPol_employer_code(String pol_employer_code) {
		this.pol_employer_code = pol_employer_code;
	}

	public String getPol_tariff_term_flag() {
		return pol_tariff_term_flag;
	}

	public void setPol_tariff_term_flag(String pol_tariff_term_flag) {
		this.pol_tariff_term_flag = pol_tariff_term_flag;
	}

	public String getPol_rate_applied_on() {
		return pol_rate_applied_on;
	}

	public void setPol_rate_applied_on(String pol_rate_applied_on) {
		this.pol_rate_applied_on = pol_rate_applied_on;
	}

	public String getPol_staff_yn() {
		return pol_staff_yn;
	}

	public void setPol_staff_yn(String pol_staff_yn) {
		this.pol_staff_yn = pol_staff_yn;
	}

	public BigDecimal getPol_fc_disc_amt() {
		return pol_fc_disc_amt;
	}

	public void setPol_fc_disc_amt(BigDecimal pol_fc_disc_amt) {
		this.pol_fc_disc_amt = pol_fc_disc_amt;
	}

	public BigDecimal getPol_lc_disc_amt() {
		return pol_lc_disc_amt;
	}

	public void setPol_lc_disc_amt(BigDecimal pol_lc_disc_amt) {
		this.pol_lc_disc_amt = pol_lc_disc_amt;
	}

	public String getPol_std_risk_yn() {
		return pol_std_risk_yn;
	}

	public void setPol_std_risk_yn(String pol_std_risk_yn) {
		this.pol_std_risk_yn = pol_std_risk_yn;
	}

	public BigDecimal getPol_fc_first_prem() {
		return pol_fc_first_prem;
	}

	public void setPol_fc_first_prem(BigDecimal pol_fc_first_prem) {
		this.pol_fc_first_prem = pol_fc_first_prem;
	}

	public BigDecimal getPol_lc_first_prem() {
		return pol_lc_first_prem;
	}

	public void setPol_lc_first_prem(BigDecimal pol_lc_first_prem) {
		this.pol_lc_first_prem = pol_lc_first_prem;
	}

	public Short getPol_no_of_inst() {
		return pol_no_of_inst;
	}

	public void setPol_no_of_inst(Short pol_no_of_inst) {
		this.pol_no_of_inst = pol_no_of_inst;
	}

	public String getPol_addl_status() {
		return pol_addl_status;
	}

	public void setPol_addl_status(String pol_addl_status) {
		this.pol_addl_status = pol_addl_status;
	}

	public String getPol_mode_of_calc() {
		return pol_mode_of_calc;
	}

	public void setPol_mode_of_calc(String pol_mode_of_calc) {
		this.pol_mode_of_calc = pol_mode_of_calc;
	}

	public String getPol_pymt_type() {
		return pol_pymt_type;
	}

	public void setPol_pymt_type(String pol_pymt_type) {
		this.pol_pymt_type = pol_pymt_type;
	}

	public BigDecimal getPol_fc_tot_sa() {
		return pol_fc_tot_sa;
	}

	public void setPol_fc_tot_sa(BigDecimal pol_fc_tot_sa) {
		this.pol_fc_tot_sa = pol_fc_tot_sa;
	}

	public BigDecimal getPol_lc_tot_sa() {
		return pol_lc_tot_sa;
	}

	public void setPol_lc_tot_sa(BigDecimal pol_lc_tot_sa) {
		this.pol_lc_tot_sa = pol_lc_tot_sa;
	}

	public BigDecimal getPol_fc_net_prem() {
		return pol_fc_net_prem;
	}

	public void setPol_fc_net_prem(BigDecimal pol_fc_net_prem) {
		this.pol_fc_net_prem = pol_fc_net_prem;
	}

	public BigDecimal getPol_lc_net_prem() {
		return pol_lc_net_prem;
	}

	public void setPol_lc_net_prem(BigDecimal pol_lc_net_prem) {
		this.pol_lc_net_prem = pol_lc_net_prem;
	}

	public String getPol_frz_flag() {
		return pol_frz_flag;
	}

	public void setPol_frz_flag(String pol_frz_flag) {
		this.pol_frz_flag = pol_frz_flag;
	}

	public LocalDateTime getPol_prop_recv_dt() {
		return pol_prop_recv_dt;
	}

	public void setPol_prop_recv_dt(LocalDateTime pol_prop_recv_dt) {
		this.pol_prop_recv_dt = pol_prop_recv_dt;
	}

	public LocalDateTime getPol_prop_stamp_dt() {
		return pol_prop_stamp_dt;
	}

	public void setPol_prop_stamp_dt(LocalDateTime pol_prop_stamp_dt) {
		this.pol_prop_stamp_dt = pol_prop_stamp_dt;
	}

	public LocalDateTime getPol_prop_decl_dt() {
		return pol_prop_decl_dt;
	}

	public void setPol_prop_decl_dt(LocalDateTime pol_prop_decl_dt) {
		this.pol_prop_decl_dt = pol_prop_decl_dt;
	}

	public String getPol_src_of_bus() {
		return pol_src_of_bus;
	}

	public void setPol_src_of_bus(String pol_src_of_bus) {
		this.pol_src_of_bus = pol_src_of_bus;
	}

	public Short getPol_postpone_days() {
		return pol_postpone_days;
	}

	public void setPol_postpone_days(Short pol_postpone_days) {
		this.pol_postpone_days = pol_postpone_days;
	}

	public LocalDateTime getPol_postpone_expiry_dt() {
		return pol_postpone_expiry_dt;
	}

	public void setPol_postpone_expiry_dt(LocalDateTime pol_postpone_expiry_dt) {
		this.pol_postpone_expiry_dt = pol_postpone_expiry_dt;
	}

	public String getPol_fac_basis() {
		return pol_fac_basis;
	}

	public void setPol_fac_basis(String pol_fac_basis) {
		this.pol_fac_basis = pol_fac_basis;
	}

	public String getPol_ri_pool_code() {
		return pol_ri_pool_code;
	}

	public void setPol_ri_pool_code(String pol_ri_pool_code) {
		this.pol_ri_pool_code = pol_ri_pool_code;
	}

	public String getPol_apprv_uid() {
		return pol_apprv_uid;
	}

	public void setPol_apprv_uid(String pol_apprv_uid) {
		this.pol_apprv_uid = pol_apprv_uid;
	}

	public BigDecimal getPol_lc_modal_prem() {
		return pol_lc_modal_prem;
	}

	public void setPol_lc_modal_prem(BigDecimal pol_lc_modal_prem) {
		this.pol_lc_modal_prem = pol_lc_modal_prem;
	}

	public BigDecimal getPol_fc_modal_prem() {
		return pol_fc_modal_prem;
	}

	public void setPol_fc_modal_prem(BigDecimal pol_fc_modal_prem) {
		this.pol_fc_modal_prem = pol_fc_modal_prem;
	}

	public LocalDateTime getPol_end_apprv_dt() {
		return pol_end_apprv_dt;
	}

	public void setPol_end_apprv_dt(LocalDateTime pol_end_apprv_dt) {
		this.pol_end_apprv_dt = pol_end_apprv_dt;
	}

	public BigDecimal getPol_lc_min_prem() {
		return pol_lc_min_prem;
	}

	public void setPol_lc_min_prem(BigDecimal pol_lc_min_prem) {
		this.pol_lc_min_prem = pol_lc_min_prem;
	}

	public BigDecimal getPol_fc_min_prem() {
		return pol_fc_min_prem;
	}

	public void setPol_fc_min_prem(BigDecimal pol_fc_min_prem) {
		this.pol_fc_min_prem = pol_fc_min_prem;
	}

	public BigDecimal getPol_fc_extra_prem() {
		return pol_fc_extra_prem;
	}

	public void setPol_fc_extra_prem(BigDecimal pol_fc_extra_prem) {
		this.pol_fc_extra_prem = pol_fc_extra_prem;
	}

	public BigDecimal getPol_lc_extra_prem() {
		return pol_lc_extra_prem;
	}

	public void setPol_lc_extra_prem(BigDecimal pol_lc_extra_prem) {
		this.pol_lc_extra_prem = pol_lc_extra_prem;
	}

	public String getPol_stp_yn() {
		return pol_stp_yn;
	}

	public void setPol_stp_yn(String pol_stp_yn) {
		this.pol_stp_yn = pol_stp_yn;
	}

	
	
}
