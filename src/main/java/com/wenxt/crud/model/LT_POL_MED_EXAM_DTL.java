package com.wenxt.crud.model;

import java.math.BigDecimal;
import java.sql.Timestamp;
import java.time.LocalDateTime;

import com.fasterxml.jackson.annotation.JsonProperty;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.transaction.Transactional;

@Transactional
@Entity
@Table(name = "LT_POL_MED_EXAM_DTL")
public class LT_POL_MED_EXAM_DTL {
	
	

		@Id
	    @JsonProperty
	    private long PMED_TRAN_ID;
	    @JsonProperty
	    private long PMED_POL_TRAN_ID;
	    @JsonProperty
	    private short PMED_END_NO_IDX;
	    @JsonProperty
	    private long PMED_POAD_TRAN_ID;
	    @JsonProperty
	    private String PMED_EXAM_CODE;
	    @JsonProperty
	    private String PMED_STATUS;

	    @JsonProperty
	    private LocalDateTime PMED_CR_DT;
	    @JsonProperty
	    private String PMED_CR_UID;
	    @JsonProperty
	    private LocalDateTime PMED_UPD_DT;
	    @JsonProperty
	    private String PMED_UPD_UID;
	    @JsonProperty
	    private String PMED_CLINIC_CODE;
	    @JsonProperty
	    private BigDecimal PMED_PVT_LC_AMT;
	    @JsonProperty
	    private BigDecimal PMED_GOVT_LC_AMT;
	    @JsonProperty
	    private Timestamp PMED_REP_REC_DT;
	    @JsonProperty
	    private String PMED_DEL_FLAG;
	    @JsonProperty
	    private String PMED_INVOICE_NO;
	    @JsonProperty
	    private BigDecimal PMED_MEDICAL_FEES;
	    @JsonProperty
	    private String PMED_MEDICAL_RESULT;
	    @JsonProperty
	    private String PMED_FLEX_01;
	    @JsonProperty
	    private String PMED_FLEX_02;
	    @JsonProperty
	    private String PMED_FLEX_03;
	    @JsonProperty
	    private String PMED_FLEX_04;
	    @JsonProperty
	    private String PMED_FLEX_05;
	    @JsonProperty
	    private String PMED_FLEX_06;
	    @JsonProperty
	    private String PMED_FLEX_07;
	    @JsonProperty
	    private String PMED_FLEX_08;
	    @JsonProperty
	    private String PMED_FLEX_09;
	    @JsonProperty
	    private String PMED_FLEX_10;
	    @JsonProperty
	    private String PMED_FLEX_11;
	    @JsonProperty
	    private String PMED_FLEX_12;
	    @JsonProperty
	    private String PMED_FLEX_13;
	    @JsonProperty
	    private String PMED_FLEX_14;
	    @JsonProperty
	    private String PMED_FLEX_15;
	    @JsonProperty
	    private String PMED_FLEX_16;
	    @JsonProperty
	    private String PMED_FLEX_17;
	    @JsonProperty
	    private String PMED_FLEX_18;
	    @JsonProperty
	    private String PMED_FLEX_19;
	    @JsonProperty
	    private String PMED_FLEX_20;
	    @JsonProperty
	    private String PMED_FLEX_21;
	    @JsonProperty
	    private String PMED_FLEX_22;
	    @JsonProperty
	    private String PMED_FLEX_23;
	    @JsonProperty
	    private String PMED_FLEX_24;
	    @JsonProperty
	    private String PMED_FLEX_25;
	    @JsonProperty
	    private String PMED_FLEX_26;
	    @JsonProperty
	    private String PMED_FLEX_27;
	    @JsonProperty
	    private String PMED_FLEX_28;
	    @JsonProperty
	    private String PMED_FLEX_29;
	    @JsonProperty
	    private String PMED_FLEX_30;
	    @JsonProperty
	    private LocalDateTime PMED_EXAM_DT;
	    @JsonProperty
	    private LocalDateTime PMED_EXM_DN_DT;
	    @JsonProperty
	    private String PMED_REFER_PROP_NO;
		public long getPMED_TRAN_ID() {
			return PMED_TRAN_ID;
		}
		public void setPMED_TRAN_ID(long pMED_TRAN_ID) {
			PMED_TRAN_ID = pMED_TRAN_ID;
		}
		public long getPMED_POL_TRAN_ID() {
			return PMED_POL_TRAN_ID;
		}
		public void setPMED_POL_TRAN_ID(long pMED_POL_TRAN_ID) {
			PMED_POL_TRAN_ID = pMED_POL_TRAN_ID;
		}
		public short getPMED_END_NO_IDX() {
			return PMED_END_NO_IDX;
		}
		public void setPMED_END_NO_IDX(short pMED_END_NO_IDX) {
			PMED_END_NO_IDX = pMED_END_NO_IDX;
		}
		public long getPMED_POAD_TRAN_ID() {
			return PMED_POAD_TRAN_ID;
		}
		public void setPMED_POAD_TRAN_ID(long pMED_POAD_TRAN_ID) {
			PMED_POAD_TRAN_ID = pMED_POAD_TRAN_ID;
		}
		public String getPMED_EXAM_CODE() {
			return PMED_EXAM_CODE;
		}
		public void setPMED_EXAM_CODE(String pMED_EXAM_CODE) {
			PMED_EXAM_CODE = pMED_EXAM_CODE;
		}
		public String getPMED_STATUS() {
			return PMED_STATUS;
		}
		public void setPMED_STATUS(String pMED_STATUS) {
			PMED_STATUS = pMED_STATUS;
		}
		public LocalDateTime getPMED_CR_DT() {
			return PMED_CR_DT;
		}
		public void setPMED_CR_DT(LocalDateTime pMED_CR_DT) {
			PMED_CR_DT = pMED_CR_DT;
		}
		public String getPMED_CR_UID() {
			return PMED_CR_UID;
		}
		public void setPMED_CR_UID(String pMED_CR_UID) {
			PMED_CR_UID = pMED_CR_UID;
		}
		public LocalDateTime getPMED_UPD_DT() {
			return PMED_UPD_DT;
		}
		public void setPMED_UPD_DT(LocalDateTime pMED_UPD_DT) {
			PMED_UPD_DT = pMED_UPD_DT;
		}
		public String getPMED_UPD_UID() {
			return PMED_UPD_UID;
		}
		public void setPMED_UPD_UID(String pMED_UPD_UID) {
			PMED_UPD_UID = pMED_UPD_UID;
		}
		public String getPMED_CLINIC_CODE() {
			return PMED_CLINIC_CODE;
		}
		public void setPMED_CLINIC_CODE(String pMED_CLINIC_CODE) {
			PMED_CLINIC_CODE = pMED_CLINIC_CODE;
		}
		public BigDecimal getPMED_PVT_LC_AMT() {
			return PMED_PVT_LC_AMT;
		}
		public void setPMED_PVT_LC_AMT(BigDecimal pMED_PVT_LC_AMT) {
			PMED_PVT_LC_AMT = pMED_PVT_LC_AMT;
		}
		public BigDecimal getPMED_GOVT_LC_AMT() {
			return PMED_GOVT_LC_AMT;
		}
		public void setPMED_GOVT_LC_AMT(BigDecimal pMED_GOVT_LC_AMT) {
			PMED_GOVT_LC_AMT = pMED_GOVT_LC_AMT;
		}
		public Timestamp getPMED_REP_REC_DT() {
			return PMED_REP_REC_DT;
		}
		public void setPMED_REP_REC_DT(Timestamp pMED_REP_REC_DT) {
			PMED_REP_REC_DT = pMED_REP_REC_DT;
		}
		public String getPMED_DEL_FLAG() {
			return PMED_DEL_FLAG;
		}
		public void setPMED_DEL_FLAG(String pMED_DEL_FLAG) {
			PMED_DEL_FLAG = pMED_DEL_FLAG;
		}
		public String getPMED_INVOICE_NO() {
			return PMED_INVOICE_NO;
		}
		public void setPMED_INVOICE_NO(String pMED_INVOICE_NO) {
			PMED_INVOICE_NO = pMED_INVOICE_NO;
		}
		public BigDecimal getPMED_MEDICAL_FEES() {
			return PMED_MEDICAL_FEES;
		}
		public void setPMED_MEDICAL_FEES(BigDecimal pMED_MEDICAL_FEES) {
			PMED_MEDICAL_FEES = pMED_MEDICAL_FEES;
		}
		public String getPMED_MEDICAL_RESULT() {
			return PMED_MEDICAL_RESULT;
		}
		public void setPMED_MEDICAL_RESULT(String pMED_MEDICAL_RESULT) {
			PMED_MEDICAL_RESULT = pMED_MEDICAL_RESULT;
		}
		public String getPMED_FLEX_01() {
			return PMED_FLEX_01;
		}
		public void setPMED_FLEX_01(String pMED_FLEX_01) {
			PMED_FLEX_01 = pMED_FLEX_01;
		}
		public String getPMED_FLEX_02() {
			return PMED_FLEX_02;
		}
		public void setPMED_FLEX_02(String pMED_FLEX_02) {
			PMED_FLEX_02 = pMED_FLEX_02;
		}
		public String getPMED_FLEX_03() {
			return PMED_FLEX_03;
		}
		public void setPMED_FLEX_03(String pMED_FLEX_03) {
			PMED_FLEX_03 = pMED_FLEX_03;
		}
		public String getPMED_FLEX_04() {
			return PMED_FLEX_04;
		}
		public void setPMED_FLEX_04(String pMED_FLEX_04) {
			PMED_FLEX_04 = pMED_FLEX_04;
		}
		public String getPMED_FLEX_05() {
			return PMED_FLEX_05;
		}
		public void setPMED_FLEX_05(String pMED_FLEX_05) {
			PMED_FLEX_05 = pMED_FLEX_05;
		}
		public String getPMED_FLEX_06() {
			return PMED_FLEX_06;
		}
		public void setPMED_FLEX_06(String pMED_FLEX_06) {
			PMED_FLEX_06 = pMED_FLEX_06;
		}
		public String getPMED_FLEX_07() {
			return PMED_FLEX_07;
		}
		public void setPMED_FLEX_07(String pMED_FLEX_07) {
			PMED_FLEX_07 = pMED_FLEX_07;
		}
		public String getPMED_FLEX_08() {
			return PMED_FLEX_08;
		}
		public void setPMED_FLEX_08(String pMED_FLEX_08) {
			PMED_FLEX_08 = pMED_FLEX_08;
		}
		public String getPMED_FLEX_09() {
			return PMED_FLEX_09;
		}
		public void setPMED_FLEX_09(String pMED_FLEX_09) {
			PMED_FLEX_09 = pMED_FLEX_09;
		}
		public String getPMED_FLEX_10() {
			return PMED_FLEX_10;
		}
		public void setPMED_FLEX_10(String pMED_FLEX_10) {
			PMED_FLEX_10 = pMED_FLEX_10;
		}
		public String getPMED_FLEX_11() {
			return PMED_FLEX_11;
		}
		public void setPMED_FLEX_11(String pMED_FLEX_11) {
			PMED_FLEX_11 = pMED_FLEX_11;
		}
		public String getPMED_FLEX_12() {
			return PMED_FLEX_12;
		}
		public void setPMED_FLEX_12(String pMED_FLEX_12) {
			PMED_FLEX_12 = pMED_FLEX_12;
		}
		public String getPMED_FLEX_13() {
			return PMED_FLEX_13;
		}
		public void setPMED_FLEX_13(String pMED_FLEX_13) {
			PMED_FLEX_13 = pMED_FLEX_13;
		}
		public String getPMED_FLEX_14() {
			return PMED_FLEX_14;
		}
		public void setPMED_FLEX_14(String pMED_FLEX_14) {
			PMED_FLEX_14 = pMED_FLEX_14;
		}
		public String getPMED_FLEX_15() {
			return PMED_FLEX_15;
		}
		public void setPMED_FLEX_15(String pMED_FLEX_15) {
			PMED_FLEX_15 = pMED_FLEX_15;
		}
		public String getPMED_FLEX_16() {
			return PMED_FLEX_16;
		}
		public void setPMED_FLEX_16(String pMED_FLEX_16) {
			PMED_FLEX_16 = pMED_FLEX_16;
		}
		public String getPMED_FLEX_17() {
			return PMED_FLEX_17;
		}
		public void setPMED_FLEX_17(String pMED_FLEX_17) {
			PMED_FLEX_17 = pMED_FLEX_17;
		}
		public String getPMED_FLEX_18() {
			return PMED_FLEX_18;
		}
		public void setPMED_FLEX_18(String pMED_FLEX_18) {
			PMED_FLEX_18 = pMED_FLEX_18;
		}
		public String getPMED_FLEX_19() {
			return PMED_FLEX_19;
		}
		public void setPMED_FLEX_19(String pMED_FLEX_19) {
			PMED_FLEX_19 = pMED_FLEX_19;
		}
		public String getPMED_FLEX_20() {
			return PMED_FLEX_20;
		}
		public void setPMED_FLEX_20(String pMED_FLEX_20) {
			PMED_FLEX_20 = pMED_FLEX_20;
		}
		public String getPMED_FLEX_21() {
			return PMED_FLEX_21;
		}
		public void setPMED_FLEX_21(String pMED_FLEX_21) {
			PMED_FLEX_21 = pMED_FLEX_21;
		}
		public String getPMED_FLEX_22() {
			return PMED_FLEX_22;
		}
		public void setPMED_FLEX_22(String pMED_FLEX_22) {
			PMED_FLEX_22 = pMED_FLEX_22;
		}
		public String getPMED_FLEX_23() {
			return PMED_FLEX_23;
		}
		public void setPMED_FLEX_23(String pMED_FLEX_23) {
			PMED_FLEX_23 = pMED_FLEX_23;
		}
		public String getPMED_FLEX_24() {
			return PMED_FLEX_24;
		}
		public void setPMED_FLEX_24(String pMED_FLEX_24) {
			PMED_FLEX_24 = pMED_FLEX_24;
		}
		public String getPMED_FLEX_25() {
			return PMED_FLEX_25;
		}
		public void setPMED_FLEX_25(String pMED_FLEX_25) {
			PMED_FLEX_25 = pMED_FLEX_25;
		}
		public String getPMED_FLEX_26() {
			return PMED_FLEX_26;
		}
		public void setPMED_FLEX_26(String pMED_FLEX_26) {
			PMED_FLEX_26 = pMED_FLEX_26;
		}
		public String getPMED_FLEX_27() {
			return PMED_FLEX_27;
		}
		public void setPMED_FLEX_27(String pMED_FLEX_27) {
			PMED_FLEX_27 = pMED_FLEX_27;
		}
		public String getPMED_FLEX_28() {
			return PMED_FLEX_28;
		}
		public void setPMED_FLEX_28(String pMED_FLEX_28) {
			PMED_FLEX_28 = pMED_FLEX_28;
		}
		public String getPMED_FLEX_29() {
			return PMED_FLEX_29;
		}
		public void setPMED_FLEX_29(String pMED_FLEX_29) {
			PMED_FLEX_29 = pMED_FLEX_29;
		}
		public String getPMED_FLEX_30() {
			return PMED_FLEX_30;
		}
		public void setPMED_FLEX_30(String pMED_FLEX_30) {
			PMED_FLEX_30 = pMED_FLEX_30;
		}
		public LocalDateTime getPMED_EXAM_DT() {
			return PMED_EXAM_DT;
		}
		public void setPMED_EXAM_DT(LocalDateTime pMED_EXAM_DT) {
			PMED_EXAM_DT = pMED_EXAM_DT;
		}
		public LocalDateTime getPMED_EXM_DN_DT() {
			return PMED_EXM_DN_DT;
		}
		public void setPMED_EXM_DN_DT(LocalDateTime pMED_EXM_DN_DT) {
			PMED_EXM_DN_DT = pMED_EXM_DN_DT;
		}
		public String getPMED_REFER_PROP_NO() {
			return PMED_REFER_PROP_NO;
		}
		public void setPMED_REFER_PROP_NO(String pMED_REFER_PROP_NO) {
			PMED_REFER_PROP_NO = pMED_REFER_PROP_NO;
		}

	  
	
}
