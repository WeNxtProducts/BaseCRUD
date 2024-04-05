package com.wenxt.crud.model;

import java.time.LocalDateTime;

import io.micrometer.common.lang.Nullable;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "lm_cust_class")
public class LM_CUST_CLASS {
	
	@Id
	private String cclasType;
    private String cclasCode;
    private String cclasClassDesc;
    private String cclasShortClassDesc;
    private String cclasBlClassDesc;
    private String cclasBlShortClassDesc;
    private String cclasFrzFlag;
    private LocalDateTime cclasInsDt;
    private String cclasInsId;
    private LocalDateTime cclasModDt;
    private String cclasModId;
    @Nullable
    private String cclasCtlAcntCode;
    @Nullable
    private String cclasNgsCode;
    @Nullable
    private String cclasValIcYn;
    @Nullable
    private String cclasBrokAgentYn;
    @Nullable
    private String cclasCbcYn;
    @Nullable
    private String cclasDobYn;
    @Nullable
    private short cclasMaxCommPerc;

    
    public LM_CUST_CLASS() {
    }
    // Constructor
    public LM_CUST_CLASS(String cclasType, String cclasCode) {
        this.cclasType = cclasType;
        this.cclasCode = cclasCode;
    }

	public String getCclasType() {
		return cclasType;
	}

	public void setCclasType(String cclasType) {
		this.cclasType = cclasType;
	}

	public String getCclasCode() {
		return cclasCode;
	}

	public void setCclasCode(String cclasCode) {
		this.cclasCode = cclasCode;
	}

	public String getCclasClassDesc() {
		return cclasClassDesc;
	}

	public void setCclasClassDesc(String cclasClassDesc) {
		this.cclasClassDesc = cclasClassDesc;
	}

	public String getCclasShortClassDesc() {
		return cclasShortClassDesc;
	}

	public void setCclasShortClassDesc(String cclasShortClassDesc) {
		this.cclasShortClassDesc = cclasShortClassDesc;
	}

	public String getCclasBlClassDesc() {
		return cclasBlClassDesc;
	}

	public void setCclasBlClassDesc(String cclasBlClassDesc) {
		this.cclasBlClassDesc = cclasBlClassDesc;
	}

	public String getCclasBlShortClassDesc() {
		return cclasBlShortClassDesc;
	}

	public void setCclasBlShortClassDesc(String cclasBlShortClassDesc) {
		this.cclasBlShortClassDesc = cclasBlShortClassDesc;
	}

	public String getCclasFrzFlag() {
		return cclasFrzFlag;
	}

	public void setCclasFrzFlag(String cclasFrzFlag) {
		this.cclasFrzFlag = cclasFrzFlag;
	}

	

	public LocalDateTime getCclasInsDt() {
		return cclasInsDt;
	}
	public String getCclasInsId() {
		return cclasInsId;
	}

	public void setCclasInsId(String cclasInsId) {
		this.cclasInsId = cclasInsId;
	}

	
	public LocalDateTime getCclasModDt() {
		return cclasModDt;
	}
	public void setCclasModDt(LocalDateTime cclasModDt) {
		this.cclasModDt = cclasModDt;
	}
	public void setCclasInsDt(LocalDateTime cclasInsDt) {
		this.cclasInsDt = cclasInsDt;
	}
	public String getCclasModId() {
		return cclasModId;
	}

	public void setCclasModId(String cclasModId) {
		this.cclasModId = cclasModId;
	}

	public String getCclasCtlAcntCode() {
		return cclasCtlAcntCode;
	}

	public void setCclasCtlAcntCode(String cclasCtlAcntCode) {
		this.cclasCtlAcntCode = cclasCtlAcntCode;
	}

	public String getCclasNgsCode() {
		return cclasNgsCode;
	}

	public void setCclasNgsCode(String cclasNgsCode) {
		this.cclasNgsCode = cclasNgsCode;
	}

	public String getCclasValIcYn() {
		return cclasValIcYn;
	}

	public void setCclasValIcYn(String cclasValIcYn) {
		this.cclasValIcYn = cclasValIcYn;
	}

	public String getCclasBrokAgentYn() {
		return cclasBrokAgentYn;
	}

	public void setCclasBrokAgentYn(String cclasBrokAgentYn) {
		this.cclasBrokAgentYn = cclasBrokAgentYn;
	}

	public String getCclasCbcYn() {
		return cclasCbcYn;
	}

	public void setCclasCbcYn(String cclasCbcYn) {
		this.cclasCbcYn = cclasCbcYn;
	}

	public String getCclasDobYn() {
		return cclasDobYn;
	}

	public void setCclasDobYn(String cclasDobYn) {
		this.cclasDobYn = cclasDobYn;
	}

	public short getCclasMaxCommPerc() {
		return cclasMaxCommPerc;
	}

	public void setCclasMaxCommPerc(short cclasMaxCommPerc) {
		this.cclasMaxCommPerc = cclasMaxCommPerc;
	}
    
    
    
}