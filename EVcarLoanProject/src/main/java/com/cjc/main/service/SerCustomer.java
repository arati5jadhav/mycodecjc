package com.cjc.main.service;

import java.util.Optional;

import com.cjc.main.model.Customer;

public interface SerCustomer {

	//public	Customer saveData(Customer cust);

	public Optional<Customer> getdatabyId(int custid);

	public void editcustomer(Customer cust);

	public void delcust(int cId);

	// Customer saveuploadDoc(Customer all);



	//public void saveallcust(Customer cust);

	public void saveData(Customer cust);

	public Iterable<Customer> getcustomerData();

	public Iterable<Customer> getVerifiedCustomer();








}
