package com.example.democrud.model;

import java.math.BigDecimal;
import java.sql.Timestamp;

import com.fasterxml.jackson.annotation.JsonProperty;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;


@Entity
@Table(name="LT_POL_PLAN_DTL")
public class LT_POL_PLAN_DTL {
	
	
		@Id
	    @JsonProperty("PPD_TRAN_ID")
	    private long PPD_TRAN_ID;

	    @JsonProperty("PPD_PPH_TRAN_ID")
	    private long PPD_PPH_TRAN_ID;

	    @JsonProperty("PPD_POL_TRAN_ID")
	    private long PPD_POL_TRAN_ID;

	    @JsonProperty("PPD_PLAN_CODE")
	    private String PPD_PLAN_CODE;

	    @JsonProperty("PPD_PROD_CODE")
	    private String PPD_PROD_CODE;

	    @JsonProperty("PPD_COVER_CODE")
	    private String PPD_COVER_CODE;

	    @JsonProperty("PPD_SA_TYPE")
	    private String PPD_SA_TYPE;

	    @JsonProperty("PPD_SA_PERC")
	    private BigDecimal PPD_SA_PERC;

	    @JsonProperty("PPD_SA_MONTHS")
	    private BigDecimal PPD_SA_MONTHS;

	    @JsonProperty("PPD_SA_LC_LIMIT")
	    private BigDecimal PPD_SA_LC_LIMIT;

	    @JsonProperty("PPD_INS_DT")
	    private Timestamp PPD_INS_DT;

	    @JsonProperty("PPD_INS_ID")
	    private String PPD_INS_ID;

	    @JsonProperty("PPD_MOD_DT")
	    private Timestamp PPD_MOD_DT;

	    @JsonProperty("PPD_MOD_ID")
	    private String PPD_MOD_ID;

	    @JsonProperty("PPD_DEPN_APPL_YN")
	    private String PPD_DEPN_APPL_YN;

	    @JsonProperty("PPD_DEP_RATE")
	    private double PPD_DEP_RATE;

	    @JsonProperty("PPD_FC_FCL")
	    private double PPD_FC_FCL;

	    @JsonProperty("PPD_LC_FCL")
	    private double PPD_LC_FCL;

	    @JsonProperty("PPD_EFF_FM_DT")
	    private Timestamp PPD_EFF_FM_DT;

	    @JsonProperty("PPD_MAX_CLM_PERC")
	    private BigDecimal PPD_MAX_CLM_PERC;

	    @JsonProperty("PPD_PRORATE_REFN_YN")
	    private String PPD_PRORATE_REFN_YN;

	    @JsonProperty("PPD_PRORATE_COLL_YN")
	    private String PPD_PRORATE_COLL_YN;

	    @JsonProperty("PPD_EFF_TO_DT")
	    private Timestamp PPD_EFF_TO_DT;

	    @JsonProperty("PPD_MANDATORY_YN")
	    private String PPD_MANDATORY_YN;

	    @JsonProperty("PPD_RATE_TYPE")
	    private String PPD_RATE_TYPE;

	    @JsonProperty("PPD_RATE_PER")
	    private long PPD_RATE_PER;

	    @JsonProperty("PPD_DEL_FLAG")
	    private String PPD_DEL_FLAG;

	    @JsonProperty("PPD_REC_TYPE")
	    private String PPD_REC_TYPE;

	    @JsonProperty("PPD_FLEX_01")
	    private String PPD_FLEX_01;

	    @JsonProperty("PPD_RI_RATE_TYPE")
	    private String PPD_RI_RATE_TYPE;

	    @JsonProperty("PPD_RI_RATE")
	    private BigDecimal PPD_RI_RATE;

	    @JsonProperty("PPD_FAC_RATE_TYPE")
	    private String PPD_FAC_RATE_TYPE;

	    @JsonProperty("PPD_FAC_RATE")
	    private BigDecimal PPD_FAC_RATE;

	    @JsonProperty("PPD_FRM_CODE")
	    private String PPD_FRM_CODE;

	    @JsonProperty("PPD_FLEX_02")
	    private String PPD_FLEX_02;

	    @JsonProperty("PPD_MAX_SA")
	    private BigDecimal PPD_MAX_SA;

	    @JsonProperty("PPD_MIN_SA")
	    private BigDecimal PPD_MIN_SA;

	    @JsonProperty("PPD_MAX_AGE")
	    private int PPD_MAX_AGE;

	    @JsonProperty("PPD_MIN_AGE")
	    private int PPD_MIN_AGE;

	    @JsonProperty("PPD_RI_RATE_PER")
	    private long PPD_RI_RATE_PER;

	    @JsonProperty("PPD_FAC_RATE_PER")
	    private long PPD_FAC_RATE_PER;

	    @JsonProperty("PPD_RATE")
	    private BigDecimal PPD_RATE;

	    @JsonProperty("PPD_NET_RATE")
	    private BigDecimal PPD_NET_RATE;

	    @JsonProperty("PPD_DEDT_AMT")
	    private double PPD_DEDT_AMT;

	    @JsonProperty("PPD_CUST_PREM")
	    private BigDecimal PPD_CUST_PREM;

	    @JsonProperty("PPD_MAX_NO_INSTAL")
	    private double PPD_MAX_NO_INSTAL;

		public long getPPD_TRAN_ID() {
			return PPD_TRAN_ID;
		}

		public void setPPD_TRAN_ID(long pPD_TRAN_ID) {
			PPD_TRAN_ID = pPD_TRAN_ID;
		}

		public long getPPD_PPH_TRAN_ID() {
			return PPD_PPH_TRAN_ID;
		}

		public void setPPD_PPH_TRAN_ID(long pPD_PPH_TRAN_ID) {
			PPD_PPH_TRAN_ID = pPD_PPH_TRAN_ID;
		}

		public long getPPD_POL_TRAN_ID() {
			return PPD_POL_TRAN_ID;
		}

		public void setPPD_POL_TRAN_ID(long pPD_POL_TRAN_ID) {
			PPD_POL_TRAN_ID = pPD_POL_TRAN_ID;
		}

		public String getPPD_PLAN_CODE() {
			return PPD_PLAN_CODE;
		}

		public void setPPD_PLAN_CODE(String pPD_PLAN_CODE) {
			PPD_PLAN_CODE = pPD_PLAN_CODE;
		}

		public String getPPD_PROD_CODE() {
			return PPD_PROD_CODE;
		}

		public void setPPD_PROD_CODE(String pPD_PROD_CODE) {
			PPD_PROD_CODE = pPD_PROD_CODE;
		}

		public String getPPD_COVER_CODE() {
			return PPD_COVER_CODE;
		}

		public void setPPD_COVER_CODE(String pPD_COVER_CODE) {
			PPD_COVER_CODE = pPD_COVER_CODE;
		}

		public String getPPD_SA_TYPE() {
			return PPD_SA_TYPE;
		}

		public void setPPD_SA_TYPE(String pPD_SA_TYPE) {
			PPD_SA_TYPE = pPD_SA_TYPE;
		}

		public BigDecimal getPPD_SA_PERC() {
			return PPD_SA_PERC;
		}

		public void setPPD_SA_PERC(BigDecimal pPD_SA_PERC) {
			PPD_SA_PERC = pPD_SA_PERC;
		}

		public BigDecimal getPPD_SA_MONTHS() {
			return PPD_SA_MONTHS;
		}

		public void setPPD_SA_MONTHS(BigDecimal pPD_SA_MONTHS) {
			PPD_SA_MONTHS = pPD_SA_MONTHS;
		}

		public BigDecimal getPPD_SA_LC_LIMIT() {
			return PPD_SA_LC_LIMIT;
		}

		public void setPPD_SA_LC_LIMIT(BigDecimal pPD_SA_LC_LIMIT) {
			PPD_SA_LC_LIMIT = pPD_SA_LC_LIMIT;
		}

		public Timestamp getPPD_INS_DT() {
			return PPD_INS_DT;
		}

		public void setPPD_INS_DT(Timestamp pPD_INS_DT) {
			PPD_INS_DT = pPD_INS_DT;
		}

		public String getPPD_INS_ID() {
			return PPD_INS_ID;
		}

		public void setPPD_INS_ID(String pPD_INS_ID) {
			PPD_INS_ID = pPD_INS_ID;
		}

		public Timestamp getPPD_MOD_DT() {
			return PPD_MOD_DT;
		}

		public void setPPD_MOD_DT(Timestamp pPD_MOD_DT) {
			PPD_MOD_DT = pPD_MOD_DT;
		}

		public String getPPD_MOD_ID() {
			return PPD_MOD_ID;
		}

		public void setPPD_MOD_ID(String pPD_MOD_ID) {
			PPD_MOD_ID = pPD_MOD_ID;
		}

		public String getPPD_DEPN_APPL_YN() {
			return PPD_DEPN_APPL_YN;
		}

		public void setPPD_DEPN_APPL_YN(String pPD_DEPN_APPL_YN) {
			PPD_DEPN_APPL_YN = pPD_DEPN_APPL_YN;
		}

		public double getPPD_DEP_RATE() {
			return PPD_DEP_RATE;
		}

		public void setPPD_DEP_RATE(double pPD_DEP_RATE) {
			PPD_DEP_RATE = pPD_DEP_RATE;
		}

		public double getPPD_FC_FCL() {
			return PPD_FC_FCL;
		}

		public void setPPD_FC_FCL(double pPD_FC_FCL) {
			PPD_FC_FCL = pPD_FC_FCL;
		}

		public double getPPD_LC_FCL() {
			return PPD_LC_FCL;
		}

		public void setPPD_LC_FCL(double pPD_LC_FCL) {
			PPD_LC_FCL = pPD_LC_FCL;
		}

		public Timestamp getPPD_EFF_FM_DT() {
			return PPD_EFF_FM_DT;
		}

		public void setPPD_EFF_FM_DT(Timestamp pPD_EFF_FM_DT) {
			PPD_EFF_FM_DT = pPD_EFF_FM_DT;
		}

		public BigDecimal getPPD_MAX_CLM_PERC() {
			return PPD_MAX_CLM_PERC;
		}

		public void setPPD_MAX_CLM_PERC(BigDecimal pPD_MAX_CLM_PERC) {
			PPD_MAX_CLM_PERC = pPD_MAX_CLM_PERC;
		}

		public String getPPD_PRORATE_REFN_YN() {
			return PPD_PRORATE_REFN_YN;
		}

		public void setPPD_PRORATE_REFN_YN(String pPD_PRORATE_REFN_YN) {
			PPD_PRORATE_REFN_YN = pPD_PRORATE_REFN_YN;
		}

		public String getPPD_PRORATE_COLL_YN() {
			return PPD_PRORATE_COLL_YN;
		}

		public void setPPD_PRORATE_COLL_YN(String pPD_PRORATE_COLL_YN) {
			PPD_PRORATE_COLL_YN = pPD_PRORATE_COLL_YN;
		}

		public Timestamp getPPD_EFF_TO_DT() {
			return PPD_EFF_TO_DT;
		}

		public void setPPD_EFF_TO_DT(Timestamp pPD_EFF_TO_DT) {
			PPD_EFF_TO_DT = pPD_EFF_TO_DT;
		}

		public String getPPD_MANDATORY_YN() {
			return PPD_MANDATORY_YN;
		}

		public void setPPD_MANDATORY_YN(String pPD_MANDATORY_YN) {
			PPD_MANDATORY_YN = pPD_MANDATORY_YN;
		}

		public String getPPD_RATE_TYPE() {
			return PPD_RATE_TYPE;
		}

		public void setPPD_RATE_TYPE(String pPD_RATE_TYPE) {
			PPD_RATE_TYPE = pPD_RATE_TYPE;
		}

		public long getPPD_RATE_PER() {
			return PPD_RATE_PER;
		}

		public void setPPD_RATE_PER(long pPD_RATE_PER) {
			PPD_RATE_PER = pPD_RATE_PER;
		}

		public String getPPD_DEL_FLAG() {
			return PPD_DEL_FLAG;
		}

		public void setPPD_DEL_FLAG(String pPD_DEL_FLAG) {
			PPD_DEL_FLAG = pPD_DEL_FLAG;
		}

		public String getPPD_REC_TYPE() {
			return PPD_REC_TYPE;
		}

		public void setPPD_REC_TYPE(String pPD_REC_TYPE) {
			PPD_REC_TYPE = pPD_REC_TYPE;
		}

		public String getPPD_FLEX_01() {
			return PPD_FLEX_01;
		}

		public void setPPD_FLEX_01(String pPD_FLEX_01) {
			PPD_FLEX_01 = pPD_FLEX_01;
		}

		public String getPPD_RI_RATE_TYPE() {
			return PPD_RI_RATE_TYPE;
		}

		public void setPPD_RI_RATE_TYPE(String pPD_RI_RATE_TYPE) {
			PPD_RI_RATE_TYPE = pPD_RI_RATE_TYPE;
		}

		public BigDecimal getPPD_RI_RATE() {
			return PPD_RI_RATE;
		}

		public void setPPD_RI_RATE(BigDecimal pPD_RI_RATE) {
			PPD_RI_RATE = pPD_RI_RATE;
		}

		public String getPPD_FAC_RATE_TYPE() {
			return PPD_FAC_RATE_TYPE;
		}

		public void setPPD_FAC_RATE_TYPE(String pPD_FAC_RATE_TYPE) {
			PPD_FAC_RATE_TYPE = pPD_FAC_RATE_TYPE;
		}

		public BigDecimal getPPD_FAC_RATE() {
			return PPD_FAC_RATE;
		}

		public void setPPD_FAC_RATE(BigDecimal pPD_FAC_RATE) {
			PPD_FAC_RATE = pPD_FAC_RATE;
		}

		public String getPPD_FRM_CODE() {
			return PPD_FRM_CODE;
		}

		public void setPPD_FRM_CODE(String pPD_FRM_CODE) {
			PPD_FRM_CODE = pPD_FRM_CODE;
		}

		public String getPPD_FLEX_02() {
			return PPD_FLEX_02;
		}

		public void setPPD_FLEX_02(String pPD_FLEX_02) {
			PPD_FLEX_02 = pPD_FLEX_02;
		}

		public BigDecimal getPPD_MAX_SA() {
			return PPD_MAX_SA;
		}

		public void setPPD_MAX_SA(BigDecimal pPD_MAX_SA) {
			PPD_MAX_SA = pPD_MAX_SA;
		}

		public BigDecimal getPPD_MIN_SA() {
			return PPD_MIN_SA;
		}

		public void setPPD_MIN_SA(BigDecimal pPD_MIN_SA) {
			PPD_MIN_SA = pPD_MIN_SA;
		}

		public int getPPD_MAX_AGE() {
			return PPD_MAX_AGE;
		}

		public void setPPD_MAX_AGE(int pPD_MAX_AGE) {
			PPD_MAX_AGE = pPD_MAX_AGE;
		}

		public int getPPD_MIN_AGE() {
			return PPD_MIN_AGE;
		}

		public void setPPD_MIN_AGE(int pPD_MIN_AGE) {
			PPD_MIN_AGE = pPD_MIN_AGE;
		}

		public long getPPD_RI_RATE_PER() {
			return PPD_RI_RATE_PER;
		}

		public void setPPD_RI_RATE_PER(long pPD_RI_RATE_PER) {
			PPD_RI_RATE_PER = pPD_RI_RATE_PER;
		}

		public long getPPD_FAC_RATE_PER() {
			return PPD_FAC_RATE_PER;
		}

		public void setPPD_FAC_RATE_PER(long pPD_FAC_RATE_PER) {
			PPD_FAC_RATE_PER = pPD_FAC_RATE_PER;
		}

		public BigDecimal getPPD_RATE() {
			return PPD_RATE;
		}

		public void setPPD_RATE(BigDecimal pPD_RATE) {
			PPD_RATE = pPD_RATE;
		}

		public BigDecimal getPPD_NET_RATE() {
			return PPD_NET_RATE;
		}

		public void setPPD_NET_RATE(BigDecimal pPD_NET_RATE) {
			PPD_NET_RATE = pPD_NET_RATE;
		}

		public double getPPD_DEDT_AMT() {
			return PPD_DEDT_AMT;
		}

		public void setPPD_DEDT_AMT(double pPD_DEDT_AMT) {
			PPD_DEDT_AMT = pPD_DEDT_AMT;
		}

		public BigDecimal getPPD_CUST_PREM() {
			return PPD_CUST_PREM;
		}

		public void setPPD_CUST_PREM(BigDecimal pPD_CUST_PREM) {
			PPD_CUST_PREM = pPD_CUST_PREM;
		}

		public double getPPD_MAX_NO_INSTAL() {
			return PPD_MAX_NO_INSTAL;
		}

		public void setPPD_MAX_NO_INSTAL(double pPD_MAX_NO_INSTAL) {
			PPD_MAX_NO_INSTAL = pPD_MAX_NO_INSTAL;
		}

	
	
	
	
	
}
