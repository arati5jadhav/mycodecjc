package com.cjc.main.model;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;

@Entity
public class Customer {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int cId;
	private String cname;
	public String status;
	private String email;
	
	@OneToOne(cascade = CascadeType.ALL)
	private CurrentLoanDetails currentloandetails;
	@OneToOne(cascade = CascadeType.ALL)
	private CustomerVerification customerverification;
	@OneToOne(cascade = CascadeType.ALL)
	private Profession profession;
    @OneToOne(cascade = CascadeType.ALL)
	private AccountDetails accountdetails;
	@OneToOne(cascade = CascadeType.ALL)
    private GuarantorDetail guarantorDetail;
	@OneToOne(cascade=CascadeType.ALL)
	private SanctionLetter sanctionletter;
//	@OneToOne(cascade = CascadeType.ALL)
//	private AllPersonalDoc alldocs; 
    
	
	
//	public AllPersonalDoc getAlldocs() {
//		return alldocs;
//	}
//	public void setAlldocs(AllPersonalDoc alldocs) {
//		this.alldocs = alldocs;
	
	
//	}
	
	
	public String getStatus() {
		return status;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public SanctionLetter getSanctionletter() {
		return sanctionletter;
	}
	public void setSanctionletter(SanctionLetter sanctionletter) {
		this.sanctionletter = sanctionletter;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	public int getcId() {
		return cId;
	}
	public void setcId(int cId) {
		this.cId = cId;
	}
	
	public String getCname() {
		return cname;
	}
	public void setCname(String cname) {
		this.cname = cname;
	}
	
	public CurrentLoanDetails getCurrentloandetails() {
		return currentloandetails;
	}
	public void setCurrentloandetails(CurrentLoanDetails currentloandetails) {
		this.currentloandetails = currentloandetails;
	}
	public CustomerVerification getCustomerverification() {
		return customerverification;
	}
	public void setCustomerverification(CustomerVerification customerverification) {
		this.customerverification = customerverification;
	}

	public Profession getProfession() {
		return profession;
	}
	public void setProfession(Profession profession) {
		this.profession = profession;
	}
	public AccountDetails getAccountdetails() {
		return accountdetails;
	}
	public void setAccountdetails(AccountDetails accountdetails) {
		this.accountdetails = accountdetails;
	}
	public GuarantorDetail getGuarantorDetail() {
		return guarantorDetail;
	}
	public void setGuarantorDetail(GuarantorDetail guarantorDetail) {
		this.guarantorDetail = guarantorDetail;
	}
	@Override
	public String toString() {
		return "Customer [cId=" + cId + ", cname=" + cname + ", currentloandetails=" + currentloandetails
				+ ", customerverification=" + customerverification + ", profession=" + profession + ", accountdetails="
				+ accountdetails + ", guarantorDetail=" + guarantorDetail + "]";
	}
	

}
