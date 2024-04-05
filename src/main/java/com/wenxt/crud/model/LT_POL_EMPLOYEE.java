package com.wenxt.crud.model;

import java.math.BigDecimal;
import java.util.Date;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "lt_pol_employee")
public class LT_POL_EMPLOYEE {

	@Id
	private Long pempTranId;
	private Long pempPolTranId;
	private String pempId;
	private String pempName;
	private String pempOccCatg;
	private String pempCatgCode;
	private Date pempDob;
	private Short pempAnb;
	private Date pempEntryDt;
	private Date pempExitDt;
	private BigDecimal pempFcSalary;
	private BigDecimal pempLcSalary;
	private BigDecimal pempFcAnnualSalary;
	private BigDecimal pempLcAnnualSalary;
	private BigDecimal pempFcSa;
	private BigDecimal pempLcSa;
	private BigDecimal pempFcPrem;
	private BigDecimal pempLcPrem;
	private BigDecimal pempExtraPremPerc;
	private BigDecimal pempFcExtraPrem;
	private BigDecimal pempLcExtraPrem;
	private BigDecimal pempOrgFcSalary;
	private BigDecimal pempOrgLcSalary;
//	private BigDecimal pempOrgFcAnnSalary;
//	private BigDecimal pempOrgLcAnnSalary;
	private BigDecimal pempOrgFcSa;
	private BigDecimal pempOrgLcSa;
	private BigDecimal pempOrgFcPrem;
	private BigDecimal pempOrgLcPrem;
	private BigDecimal pempOrgFcExtraPrem;
	private BigDecimal pempOrgLcExtraPrem;
	private String pempDelFlag;
	private Date pempInsDt;
	private String pempInsId;
	private Date pempModDt;
	private String pempModId;
	private String pempMediExam;
	private String pempMedClassCode;
	private BigDecimal pempTlRate;
	private BigDecimal pempAncCvrRate;
	private String pempSaDiffYn;
	private BigDecimal pempFcActualSa;
	private BigDecimal pempLcActualSa;
	private String pempEmployeeYn;
	private String pempEmpId;
	private Long pempEmpSysId;
	private String pempOccCode;
	private String pempLocCode;
	private String pempRelnCode;
	private String pempStatus;
	private String pempRefId1;
	private String pempRefId2;
	private String pempTakeOverFlag;
	private BigDecimal pempLcTakeOverFcl;
	private BigDecimal pempFcClPrem;
	private BigDecimal pempLcClPrem;
	private BigDecimal pempFcTtyPrem;
	private BigDecimal pempLcTtyPrem;
	private BigDecimal pempOrgLcTakeOverFcl;
	private BigDecimal pempOrgFcClPrem;
	private BigDecimal pempOrgLcClPrem;
	private BigDecimal pempOrgFcTtyPrem;
	private BigDecimal pempOrgLcTtyPrem;
	private String pempRecType;
	private BigDecimal pempOrgFcActualSa;
	private BigDecimal pempOrgLcActualSa;
	private BigDecimal pempFcRiPrem;
	private BigDecimal pempLcRiPrem;
	private BigDecimal pempFcRetPrem;
	private BigDecimal pempLcRetPrem;
	private BigDecimal pempOrgFcRiPrem;
	private BigDecimal pempOrgLcRiPrem;
	private BigDecimal pempOrgFcRetPrem;
	private BigDecimal pempOrgLcRetPrem;
	private Date pempEndEffDt;
	private String pempCvrUpdYn;
	private String pempMaritalStatus;
	private String pempUwRemarks;
	private String pempSpouseYn;
	private String pempChildYn;
	private String pempUploadYn;
//	private String pempFlex01;
	private BigDecimal pempProfitRate;
	private Long pempProfitRatePer;
	private BigDecimal pempLoanTerm;
	private String pempPlanCode;
	private String pempParentId;
	private String pempMemberType;
	private Double pempNoOfDep;
	private Double pempNoOfChild;
//	private BigDecimal pempFlex02;
	private String pempCertNo;
//	private String pempAddlStatus;
	private Short pempHeight;
	private String pempHeightUnit;
	private BigDecimal pempWeight;
	private String pempWeightUnit;
	private BigDecimal pempBmi;
	private String pempEmpNation;
	private String pempEmpStatus;
	private String pempMop;
	private Date pempInceptionDt;
	private Date pempIncepEndDt;
	private BigDecimal pempInterestRate;
	private String pempCoverPremChgYn;
	private String pempCvrCode1;
	private BigDecimal pempCvrSa1;
	private String pempCvrCode2;
	private BigDecimal pempCvrSa2;
	private String pempCvrCode3;
	private BigDecimal pempCvrSa3;
	private String pempCvrCode4;
	private BigDecimal pempCvrSa4;
	private String pempCvrCode5;
	private BigDecimal pempCvrSa5;
	private BigDecimal pempFixedSa;
	private BigDecimal pempNetSal;
	private String pempTypeLoan;
	private String pempBankName;
	private String pempBranchName;
	private String pempAcntNo;
	private Date pempEcDob;
	private BigDecimal pempManFcPrem;

	public Long getPempTranId() {
		return pempTranId;
	}

	public void setPempTranId(Long pempTranId) {
		this.pempTranId = pempTranId;
	}

	public Long getPempPolTranId() {
		return pempPolTranId;
	}

	public void setPempPolTranId(Long pempPolTranId) {
		this.pempPolTranId = pempPolTranId;
	}

	public String getPempId() {
		return pempId;
	}

	public void setPempId(String pempId) {
		this.pempId = pempId;
	}

	public String getPempName() {
		return pempName;
	}

	public void setPempName(String pempName) {
		this.pempName = pempName;
	}

	public String getPempOccCatg() {
		return pempOccCatg;
	}

	public void setPempOccCatg(String pempOccCatg) {
		this.pempOccCatg = pempOccCatg;
	}

	public String getPempCatgCode() {
		return pempCatgCode;
	}

	public void setPempCatgCode(String pempCatgCode) {
		this.pempCatgCode = pempCatgCode;
	}

	public Date getPempDob() {
		return pempDob;
	}

	public void setPempDob(Date pempDob) {
		this.pempDob = pempDob;
	}

	public Short getPempAnb() {
		return pempAnb;
	}

	public void setPempAnb(Short pempAnb) {
		this.pempAnb = pempAnb;
	}

	public Date getPempEntryDt() {
		return pempEntryDt;
	}

	public void setPempEntryDt(Date pempEntryDt) {
		this.pempEntryDt = pempEntryDt;
	}

	public Date getPempExitDt() {
		return pempExitDt;
	}

	public void setPempExitDt(Date pempExitDt) {
		this.pempExitDt = pempExitDt;
	}

	public BigDecimal getPempFcSalary() {
		return pempFcSalary;
	}

	public void setPempFcSalary(BigDecimal pempFcSalary) {
		this.pempFcSalary = pempFcSalary;
	}

	public BigDecimal getPempLcSalary() {
		return pempLcSalary;
	}

	public void setPempLcSalary(BigDecimal pempLcSalary) {
		this.pempLcSalary = pempLcSalary;
	}

	public BigDecimal getPempFcAnnualSalary() {
		return pempFcAnnualSalary;
	}

	public void setPempFcAnnualSalary(BigDecimal pempFcAnnualSalary) {
		this.pempFcAnnualSalary = pempFcAnnualSalary;
	}

	public BigDecimal getPempLcAnnualSalary() {
		return pempLcAnnualSalary;
	}

	public void setPempLcAnnualSalary(BigDecimal pempLcAnnualSalary) {
		this.pempLcAnnualSalary = pempLcAnnualSalary;
	}

	public BigDecimal getPempFcSa() {
		return pempFcSa;
	}

	public void setPempFcSa(BigDecimal pempFcSa) {
		this.pempFcSa = pempFcSa;
	}

	public BigDecimal getPempLcSa() {
		return pempLcSa;
	}

	public void setPempLcSa(BigDecimal pempLcSa) {
		this.pempLcSa = pempLcSa;
	}

	public BigDecimal getPempFcPrem() {
		return pempFcPrem;
	}

	public void setPempFcPrem(BigDecimal pempFcPrem) {
		this.pempFcPrem = pempFcPrem;
	}

	public BigDecimal getPempLcPrem() {
		return pempLcPrem;
	}

	public void setPempLcPrem(BigDecimal pempLcPrem) {
		this.pempLcPrem = pempLcPrem;
	}

	public BigDecimal getPempExtraPremPerc() {
		return pempExtraPremPerc;
	}

	public void setPempExtraPremPerc(BigDecimal pempExtraPremPerc) {
		this.pempExtraPremPerc = pempExtraPremPerc;
	}

	public BigDecimal getPempFcExtraPrem() {
		return pempFcExtraPrem;
	}

	public void setPempFcExtraPrem(BigDecimal pempFcExtraPrem) {
		this.pempFcExtraPrem = pempFcExtraPrem;
	}

	public BigDecimal getPempLcExtraPrem() {
		return pempLcExtraPrem;
	}

	public void setPempLcExtraPrem(BigDecimal pempLcExtraPrem) {
		this.pempLcExtraPrem = pempLcExtraPrem;
	}

	public BigDecimal getPempOrgFcSalary() {
		return pempOrgFcSalary;
	}

	public void setPempOrgFcSalary(BigDecimal pempOrgFcSalary) {
		this.pempOrgFcSalary = pempOrgFcSalary;
	}

	public BigDecimal getPempOrgLcSalary() {
		return pempOrgLcSalary;
	}

	public void setPempOrgLcSalary(BigDecimal pempOrgLcSalary) {
		this.pempOrgLcSalary = pempOrgLcSalary;
	}

//		public BigDecimal getPempOrgFcAnnSalary() {
//			return pempOrgFcAnnSalary;
//		}
//		public void setPempOrgFcAnnSalary(BigDecimal pempOrgFcAnnSalary) {
//			this.pempOrgFcAnnSalary = pempOrgFcAnnSalary;
//		}
//		public BigDecimal getPempOrgLcAnnSalary() {
//			return pempOrgLcAnnSalary;
//		}
//		public void setPempOrgLcAnnSalary(BigDecimal pempOrgLcAnnSalary) {
//			this.pempOrgLcAnnSalary = pempOrgLcAnnSalary;
//		}
	public BigDecimal getPempOrgFcSa() {
		return pempOrgFcSa;
	}

	public void setPempOrgFcSa(BigDecimal pempOrgFcSa) {
		this.pempOrgFcSa = pempOrgFcSa;
	}

	public BigDecimal getPempOrgLcSa() {
		return pempOrgLcSa;
	}

	public void setPempOrgLcSa(BigDecimal pempOrgLcSa) {
		this.pempOrgLcSa = pempOrgLcSa;
	}

	public BigDecimal getPempOrgFcPrem() {
		return pempOrgFcPrem;
	}

	public void setPempOrgFcPrem(BigDecimal pempOrgFcPrem) {
		this.pempOrgFcPrem = pempOrgFcPrem;
	}

	public BigDecimal getPempOrgLcPrem() {
		return pempOrgLcPrem;
	}

	public void setPempOrgLcPrem(BigDecimal pempOrgLcPrem) {
		this.pempOrgLcPrem = pempOrgLcPrem;
	}

	public BigDecimal getPempOrgFcExtraPrem() {
		return pempOrgFcExtraPrem;
	}

	public void setPempOrgFcExtraPrem(BigDecimal pempOrgFcExtraPrem) {
		this.pempOrgFcExtraPrem = pempOrgFcExtraPrem;
	}

	public BigDecimal getPempOrgLcExtraPrem() {
		return pempOrgLcExtraPrem;
	}

	public void setPempOrgLcExtraPrem(BigDecimal pempOrgLcExtraPrem) {
		this.pempOrgLcExtraPrem = pempOrgLcExtraPrem;
	}

	public String getPempDelFlag() {
		return pempDelFlag;
	}

	public void setPempDelFlag(String pempDelFlag) {
		this.pempDelFlag = pempDelFlag;
	}

	public Date getPempInsDt() {
		return pempInsDt;
	}

	public void setPempInsDt(Date pempInsDt) {
		this.pempInsDt = pempInsDt;
	}

	public String getPempInsId() {
		return pempInsId;
	}

	public void setPempInsId(String pempInsId) {
		this.pempInsId = pempInsId;
	}

	public Date getPempModDt() {
		return pempModDt;
	}

	public void setPempModDt(Date pempModDt) {
		this.pempModDt = pempModDt;
	}

	public String getPempModId() {
		return pempModId;
	}

	public void setPempModId(String pempModId) {
		this.pempModId = pempModId;
	}

	public String getPempMediExam() {
		return pempMediExam;
	}

	public void setPempMediExam(String pempMediExam) {
		this.pempMediExam = pempMediExam;
	}

	public String getPempMedClassCode() {
		return pempMedClassCode;
	}

	public void setPempMedClassCode(String pempMedClassCode) {
		this.pempMedClassCode = pempMedClassCode;
	}

	public BigDecimal getPempTlRate() {
		return pempTlRate;
	}

	public void setPempTlRate(BigDecimal pempTlRate) {
		this.pempTlRate = pempTlRate;
	}

	public BigDecimal getPempAncCvrRate() {
		return pempAncCvrRate;
	}

	public void setPempAncCvrRate(BigDecimal pempAncCvrRate) {
		this.pempAncCvrRate = pempAncCvrRate;
	}

	public String getPempSaDiffYn() {
		return pempSaDiffYn;
	}

	public void setPempSaDiffYn(String pempSaDiffYn) {
		this.pempSaDiffYn = pempSaDiffYn;
	}

	public BigDecimal getPempFcActualSa() {
		return pempFcActualSa;
	}

	public void setPempFcActualSa(BigDecimal pempFcActualSa) {
		this.pempFcActualSa = pempFcActualSa;
	}

	public BigDecimal getPempLcActualSa() {
		return pempLcActualSa;
	}

	public void setPempLcActualSa(BigDecimal pempLcActualSa) {
		this.pempLcActualSa = pempLcActualSa;
	}

	public String getPempEmployeeYn() {
		return pempEmployeeYn;
	}

	public void setPempEmployeeYn(String pempEmployeeYn) {
		this.pempEmployeeYn = pempEmployeeYn;
	}

	public String getPempEmpId() {
		return pempEmpId;
	}

	public void setPempEmpId(String pempEmpId) {
		this.pempEmpId = pempEmpId;
	}

	public Long getPempEmpSysId() {
		return pempEmpSysId;
	}

	public void setPempEmpSysId(Long pempEmpSysId) {
		this.pempEmpSysId = pempEmpSysId;
	}

	public String getPempOccCode() {
		return pempOccCode;
	}

	public void setPempOccCode(String pempOccCode) {
		this.pempOccCode = pempOccCode;
	}

	public String getPempLocCode() {
		return pempLocCode;
	}

	public void setPempLocCode(String pempLocCode) {
		this.pempLocCode = pempLocCode;
	}

	public String getPempRelnCode() {
		return pempRelnCode;
	}

	public void setPempRelnCode(String pempRelnCode) {
		this.pempRelnCode = pempRelnCode;
	}

	public String getPempStatus() {
		return pempStatus;
	}

	public void setPempStatus(String pempStatus) {
		this.pempStatus = pempStatus;
	}

	public String getPempRefId1() {
		return pempRefId1;
	}

	public void setPempRefId1(String pempRefId1) {
		this.pempRefId1 = pempRefId1;
	}

	public String getPempRefId2() {
		return pempRefId2;
	}

	public void setPempRefId2(String pempRefId2) {
		this.pempRefId2 = pempRefId2;
	}

	public String getPempTakeOverFlag() {
		return pempTakeOverFlag;
	}

	public void setPempTakeOverFlag(String pempTakeOverFlag) {
		this.pempTakeOverFlag = pempTakeOverFlag;
	}

	public BigDecimal getPempLcTakeOverFcl() {
		return pempLcTakeOverFcl;
	}

	public void setPempLcTakeOverFcl(BigDecimal pempLcTakeOverFcl) {
		this.pempLcTakeOverFcl = pempLcTakeOverFcl;
	}

	public BigDecimal getPempFcClPrem() {
		return pempFcClPrem;
	}

	public void setPempFcClPrem(BigDecimal pempFcClPrem) {
		this.pempFcClPrem = pempFcClPrem;
	}

	public BigDecimal getPempLcClPrem() {
		return pempLcClPrem;
	}

	public void setPempLcClPrem(BigDecimal pempLcClPrem) {
		this.pempLcClPrem = pempLcClPrem;
	}

	public BigDecimal getPempFcTtyPrem() {
		return pempFcTtyPrem;
	}

	public void setPempFcTtyPrem(BigDecimal pempFcTtyPrem) {
		this.pempFcTtyPrem = pempFcTtyPrem;
	}

	public BigDecimal getPempLcTtyPrem() {
		return pempLcTtyPrem;
	}

	public void setPempLcTtyPrem(BigDecimal pempLcTtyPrem) {
		this.pempLcTtyPrem = pempLcTtyPrem;
	}

	public BigDecimal getPempOrgLcTakeOverFcl() {
		return pempOrgLcTakeOverFcl;
	}

	public void setPempOrgLcTakeOverFcl(BigDecimal pempOrgLcTakeOverFcl) {
		this.pempOrgLcTakeOverFcl = pempOrgLcTakeOverFcl;
	}

	public BigDecimal getPempOrgFcClPrem() {
		return pempOrgFcClPrem;
	}

	public void setPempOrgFcClPrem(BigDecimal pempOrgFcClPrem) {
		this.pempOrgFcClPrem = pempOrgFcClPrem;
	}

	public BigDecimal getPempOrgLcClPrem() {
		return pempOrgLcClPrem;
	}

	public void setPempOrgLcClPrem(BigDecimal pempOrgLcClPrem) {
		this.pempOrgLcClPrem = pempOrgLcClPrem;
	}

	public BigDecimal getPempOrgFcTtyPrem() {
		return pempOrgFcTtyPrem;
	}

	public void setPempOrgFcTtyPrem(BigDecimal pempOrgFcTtyPrem) {
		this.pempOrgFcTtyPrem = pempOrgFcTtyPrem;
	}

	public BigDecimal getPempOrgLcTtyPrem() {
		return pempOrgLcTtyPrem;
	}

	public void setPempOrgLcTtyPrem(BigDecimal pempOrgLcTtyPrem) {
		this.pempOrgLcTtyPrem = pempOrgLcTtyPrem;
	}

	public String getPempRecType() {
		return pempRecType;
	}

	public void setPempRecType(String pempRecType) {
		this.pempRecType = pempRecType;
	}

	public BigDecimal getPempOrgFcActualSa() {
		return pempOrgFcActualSa;
	}

	public void setPempOrgFcActualSa(BigDecimal pempOrgFcActualSa) {
		this.pempOrgFcActualSa = pempOrgFcActualSa;
	}

	public BigDecimal getPempOrgLcActualSa() {
		return pempOrgLcActualSa;
	}

	public void setPempOrgLcActualSa(BigDecimal pempOrgLcActualSa) {
		this.pempOrgLcActualSa = pempOrgLcActualSa;
	}

	public BigDecimal getPempFcRiPrem() {
		return pempFcRiPrem;
	}

	public void setPempFcRiPrem(BigDecimal pempFcRiPrem) {
		this.pempFcRiPrem = pempFcRiPrem;
	}

	public BigDecimal getPempLcRiPrem() {
		return pempLcRiPrem;
	}

	public void setPempLcRiPrem(BigDecimal pempLcRiPrem) {
		this.pempLcRiPrem = pempLcRiPrem;
	}

	public BigDecimal getPempFcRetPrem() {
		return pempFcRetPrem;
	}

	public void setPempFcRetPrem(BigDecimal pempFcRetPrem) {
		this.pempFcRetPrem = pempFcRetPrem;
	}

	public BigDecimal getPempLcRetPrem() {
		return pempLcRetPrem;
	}

	public void setPempLcRetPrem(BigDecimal pempLcRetPrem) {
		this.pempLcRetPrem = pempLcRetPrem;
	}

	public BigDecimal getPempOrgFcRiPrem() {
		return pempOrgFcRiPrem;
	}

	public void setPempOrgFcRiPrem(BigDecimal pempOrgFcRiPrem) {
		this.pempOrgFcRiPrem = pempOrgFcRiPrem;
	}

	public BigDecimal getPempOrgLcRiPrem() {
		return pempOrgLcRiPrem;
	}

	public void setPempOrgLcRiPrem(BigDecimal pempOrgLcRiPrem) {
		this.pempOrgLcRiPrem = pempOrgLcRiPrem;
	}

	public BigDecimal getPempOrgFcRetPrem() {
		return pempOrgFcRetPrem;
	}

	public void setPempOrgFcRetPrem(BigDecimal pempOrgFcRetPrem) {
		this.pempOrgFcRetPrem = pempOrgFcRetPrem;
	}

	public BigDecimal getPempOrgLcRetPrem() {
		return pempOrgLcRetPrem;
	}

	public void setPempOrgLcRetPrem(BigDecimal pempOrgLcRetPrem) {
		this.pempOrgLcRetPrem = pempOrgLcRetPrem;
	}

	public Date getPempEndEffDt() {
		return pempEndEffDt;
	}

	public void setPempEndEffDt(Date pempEndEffDt) {
		this.pempEndEffDt = pempEndEffDt;
	}

	public String getPempCvrUpdYn() {
		return pempCvrUpdYn;
	}

	public void setPempCvrUpdYn(String pempCvrUpdYn) {
		this.pempCvrUpdYn = pempCvrUpdYn;
	}

	public String getPempMaritalStatus() {
		return pempMaritalStatus;
	}

	public void setPempMaritalStatus(String pempMaritalStatus) {
		this.pempMaritalStatus = pempMaritalStatus;
	}

	public String getPempUwRemarks() {
		return pempUwRemarks;
	}

	public void setPempUwRemarks(String pempUwRemarks) {
		this.pempUwRemarks = pempUwRemarks;
	}

	public String getPempSpouseYn() {
		return pempSpouseYn;
	}

	public void setPempSpouseYn(String pempSpouseYn) {
		this.pempSpouseYn = pempSpouseYn;
	}

	public String getPempChildYn() {
		return pempChildYn;
	}

	public void setPempChildYn(String pempChildYn) {
		this.pempChildYn = pempChildYn;
	}

	public String getPempUploadYn() {
		return pempUploadYn;
	}

	public void setPempUploadYn(String pempUploadYn) {
		this.pempUploadYn = pempUploadYn;
	}

//		public String getPempFlex01() {
//			return pempFlex01;
//		}
//		public void setPempFlex01(String pempFlex01) {
//			this.pempFlex01 = pempFlex01;
//		}
	public BigDecimal getPempProfitRate() {
		return pempProfitRate;
	}

	public void setPempProfitRate(BigDecimal pempProfitRate) {
		this.pempProfitRate = pempProfitRate;
	}

	public Long getPempProfitRatePer() {
		return pempProfitRatePer;
	}

	public void setPempProfitRatePer(Long pempProfitRatePer) {
		this.pempProfitRatePer = pempProfitRatePer;
	}

	public BigDecimal getPempLoanTerm() {
		return pempLoanTerm;
	}

	public void setPempLoanTerm(BigDecimal pempLoanTerm) {
		this.pempLoanTerm = pempLoanTerm;
	}

	public String getPempPlanCode() {
		return pempPlanCode;
	}

	public void setPempPlanCode(String pempPlanCode) {
		this.pempPlanCode = pempPlanCode;
	}

	public String getPempParentId() {
		return pempParentId;
	}

	public void setPempParentId(String pempParentId) {
		this.pempParentId = pempParentId;
	}

	public String getPempMemberType() {
		return pempMemberType;
	}

	public void setPempMemberType(String pempMemberType) {
		this.pempMemberType = pempMemberType;
	}

	public Double getPempNoOfDep() {
		return pempNoOfDep;
	}

	public void setPempNoOfDep(Double pempNoOfDep) {
		this.pempNoOfDep = pempNoOfDep;
	}

	public Double getPempNoOfChild() {
		return pempNoOfChild;
	}

	public void setPempNoOfChild(Double pempNoOfChild) {
		this.pempNoOfChild = pempNoOfChild;
	}

//		public BigDecimal getPempFlex02() {
//			return pempFlex02;
//		}
//		public void setPempFlex02(BigDecimal pempFlex02) {
//			this.pempFlex02 = pempFlex02;
//		}
	public String getPempCertNo() {
		return pempCertNo;
	}

	public void setPempCertNo(String pempCertNo) {
		this.pempCertNo = pempCertNo;
	}

//	public String getPempAddlStatus() {
//		return pempAddlStatus;
//	}
//
//	public void setPempAddlStatus(String pempAddlStatus) {
//		this.pempAddlStatus = pempAddlStatus;
//	}

	public Short getPempHeight() {
		return pempHeight;
	}

	public void setPempHeight(Short pempHeight) {
		this.pempHeight = pempHeight;
	}

	public String getPempHeightUnit() {
		return pempHeightUnit;
	}

	public void setPempHeightUnit(String pempHeightUnit) {
		this.pempHeightUnit = pempHeightUnit;
	}

	public BigDecimal getPempWeight() {
		return pempWeight;
	}

	public void setPempWeight(BigDecimal pempWeight) {
		this.pempWeight = pempWeight;
	}

	public String getPempWeightUnit() {
		return pempWeightUnit;
	}

	public void setPempWeightUnit(String pempWeightUnit) {
		this.pempWeightUnit = pempWeightUnit;
	}

	public BigDecimal getPempBmi() {
		return pempBmi;
	}

	public void setPempBmi(BigDecimal pempBmi) {
		this.pempBmi = pempBmi;
	}

	public String getPempEmpNation() {
		return pempEmpNation;
	}

	public void setPempEmpNation(String pempEmpNation) {
		this.pempEmpNation = pempEmpNation;
	}

	public String getPempEmpStatus() {
		return pempEmpStatus;
	}

	public void setPempEmpStatus(String pempEmpStatus) {
		this.pempEmpStatus = pempEmpStatus;
	}

	public String getPempMop() {
		return pempMop;
	}

	public void setPempMop(String pempMop) {
		this.pempMop = pempMop;
	}

	public Date getPempInceptionDt() {
		return pempInceptionDt;
	}

	public void setPempInceptionDt(Date pempInceptionDt) {
		this.pempInceptionDt = pempInceptionDt;
	}

	public Date getPempIncepEndDt() {
		return pempIncepEndDt;
	}

	public void setPempIncepEndDt(Date pempIncepEndDt) {
		this.pempIncepEndDt = pempIncepEndDt;
	}

	public BigDecimal getPempInterestRate() {
		return pempInterestRate;
	}

	public void setPempInterestRate(BigDecimal pempInterestRate) {
		this.pempInterestRate = pempInterestRate;
	}

	public String getPempCoverPremChgYn() {
		return pempCoverPremChgYn;
	}

	public void setPempCoverPremChgYn(String pempCoverPremChgYn) {
		this.pempCoverPremChgYn = pempCoverPremChgYn;
	}

	public String getPempCvrCode1() {
		return pempCvrCode1;
	}

	public void setPempCvrCode1(String pempCvrCode1) {
		this.pempCvrCode1 = pempCvrCode1;
	}

	public BigDecimal getPempCvrSa1() {
		return pempCvrSa1;
	}

	public void setPempCvrSa1(BigDecimal pempCvrSa1) {
		this.pempCvrSa1 = pempCvrSa1;
	}

	public String getPempCvrCode2() {
		return pempCvrCode2;
	}

	public void setPempCvrCode2(String pempCvrCode2) {
		this.pempCvrCode2 = pempCvrCode2;
	}

	public BigDecimal getPempCvrSa2() {
		return pempCvrSa2;
	}

	public void setPempCvrSa2(BigDecimal pempCvrSa2) {
		this.pempCvrSa2 = pempCvrSa2;
	}

	public String getPempCvrCode3() {
		return pempCvrCode3;
	}

	public void setPempCvrCode3(String pempCvrCode3) {
		this.pempCvrCode3 = pempCvrCode3;
	}

	public BigDecimal getPempCvrSa3() {
		return pempCvrSa3;
	}

	public void setPempCvrSa3(BigDecimal pempCvrSa3) {
		this.pempCvrSa3 = pempCvrSa3;
	}

	public String getPempCvrCode4() {
		return pempCvrCode4;
	}

	public void setPempCvrCode4(String pempCvrCode4) {
		this.pempCvrCode4 = pempCvrCode4;
	}

	public BigDecimal getPempCvrSa4() {
		return pempCvrSa4;
	}

	public void setPempCvrSa4(BigDecimal pempCvrSa4) {
		this.pempCvrSa4 = pempCvrSa4;
	}

	public String getPempCvrCode5() {
		return pempCvrCode5;
	}

	public void setPempCvrCode5(String pempCvrCode5) {
		this.pempCvrCode5 = pempCvrCode5;
	}

	public BigDecimal getPempCvrSa5() {
		return pempCvrSa5;
	}

	public void setPempCvrSa5(BigDecimal pempCvrSa5) {
		this.pempCvrSa5 = pempCvrSa5;
	}

	public BigDecimal getPempFixedSa() {
		return pempFixedSa;
	}

	public void setPempFixedSa(BigDecimal pempFixedSa) {
		this.pempFixedSa = pempFixedSa;
	}

	public BigDecimal getPempNetSal() {
		return pempNetSal;
	}

	public void setPempNetSal(BigDecimal pempNetSal) {
		this.pempNetSal = pempNetSal;
	}

	public String getPempTypeLoan() {
		return pempTypeLoan;
	}

	public void setPempTypeLoan(String pempTypeLoan) {
		this.pempTypeLoan = pempTypeLoan;
	}

	public String getPempBankName() {
		return pempBankName;
	}

	public void setPempBankName(String pempBankName) {
		this.pempBankName = pempBankName;
	}

	public String getPempBranchName() {
		return pempBranchName;
	}

	public void setPempBranchName(String pempBranchName) {
		this.pempBranchName = pempBranchName;
	}

	public String getPempAcntNo() {
		return pempAcntNo;
	}

	public void setPempAcntNo(String pempAcntNo) {
		this.pempAcntNo = pempAcntNo;
	}

	public Date getPempEcDob() {
		return pempEcDob;
	}

	public void setPempEcDob(Date pempEcDob) {
		this.pempEcDob = pempEcDob;
	}

	public BigDecimal getPempManFcPrem() {
		return pempManFcPrem;
	}

	public void setPempManFcPrem(BigDecimal pempManFcPrem) {
		this.pempManFcPrem = pempManFcPrem;
	}

//	public BigDecimal getPempOrgFcAnnSalary() {
//		return pempOrgFcAnnSalary;
//	}
//
//	public void setPempOrgFcAnnSalary(BigDecimal pempOrgFcAnnSalary) {
//		this.pempOrgFcAnnSalary = pempOrgFcAnnSalary;
//	}
//
//	public BigDecimal getPempOrgLcAnnSalary() {
//		return pempOrgLcAnnSalary;
//	}
//
//	public void setPempOrgLcAnnSalary(BigDecimal pempOrgLcAnnSalary) {
//		this.pempOrgLcAnnSalary = pempOrgLcAnnSalary;
//	}
//
//	public String getPempFlex01() {
//		return pempFlex01;
//	}
//
//	public void setPempFlex01(String pempFlex01) {
//		this.pempFlex01 = pempFlex01;
//	}
//
//	public BigDecimal getPempFlex02() {
//		return pempFlex02;
//	}
//
//	public void setPempFlex02(BigDecimal pempFlex02) {
//		this.pempFlex02 = pempFlex02;
//	}
//
//	
	
}
