package com.cjc.main.serviceImpl;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import com.cjc.main.model.Customer;
import com.cjc.main.repository.RepoCustomer;
import com.cjc.main.service.SerCustomer;

@Service
public class ImplCustomer implements SerCustomer{

	@Autowired
	RepoCustomer rc;

//	@Override
//	public void saveData(Customer cust) {
//		rc.save(cust);
//		
//	}

	@Override
	public Optional<Customer> getdatabyId(int custid) {
		
		return rc.findById(custid);
	}

	@Override
	public void editcustomer(Customer cust) {
		
		rc.save(cust);
	}

	@Override
	public void delcust(int cId) {
		rc.deleteById(cId);
	}

	

	

	@Override
	public void saveData(Customer cust) {
		rc.save(cust);
		
	}

	@Override
	public Iterable<Customer> getcustomerData() {
		
		return rc.findAll();
	}

	@Override
	public Iterable<Customer> getVerifiedCustomer() {
		
		return rc.findAll();
	}


}
