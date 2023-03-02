package com.cjc.main.model;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;

@Entity
public class Applicant {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int id;
	private String name;
	private int age;
	private String emailid;
	private double sanctionamount;
	private String status;
	private String action;
	@OneToOne(cascade = CascadeType.ALL)
	private LoanDisbursement loanDisbursementDetails;
	@OneToOne(cascade = CascadeType.ALL)
	private Ledger ledger;
	
	
	public Ledger getLedger() {
		return ledger;
	}
	public void setLedger(Ledger ledger) {
		this.ledger = ledger;
	}
	public LoanDisbursement getLoanDisbursementDetails() {
		return loanDisbursementDetails;
	}
	public void setLoanDisbursementDetails(LoanDisbursement loanDisbursementDetails) {
		this.loanDisbursementDetails = loanDisbursementDetails;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getEmailid() {
		return emailid;
	}
	public void setEmailid(String emailid) {
		this.emailid = emailid;
	}
	public double getSanctionamount() {
		return sanctionamount;
	}
	public void setSanctionamount(double sanctionamount) {
		this.sanctionamount = sanctionamount;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	public String getAction() {
		return action;
	}
	public void setAction(String action) {
		this.action = action;
	}
}
