package com.cjc.main.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class AccountDetails {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int accountid;
	private String accounttype;
	private double accountbalance;
	private String accountholdername;
	private String accountstatus;
	private long accountnumber;
	public int getAccountid() {
		return accountid;
	}
	public void setAccountid(int accountid) {
		this.accountid = accountid;
	}
	public String getAccounttype() {
		return accounttype;
	}
	public void setAccounttype(String accounttype) {
		this.accounttype = accounttype;
	}
	public double getAccountbalance() {
		return accountbalance;
	}
	public void setAccountbalance(double accountbalance) {
		this.accountbalance = accountbalance;
	}
	public String getAccountholdername() {
		return accountholdername;
	}
	public void setAccountholdername(String accountholdername) {
		this.accountholdername = accountholdername;
	}
	public String getAccountstatus() {
		return accountstatus;
	}
	public void setAccountstatus(String accountstatus) {
		this.accountstatus = accountstatus;
	}
	public long getAccountnumber() {
		return accountnumber;
	}
	public void setAccountnumber(long accountnumber) {
		this.accountnumber = accountnumber;
	}
	@Override
	public String toString() {
		return "AccountDetails [accountid=" + accountid + ", accounttype=" + accounttype + ", accountbalance="
				+ accountbalance + ", accountholdername=" + accountholdername + ", accountstatus=" + accountstatus
				+ ", accountnumber=" + accountnumber + "]";
	}
	
}
