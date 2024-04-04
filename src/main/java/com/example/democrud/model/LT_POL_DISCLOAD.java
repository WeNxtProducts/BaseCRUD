package com.example.democrud.model;

import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.Date;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "LT_POL_DISCLOAD")
public class LT_POL_DISCLOAD {

	@Id
	private BigInteger pdTranId;
	private BigInteger pdPolTranId;
	private Short pdSrNo;
	private String pdDiscLoadType;
	private String pdDiscLoadCode;
	private String pdAppliedOn;
	private String pdCoverCode;
	private BigDecimal pdRate;
	private BigInteger pdRatePer;
	private BigDecimal pdFcDiscLoadValue;
	private BigDecimal pdLcDiscLoadValue;
	private String pdDelFlag;
	private Date pdInsDt;
	private String pdInsId;
	private Date pdModDt;
	private String pdModUid;
	private BigDecimal pdApplPerc;
	private BigDecimal pdFcEmrVal;
	private BigDecimal pdLcEmrVal;
	private BigDecimal pdEmrRate;
	private Short pdEndNoIdx;

	public BigInteger getPdTranId() {
		return pdTranId;
	}

	public void setPdTranId(BigInteger pdTranId) {
		this.pdTranId = pdTranId;
	}

	public BigInteger getPdPolTranId() {
		return pdPolTranId;
	}

	public void setPdPolTranId(BigInteger pdPolTranId) {
		this.pdPolTranId = pdPolTranId;
	}

	public Short getPdSrNo() {
		return pdSrNo;
	}

	public void setPdSrNo(Short pdSrNo) {
		this.pdSrNo = pdSrNo;
	}

	public String getPdDiscLoadType() {
		return pdDiscLoadType;
	}

	public void setPdDiscLoadType(String pdDiscLoadType) {
		this.pdDiscLoadType = pdDiscLoadType;
	}

	public String getPdDiscLoadCode() {
		return pdDiscLoadCode;
	}

	public void setPdDiscLoadCode(String pdDiscLoadCode) {
		this.pdDiscLoadCode = pdDiscLoadCode;
	}

	public String getPdAppliedOn() {
		return pdAppliedOn;
	}

	public void setPdAppliedOn(String pdAppliedOn) {
		this.pdAppliedOn = pdAppliedOn;
	}

	public String getPdCoverCode() {
		return pdCoverCode;
	}

	public void setPdCoverCode(String pdCoverCode) {
		this.pdCoverCode = pdCoverCode;
	}

	public BigDecimal getPdRate() {
		return pdRate;
	}

	public void setPdRate(BigDecimal pdRate) {
		this.pdRate = pdRate;
	}

	public BigInteger getPdRatePer() {
		return pdRatePer;
	}

	public void setPdRatePer(BigInteger pdRatePer) {
		this.pdRatePer = pdRatePer;
	}

	public BigDecimal getPdFcDiscLoadValue() {
		return pdFcDiscLoadValue;
	}

	public void setPdFcDiscLoadValue(BigDecimal pdFcDiscLoadValue) {
		this.pdFcDiscLoadValue = pdFcDiscLoadValue;
	}

	public BigDecimal getPdLcDiscLoadValue() {
		return pdLcDiscLoadValue;
	}

	public void setPdLcDiscLoadValue(BigDecimal pdLcDiscLoadValue) {
		this.pdLcDiscLoadValue = pdLcDiscLoadValue;
	}

	public String getPdDelFlag() {
		return pdDelFlag;
	}

	public void setPdDelFlag(String pdDelFlag) {
		this.pdDelFlag = pdDelFlag;
	}

	public Date getPdInsDt() {
		return pdInsDt;
	}

	public void setPdInsDt(Date pdInsDt) {
		this.pdInsDt = pdInsDt;
	}

	public String getPdInsId() {
		return pdInsId;
	}

	public void setPdInsId(String pdInsId) {
		this.pdInsId = pdInsId;
	}

	public Date getPdModDt() {
		return pdModDt;
	}

	public void setPdModDt(Date pdModDt) {
		this.pdModDt = pdModDt;
	}

	public String getPdModUid() {
		return pdModUid;
	}

	public void setPdModUid(String pdModUid) {
		this.pdModUid = pdModUid;
	}

	public BigDecimal getPdApplPerc() {
		return pdApplPerc;
	}

	public void setPdApplPerc(BigDecimal pdApplPerc) {
		this.pdApplPerc = pdApplPerc;
	}

	public BigDecimal getPdFcEmrVal() {
		return pdFcEmrVal;
	}

	public void setPdFcEmrVal(BigDecimal pdFcEmrVal) {
		this.pdFcEmrVal = pdFcEmrVal;
	}

	public BigDecimal getPdLcEmrVal() {
		return pdLcEmrVal;
	}

	public void setPdLcEmrVal(BigDecimal pdLcEmrVal) {
		this.pdLcEmrVal = pdLcEmrVal;
	}

	public BigDecimal getPdEmrRate() {
		return pdEmrRate;
	}

	public void setPdEmrRate(BigDecimal pdEmrRate) {
		this.pdEmrRate = pdEmrRate;
	}

	public Short getPdEndNoIdx() {
		return pdEndNoIdx;
	}

	public void setPdEndNoIdx(Short pdEndNoIdx) {
		this.pdEndNoIdx = pdEndNoIdx;
	}

}
