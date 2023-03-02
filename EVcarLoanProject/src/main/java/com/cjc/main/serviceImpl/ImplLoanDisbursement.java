package com.cjc.main.serviceImpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cjc.main.model.Customer;
import com.cjc.main.model.LoanDisbursement;
import com.cjc.main.repository.RepoLoanDisbursement;
import com.cjc.main.service.SerLoanDisbursement;

@Service
public class ImplLoanDisbursement implements SerLoanDisbursement{

	@Autowired
	RepoLoanDisbursement ldr;
	@Override
	public LoanDisbursement saveData(LoanDisbursement agreement) 
	{
		ldr.save(agreement);
		return agreement;
	}

	@Override
	public Iterable<LoanDisbursement> getAllLoanDisbursement()
	{
		return ldr.findAll();
	}

	@Override
	public Customer getSingleData(int custId) {
		
	Customer c= ldr.findById(custId);
		 return c;
	}
}
