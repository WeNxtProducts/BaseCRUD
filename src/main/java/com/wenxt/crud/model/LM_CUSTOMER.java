package com.wenxt.crud.model;

import java.time.LocalDateTime;

import jakarta.annotation.Nullable;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "lm_customer")
public class LM_CUSTOMER {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int cust_code;
	private String cust_class;
	private String cust_type;
	private String cust_name;
	private String cust_short_name;
	private String cust_dob;
	private String cust_catg_code;
	@Nullable
	private String cust_addr1;
	@Nullable
	private String cust_addr2;
	@Nullable
	private String cust_addr3;
	@Nullable
	private String cust_contact;
	@Nullable
	private String cust_phone;
	@Nullable
	private String cust_city;
	@Nullable
	private String cust_country;
	@Nullable
	private String cust_mar_status;
	@Nullable
	private String cust_salutation;
	@Nullable
	private String cust_ml_name;
	@Nullable
	private String cust_ml_short_name;
	@Nullable
	private String cust_ml_addr1;
	@Nullable
	private String cust_ml_addr2;
	@Nullable
	private String cust_ml_addr3;
	@Nullable
	private String cust_ml_contact;
	@Nullable
	private String cust_ml_phone;
	@Nullable
	private String cust_ml_city;
	@Nullable
	private String cust_ml_country;

	private String cust_frz_flag;
	@Nullable
	private LocalDateTime cust_ins_dt;
	@Nullable
	private String cust_ins_id;
	@Nullable
	private LocalDateTime cust_mod_dt;
	@Nullable
	private String cust_mod_id;
	@Nullable
	private String cust_national_id;
	@Nullable
	private String cust_credit_days;
	@Nullable
	private String cust_occupation;
	@Nullable
	private String cust_mobile_no;
	@Nullable
	private String cust_qualfn;
	@Nullable
	private LocalDateTime cust_eff_fm_dt;
	@Nullable
	private String cust_eff_to_dt;
	@Nullable
	private String cust_agency_name;
	@Nullable
	private String cust_agent_rank_code;
	@Nullable
	private String cust_lcn_no;
	@Nullable
	private LocalDateTime cust_lic_start_dt;
	@Nullable
	private LocalDateTime cust_lic_end_dt;
	@Nullable
	private LocalDateTime cust_lcn_reg_dt;
	@Nullable
	private String cust_lcn_status;
	@Nullable
	private String cust_spouse_name;
	@Nullable
	private String cust_status;
	@Nullable
	private String cust_flex_01;
	@Nullable
	private String cust_flex_02;
	@Nullable
	private String cust_flex_03;
	@Nullable
	private String cust_flex_04;
	@Nullable
	private String cust_flex_05;
	@Nullable
	private String cust_flex_06;
	@Nullable
	private String cust_flex_07;
	@Nullable
	private String cust_flex_08;
	@Nullable
	private String cust_flex_09;
	@Nullable
	private String cust_flex_10;
	@Nullable
	private String cust_employer_code;
	@Nullable
	private String cust_comp_code;

	public int getCust_code() {
		return cust_code;
	}

	public void setCust_code(int cust_code) {
		this.cust_code = cust_code;
	}

	public String getCust_class() {
		return cust_class;
	}

	public void setCust_class(String cust_class) {
		this.cust_class = cust_class;
	}

	public String getCust_type() {
		return cust_type;
	}

	public void setCust_type(String cust_type) {
		this.cust_type = cust_type;
	}

	public String getCust_name() {
		return cust_name;
	}

	public void setCust_name(String cust_name) {
		this.cust_name = cust_name;
	}

	public String getCust_short_name() {
		return cust_short_name;
	}

	public void setCust_short_name(String cust_short_name) {
		this.cust_short_name = cust_short_name;
	}

	public String getCust_dob() {
		return cust_dob;
	}

	public void setCust_dob(String cust_dob) {
		this.cust_dob = cust_dob;
	}

	public String getCust_catg_code() {
		return cust_catg_code;
	}

	public void setCust_catg_code(String cust_catg_code) {
		this.cust_catg_code = cust_catg_code;
	}

	public String getCust_addr1() {
		return cust_addr1;
	}

	public void setCust_addr1(String cust_addr1) {
		this.cust_addr1 = cust_addr1;
	}

	public String getCust_addr2() {
		return cust_addr2;
	}

	public void setCust_addr2(String cust_addr2) {
		this.cust_addr2 = cust_addr2;
	}

	public String getCust_addr3() {
		return cust_addr3;
	}

	public void setCust_addr3(String cust_addr3) {
		this.cust_addr3 = cust_addr3;
	}

	public String getCust_contact() {
		return cust_contact;
	}

	public void setCust_contact(String cust_contact) {
		this.cust_contact = cust_contact;
	}

	public String getCust_phone() {
		return cust_phone;
	}

	public void setCust_phone(String cust_phone) {
		this.cust_phone = cust_phone;
	}

	public String getCust_city() {
		return cust_city;
	}

	public void setCust_city(String cust_city) {
		this.cust_city = cust_city;
	}

	public String getCust_country() {
		return cust_country;
	}

	public void setCust_country(String cust_country) {
		this.cust_country = cust_country;
	}

	public String getCust_mar_status() {
		return cust_mar_status;
	}

	public void setCust_mar_status(String cust_mar_status) {
		this.cust_mar_status = cust_mar_status;
	}

	public String getCust_salutation() {
		return cust_salutation;
	}

	public void setCust_salutation(String cust_salutation) {
		this.cust_salutation = cust_salutation;
	}

	public String getCust_ml_name() {
		return cust_ml_name;
	}

	public void setCust_ml_name(String cust_ml_name) {
		this.cust_ml_name = cust_ml_name;
	}

	public String getCust_ml_short_name() {
		return cust_ml_short_name;
	}

	public void setCust_ml_short_name(String cust_ml_short_name) {
		this.cust_ml_short_name = cust_ml_short_name;
	}

	public String getCust_ml_addr1() {
		return cust_ml_addr1;
	}

	public void setCust_ml_addr1(String cust_ml_addr1) {
		this.cust_ml_addr1 = cust_ml_addr1;
	}

	public String getCust_ml_addr2() {
		return cust_ml_addr2;
	}

	public void setCust_ml_addr2(String cust_ml_addr2) {
		this.cust_ml_addr2 = cust_ml_addr2;
	}

	public String getCust_ml_addr3() {
		return cust_ml_addr3;
	}

	public void setCust_ml_addr3(String cust_ml_addr3) {
		this.cust_ml_addr3 = cust_ml_addr3;
	}

	public String getCust_ml_contact() {
		return cust_ml_contact;
	}

	public void setCust_ml_contact(String cust_ml_contact) {
		this.cust_ml_contact = cust_ml_contact;
	}

	public String getCust_ml_phone() {
		return cust_ml_phone;
	}

	public void setCust_ml_phone(String cust_ml_phone) {
		this.cust_ml_phone = cust_ml_phone;
	}

	public String getCust_ml_city() {
		return cust_ml_city;
	}

	public void setCust_ml_city(String cust_ml_city) {
		this.cust_ml_city = cust_ml_city;
	}

	public String getCust_ml_country() {
		return cust_ml_country;
	}

	public void setCust_ml_country(String cust_ml_country) {
		this.cust_ml_country = cust_ml_country;
	}

	public String getCust_frz_flag() {
		return cust_frz_flag;
	}

	public void setCust_frz_flag(String cust_frz_flag) {
		this.cust_frz_flag = cust_frz_flag;
	}

	public LocalDateTime getCust_ins_dt() {
		return cust_ins_dt;
	}

	public void setCust_ins_dt(LocalDateTime cust_ins_dt) {
		this.cust_ins_dt = cust_ins_dt;
	}

	public String getCust_ins_id() {
		return cust_ins_id;
	}

	public void setCust_ins_id(String cust_ins_id) {
		this.cust_ins_id = cust_ins_id;
	}

	public LocalDateTime getCust_mod_dt() {
		return cust_mod_dt;
	}

	public void setCust_mod_dt(LocalDateTime cust_mod_dt) {
		this.cust_mod_dt = cust_mod_dt;
	}

	public String getCust_mod_id() {
		return cust_mod_id;
	}

	public void setCust_mod_id(String cust_mod_id) {
		this.cust_mod_id = cust_mod_id;
	}

	public String getCust_national_id() {
		return cust_national_id;
	}

	public void setCust_national_id(String cust_national_id) {
		this.cust_national_id = cust_national_id;
	}

	public String getCust_credit_days() {
		return cust_credit_days;
	}

	public void setCust_credit_days(String cust_credit_days) {
		this.cust_credit_days = cust_credit_days;
	}

	public String getCust_occupation() {
		return cust_occupation;
	}

	public void setCust_occupation(String cust_occupation) {
		this.cust_occupation = cust_occupation;
	}

	public String getCust_mobile_no() {
		return cust_mobile_no;
	}

	public void setCust_mobile_no(String cust_mobile_no) {
		this.cust_mobile_no = cust_mobile_no;
	}

	public String getCust_qualfn() {
		return cust_qualfn;
	}

	public void setCust_qualfn(String cust_qualfn) {
		this.cust_qualfn = cust_qualfn;
	}

	public LocalDateTime getCust_eff_fm_dt() {
		return cust_eff_fm_dt;
	}

	public void setCust_eff_fm_dt(LocalDateTime cust_eff_fm_dt) {
		this.cust_eff_fm_dt = cust_eff_fm_dt;
	}

	public String getCust_eff_to_dt() {
		return cust_eff_to_dt;
	}

	public void setCust_eff_to_dt(String cust_eff_to_dt) {
		this.cust_eff_to_dt = cust_eff_to_dt;
	}

	public String getCust_agency_name() {
		return cust_agency_name;
	}

	public void setCust_agency_name(String cust_agency_name) {
		this.cust_agency_name = cust_agency_name;
	}

	public String getCust_agent_rank_code() {
		return cust_agent_rank_code;
	}

	public void setCust_agent_rank_code(String cust_agent_rank_code) {
		this.cust_agent_rank_code = cust_agent_rank_code;
	}

	public String getCust_lcn_no() {
		return cust_lcn_no;
	}

	public void setCust_lcn_no(String cust_lcn_no) {
		this.cust_lcn_no = cust_lcn_no;
	}

	public LocalDateTime getCust_lic_start_dt() {
		return cust_lic_start_dt;
	}

	public void setCust_lic_start_dt(LocalDateTime cust_lic_start_dt) {
		this.cust_lic_start_dt = cust_lic_start_dt;
	}

	public LocalDateTime getCust_lic_end_dt() {
		return cust_lic_end_dt;
	}

	public void setCust_lic_end_dt(LocalDateTime cust_lic_end_dt) {
		this.cust_lic_end_dt = cust_lic_end_dt;
	}

	public LocalDateTime getCust_lcn_reg_dt() {
		return cust_lcn_reg_dt;
	}

	public void setCust_lcn_reg_dt(LocalDateTime cust_lcn_reg_dt) {
		this.cust_lcn_reg_dt = cust_lcn_reg_dt;
	}

	public String getCust_lcn_status() {
		return cust_lcn_status;
	}

	public void setCust_lcn_status(String cust_lcn_status) {
		this.cust_lcn_status = cust_lcn_status;
	}

	public String getCust_spouse_name() {
		return cust_spouse_name;
	}

	public void setCust_spouse_name(String cust_spouse_name) {
		this.cust_spouse_name = cust_spouse_name;
	}

	public String getCust_status() {
		return cust_status;
	}

	public void setCust_status(String cust_status) {
		this.cust_status = cust_status;
	}

	public String getCust_flex_01() {
		return cust_flex_01;
	}

	public void setCust_flex_01(String cust_flex_01) {
		this.cust_flex_01 = cust_flex_01;
	}

	public String getCust_flex_02() {
		return cust_flex_02;
	}

	public void setCust_flex_02(String cust_flex_02) {
		this.cust_flex_02 = cust_flex_02;
	}

	public String getCust_flex_03() {
		return cust_flex_03;
	}

	public void setCust_flex_03(String cust_flex_03) {
		this.cust_flex_03 = cust_flex_03;
	}

	public String getCust_flex_04() {
		return cust_flex_04;
	}

	public void setCust_flex_04(String cust_flex_04) {
		this.cust_flex_04 = cust_flex_04;
	}

	public String getCust_flex_05() {
		return cust_flex_05;
	}

	public void setCust_flex_05(String cust_flex_05) {
		this.cust_flex_05 = cust_flex_05;
	}

	public String getCust_flex_06() {
		return cust_flex_06;
	}

	public void setCust_flex_06(String cust_flex_06) {
		this.cust_flex_06 = cust_flex_06;
	}

	public String getCust_flex_07() {
		return cust_flex_07;
	}

	public void setCust_flex_07(String cust_flex_07) {
		this.cust_flex_07 = cust_flex_07;
	}

	public String getCust_flex_08() {
		return cust_flex_08;
	}

	public void setCust_flex_08(String cust_flex_08) {
		this.cust_flex_08 = cust_flex_08;
	}

	public String getCust_flex_09() {
		return cust_flex_09;
	}

	public void setCust_flex_09(String cust_flex_09) {
		this.cust_flex_09 = cust_flex_09;
	}

	public String getCust_flex_10() {
		return cust_flex_10;
	}

	public void setCust_flex_10(String cust_flex_10) {
		this.cust_flex_10 = cust_flex_10;
	}

	public String getCust_employer_code() {
		return cust_employer_code;
	}

	public void setCust_employer_code(String cust_employer_code) {
		this.cust_employer_code = cust_employer_code;
	}

	public String getCust_comp_code() {
		return cust_comp_code;
	}

	public void setCust_comp_code(String cust_comp_code) {
		this.cust_comp_code = cust_comp_code;
	}

}
