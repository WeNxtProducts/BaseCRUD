package com.example.democrud.model;

import java.math.BigDecimal;
import java.time.LocalDateTime;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="LT_POL_EMP_COVER")
public class LT_POL_EMP_COVER {
	
		@Id
	    private Long pecTranId;
	    private Long pecPolTranId;
	    private Long pecPempTranId;
	    private String pecCoverCode;
	    private BigDecimal pecFcSa;
	    private BigDecimal pecLcSa;
	    private BigDecimal pecRate;
	    private Long pecRatePer;
	    private BigDecimal pecFcPrem;
	    private BigDecimal pecLcPrem;
	    private BigDecimal pecOrgFcSa;
	    private BigDecimal pecOrgLcSa;
	    private BigDecimal pecOrgFcPrem;
	    private BigDecimal pecOrgLcPrem;
	    private String pecDelFlag;
	    private LocalDateTime pecInsDt;
	    private String pecInsId;
	    private LocalDateTime pecModDt;
	    private String pecModId;
	    private BigDecimal pecFcClPrem;
	    private BigDecimal pecLcClPrem;
	    private BigDecimal pecFcTtyPrem;
	    private BigDecimal pecLcTtyPrem;
	    private BigDecimal pecOrgFcClPrem;
	    private BigDecimal pecOrgLcClPrem;
	    private BigDecimal pecOrgFcTtyPrem;
	    private BigDecimal pecOrgLcTtyPrem;
	    private String pecRecType;
	    private BigDecimal pecFcRetPrem;
	    private BigDecimal pecLcRetPrem;
	    private BigDecimal pecFcRiPrem;
	    private BigDecimal pecLcRiPrem;
	    private BigDecimal pecLcActualSa;
	    private BigDecimal pecFcActualSa;
	    private BigDecimal pecOrgFcRetPrem;
	    private BigDecimal pecOrgLcRetPrem;
	    private BigDecimal pecOrgFcRiPrem;
	    private BigDecimal pecOrgLcRiPrem;
	    private BigDecimal pecOrgLcActualSa;
	    private BigDecimal pecOrgFcActualSa;
	    private LocalDateTime pecEffFmDt;
	    private LocalDateTime pecEffToDt;
	    private Long pecCvrLinkSysId;
	    private String pecCvrsaUpdYn;
	    private String pecClmApplYn;
	    private Long pecRefPempSysId;
	    private BigDecimal pecLcCoverFcl;
	    private BigDecimal pecFcCoverFcl;
	    private String pecMediExam;
	    private String pecPpdDepnApplYn;
	    
	    private String recVersion;
	    
		
		public String getRecVersion() {
			return recVersion;
		}
		public void setRecVersion(String recVersion) {
			this.recVersion = recVersion;
		}
		public Long getPecTranId() {
			return pecTranId;
		}
		public void setPecTranId(Long pecTranId) {
			this.pecTranId = pecTranId;
		}
		public Long getPecPolTranId() {
			return pecPolTranId;
		}
		public void setPecPolTranId(Long pecPolTranId) {
			this.pecPolTranId = pecPolTranId;
		}
		public Long getPecPempTranId() {
			return pecPempTranId;
		}
		public void setPecPempTranId(Long pecPempTranId) {
			this.pecPempTranId = pecPempTranId;
		}
		public String getPecCoverCode() {
			return pecCoverCode;
		}
		public void setPecCoverCode(String pecCoverCode) {
			this.pecCoverCode = pecCoverCode;
		}
		public BigDecimal getPecFcSa() {
			return pecFcSa;
		}
		public void setPecFcSa(BigDecimal pecFcSa) {
			this.pecFcSa = pecFcSa;
		}
		public BigDecimal getPecLcSa() {
			return pecLcSa;
		}
		public void setPecLcSa(BigDecimal pecLcSa) {
			this.pecLcSa = pecLcSa;
		}
		public BigDecimal getPecRate() {
			return pecRate;
		}
		public void setPecRate(BigDecimal pecRate) {
			this.pecRate = pecRate;
		}
		public Long getPecRatePer() {
			return pecRatePer;
		}
		public void setPecRatePer(Long pecRatePer) {
			this.pecRatePer = pecRatePer;
		}
		public BigDecimal getPecFcPrem() {
			return pecFcPrem;
		}
		public void setPecFcPrem(BigDecimal pecFcPrem) {
			this.pecFcPrem = pecFcPrem;
		}
		public BigDecimal getPecLcPrem() {
			return pecLcPrem;
		}
		public void setPecLcPrem(BigDecimal pecLcPrem) {
			this.pecLcPrem = pecLcPrem;
		}
		public BigDecimal getPecOrgFcSa() {
			return pecOrgFcSa;
		}
		public void setPecOrgFcSa(BigDecimal pecOrgFcSa) {
			this.pecOrgFcSa = pecOrgFcSa;
		}
		public BigDecimal getPecOrgLcSa() {
			return pecOrgLcSa;
		}
		public void setPecOrgLcSa(BigDecimal pecOrgLcSa) {
			this.pecOrgLcSa = pecOrgLcSa;
		}
		public BigDecimal getPecOrgFcPrem() {
			return pecOrgFcPrem;
		}
		public void setPecOrgFcPrem(BigDecimal pecOrgFcPrem) {
			this.pecOrgFcPrem = pecOrgFcPrem;
		}
		public BigDecimal getPecOrgLcPrem() {
			return pecOrgLcPrem;
		}
		public void setPecOrgLcPrem(BigDecimal pecOrgLcPrem) {
			this.pecOrgLcPrem = pecOrgLcPrem;
		}
		public String getPecDelFlag() {
			return pecDelFlag;
		}
		public void setPecDelFlag(String pecDelFlag) {
			this.pecDelFlag = pecDelFlag;
		}
		public LocalDateTime getPecInsDt() {
			return pecInsDt;
		}
		public void setPecInsDt(LocalDateTime pecInsDt) {
			this.pecInsDt = pecInsDt;
		}
		public String getPecInsId() {
			return pecInsId;
		}
		public void setPecInsId(String pecInsId) {
			this.pecInsId = pecInsId;
		}
		public LocalDateTime getPecModDt() {
			return pecModDt;
		}
		public void setPecModDt(LocalDateTime pecModDt) {
			this.pecModDt = pecModDt;
		}
		public String getPecModId() {
			return pecModId;
		}
		public void setPecModId(String pecModId) {
			this.pecModId = pecModId;
		}
		public BigDecimal getPecFcClPrem() {
			return pecFcClPrem;
		}
		public void setPecFcClPrem(BigDecimal pecFcClPrem) {
			this.pecFcClPrem = pecFcClPrem;
		}
		public BigDecimal getPecLcClPrem() {
			return pecLcClPrem;
		}
		public void setPecLcClPrem(BigDecimal pecLcClPrem) {
			this.pecLcClPrem = pecLcClPrem;
		}
		public BigDecimal getPecFcTtyPrem() {
			return pecFcTtyPrem;
		}
		public void setPecFcTtyPrem(BigDecimal pecFcTtyPrem) {
			this.pecFcTtyPrem = pecFcTtyPrem;
		}
		public BigDecimal getPecLcTtyPrem() {
			return pecLcTtyPrem;
		}
		public void setPecLcTtyPrem(BigDecimal pecLcTtyPrem) {
			this.pecLcTtyPrem = pecLcTtyPrem;
		}
		public BigDecimal getPecOrgFcClPrem() {
			return pecOrgFcClPrem;
		}
		public void setPecOrgFcClPrem(BigDecimal pecOrgFcClPrem) {
			this.pecOrgFcClPrem = pecOrgFcClPrem;
		}
		public BigDecimal getPecOrgLcClPrem() {
			return pecOrgLcClPrem;
		}
		public void setPecOrgLcClPrem(BigDecimal pecOrgLcClPrem) {
			this.pecOrgLcClPrem = pecOrgLcClPrem;
		}
		public BigDecimal getPecOrgFcTtyPrem() {
			return pecOrgFcTtyPrem;
		}
		public void setPecOrgFcTtyPrem(BigDecimal pecOrgFcTtyPrem) {
			this.pecOrgFcTtyPrem = pecOrgFcTtyPrem;
		}
		public BigDecimal getPecOrgLcTtyPrem() {
			return pecOrgLcTtyPrem;
		}
		public void setPecOrgLcTtyPrem(BigDecimal pecOrgLcTtyPrem) {
			this.pecOrgLcTtyPrem = pecOrgLcTtyPrem;
		}
		public String getPecRecType() {
			return pecRecType;
		}
		public void setPecRecType(String pecRecType) {
			this.pecRecType = pecRecType;
		}
		public BigDecimal getPecFcRetPrem() {
			return pecFcRetPrem;
		}
		public void setPecFcRetPrem(BigDecimal pecFcRetPrem) {
			this.pecFcRetPrem = pecFcRetPrem;
		}
		public BigDecimal getPecLcRetPrem() {
			return pecLcRetPrem;
		}
		public void setPecLcRetPrem(BigDecimal pecLcRetPrem) {
			this.pecLcRetPrem = pecLcRetPrem;
		}
		public BigDecimal getPecFcRiPrem() {
			return pecFcRiPrem;
		}
		public void setPecFcRiPrem(BigDecimal pecFcRiPrem) {
			this.pecFcRiPrem = pecFcRiPrem;
		}
		public BigDecimal getPecLcRiPrem() {
			return pecLcRiPrem;
		}
		public void setPecLcRiPrem(BigDecimal pecLcRiPrem) {
			this.pecLcRiPrem = pecLcRiPrem;
		}
		public BigDecimal getPecLcActualSa() {
			return pecLcActualSa;
		}
		public void setPecLcActualSa(BigDecimal pecLcActualSa) {
			this.pecLcActualSa = pecLcActualSa;
		}
		public BigDecimal getPecFcActualSa() {
			return pecFcActualSa;
		}
		public void setPecFcActualSa(BigDecimal pecFcActualSa) {
			this.pecFcActualSa = pecFcActualSa;
		}
		public BigDecimal getPecOrgFcRetPrem() {
			return pecOrgFcRetPrem;
		}
		public void setPecOrgFcRetPrem(BigDecimal pecOrgFcRetPrem) {
			this.pecOrgFcRetPrem = pecOrgFcRetPrem;
		}
		public BigDecimal getPecOrgLcRetPrem() {
			return pecOrgLcRetPrem;
		}
		public void setPecOrgLcRetPrem(BigDecimal pecOrgLcRetPrem) {
			this.pecOrgLcRetPrem = pecOrgLcRetPrem;
		}
		public BigDecimal getPecOrgFcRiPrem() {
			return pecOrgFcRiPrem;
		}
		public void setPecOrgFcRiPrem(BigDecimal pecOrgFcRiPrem) {
			this.pecOrgFcRiPrem = pecOrgFcRiPrem;
		}
		public BigDecimal getPecOrgLcRiPrem() {
			return pecOrgLcRiPrem;
		}
		public void setPecOrgLcRiPrem(BigDecimal pecOrgLcRiPrem) {
			this.pecOrgLcRiPrem = pecOrgLcRiPrem;
		}
		public BigDecimal getPecOrgLcActualSa() {
			return pecOrgLcActualSa;
		}
		public void setPecOrgLcActualSa(BigDecimal pecOrgLcActualSa) {
			this.pecOrgLcActualSa = pecOrgLcActualSa;
		}
		public BigDecimal getPecOrgFcActualSa() {
			return pecOrgFcActualSa;
		}
		public void setPecOrgFcActualSa(BigDecimal pecOrgFcActualSa) {
			this.pecOrgFcActualSa = pecOrgFcActualSa;
		}
		public LocalDateTime getPecEffFmDt() {
			return pecEffFmDt;
		}
		public void setPecEffFmDt(LocalDateTime pecEffFmDt) {
			this.pecEffFmDt = pecEffFmDt;
		}
		public LocalDateTime getPecEffToDt() {
			return pecEffToDt;
		}
		public void setPecEffToDt(LocalDateTime pecEffToDt) {
			this.pecEffToDt = pecEffToDt;
		}
		public Long getPecCvrLinkSysId() {
			return pecCvrLinkSysId;
		}
		public void setPecCvrLinkSysId(Long pecCvrLinkSysId) {
			this.pecCvrLinkSysId = pecCvrLinkSysId;
		}
		public String getPecCvrsaUpdYn() {
			return pecCvrsaUpdYn;
		}
		public void setPecCvrsaUpdYn(String pecCvrsaUpdYn) {
			this.pecCvrsaUpdYn = pecCvrsaUpdYn;
		}
		public String getPecClmApplYn() {
			return pecClmApplYn;
		}
		public void setPecClmApplYn(String pecClmApplYn) {
			this.pecClmApplYn = pecClmApplYn;
		}
		public Long getPecRefPempSysId() {
			return pecRefPempSysId;
		}
		public void setPecRefPempSysId(Long pecRefPempSysId) {
			this.pecRefPempSysId = pecRefPempSysId;
		}
		public BigDecimal getPecLcCoverFcl() {
			return pecLcCoverFcl;
		}
		public void setPecLcCoverFcl(BigDecimal pecLcCoverFcl) {
			this.pecLcCoverFcl = pecLcCoverFcl;
		}
		public BigDecimal getPecFcCoverFcl() {
			return pecFcCoverFcl;
		}
		public void setPecFcCoverFcl(BigDecimal pecFcCoverFcl) {
			this.pecFcCoverFcl = pecFcCoverFcl;
		}
		public String getPecMediExam() {
			return pecMediExam;
		}
		public void setPecMediExam(String pecMediExam) {
			this.pecMediExam = pecMediExam;
		}
		public String getPecPpdDepnApplYn() {
			return pecPpdDepnApplYn;
		}
		public void setPecPpdDepnApplYn(String pecPpdDepnApplYn) {
			this.pecPpdDepnApplYn = pecPpdDepnApplYn;
		}

	    
	}



