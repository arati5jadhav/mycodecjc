package com.cjc.main.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Profession {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int profeesionID;
	private String professionType;
	private long professionSalary;
	private String professionDesignation;
	public int getProfeesionID() {
		return profeesionID;
	}
	public void setProfeesionID(int profeesionID) {
		this.profeesionID = profeesionID;
	}
	public String getProfessionType() {
		return professionType;
	}
	public void setProfessionType(String professionType) {
		this.professionType = professionType;
	}
	public long getProfessionSalary() {
		return professionSalary;
	}
	public void setProfessionSalary(long professionSalary) {
		this.professionSalary = professionSalary;
	}
	public String getProfessionDesignation() {
		return professionDesignation;
	}
	public void setProfessionDesignation(String professionDesignation) {
		this.professionDesignation = professionDesignation;
	}
}
