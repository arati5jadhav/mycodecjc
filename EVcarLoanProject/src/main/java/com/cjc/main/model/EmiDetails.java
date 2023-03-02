package com.cjc.main.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class EmiDetails {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int emiId;
	private String emailid;
	private String emiAmountMonthly;
	private String nextemiduedate;
	private String previousemistatus;
	
	public int getEmiId() {
		return emiId;
	}
	public void setEmiId(int emiId) {
		this.emiId = emiId;
	}
	public String getEmailid() {
		return emailid;
	}
	public void setEmailid(String emailid) {
		this.emailid = emailid;
	}
	public String getEmiAmountMonthly() {
		return emiAmountMonthly;
	}
	public void setEmiAmountMonthly(String emiAmountMonthly) {
		this.emiAmountMonthly = emiAmountMonthly;
	}
	public String getNextemiduedate() {
		return nextemiduedate;
	}
	public void setNextemiduedate(String nextemiduedate) {
		this.nextemiduedate = nextemiduedate;
	}
	public String getPreviousemistatus() {
		return previousemistatus;
	}
	public void setPreviousemistatus(String previousemistatus) {
		this.previousemistatus = previousemistatus;
	}
}
