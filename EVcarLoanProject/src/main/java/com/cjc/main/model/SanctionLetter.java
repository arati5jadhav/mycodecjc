package com.cjc.main.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class SanctionLetter {
	@Id
	//@GeneratedValue(strategy = GenerationType.AUTO)
	private int sanctionId;
	private int cId;
	private double tenure;
	private double rateofInt;
	private double customerTotalLoanRequired;
	private String bankName;
	private int accountNumber;
	private double sanctionAmount;
	

	public int getcId() {
		return cId;
	}
	public void setcId(int cId) {
		this.cId = cId;
	}
	public int getSanctionId() {
		return sanctionId;
	}
	public void setSanctionId(int sanctionId) {
		this.sanctionId = sanctionId;
	}
	public double getTenure() {
		return tenure;
	}
	public void setTenure(double tenure) {
		this.tenure = tenure;
	}
	public double getRateofInt() {
		return rateofInt;
	}
	public void setRateofInt(double rateofInt) {
		this.rateofInt = rateofInt;
	}
	public double getCustomerTotalLoanRequired() {
		return customerTotalLoanRequired;
	}
	public void setCustomerTotalLoanRequired(double customerTotalLoanRequired) {
		this.customerTotalLoanRequired = customerTotalLoanRequired;
	}
	public String getBankName() {
		return bankName;
	}
	public void setBankName(String bankName) {
		this.bankName = bankName;
	}
	public int getAccountNumber() {
		return accountNumber;
	}
	public void setAccountNumber(int accountNumber) {
		this.accountNumber = accountNumber;
	}
	public double getSanctionAmount() {
		return sanctionAmount;
	}
	public void setSanctionAmount(double sanctionAmount) {
		this.sanctionAmount = sanctionAmount;
	}
	@Override
	public String toString() {
		return "SanctionLetter [sanctionId=" + sanctionId + ", cId=" + cId + ", tenure=" + tenure + ", rateofInt="
				+ rateofInt + ", customerTotalLoanRequired=" + customerTotalLoanRequired + ", bankName=" + bankName
				+ ", accountNumber=" + accountNumber + ", sanctionAmount=" + sanctionAmount + "]";
	}

}
