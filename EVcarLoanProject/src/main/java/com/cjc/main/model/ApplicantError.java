package com.cjc.main.model;

public class ApplicantError {

	private int errorcode;
	private String applicantmessage;
	public ApplicantError(int errorcode, String applicantmessage) {
		super();
		this.errorcode = errorcode;
		this.applicantmessage = applicantmessage;
	}
	public int getErrorcode() {
		return errorcode;
	}
	public void setErrorcode(int errorcode) {
		this.errorcode = errorcode;
	}
	public String getApplicantmessage() {
		return applicantmessage;
	}
	public void setApplicantmessage(String applicantmessage) {
		this.applicantmessage = applicantmessage;
	}
}
