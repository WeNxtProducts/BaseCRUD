package com.example.democrud.model;

import java.util.Date;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="LT_CLAIM_ESTIMATE")
public class LT_CLAIM_ESTIMATE {
	
	@Id
    private long ce_TRAN_id;
    private long ce_claim_TRAN_id;
    private String ce_est_setl_unit;
    private short ce_est_no_of_units;
    private double ce_lc_est_amt;
    private double ce_fc_est_amt;
    private double ce_lc_prem_os;
    private double ce_fc_prem_os;
    private double ce_lc_loan_os;
    private double ce_fc_loan_os;
    private double ce_lc_loan_int;
    private double ce_fc_loan_int;
    private double ce_lc_acc_profit;
    private double ce_fc_acc_profit;
    private double ce_lc_net_est_amt;
    private double ce_fc_net_est_amt;
    private String ce_act_setl_unit;
    private short ce_act_no_of_units;
    private Date ce_setl_start_dt;
    private double ce_lc_paid_amt;
    private double ce_fc_paid_amt;
    private String ce_ref_no;
    private String ce_remarks;
    private String ce_frz_flag;
    private String ce_close_flag;
    private String ce_INS_id;
    private Date ce_INS_dt;
    private String ce_MOD_id;
    private Date ce_MOD_dt;
    private double ce_lc_prem_os_int;
    private double ce_fc_prem_os_int;
    private double ce_unit_lc_amt;
    private double ce_unit_fc_amt;
    private String ce_unpaid_prem_flag;
    private double ce_total_chrg_amt;
    private double ce_cash_back_fc_value;
    private double ce_cash_back_lc_value;
    private double ce_fc_excess_amt;
    private double ce_lc_excess_amt;
    private double ce_asst_sepr_pup_amt;
    private double ce_asst_sepr_new_sa;
    private double ce_asst_sepr_bon;
	public long getCe_TRAN_id() {
		return ce_TRAN_id;
	}
	public void setCe_TRAN_id(long ce_TRAN_id) {
		this.ce_TRAN_id = ce_TRAN_id;
	}
	public long getCe_claim_TRAN_id() {
		return ce_claim_TRAN_id;
	}
	public void setCe_claim_TRAN_id(long ce_claim_TRAN_id) {
		this.ce_claim_TRAN_id = ce_claim_TRAN_id;
	}
	public String getCe_est_setl_unit() {
		return ce_est_setl_unit;
	}
	public void setCe_est_setl_unit(String ce_est_setl_unit) {
		this.ce_est_setl_unit = ce_est_setl_unit;
	}
	public short getCe_est_no_of_units() {
		return ce_est_no_of_units;
	}
	public void setCe_est_no_of_units(short ce_est_no_of_units) {
		this.ce_est_no_of_units = ce_est_no_of_units;
	}
	public double getCe_lc_est_amt() {
		return ce_lc_est_amt;
	}
	public void setCe_lc_est_amt(double ce_lc_est_amt) {
		this.ce_lc_est_amt = ce_lc_est_amt;
	}
	public double getCe_fc_est_amt() {
		return ce_fc_est_amt;
	}
	public void setCe_fc_est_amt(double ce_fc_est_amt) {
		this.ce_fc_est_amt = ce_fc_est_amt;
	}
	public double getCe_lc_prem_os() {
		return ce_lc_prem_os;
	}
	public void setCe_lc_prem_os(double ce_lc_prem_os) {
		this.ce_lc_prem_os = ce_lc_prem_os;
	}
	public double getCe_fc_prem_os() {
		return ce_fc_prem_os;
	}
	public void setCe_fc_prem_os(double ce_fc_prem_os) {
		this.ce_fc_prem_os = ce_fc_prem_os;
	}
	public double getCe_lc_loan_os() {
		return ce_lc_loan_os;
	}
	public void setCe_lc_loan_os(double ce_lc_loan_os) {
		this.ce_lc_loan_os = ce_lc_loan_os;
	}
	public double getCe_fc_loan_os() {
		return ce_fc_loan_os;
	}
	public void setCe_fc_loan_os(double ce_fc_loan_os) {
		this.ce_fc_loan_os = ce_fc_loan_os;
	}
	public double getCe_lc_loan_int() {
		return ce_lc_loan_int;
	}
	public void setCe_lc_loan_int(double ce_lc_loan_int) {
		this.ce_lc_loan_int = ce_lc_loan_int;
	}
	public double getCe_fc_loan_int() {
		return ce_fc_loan_int;
	}
	public void setCe_fc_loan_int(double ce_fc_loan_int) {
		this.ce_fc_loan_int = ce_fc_loan_int;
	}
	public double getCe_lc_acc_profit() {
		return ce_lc_acc_profit;
	}
	public void setCe_lc_acc_profit(double ce_lc_acc_profit) {
		this.ce_lc_acc_profit = ce_lc_acc_profit;
	}
	public double getCe_fc_acc_profit() {
		return ce_fc_acc_profit;
	}
	public void setCe_fc_acc_profit(double ce_fc_acc_profit) {
		this.ce_fc_acc_profit = ce_fc_acc_profit;
	}
	public double getCe_lc_net_est_amt() {
		return ce_lc_net_est_amt;
	}
	public void setCe_lc_net_est_amt(double ce_lc_net_est_amt) {
		this.ce_lc_net_est_amt = ce_lc_net_est_amt;
	}
	public double getCe_fc_net_est_amt() {
		return ce_fc_net_est_amt;
	}
	public void setCe_fc_net_est_amt(double ce_fc_net_est_amt) {
		this.ce_fc_net_est_amt = ce_fc_net_est_amt;
	}
	public String getCe_act_setl_unit() {
		return ce_act_setl_unit;
	}
	public void setCe_act_setl_unit(String ce_act_setl_unit) {
		this.ce_act_setl_unit = ce_act_setl_unit;
	}
	public short getCe_act_no_of_units() {
		return ce_act_no_of_units;
	}
	public void setCe_act_no_of_units(short ce_act_no_of_units) {
		this.ce_act_no_of_units = ce_act_no_of_units;
	}
	public Date getCe_setl_start_dt() {
		return ce_setl_start_dt;
	}
	public void setCe_setl_start_dt(Date ce_setl_start_dt) {
		this.ce_setl_start_dt = ce_setl_start_dt;
	}
	public double getCe_lc_paid_amt() {
		return ce_lc_paid_amt;
	}
	public void setCe_lc_paid_amt(double ce_lc_paid_amt) {
		this.ce_lc_paid_amt = ce_lc_paid_amt;
	}
	public double getCe_fc_paid_amt() {
		return ce_fc_paid_amt;
	}
	public void setCe_fc_paid_amt(double ce_fc_paid_amt) {
		this.ce_fc_paid_amt = ce_fc_paid_amt;
	}
	public String getCe_ref_no() {
		return ce_ref_no;
	}
	public void setCe_ref_no(String ce_ref_no) {
		this.ce_ref_no = ce_ref_no;
	}
	public String getCe_remarks() {
		return ce_remarks;
	}
	public void setCe_remarks(String ce_remarks) {
		this.ce_remarks = ce_remarks;
	}
	public String getCe_frz_flag() {
		return ce_frz_flag;
	}
	public void setCe_frz_flag(String ce_frz_flag) {
		this.ce_frz_flag = ce_frz_flag;
	}
	public String getCe_close_flag() {
		return ce_close_flag;
	}
	public void setCe_close_flag(String ce_close_flag) {
		this.ce_close_flag = ce_close_flag;
	}
	public String getCe_INS_id() {
		return ce_INS_id;
	}
	public void setCe_INS_id(String ce_INS_id) {
		this.ce_INS_id = ce_INS_id;
	}
	public Date getCe_INS_dt() {
		return ce_INS_dt;
	}
	public void setCe_INS_dt(Date ce_INS_dt) {
		this.ce_INS_dt = ce_INS_dt;
	}
	public String getCe_MOD_id() {
		return ce_MOD_id;
	}
	public void setCe_MOD_id(String ce_MOD_id) {
		this.ce_MOD_id = ce_MOD_id;
	}
	public Date getCe_MOD_dt() {
		return ce_MOD_dt;
	}
	public void setCe_MOD_dt(Date ce_MOD_dt) {
		this.ce_MOD_dt = ce_MOD_dt;
	}
	public double getCe_lc_prem_os_int() {
		return ce_lc_prem_os_int;
	}
	public void setCe_lc_prem_os_int(double ce_lc_prem_os_int) {
		this.ce_lc_prem_os_int = ce_lc_prem_os_int;
	}
	public double getCe_fc_prem_os_int() {
		return ce_fc_prem_os_int;
	}
	public void setCe_fc_prem_os_int(double ce_fc_prem_os_int) {
		this.ce_fc_prem_os_int = ce_fc_prem_os_int;
	}
	public double getCe_unit_lc_amt() {
		return ce_unit_lc_amt;
	}
	public void setCe_unit_lc_amt(double ce_unit_lc_amt) {
		this.ce_unit_lc_amt = ce_unit_lc_amt;
	}
	public double getCe_unit_fc_amt() {
		return ce_unit_fc_amt;
	}
	public void setCe_unit_fc_amt(double ce_unit_fc_amt) {
		this.ce_unit_fc_amt = ce_unit_fc_amt;
	}
	public String getCe_unpaid_prem_flag() {
		return ce_unpaid_prem_flag;
	}
	public void setCe_unpaid_prem_flag(String ce_unpaid_prem_flag) {
		this.ce_unpaid_prem_flag = ce_unpaid_prem_flag;
	}
	public double getCe_total_chrg_amt() {
		return ce_total_chrg_amt;
	}
	public void setCe_total_chrg_amt(double ce_total_chrg_amt) {
		this.ce_total_chrg_amt = ce_total_chrg_amt;
	}
	public double getCe_cash_back_fc_value() {
		return ce_cash_back_fc_value;
	}
	public void setCe_cash_back_fc_value(double ce_cash_back_fc_value) {
		this.ce_cash_back_fc_value = ce_cash_back_fc_value;
	}
	public double getCe_cash_back_lc_value() {
		return ce_cash_back_lc_value;
	}
	public void setCe_cash_back_lc_value(double ce_cash_back_lc_value) {
		this.ce_cash_back_lc_value = ce_cash_back_lc_value;
	}
	public double getCe_fc_excess_amt() {
		return ce_fc_excess_amt;
	}
	public void setCe_fc_excess_amt(double ce_fc_excess_amt) {
		this.ce_fc_excess_amt = ce_fc_excess_amt;
	}
	public double getCe_lc_excess_amt() {
		return ce_lc_excess_amt;
	}
	public void setCe_lc_excess_amt(double ce_lc_excess_amt) {
		this.ce_lc_excess_amt = ce_lc_excess_amt;
	}
	public double getCe_asst_sepr_pup_amt() {
		return ce_asst_sepr_pup_amt;
	}
	public void setCe_asst_sepr_pup_amt(double ce_asst_sepr_pup_amt) {
		this.ce_asst_sepr_pup_amt = ce_asst_sepr_pup_amt;
	}
	public double getCe_asst_sepr_new_sa() {
		return ce_asst_sepr_new_sa;
	}
	public void setCe_asst_sepr_new_sa(double ce_asst_sepr_new_sa) {
		this.ce_asst_sepr_new_sa = ce_asst_sepr_new_sa;
	}
	public double getCe_asst_sepr_bon() {
		return ce_asst_sepr_bon;
	}
	public void setCe_asst_sepr_bon(double ce_asst_sepr_bon) {
		this.ce_asst_sepr_bon = ce_asst_sepr_bon;
	}

 
}

