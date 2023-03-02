package com.cjc.main.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.cjc.main.model.LoanDisbursement;
import com.cjc.main.service.SerLoanDisbursement;

@RestController
public class LoanDisbursementController {

	@Autowired
	SerLoanDisbursement lds;
	
	@Autowired
	public JavaMailSender javamailsender;
	
	
	@RequestMapping(value="/saveLoanData" ,method = RequestMethod.POST)
	public LoanDisbursement saveData(@RequestBody LoanDisbursement agreement) 
	{
		
		System.out.println(agreement.getAgreementId());
		LoanDisbursement ld=lds.saveData(agreement);
		return ld;
	}

	@RequestMapping(value = "/getAllLoanDisbursement" ,method = RequestMethod.GET)
	public Iterable<LoanDisbursement> getAllLoanDisbursement()
	{
		Iterable< LoanDisbursement> list=lds.getAllLoanDisbursement();
		System.out.println(list);
		return list;
	}
}
