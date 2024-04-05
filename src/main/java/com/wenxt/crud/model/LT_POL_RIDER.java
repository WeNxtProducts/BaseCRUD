package com.wenxt.crud.model;

import java.math.BigDecimal;
import java.util.Date;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;


@Entity
@Table(name="LT_POL_RIDER")
public class LT_POL_RIDER {
	
	@Id
	private long prTranId;
	private long prPolTranId;
	private String prCoverCode;
	private String prApplAll;
	private String prAssrCode;
	private BigDecimal prRate;
	private long prRatePer;
	private BigDecimal prLcPrem;
	private BigDecimal prFcPrem;
	private String prDelFlag;
	private Date prInsDt;
	private String prInsId;
	private Date prModDt;
	private String prModId;
	private long prPadTranId;
	private int prPeriod;
	private int prPremPayYrs;
	private Date prFmDt;
	private Date prToDt;
	private BigDecimal prFcSa;
	private BigDecimal prLcSa;
	private String prTariffTermFlag;
	private String prRateAppliedOn;
	private String prWopFlag;
	private BigDecimal prLcMedAmt;
	private BigDecimal prNoOfUnit;
	private BigDecimal prEmrRate;
//	private BigDecimal prFlex01;
	private BigDecimal prLcMopPrem;
	private BigDecimal prFcMopPrem;
	public long getPrTranId() {
		return prTranId;
	}
	public void setPrTranId(long prTranId) {
		this.prTranId = prTranId;
	}
	public long getPrPolTranId() {
		return prPolTranId;
	}
	public void setPrPolTranId(long prPolTranId) {
		this.prPolTranId = prPolTranId;
	}
	public String getPrCoverCode() {
		return prCoverCode;
	}
	public void setPrCoverCode(String prCoverCode) {
		this.prCoverCode = prCoverCode;
	}
	public String getPrApplAll() {
		return prApplAll;
	}
	public void setPrApplAll(String prApplAll) {
		this.prApplAll = prApplAll;
	}
	public String getPrAssrCode() {
		return prAssrCode;
	}
	public void setPrAssrCode(String prAssrCode) {
		this.prAssrCode = prAssrCode;
	}
	public BigDecimal getPrRate() {
		return prRate;
	}
	public void setPrRate(BigDecimal prRate) {
		this.prRate = prRate;
	}
	public long getPrRatePer() {
		return prRatePer;
	}
	public void setPrRatePer(long prRatePer) {
		this.prRatePer = prRatePer;
	}
	public BigDecimal getPrLcPrem() {
		return prLcPrem;
	}
	public void setPrLcPrem(BigDecimal prLcPrem) {
		this.prLcPrem = prLcPrem;
	}
	public BigDecimal getPrFcPrem() {
		return prFcPrem;
	}
	public void setPrFcPrem(BigDecimal prFcPrem) {
		this.prFcPrem = prFcPrem;
	}
	public String getPrDelFlag() {
		return prDelFlag;
	}
	public void setPrDelFlag(String prDelFlag) {
		this.prDelFlag = prDelFlag;
	}
	public Date getPrInsDt() {
		return prInsDt;
	}
	public void setPrInsDt(Date prInsDt) {
		this.prInsDt = prInsDt;
	}
	public String getPrInsId() {
		return prInsId;
	}
	public void setPrInsId(String prInsId) {
		this.prInsId = prInsId;
	}
	public Date getPrModDt() {
		return prModDt;
	}
	public void setPrModDt(Date prModDt) {
		this.prModDt = prModDt;
	}
	public String getPrModId() {
		return prModId;
	}
	public void setPrModId(String prModId) {
		this.prModId = prModId;
	}
	public long getPrPadTranId() {
		return prPadTranId;
	}
	public void setPrPadTranId(long prPadTranId) {
		this.prPadTranId = prPadTranId;
	}
	public int getPrPeriod() {
		return prPeriod;
	}
	public void setPrPeriod(int prPeriod) {
		this.prPeriod = prPeriod;
	}
	public int getPrPremPayYrs() {
		return prPremPayYrs;
	}
	public void setPrPremPayYrs(int prPremPayYrs) {
		this.prPremPayYrs = prPremPayYrs;
	}
	public Date getPrFmDt() {
		return prFmDt;
	}
	public void setPrFmDt(Date prFmDt) {
		this.prFmDt = prFmDt;
	}
	public Date getPrToDt() {
		return prToDt;
	}
	public void setPrToDt(Date prToDt) {
		this.prToDt = prToDt;
	}
	public BigDecimal getPrFcSa() {
		return prFcSa;
	}
	public void setPrFcSa(BigDecimal prFcSa) {
		this.prFcSa = prFcSa;
	}
	public BigDecimal getPrLcSa() {
		return prLcSa;
	}
	public void setPrLcSa(BigDecimal prLcSa) {
		this.prLcSa = prLcSa;
	}
	public String getPrTariffTermFlag() {
		return prTariffTermFlag;
	}
	public void setPrTariffTermFlag(String prTariffTermFlag) {
		this.prTariffTermFlag = prTariffTermFlag;
	}
	public String getPrRateAppliedOn() {
		return prRateAppliedOn;
	}
	public void setPrRateAppliedOn(String prRateAppliedOn) {
		this.prRateAppliedOn = prRateAppliedOn;
	}
	public String getPrWopFlag() {
		return prWopFlag;
	}
	public void setPrWopFlag(String prWopFlag) {
		this.prWopFlag = prWopFlag;
	}
	public BigDecimal getPrLcMedAmt() {
		return prLcMedAmt;
	}
	public void setPrLcMedAmt(BigDecimal prLcMedAmt) {
		this.prLcMedAmt = prLcMedAmt;
	}
	public BigDecimal getPrNoOfUnit() {
		return prNoOfUnit;
	}
	public void setPrNoOfUnit(BigDecimal prNoOfUnit) {
		this.prNoOfUnit = prNoOfUnit;
	}
	public BigDecimal getPrEmrRate() {
		return prEmrRate;
	}
	public void setPrEmrRate(BigDecimal prEmrRate) {
		this.prEmrRate = prEmrRate;
	}
//	public BigDecimal getPrFlex01() {
//		return prFlex01;
//	}
//	public void setPrFlex01(BigDecimal prFlex01) {
//		this.prFlex01 = prFlex01;
//	}
	public BigDecimal getPrLcMopPrem() {
		return prLcMopPrem;
	}
	public void setPrLcMopPrem(BigDecimal prLcMopPrem) {
		this.prLcMopPrem = prLcMopPrem;
	}
	public BigDecimal getPrFcMopPrem() {
		return prFcMopPrem;
	}
	public void setPrFcMopPrem(BigDecimal prFcMopPrem) {
		this.prFcMopPrem = prFcMopPrem;
	}
	
	
	

}
