package com.example.democrud.model;

import java.util.Date;

import com.fasterxml.jackson.annotation.JsonProperty;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;


@Entity
@Table(name="LT_POL_PLAN_HDR")
public class LT_POL_PLAN_HDR {

	
	@Id
	@JsonProperty("pph_tran_id")
	private Integer pph_tran_id;

	@JsonProperty("pph_pol_tran_id")
	private Integer pph_pol_tran_id;

	@JsonProperty("pph_prod_code")
	private String pph_prod_code;

	@JsonProperty("pph_plan_code")
	private String pph_plan_code;

	@JsonProperty("pph_cr_dt")
	private Date pph_cr_dt;

	@JsonProperty("pph_cr_uid")
	private String pph_cr_uid;

	@JsonProperty("pph_upd_uid")
	private String pph_upd_uid;

	@JsonProperty("pph_upd_dt")
	private Date pph_upd_dt;

	@JsonProperty("pph_default_yn")
	private String pph_default_yn;

	@JsonProperty("pph_del_flag")
	private String pph_del_flag;

	@JsonProperty("pph_rec_type")
	private String pph_rec_type;

	@JsonProperty("pph_cust_prof")
	private String pph_cust_prof;

	@JsonProperty("pph_yr_limit")
	private Integer pph_yr_limit;



	public Integer getPph_tran_id() {
		return pph_tran_id;
	}

	public void setPph_tran_id(Integer pph_tran_id) {
		this.pph_tran_id = pph_tran_id;
	}

	public Integer getPph_pol_tran_id() {
		return pph_pol_tran_id;
	}

	public void setPph_pol_tran_id(Integer pph_pol_tran_id) {
		this.pph_pol_tran_id = pph_pol_tran_id;
	}

	public String getPph_prod_code() {
		return pph_prod_code;
	}

	public void setPph_prod_code(String pph_prod_code) {
		this.pph_prod_code = pph_prod_code;
	}

	public String getPph_plan_code() {
		return pph_plan_code;
	}

	public void setPph_plan_code(String pph_plan_code) {
		this.pph_plan_code = pph_plan_code;
	}

	public Date getPph_cr_dt() {
		return pph_cr_dt;
	}

	public void setPph_cr_dt(Date pph_cr_dt) {
		this.pph_cr_dt = pph_cr_dt;
	}

	public String getPph_cr_uid() {
		return pph_cr_uid;
	}

	public void setPph_cr_uid(String pph_cr_uid) {
		this.pph_cr_uid = pph_cr_uid;
	}

	public String getPph_upd_uid() {
		return pph_upd_uid;
	}

	public void setPph_upd_uid(String pph_upd_uid) {
		this.pph_upd_uid = pph_upd_uid;
	}

	public Date getPph_upd_dt() {
		return pph_upd_dt;
	}

	public void setPph_upd_dt(Date pph_upd_dt) {
		this.pph_upd_dt = pph_upd_dt;
	}

	public String getPph_default_yn() {
		return pph_default_yn;
	}

	public void setPph_default_yn(String pph_default_yn) {
		this.pph_default_yn = pph_default_yn;
	}

	public String getPph_del_flag() {
		return pph_del_flag;
	}

	public void setPph_del_flag(String pph_del_flag) {
		this.pph_del_flag = pph_del_flag;
	}

	public String getPph_rec_type() {
		return pph_rec_type;
	}

	public void setPph_rec_type(String pph_rec_type) {
		this.pph_rec_type = pph_rec_type;
	}

	public String getPph_cust_prof() {
		return pph_cust_prof;
	}

	public void setPph_cust_prof(String pph_cust_prof) {
		this.pph_cust_prof = pph_cust_prof;
	}

	public Integer getPph_yr_limit() {
		return pph_yr_limit;
	}

	public void setPph_yr_limit(Integer pph_yr_limit) {
		this.pph_yr_limit = pph_yr_limit;
	}

}
