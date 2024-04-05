package com.wenxt.crud.model;

import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.Date;

import io.micrometer.common.lang.Nullable;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "LT_POL_CHARGE")
public class LT_POL_CHARGE {

	@Id
	private BigInteger pocTranId;
	private BigInteger pocPolTranId;
	private String pocChrgCode;
	@Nullable
	private BigDecimal pocLcValue;
	@Nullable
	private BigDecimal pocFcValue;
	@Nullable
	private String pocDelFlag;
	@Nullable
	private Date pocInsDt;
	@Nullable
	private String pocInsId;
	@Nullable
	private Date pocModDt;
	@Nullable
	private String pocModId;
	@Nullable
	private BigDecimal pocRate;
	@Nullable
	private BigInteger pocRatePer;
	@Nullable
	private String pocAppliedOn;
	@Nullable
	private BigDecimal pocCustSharePerc;
	@Nullable
	private String pocApplyPeriod;
	@Nullable
	private String pocType;
	@Nullable
	private Double pocEndNoIdx;
	@Nullable
	private String pocAccGenYn;
	@Nullable
	private BigDecimal pocChargeMaxLmt;

	public BigInteger getPocTranId() {
		return pocTranId;
	}

	public void setPocTranId(BigInteger pocTranId) {
		this.pocTranId = pocTranId;
	}

	public BigInteger getPocPolTranId() {
		return pocPolTranId;
	}

	public void setPocPolTranId(BigInteger pocPolTranId) {
		this.pocPolTranId = pocPolTranId;
	}

	public String getPocChrgCode() {
		return pocChrgCode;
	}

	public void setPocChrgCode(String pocChrgCode) {
		this.pocChrgCode = pocChrgCode;
	}

	public BigDecimal getPocLcValue() {
		return pocLcValue;
	}

	public void setPocLcValue(BigDecimal pocLcValue) {
		this.pocLcValue = pocLcValue;
	}

	public BigDecimal getPocFcValue() {
		return pocFcValue;
	}

	public void setPocFcValue(BigDecimal pocFcValue) {
		this.pocFcValue = pocFcValue;
	}

	public String getPocDelFlag() {
		return pocDelFlag;
	}

	public void setPocDelFlag(String pocDelFlag) {
		this.pocDelFlag = pocDelFlag;
	}

	public Date getPocInsDt() {
		return pocInsDt;
	}

	public void setPocInsDt(Date pocInsDt) {
		this.pocInsDt = pocInsDt;
	}

	public String getPocInsId() {
		return pocInsId;
	}

	public void setPocInsId(String pocInsId) {
		this.pocInsId = pocInsId;
	}

	public Date getPocModDt() {
		return pocModDt;
	}

	public void setPocModDt(Date pocModDt) {
		this.pocModDt = pocModDt;
	}

	public String getPocModId() {
		return pocModId;
	}

	public void setPocModId(String pocModId) {
		this.pocModId = pocModId;
	}

	public BigDecimal getPocRate() {
		return pocRate;
	}

	public void setPocRate(BigDecimal pocRate) {
		this.pocRate = pocRate;
	}

	public BigInteger getPocRatePer() {
		return pocRatePer;
	}

	public void setPocRatePer(BigInteger pocRatePer) {
		this.pocRatePer = pocRatePer;
	}

	public String getPocAppliedOn() {
		return pocAppliedOn;
	}

	public void setPocAppliedOn(String pocAppliedOn) {
		this.pocAppliedOn = pocAppliedOn;
	}

	public BigDecimal getPocCustSharePerc() {
		return pocCustSharePerc;
	}

	public void setPocCustSharePerc(BigDecimal pocCustSharePerc) {
		this.pocCustSharePerc = pocCustSharePerc;
	}

	public String getPocApplyPeriod() {
		return pocApplyPeriod;
	}

	public void setPocApplyPeriod(String pocApplyPeriod) {
		this.pocApplyPeriod = pocApplyPeriod;
	}

	public String getPocType() {
		return pocType;
	}

	public void setPocType(String pocType) {
		this.pocType = pocType;
	}

	public Double getPocEndNoIdx() {
		return pocEndNoIdx;
	}

	public void setPocEndNoIdx(Double pocEndNoIdx) {
		this.pocEndNoIdx = pocEndNoIdx;
	}

	public String getPocAccGenYn() {
		return pocAccGenYn;
	}

	public void setPocAccGenYn(String pocAccGenYn) {
		this.pocAccGenYn = pocAccGenYn;
	}

	public BigDecimal getPocChargeMaxLmt() {
		return pocChargeMaxLmt;
	}

	public void setPocChargeMaxLmt(BigDecimal pocChargeMaxLmt) {
		this.pocChargeMaxLmt = pocChargeMaxLmt;
	}

}
