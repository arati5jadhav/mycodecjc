package com.cjc.main.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class GuarantorDetail {


	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int guarantorId;
	private String guarantorname;
	private String guarantorDOB;
	private String guarantornumber;
	private String guarantorjob;
	private String guarantoraddress;
	
	public int getGuarantorId() {
		return guarantorId;
	}
	public void setGuarantorId(int guarantorId) {
		this.guarantorId = guarantorId;
	}
	public String getGuarantorname() {
		return guarantorname;
	}
	public void setGuarantorname(String guarantorname) {
		this.guarantorname = guarantorname;
	}
	public String getGuarantorDOB() {
		return guarantorDOB;
	}
	public void setGuarantorDOB(String guarantorDOB) {
		this.guarantorDOB = guarantorDOB;
	}
	public String getGuarantornumber() {
		return guarantornumber;
	}
	public void setGuarantornumber(String guarantornumber) {
		this.guarantornumber = guarantornumber;
	}
	public String getGuarantorjob() {
		return guarantorjob;
	}
	public void setGuarantorjob(String guarantorjob) {
		this.guarantorjob = guarantorjob;
	}
	public String getGuarantoraddress() {
		return guarantoraddress;
	}
	public void setGuarantoraddress(String guarantoraddress) {
		this.guarantoraddress = guarantoraddress;
	}
	
}
