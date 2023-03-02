package com.cjc.main.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class CustomerVerification {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int verificationID;
	private String verificationDate;
	private String status;
	private String remark;
	public int getVerificationID() {
		return verificationID;
	}
	public void setVerificationID(int verificationID) {
		this.verificationID = verificationID;
	}
	public String getVerificationDate() {
		return verificationDate;
	}
	public void setVerificationDate(String verificationDate) {
		this.verificationDate = verificationDate;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	public String getRemark() {
		return remark;
	}
	public void setRemark(String remark) {
		this.remark = remark;
	}
	
	@Override
	public String toString() {
		return "CustomerVerification [verificationID=" + verificationID + ", verificationDate=" + verificationDate
				+ ", status=" + status + ", remark=" + remark + "]";
	}
	
	
}
