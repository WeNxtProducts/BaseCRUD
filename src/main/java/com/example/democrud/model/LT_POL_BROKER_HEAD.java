package com.example.democrud.model;

import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.Date;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "LT_POL_BROKER_HEAD")
public class LT_POL_BROKER_HEAD {

    @Id
    private BigInteger pobhTranId;
    private BigInteger pobhPolTranId;
    private String pobhBrokerCode;
    private String pobhCoverCode;
    private String pobhBrokerCurrCode;
    private String pobhRemarks;
    private String pobhDelFlag;
    private Date pobhInsDt;
    private String pobhInsId;
    private Date pobhModDt;
    private String pobhModId;
    private String pobhCommCode;
    private Short pobhSrno;
    private Short pobhApplyOnSrno;
    private String pobhActingAgentYn;
    private String pobhAgentRankCode;
    private BigDecimal pobhAgentLevel;
    private String pobhMktCode;
    private String pobhUnitCode;
    private String pobhAgencyBranchCode;
    private String pobhRegionCode;
    private String pobhAgencyCode;
    private String pobhRecruiterCode;
    private BigDecimal pobhFcCommission;
    private BigDecimal pobhLcCommission;
    private String pobhEmailId;
    private BigDecimal pobhOrgRate;
    private BigDecimal pobhOrgValue;
    private BigDecimal pobhRate;
    private BigDecimal pobhValue;
    private Short pobhSharePerc;
    private String pobhParentCode;
    private String pobhAgentHeirchy;
	public BigInteger getPobhTranId() {
		return pobhTranId;
	}
	public void setPobhTranId(BigInteger pobhTranId) {
		this.pobhTranId = pobhTranId;
	}
	public BigInteger getPobhPolTranId() {
		return pobhPolTranId;
	}
	public void setPobhPolTranId(BigInteger pobhPolTranId) {
		this.pobhPolTranId = pobhPolTranId;
	}
	public String getPobhBrokerCode() {
		return pobhBrokerCode;
	}
	public void setPobhBrokerCode(String pobhBrokerCode) {
		this.pobhBrokerCode = pobhBrokerCode;
	}
	public String getPobhCoverCode() {
		return pobhCoverCode;
	}
	public void setPobhCoverCode(String pobhCoverCode) {
		this.pobhCoverCode = pobhCoverCode;
	}
	public String getPobhBrokerCurrCode() {
		return pobhBrokerCurrCode;
	}
	public void setPobhBrokerCurrCode(String pobhBrokerCurrCode) {
		this.pobhBrokerCurrCode = pobhBrokerCurrCode;
	}
	public String getPobhRemarks() {
		return pobhRemarks;
	}
	public void setPobhRemarks(String pobhRemarks) {
		this.pobhRemarks = pobhRemarks;
	}
	public String getPobhDelFlag() {
		return pobhDelFlag;
	}
	public void setPobhDelFlag(String pobhDelFlag) {
		this.pobhDelFlag = pobhDelFlag;
	}
	public Date getPobhInsDt() {
		return pobhInsDt;
	}
	public void setPobhInsDt(Date pobhInsDt) {
		this.pobhInsDt = pobhInsDt;
	}
	public String getPobhInsId() {
		return pobhInsId;
	}
	public void setPobhInsId(String pobhInsId) {
		this.pobhInsId = pobhInsId;
	}
	public Date getPobhModDt() {
		return pobhModDt;
	}
	public void setPobhModDt(Date pobhModDt) {
		this.pobhModDt = pobhModDt;
	}
	public String getPobhModId() {
		return pobhModId;
	}
	public void setPobhModId(String pobhModId) {
		this.pobhModId = pobhModId;
	}
	public String getPobhCommCode() {
		return pobhCommCode;
	}
	public void setPobhCommCode(String pobhCommCode) {
		this.pobhCommCode = pobhCommCode;
	}
	public Short getPobhSrno() {
		return pobhSrno;
	}
	public void setPobhSrno(Short pobhSrno) {
		this.pobhSrno = pobhSrno;
	}
	public Short getPobhApplyOnSrno() {
		return pobhApplyOnSrno;
	}
	public void setPobhApplyOnSrno(Short pobhApplyOnSrno) {
		this.pobhApplyOnSrno = pobhApplyOnSrno;
	}
	public String getPobhActingAgentYn() {
		return pobhActingAgentYn;
	}
	public void setPobhActingAgentYn(String pobhActingAgentYn) {
		this.pobhActingAgentYn = pobhActingAgentYn;
	}
	public String getPobhAgentRankCode() {
		return pobhAgentRankCode;
	}
	public void setPobhAgentRankCode(String pobhAgentRankCode) {
		this.pobhAgentRankCode = pobhAgentRankCode;
	}
	public BigDecimal getPobhAgentLevel() {
		return pobhAgentLevel;
	}
	public void setPobhAgentLevel(BigDecimal pobhAgentLevel) {
		this.pobhAgentLevel = pobhAgentLevel;
	}
	public String getPobhMktCode() {
		return pobhMktCode;
	}
	public void setPobhMktCode(String pobhMktCode) {
		this.pobhMktCode = pobhMktCode;
	}
	public String getPobhUnitCode() {
		return pobhUnitCode;
	}
	public void setPobhUnitCode(String pobhUnitCode) {
		this.pobhUnitCode = pobhUnitCode;
	}
	public String getPobhAgencyBranchCode() {
		return pobhAgencyBranchCode;
	}
	public void setPobhAgencyBranchCode(String pobhAgencyBranchCode) {
		this.pobhAgencyBranchCode = pobhAgencyBranchCode;
	}
	public String getPobhRegionCode() {
		return pobhRegionCode;
	}
	public void setPobhRegionCode(String pobhRegionCode) {
		this.pobhRegionCode = pobhRegionCode;
	}
	public String getPobhAgencyCode() {
		return pobhAgencyCode;
	}
	public void setPobhAgencyCode(String pobhAgencyCode) {
		this.pobhAgencyCode = pobhAgencyCode;
	}
	public String getPobhRecruiterCode() {
		return pobhRecruiterCode;
	}
	public void setPobhRecruiterCode(String pobhRecruiterCode) {
		this.pobhRecruiterCode = pobhRecruiterCode;
	}
	public BigDecimal getPobhFcCommission() {
		return pobhFcCommission;
	}
	public void setPobhFcCommission(BigDecimal pobhFcCommission) {
		this.pobhFcCommission = pobhFcCommission;
	}
	public BigDecimal getPobhLcCommission() {
		return pobhLcCommission;
	}
	public void setPobhLcCommission(BigDecimal pobhLcCommission) {
		this.pobhLcCommission = pobhLcCommission;
	}
	public String getPobhEmailId() {
		return pobhEmailId;
	}
	public void setPobhEmailId(String pobhEmailId) {
		this.pobhEmailId = pobhEmailId;
	}
	public BigDecimal getPobhOrgRate() {
		return pobhOrgRate;
	}
	public void setPobhOrgRate(BigDecimal pobhOrgRate) {
		this.pobhOrgRate = pobhOrgRate;
	}
	public BigDecimal getPobhOrgValue() {
		return pobhOrgValue;
	}
	public void setPobhOrgValue(BigDecimal pobhOrgValue) {
		this.pobhOrgValue = pobhOrgValue;
	}
	public BigDecimal getPobhRate() {
		return pobhRate;
	}
	public void setPobhRate(BigDecimal pobhRate) {
		this.pobhRate = pobhRate;
	}
	public BigDecimal getPobhValue() {
		return pobhValue;
	}
	public void setPobhValue(BigDecimal pobhValue) {
		this.pobhValue = pobhValue;
	}
	public Short getPobhSharePerc() {
		return pobhSharePerc;
	}
	public void setPobhSharePerc(Short pobhSharePerc) {
		this.pobhSharePerc = pobhSharePerc;
	}
	public String getPobhParentCode() {
		return pobhParentCode;
	}
	public void setPobhParentCode(String pobhParentCode) {
		this.pobhParentCode = pobhParentCode;
	}
	public String getPobhAgentHeirchy() {
		return pobhAgentHeirchy;
	}
	public void setPobhAgentHeirchy(String pobhAgentHeirchy) {
		this.pobhAgentHeirchy = pobhAgentHeirchy;
	}

    
}
