package com.wenxt.crud.model;

import java.math.BigDecimal;
import java.util.Date;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "LT_POL_BROKER_DTL")
public class LT_POL_BROKER_DTL {
	
	@Id
	private long pobdTranId;
    private long pobdPobhTranId;
    private Short pobdYearFrom;
    private Short pobdYearTo;
    private String pobdDelFlag;
    private Date pobdInsDt;
    private String pobdInsId;
    private Date pobdModDt;
    private String pobdModUid;
    private BigDecimal pobdRate;
    private Long pobdRatePer;
    private BigDecimal pobdOrgCommRate;
    private BigDecimal pobdCommValue;
    private String pobdCommCode;
    private String pobdCommCoverCode;
	public long getPobdTranId() {
		return pobdTranId;
	}
	public void setPobdTranId(long pobdTranId) {
		this.pobdTranId = pobdTranId;
	}
	public long getPobdPobhTranId() {
		return pobdPobhTranId;
	}
	public void setPobdPobhTranId(long pobdPobhTranId) {
		this.pobdPobhTranId = pobdPobhTranId;
	}
	public Short getPobdYearFrom() {
		return pobdYearFrom;
	}
	public void setPobdYearFrom(Short pobdYearFrom) {
		this.pobdYearFrom = pobdYearFrom;
	}
	public Short getPobdYearTo() {
		return pobdYearTo;
	}
	public void setPobdYearTo(Short pobdYearTo) {
		this.pobdYearTo = pobdYearTo;
	}
	public String getPobdDelFlag() {
		return pobdDelFlag;
	}
	public void setPobdDelFlag(String pobdDelFlag) {
		this.pobdDelFlag = pobdDelFlag;
	}
	public Date getPobdInsDt() {
		return pobdInsDt;
	}
	public void setPobdInsDt(Date pobdInsDt) {
		this.pobdInsDt = pobdInsDt;
	}
	public String getPobdInsId() {
		return pobdInsId;
	}
	public void setPobdInsId(String pobdInsId) {
		this.pobdInsId = pobdInsId;
	}
	public Date getPobdModDt() {
		return pobdModDt;
	}
	public void setPobdModDt(Date pobdModDt) {
		this.pobdModDt = pobdModDt;
	}
	public String getPobdModUid() {
		return pobdModUid;
	}
	public void setPobdModUid(String pobdModUid) {
		this.pobdModUid = pobdModUid;
	}
	public BigDecimal getPobdRate() {
		return pobdRate;
	}
	public void setPobdRate(BigDecimal pobdRate) {
		this.pobdRate = pobdRate;
	}
	public Long getPobdRatePer() {
		return pobdRatePer;
	}
	public void setPobdRatePer(Long pobdRatePer) {
		this.pobdRatePer = pobdRatePer;
	}
	public BigDecimal getPobdOrgCommRate() {
		return pobdOrgCommRate;
	}
	public void setPobdOrgCommRate(BigDecimal pobdOrgCommRate) {
		this.pobdOrgCommRate = pobdOrgCommRate;
	}
	public BigDecimal getPobdCommValue() {
		return pobdCommValue;
	}
	public void setPobdCommValue(BigDecimal pobdCommValue) {
		this.pobdCommValue = pobdCommValue;
	}
	public String getPobdCommCode() {
		return pobdCommCode;
	}
	public void setPobdCommCode(String pobdCommCode) {
		this.pobdCommCode = pobdCommCode;
	}
	public String getPobdCommCoverCode() {
		return pobdCommCoverCode;
	}
	public void setPobdCommCoverCode(String pobdCommCoverCode) {
		this.pobdCommCoverCode = pobdCommCoverCode;
	}

    

	
	
	
}
