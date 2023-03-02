package com.cjc.main.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;


@Entity
public class Cibil {
       @Id
       @GeneratedValue(strategy = GenerationType.AUTO)
	private int cibilId;
	private int cibilScore;
	private String cibilStatus;
	private String cibilRemark;

	
	public int getCibilId() {
		return cibilId;
	}
	public void setCibilId(int cibilId) {
		this.cibilId = cibilId;
	}
	
	public int getCibilScore() {
		return cibilScore;
	}
	public void setCibilScore(int cibilScore) {
		this.cibilScore = cibilScore;
	}
	public String getCibilStatus() {
		return cibilStatus;
	}
	public void setCibilStatus(String cibilStatus) {
		this.cibilStatus = cibilStatus;
	}
	public String getCibilRemark() {
		return cibilRemark;
	}
	public void setCibilRemark(String cibilRemark) {
		this.cibilRemark = cibilRemark;
	}
	
}
