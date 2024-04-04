package com.example.democrud.model;

import java.util.Date;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "lm_cust_divn")
public class LM_CUST_DIVN {

	@Id
	private String cdivCustCode;

	private String cdivDivnCode;

	private String cdivFrzFlag;
	private Date cdivCrDt;
	private String cdivCrUid;
	private Date cdivUpdDt;
	private String cdivUpdUid;

	// Constructors
	public LM_CUST_DIVN() {
	}

	public LM_CUST_DIVN(String cdivCustCode, String cdivDivnCode) {
		this.cdivCustCode = cdivCustCode;
		this.cdivDivnCode = cdivDivnCode;
	}

	public String getCdivCustCode() {
		return cdivCustCode;
	}

	public void setCdivCustCode(String cdivCustCode) {
		this.cdivCustCode = cdivCustCode;
	}

	public String getCdivDivnCode() {
		return cdivDivnCode;
	}

	public void setCdivDivnCode(String cdivDivnCode) {
		this.cdivDivnCode = cdivDivnCode;
	}

	public String getCdivFrzFlag() {
		return cdivFrzFlag;
	}

	public void setCdivFrzFlag(String cdivFrzFlag) {
		this.cdivFrzFlag = cdivFrzFlag;
	}

	public Date getCdivCrDt() {
		return cdivCrDt;
	}

	public void setCdivCrDt(Date cdivCrDt) {
		this.cdivCrDt = cdivCrDt;
	}

	public String getCdivCrUid() {
		return cdivCrUid;
	}

	public void setCdivCrUid(String cdivCrUid) {
		this.cdivCrUid = cdivCrUid;
	}

	public Date getCdivUpdDt() {
		return cdivUpdDt;
	}

	public void setCdivUpdDt(Date cdivUpdDt) {
		this.cdivUpdDt = cdivUpdDt;
	}

	public String getCdivUpdUid() {
		return cdivUpdUid;
	}

	public void setCdivUpdUid(String cdivUpdUid) {
		this.cdivUpdUid = cdivUpdUid;
	}

}
