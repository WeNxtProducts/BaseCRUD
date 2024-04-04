package com.example.democrud.model;

import java.math.BigDecimal;
import java.sql.Date;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "LT_POL_ASSRD_DET")
public class LT_POL_ASSRD_DET {

	@Id
	private Long padTranId;
	private Long padPolTranId;
	private Short padSerialNo;
	private String padAssrCode;
	private String padAssuredName;
	private String padBirthPlace;
	private Date padDob;
	private Short padAge;
	private String padGender;
	private String padMarStatus;
	private String padNationality;
	private String padOccCode;
	private String padNatureOfWork;
	private String padHealthCode;
	private String padRemarks;
	private Date padInsDt;
	private String padInsId;
	private Date padModDt;
	private String padModUid;
	private BigDecimal padFcSumAssured;
	private BigDecimal padLcSumAssured;
	private BigDecimal padHealthRate;
	private BigDecimal padHeight;
	private BigDecimal padWeight;
	private Short padDiscAge;
	private String padAgeProofFlag;
	private String padAgeProofOthers;
	private String padUniqId1;
	private String padUniqId2;
	private String padOccClass;
	private BigDecimal padBmi;
	private String padRace;
	private BigDecimal padLcThresholdLmt;
	private BigDecimal padOrgLcThresholdLmt;
	private String padReligionCode;
	private String padType;
	private String padHeightUnit;
	private String padWeightUnit;
	private BigDecimal padFcSalary;
	private BigDecimal padLcSalary;
	private String padSmokeYn;
	private Integer padNoOfCigar;
	private String padRelationCode;
	private String padPolOwnerYn;
	private String padAlchohalicYn;
	private BigDecimal padAlcoholQuan;
	private String padAgeAdmitted;
	private Double padBpl;
	private Double padBph;
	private String padHivTestYn;
	private String padPregnentYn;
	private String padFamilyYn;
	private String padOccYn;

	public Long getPadTranId() {
		return padTranId;
	}

	public void setPadTranId(Long padTranId) {
		this.padTranId = padTranId;
	}

	public Long getPadPolTranId() {
		return padPolTranId;
	}

	public void setPadPolTranId(Long padPolTranId) {
		this.padPolTranId = padPolTranId;
	}

	public Short getPadSerialNo() {
		return padSerialNo;
	}

	public void setPadSerialNo(Short padSerialNo) {
		this.padSerialNo = padSerialNo;
	}

	public String getPadAssrCode() {
		return padAssrCode;
	}

	public void setPadAssrCode(String padAssrCode) {
		this.padAssrCode = padAssrCode;
	}

	public String getPadAssuredName() {
		return padAssuredName;
	}

	public void setPadAssuredName(String padAssuredName) {
		this.padAssuredName = padAssuredName;
	}

	public String getPadBirthPlace() {
		return padBirthPlace;
	}

	public void setPadBirthPlace(String padBirthPlace) {
		this.padBirthPlace = padBirthPlace;
	}

	public Date getPadDob() {
		return padDob;
	}

	public void setPadDob(Date padDob) {
		this.padDob = padDob;
	}

	public Short getPadAge() {
		return padAge;
	}

	public void setPadAge(Short padAge) {
		this.padAge = padAge;
	}

	public String getPadGender() {
		return padGender;
	}

	public void setPadGender(String padGender) {
		this.padGender = padGender;
	}

	public String getPadMarStatus() {
		return padMarStatus;
	}

	public void setPadMarStatus(String padMarStatus) {
		this.padMarStatus = padMarStatus;
	}

	public String getPadNationality() {
		return padNationality;
	}

	public void setPadNationality(String padNationality) {
		this.padNationality = padNationality;
	}

	public String getPadOccCode() {
		return padOccCode;
	}

	public void setPadOccCode(String padOccCode) {
		this.padOccCode = padOccCode;
	}

	public String getPadNatureOfWork() {
		return padNatureOfWork;
	}

	public void setPadNatureOfWork(String padNatureOfWork) {
		this.padNatureOfWork = padNatureOfWork;
	}

	public String getPadHealthCode() {
		return padHealthCode;
	}

	public void setPadHealthCode(String padHealthCode) {
		this.padHealthCode = padHealthCode;
	}

	public String getPadRemarks() {
		return padRemarks;
	}

	public void setPadRemarks(String padRemarks) {
		this.padRemarks = padRemarks;
	}

	public Date getPadInsDt() {
		return padInsDt;
	}

	public void setPadInsDt(Date padInsDt) {
		this.padInsDt = padInsDt;
	}

	public String getPadInsId() {
		return padInsId;
	}

	public void setPadInsId(String padInsId) {
		this.padInsId = padInsId;
	}

	public Date getPadModDt() {
		return padModDt;
	}

	public void setPadModDt(Date padModDt) {
		this.padModDt = padModDt;
	}

	public String getPadModUid() {
		return padModUid;
	}

	public void setPadModUid(String padModUid) {
		this.padModUid = padModUid;
	}

	public BigDecimal getPadFcSumAssured() {
		return padFcSumAssured;
	}

	public void setPadFcSumAssured(BigDecimal padFcSumAssured) {
		this.padFcSumAssured = padFcSumAssured;
	}

	public BigDecimal getPadLcSumAssured() {
		return padLcSumAssured;
	}

	public void setPadLcSumAssured(BigDecimal padLcSumAssured) {
		this.padLcSumAssured = padLcSumAssured;
	}

	public BigDecimal getPadHealthRate() {
		return padHealthRate;
	}

	public void setPadHealthRate(BigDecimal padHealthRate) {
		this.padHealthRate = padHealthRate;
	}

	public BigDecimal getPadHeight() {
		return padHeight;
	}

	public void setPadHeight(BigDecimal padHeight) {
		this.padHeight = padHeight;
	}

	public BigDecimal getPadWeight() {
		return padWeight;
	}

	public void setPadWeight(BigDecimal padWeight) {
		this.padWeight = padWeight;
	}

	public Short getPadDiscAge() {
		return padDiscAge;
	}

	public void setPadDiscAge(Short padDiscAge) {
		this.padDiscAge = padDiscAge;
	}

	public String getPadAgeProofFlag() {
		return padAgeProofFlag;
	}

	public void setPadAgeProofFlag(String padAgeProofFlag) {
		this.padAgeProofFlag = padAgeProofFlag;
	}

	public String getPadAgeProofOthers() {
		return padAgeProofOthers;
	}

	public void setPadAgeProofOthers(String padAgeProofOthers) {
		this.padAgeProofOthers = padAgeProofOthers;
	}

	public String getPadUniqId1() {
		return padUniqId1;
	}

	public void setPadUniqId1(String padUniqId1) {
		this.padUniqId1 = padUniqId1;
	}

	public String getPadUniqId2() {
		return padUniqId2;
	}

	public void setPadUniqId2(String padUniqId2) {
		this.padUniqId2 = padUniqId2;
	}

	public String getPadOccClass() {
		return padOccClass;
	}

	public void setPadOccClass(String padOccClass) {
		this.padOccClass = padOccClass;
	}

	public BigDecimal getPadBmi() {
		return padBmi;
	}

	public void setPadBmi(BigDecimal padBmi) {
		this.padBmi = padBmi;
	}

	public String getPadRace() {
		return padRace;
	}

	public void setPadRace(String padRace) {
		this.padRace = padRace;
	}

	public BigDecimal getPadLcThresholdLmt() {
		return padLcThresholdLmt;
	}

	public void setPadLcThresholdLmt(BigDecimal padLcThresholdLmt) {
		this.padLcThresholdLmt = padLcThresholdLmt;
	}

	public BigDecimal getPadOrgLcThresholdLmt() {
		return padOrgLcThresholdLmt;
	}

	public void setPadOrgLcThresholdLmt(BigDecimal padOrgLcThresholdLmt) {
		this.padOrgLcThresholdLmt = padOrgLcThresholdLmt;
	}

	public String getPadReligionCode() {
		return padReligionCode;
	}

	public void setPadReligionCode(String padReligionCode) {
		this.padReligionCode = padReligionCode;
	}

	public String getPadType() {
		return padType;
	}

	public void setPadType(String padType) {
		this.padType = padType;
	}

	public String getPadHeightUnit() {
		return padHeightUnit;
	}

	public void setPadHeightUnit(String padHeightUnit) {
		this.padHeightUnit = padHeightUnit;
	}

	public String getPadWeightUnit() {
		return padWeightUnit;
	}

	public void setPadWeightUnit(String padWeightUnit) {
		this.padWeightUnit = padWeightUnit;
	}

	public BigDecimal getPadFcSalary() {
		return padFcSalary;
	}

	public void setPadFcSalary(BigDecimal padFcSalary) {
		this.padFcSalary = padFcSalary;
	}

	public BigDecimal getPadLcSalary() {
		return padLcSalary;
	}

	public void setPadLcSalary(BigDecimal padLcSalary) {
		this.padLcSalary = padLcSalary;
	}

	public String getPadSmokeYn() {
		return padSmokeYn;
	}

	public void setPadSmokeYn(String padSmokeYn) {
		this.padSmokeYn = padSmokeYn;
	}

	public Integer getPadNoOfCigar() {
		return padNoOfCigar;
	}

	public void setPadNoOfCigar(Integer padNoOfCigar) {
		this.padNoOfCigar = padNoOfCigar;
	}

	public String getPadRelationCode() {
		return padRelationCode;
	}

	public void setPadRelationCode(String padRelationCode) {
		this.padRelationCode = padRelationCode;
	}

	public String getPadPolOwnerYn() {
		return padPolOwnerYn;
	}

	public void setPadPolOwnerYn(String padPolOwnerYn) {
		this.padPolOwnerYn = padPolOwnerYn;
	}

	public String getPadAlchohalicYn() {
		return padAlchohalicYn;
	}

	public void setPadAlchohalicYn(String padAlchohalicYn) {
		this.padAlchohalicYn = padAlchohalicYn;
	}

	public BigDecimal getPadAlcoholQuan() {
		return padAlcoholQuan;
	}

	public void setPadAlcoholQuan(BigDecimal padAlcoholQuan) {
		this.padAlcoholQuan = padAlcoholQuan;
	}

	public String getPadAgeAdmitted() {
		return padAgeAdmitted;
	}

	public void setPadAgeAdmitted(String padAgeAdmitted) {
		this.padAgeAdmitted = padAgeAdmitted;
	}

	public Double getPadBpl() {
		return padBpl;
	}

	public void setPadBpl(Double padBpl) {
		this.padBpl = padBpl;
	}

	public Double getPadBph() {
		return padBph;
	}

	public void setPadBph(Double padBph) {
		this.padBph = padBph;
	}

	public String getPadHivTestYn() {
		return padHivTestYn;
	}

	public void setPadHivTestYn(String padHivTestYn) {
		this.padHivTestYn = padHivTestYn;
	}

	public String getPadPregnentYn() {
		return padPregnentYn;
	}

	public void setPadPregnentYn(String padPregnentYn) {
		this.padPregnentYn = padPregnentYn;
	}

	public String getPadFamilyYn() {
		return padFamilyYn;
	}

	public void setPadFamilyYn(String padFamilyYn) {
		this.padFamilyYn = padFamilyYn;
	}

	public String getPadOccYn() {
		return padOccYn;
	}

	public void setPadOccYn(String padOccYn) {
		this.padOccYn = padOccYn;
	}

}
