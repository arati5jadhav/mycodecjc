package com.cjc.main.model;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;



@Entity

public class PreviousLoanDetails {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int preloanId; 
	private double preloanAmount; 
	private int preloanTenure; 
	private double preloanEmi; 
	private double preloanPaidAmount;
	private double preloanRemainingAmount;
	private String preLoanType;
	private String preLoanStauts;
//	@OneToOne(cascade = CascadeType.ALL)
//	private PreviousLoanBank previousloanbank;

	public int getPreloanId() {
		return preloanId;
	}

	public void setPreloanId(int preloanId) {
		this.preloanId = preloanId;
	}

	public double getPreloanAmount() {
		return preloanAmount;
	}

	public void setPreloanAmount(double preloanAmount) {
		this.preloanAmount = preloanAmount;
	}

	public int getPreloanTenure() {
		return preloanTenure;
	}

	public void setPreloanTenure(int preloanTenure) {
		this.preloanTenure = preloanTenure;
	}

	public double getPreloanEmi() {
		return preloanEmi;
	}

	public void setPreloanEmi(double preloanEmi) {
		this.preloanEmi = preloanEmi;
	}

	public double getPreloanPaidAmount() {
		return preloanPaidAmount;
	}

	public void setPreloanPaidAmount(double preloanPaidAmount) {
		this.preloanPaidAmount = preloanPaidAmount;
	}

	public double getPreloanRemainingAmount() {
		return preloanRemainingAmount;
	}

	public void setPreloanRemainingAmount(double preloanRemainingAmount) {
		this.preloanRemainingAmount = preloanRemainingAmount;
	}

	public String getPreLoanType() {
		return preLoanType;
	}

	public void setPreLoanType(String preLoanType) {
		this.preLoanType = preLoanType;
	}

	public String getPreLoanStauts() {
		return preLoanStauts;
	}

	public void setPreLoanStauts(String preLoanStauts) {
		this.preLoanStauts = preLoanStauts;
	}

//	public PreviousLoanBank getPreviousloanbank() {
//		return previousloanbank;
//	}
//
//	public void setPreviousloanbank(PreviousLoanBank previousloanbank) {
//		this.previousloanbank = previousloanbank;
//	}


}
