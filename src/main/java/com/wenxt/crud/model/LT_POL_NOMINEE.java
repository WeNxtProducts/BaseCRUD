package com.wenxt.crud.model;

import java.math.BigDecimal;
import java.time.LocalDateTime;

import com.fasterxml.jackson.annotation.JsonProperty;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "LT_POL_NOMINEE")
public class LT_POL_NOMINEE {

	@Id
	@JsonProperty
	private long PN_TRAN_ID;
	@JsonProperty
	private long PN_POL_TRAN_ID;
	@JsonProperty
	private int PN_SR_NO;
	@JsonProperty
	private String PN_NOM_TYPE;
	@JsonProperty
	private String PN_NOM_NAME;
	@JsonProperty
	private String PN_NOM_NAME_BL;
	@JsonProperty
	private String PN_NOM_CUST_CODE;
	@JsonProperty
	private String PN_CATG_CODE;
	@JsonProperty
	private LocalDateTime PN_DOB;
	@JsonProperty
	private Integer PN_AGE;
	@JsonProperty
	private BigDecimal PN_PERC;
	@JsonProperty
	private String PN_RELATION;
	@JsonProperty
	private String PN_ADDRESS_1;
	@JsonProperty
	private String PN_ADDRESS_2;
	@JsonProperty
	private String PN_ADDRESS_3;
	@JsonProperty
	private String PN_ADDRESS_4;
	@JsonProperty
	private String PN_ADDRESS_5;
	@JsonProperty
	private String PN_ADDRESS_1_BL;
	@JsonProperty
	private String PN_ADDRESS_2_BL;
	@JsonProperty
	private String PN_ADDRESS_3_BL;
	@JsonProperty
	private String PN_ADDRESS_4_BL;
	@JsonProperty
	private String PN_ADDRESS_5_BL;
	@JsonProperty
	private String PN_REMARKS;
	@JsonProperty
	private String PN_REMARKS_BL;
	@JsonProperty
	private String PN_INS_ID;
	@JsonProperty
	private LocalDateTime PN_INS_DT;
	@JsonProperty
	private String PN_MOD_ID;
	@JsonProperty
	private LocalDateTime PN_MOD_DT;
	@JsonProperty
	private String PN_GUARDIAN_NAME;
	@JsonProperty
	private String PN_DEL_FLAG;
	@JsonProperty
	private String PN_REF_ID1;
	@JsonProperty
	private String PN_REF_ID2;
	@JsonProperty
	private Long PN_MICR_CODE;
	@JsonProperty
	private BigDecimal PN_ACNT_NO;
	@JsonProperty
	private String PN_CITY_CODE;
	@JsonProperty
	private String PN_BANK_CODE;
	@JsonProperty
	private String PN_DIVISION;
	@JsonProperty
	private LocalDateTime PN_EFF_FM_DT;
	@JsonProperty
	private LocalDateTime PN_EFF_TO_DT;
	@JsonProperty
	private String PN_GUAR_RELATION;
	@JsonProperty
	private String PN_EMAIL;
	@JsonProperty
	private Double PN_REC_TYPE;
	@JsonProperty
	private String PN_GUAR_UNIQ_ID;
	@JsonProperty
	private String PN_GUAR_ID_TYPE;
	@JsonProperty
	private String PN_NOM_ID_TYPE;
	@JsonProperty
	private BigDecimal PN_MOBILE_NO;

	public long getPN_TRAN_ID() {
		return PN_TRAN_ID;
	}

	public void setPN_TRAN_ID(long pN_TRAN_ID) {
		PN_TRAN_ID = pN_TRAN_ID;
	}

	public long getPN_POL_TRAN_ID() {
		return PN_POL_TRAN_ID;
	}

	public void setPN_POL_TRAN_ID(long pN_POL_TRAN_ID) {
		PN_POL_TRAN_ID = pN_POL_TRAN_ID;
	}

	public int getPN_SR_NO() {
		return PN_SR_NO;
	}

	public void setPN_SR_NO(int pN_SR_NO) {
		PN_SR_NO = pN_SR_NO;
	}

	public String getPN_NOM_TYPE() {
		return PN_NOM_TYPE;
	}

	public void setPN_NOM_TYPE(String pN_NOM_TYPE) {
		PN_NOM_TYPE = pN_NOM_TYPE;
	}

	public String getPN_NOM_NAME() {
		return PN_NOM_NAME;
	}

	public void setPN_NOM_NAME(String pN_NOM_NAME) {
		PN_NOM_NAME = pN_NOM_NAME;
	}

	public String getPN_NOM_NAME_BL() {
		return PN_NOM_NAME_BL;
	}

	public void setPN_NOM_NAME_BL(String pN_NOM_NAME_BL) {
		PN_NOM_NAME_BL = pN_NOM_NAME_BL;
	}

	public String getPN_NOM_CUST_CODE() {
		return PN_NOM_CUST_CODE;
	}

	public void setPN_NOM_CUST_CODE(String pN_NOM_CUST_CODE) {
		PN_NOM_CUST_CODE = pN_NOM_CUST_CODE;
	}

	public String getPN_CATG_CODE() {
		return PN_CATG_CODE;
	}

	public void setPN_CATG_CODE(String pN_CATG_CODE) {
		PN_CATG_CODE = pN_CATG_CODE;
	}

	public LocalDateTime getPN_DOB() {
		return PN_DOB;
	}

	public void setPN_DOB(LocalDateTime pN_DOB) {
		PN_DOB = pN_DOB;
	}

	public Integer getPN_AGE() {
		return PN_AGE;
	}

	public void setPN_AGE(Integer pN_AGE) {
		PN_AGE = pN_AGE;
	}

	public BigDecimal getPN_PERC() {
		return PN_PERC;
	}

	public void setPN_PERC(BigDecimal pN_PERC) {
		PN_PERC = pN_PERC;
	}

	public String getPN_RELATION() {
		return PN_RELATION;
	}

	public void setPN_RELATION(String pN_RELATION) {
		PN_RELATION = pN_RELATION;
	}

	public String getPN_ADDRESS_1() {
		return PN_ADDRESS_1;
	}

	public void setPN_ADDRESS_1(String pN_ADDRESS_1) {
		PN_ADDRESS_1 = pN_ADDRESS_1;
	}

	public String getPN_ADDRESS_2() {
		return PN_ADDRESS_2;
	}

	public void setPN_ADDRESS_2(String pN_ADDRESS_2) {
		PN_ADDRESS_2 = pN_ADDRESS_2;
	}

	public String getPN_ADDRESS_3() {
		return PN_ADDRESS_3;
	}

	public void setPN_ADDRESS_3(String pN_ADDRESS_3) {
		PN_ADDRESS_3 = pN_ADDRESS_3;
	}

	public String getPN_ADDRESS_4() {
		return PN_ADDRESS_4;
	}

	public void setPN_ADDRESS_4(String pN_ADDRESS_4) {
		PN_ADDRESS_4 = pN_ADDRESS_4;
	}

	public String getPN_ADDRESS_5() {
		return PN_ADDRESS_5;
	}

	public void setPN_ADDRESS_5(String pN_ADDRESS_5) {
		PN_ADDRESS_5 = pN_ADDRESS_5;
	}

	public String getPN_ADDRESS_1_BL() {
		return PN_ADDRESS_1_BL;
	}

	public void setPN_ADDRESS_1_BL(String pN_ADDRESS_1_BL) {
		PN_ADDRESS_1_BL = pN_ADDRESS_1_BL;
	}

	public String getPN_ADDRESS_2_BL() {
		return PN_ADDRESS_2_BL;
	}

	public void setPN_ADDRESS_2_BL(String pN_ADDRESS_2_BL) {
		PN_ADDRESS_2_BL = pN_ADDRESS_2_BL;
	}

	public String getPN_ADDRESS_3_BL() {
		return PN_ADDRESS_3_BL;
	}

	public void setPN_ADDRESS_3_BL(String pN_ADDRESS_3_BL) {
		PN_ADDRESS_3_BL = pN_ADDRESS_3_BL;
	}

	public String getPN_ADDRESS_4_BL() {
		return PN_ADDRESS_4_BL;
	}

	public void setPN_ADDRESS_4_BL(String pN_ADDRESS_4_BL) {
		PN_ADDRESS_4_BL = pN_ADDRESS_4_BL;
	}

	public String getPN_ADDRESS_5_BL() {
		return PN_ADDRESS_5_BL;
	}

	public void setPN_ADDRESS_5_BL(String pN_ADDRESS_5_BL) {
		PN_ADDRESS_5_BL = pN_ADDRESS_5_BL;
	}

	public String getPN_REMARKS() {
		return PN_REMARKS;
	}

	public void setPN_REMARKS(String pN_REMARKS) {
		PN_REMARKS = pN_REMARKS;
	}

	public String getPN_REMARKS_BL() {
		return PN_REMARKS_BL;
	}

	public void setPN_REMARKS_BL(String pN_REMARKS_BL) {
		PN_REMARKS_BL = pN_REMARKS_BL;
	}

	public String getPN_INS_ID() {
		return PN_INS_ID;
	}

	public void setPN_INS_ID(String pN_INS_ID) {
		PN_INS_ID = pN_INS_ID;
	}

	public LocalDateTime getPN_INS_DT() {
		return PN_INS_DT;
	}

	public void setPN_INS_DT(LocalDateTime pN_INS_DT) {
		PN_INS_DT = pN_INS_DT;
	}

	public String getPN_MOD_ID() {
		return PN_MOD_ID;
	}

	public void setPN_MOD_ID(String pN_MOD_ID) {
		PN_MOD_ID = pN_MOD_ID;
	}

	public LocalDateTime getPN_MOD_DT() {
		return PN_MOD_DT;
	}

	public void setPN_MOD_DT(LocalDateTime pN_MOD_DT) {
		PN_MOD_DT = pN_MOD_DT;
	}

	public String getPN_GUARDIAN_NAME() {
		return PN_GUARDIAN_NAME;
	}

	public void setPN_GUARDIAN_NAME(String pN_GUARDIAN_NAME) {
		PN_GUARDIAN_NAME = pN_GUARDIAN_NAME;
	}

	public String getPN_DEL_FLAG() {
		return PN_DEL_FLAG;
	}

	public void setPN_DEL_FLAG(String pN_DEL_FLAG) {
		PN_DEL_FLAG = pN_DEL_FLAG;
	}

	public String getPN_REF_ID1() {
		return PN_REF_ID1;
	}

	public void setPN_REF_ID1(String pN_REF_ID1) {
		PN_REF_ID1 = pN_REF_ID1;
	}

	public String getPN_REF_ID2() {
		return PN_REF_ID2;
	}

	public void setPN_REF_ID2(String pN_REF_ID2) {
		PN_REF_ID2 = pN_REF_ID2;
	}

	public Long getPN_MICR_CODE() {
		return PN_MICR_CODE;
	}

	public void setPN_MICR_CODE(Long pN_MICR_CODE) {
		PN_MICR_CODE = pN_MICR_CODE;
	}

	public BigDecimal getPN_ACNT_NO() {
		return PN_ACNT_NO;
	}

	public void setPN_ACNT_NO(BigDecimal pN_ACNT_NO) {
		PN_ACNT_NO = pN_ACNT_NO;
	}

	public String getPN_CITY_CODE() {
		return PN_CITY_CODE;
	}

	public void setPN_CITY_CODE(String pN_CITY_CODE) {
		PN_CITY_CODE = pN_CITY_CODE;
	}

	public String getPN_BANK_CODE() {
		return PN_BANK_CODE;
	}

	public void setPN_BANK_CODE(String pN_BANK_CODE) {
		PN_BANK_CODE = pN_BANK_CODE;
	}

	public String getPN_DIVISION() {
		return PN_DIVISION;
	}

	public void setPN_DIVISION(String pN_DIVISION) {
		PN_DIVISION = pN_DIVISION;
	}

	public LocalDateTime getPN_EFF_FM_DT() {
		return PN_EFF_FM_DT;
	}

	public void setPN_EFF_FM_DT(LocalDateTime pN_EFF_FM_DT) {
		PN_EFF_FM_DT = pN_EFF_FM_DT;
	}

	public LocalDateTime getPN_EFF_TO_DT() {
		return PN_EFF_TO_DT;
	}

	public void setPN_EFF_TO_DT(LocalDateTime pN_EFF_TO_DT) {
		PN_EFF_TO_DT = pN_EFF_TO_DT;
	}

	public String getPN_GUAR_RELATION() {
		return PN_GUAR_RELATION;
	}

	public void setPN_GUAR_RELATION(String pN_GUAR_RELATION) {
		PN_GUAR_RELATION = pN_GUAR_RELATION;
	}

	public String getPN_EMAIL() {
		return PN_EMAIL;
	}

	public void setPN_EMAIL(String pN_EMAIL) {
		PN_EMAIL = pN_EMAIL;
	}

	public Double getPN_REC_TYPE() {
		return PN_REC_TYPE;
	}

	public void setPN_REC_TYPE(Double pN_REC_TYPE) {
		PN_REC_TYPE = pN_REC_TYPE;
	}

	public String getPN_GUAR_UNIQ_ID() {
		return PN_GUAR_UNIQ_ID;
	}

	public void setPN_GUAR_UNIQ_ID(String pN_GUAR_UNIQ_ID) {
		PN_GUAR_UNIQ_ID = pN_GUAR_UNIQ_ID;
	}

	public String getPN_GUAR_ID_TYPE() {
		return PN_GUAR_ID_TYPE;
	}

	public void setPN_GUAR_ID_TYPE(String pN_GUAR_ID_TYPE) {
		PN_GUAR_ID_TYPE = pN_GUAR_ID_TYPE;
	}

	public String getPN_NOM_ID_TYPE() {
		return PN_NOM_ID_TYPE;
	}

	public void setPN_NOM_ID_TYPE(String pN_NOM_ID_TYPE) {
		PN_NOM_ID_TYPE = pN_NOM_ID_TYPE;
	}

	public BigDecimal getPN_MOBILE_NO() {
		return PN_MOBILE_NO;
	}

	public void setPN_MOBILE_NO(BigDecimal pN_MOBILE_NO) {
		PN_MOBILE_NO = pN_MOBILE_NO;
	}

	// Getters and setters

}
