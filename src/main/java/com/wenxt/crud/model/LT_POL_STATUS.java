package com.wenxt.crud.model;

import java.util.Date;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="LT_POL_STATUS")
public class LT_POL_STATUS {
		
	
		@Id
		private int psTranId;
	 	private Long psPolTranId;
	    private Short psEndNoIdx;
	    private Date psStatusDt;
	    private String psStatus;
	    private String psReasonCode;
	    private String psRemarks;
	    private String psStatusUid;
	    private String psInsId;
	    private Date psInsDt;
	    private String psStatusType;
	    private Short psReminderNo;
	    private String psRiCode;

	    
	    
		public int getPsTranId() {
			return psTranId;
		}

		public void setPsTranId(int psTranId) {
			this.psTranId = psTranId;
		}

		public Long getPsPolTranId() {
			return psPolTranId;
		}

		public void setPsPolTranId(Long psPolTranId) {
			this.psPolTranId = psPolTranId;
		}

		public Short getPsEndNoIdx() {
			return psEndNoIdx;
		}

		public void setPsEndNoIdx(Short psEndNoIdx) {
			this.psEndNoIdx = psEndNoIdx;
		}

		public Date getPsStatusDt() {
			return psStatusDt;
		}

		public void setPsStatusDt(Date psStatusDt) {
			this.psStatusDt = psStatusDt;
		}

		public String getPsStatus() {
			return psStatus;
		}

		public void setPsStatus(String psStatus) {
			this.psStatus = psStatus;
		}

		public String getPsReasonCode() {
			return psReasonCode;
		}

		public void setPsReasonCode(String psReasonCode) {
			this.psReasonCode = psReasonCode;
		}

		public String getPsRemarks() {
			return psRemarks;
		}

		public void setPsRemarks(String psRemarks) {
			this.psRemarks = psRemarks;
		}

		public String getPsStatusUid() {
			return psStatusUid;
		}

		public void setPsStatusUid(String psStatusUid) {
			this.psStatusUid = psStatusUid;
		}

		public String getPsInsId() {
			return psInsId;
		}

		public void setPsInsId(String psInsId) {
			this.psInsId = psInsId;
		}

		public Date getPsInsDt() {
			return psInsDt;
		}

		public void setPsInsDt(Date psInsDt) {
			this.psInsDt = psInsDt;
		}

		public String getPsStatusType() {
			return psStatusType;
		}

		public void setPsStatusType(String psStatusType) {
			this.psStatusType = psStatusType;
		}

		public Short getPsReminderNo() {
			return psReminderNo;
		}

		public void setPsReminderNo(Short psReminderNo) {
			this.psReminderNo = psReminderNo;
		}

		public String getPsRiCode() {
			return psRiCode;
		}

		public void setPsRiCode(String psRiCode) {
			this.psRiCode = psRiCode;
		}
	    
	    


}
