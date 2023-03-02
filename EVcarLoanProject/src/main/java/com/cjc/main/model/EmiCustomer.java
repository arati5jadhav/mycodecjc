package com.cjc.main.model;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;

@Entity
public class EmiCustomer {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int custid;
	private String name;
	private int sanctionAmount;
    private int	rateofInt ;
    private int tenure;
    @OneToOne(cascade = CascadeType.ALL)
    private EmiDetails emiDetails;
	public int getCusid() {
		return custid;
	}
	public void setCusid(int cusid) {
		this.custid = cusid;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getSanctionAmount() {
		return sanctionAmount;
	}
	public void setSanctionAmount(int sanctionAmount) {
		this.sanctionAmount = sanctionAmount;
	}
	public int getRateofInt() {
		return rateofInt;
	}
	public void setRateofInt(int rateofInt) {
		this.rateofInt = rateofInt;
	}
	public int getTenure() {
		return tenure;
	}
	public void setTenure(int tenure) {
		this.tenure = tenure;
	}
	public EmiDetails getEmiDetails() {
		return emiDetails;
	}
	public void setEmiDetails(EmiDetails emiDetails) {
		this.emiDetails = emiDetails;
	}
    
}
