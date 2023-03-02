package com.cjc.main.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Ledger {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int ledgerId;
	private String ledgerCreatedDate;
	private double totalLoanAmount;
	private double payableAmountwithInterest;
	private int tenure;
	private Double monthlyEmi;
	private Double amountPaidTillDate;
	private Double reamainingAmount;
	private String nextEmiStartDate;
	private String nextEmiEnddate;
	private int defaulterCount;
	private String previousEmiStatus;
	private String currentMonthEmiStatus;
	private String loanEndDate;
	private String loanStatus;
	
	
	public Double getReamainingAmount() {
		return reamainingAmount;
	}
	public void setReamainingAmount(Double reamainingAmount) {
		this.reamainingAmount = reamainingAmount;
	}
	public Double getMonthlyEmi() {
		return monthlyEmi;
	}
	public void setMonthlyEmi(Double monthlyEmi) {
		this.monthlyEmi = monthlyEmi;
	}
	public Double getAmountPaidTillDate() {
		return amountPaidTillDate;
	}
	public void setAmountPaidTillDate(Double amountPaidTillDate) {
		this.amountPaidTillDate = amountPaidTillDate;
	}
	
	public String getNextEmiStartDate() {
		return nextEmiStartDate;
	}
	public void setNextEmiStartDate(String nextEmiStartDate) {
		this.nextEmiStartDate = nextEmiStartDate;
	}
	public String getNextEmiEnddate() {
		return nextEmiEnddate;
	}
	public void setNextEmiEnddate(String nextEmiEnddate) {
		this.nextEmiEnddate = nextEmiEnddate;
	}
	public int getLedgerId() {
		return ledgerId;
	}
	public void setLedgerId(int ledgerId) {
		this.ledgerId = ledgerId;
	}
	public String getLedgerCreatedDate() {
		return ledgerCreatedDate;
	}
	public void setLedgerCreatedDate(String ledgerCreatedDate) {
		this.ledgerCreatedDate = ledgerCreatedDate;
	}
	public double getTotalLoanAmount() {
		return totalLoanAmount;
	}
	public void setTotalLoanAmount(double totalLoanAmount) {
		this.totalLoanAmount = totalLoanAmount;
	}
	public double getPayableAmountwithInterest() {
		return payableAmountwithInterest;
	}
	public void setPayableAmountwithInterest(double payableAmountwithInterest) {
		this.payableAmountwithInterest = payableAmountwithInterest;
	}
	public int getTenure() {
		return tenure;
	}
	public void setTenure(int tenure) {
		this.tenure = tenure;
	}
	
	
	public int getDefaulterCount() {
		return defaulterCount;
	}
	public void setDefaulterCount(int defaulterCount) {
		this.defaulterCount = defaulterCount;
	}
	public String getPreviousEmiStatus() {
		return previousEmiStatus;
	}
	public void setPreviousEmiStatus(String previousEmiStatus) {
		this.previousEmiStatus = previousEmiStatus;
	}
	public String getCurrentMonthEmiStatus() {
		return currentMonthEmiStatus;
	}
	public void setCurrentMonthEmiStatus(String currentMonthEmiStatus) {
		this.currentMonthEmiStatus = currentMonthEmiStatus;
	}
	public String getLoanEndDate() {
		return loanEndDate;
	}
	public void setLoanEndDate(String loanEndDate) {
		this.loanEndDate = loanEndDate;
	}
	public String getLoanStatus() {
		return loanStatus;
	}
	public void setLoanStatus(String loanStatus) {
		this.loanStatus = loanStatus;
	}
	
}
