package com.cjc.main.model;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;

@Entity
public class CurrentLoanDetails {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int loanId; 
	private double loanAmount; 
	private double loanRoi;
	private int loanTenure; 
	private double loanAmounttobePaid; 
	private double sanctionAmount; 
	@OneToOne(cascade = CascadeType.ALL)
	private EmiDetails emidetails;
	@OneToOne(cascade = CascadeType.ALL)
	private PreviousLoanDetails previousloandetails;

	public int getLoanId() {
		return loanId;
	}

	public void setLoanId(int loanId) {
		this.loanId = loanId;
	}

	public double getLoanAmount() {
		return loanAmount;
	}

	public void setLoanAmount(double loanAmount) {
		this.loanAmount = loanAmount;
	}

	public double getLoanRoi() {
		return loanRoi;
	}

	public void setLoanRoi(double loanRoi) {
		this.loanRoi = loanRoi;
	}

	public int getLoanTenure() {
		return loanTenure;
	}

	public void setLoanTenure(int loanTenure) {
		this.loanTenure = loanTenure;
	}

	public double getLoanAmounttobePaid() {
		return loanAmounttobePaid;
	}

	public void setLoanAmounttobePaid(double loanAmounttobePaid) {
		this.loanAmounttobePaid = loanAmounttobePaid;
	}

	public double getSanctionAmount() {
		return sanctionAmount;
	}

	public void setSanctionAmount(double sanctionAmount) {
		this.sanctionAmount = sanctionAmount;
	}

	public EmiDetails getEmidetails() {
		return emidetails;
	}

	public void setEmidetails(EmiDetails emidetails) {
		this.emidetails = emidetails;
	}

	public PreviousLoanDetails getPreviousloandetails() {
		return previousloandetails;
	}

	public void setPreviousloandetails(PreviousLoanDetails previousloandetails) {
		this.previousloandetails = previousloandetails;
	}

}
