package com.cjc.main.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.cjc.main.exception.ApplicantServiceException;
import com.cjc.main.model.Applicant;
import com.cjc.main.service.SerApplicant;

@CrossOrigin("*")
@RestController
@RequestMapping(value = "/enquiry")
public class ApplicantController {

	@Autowired
	SerApplicant as;
	
	@Autowired
	JavaMailSender  javamailsender;
	
	@RequestMapping(value="/saveapplidata",method = RequestMethod.POST)
	public Applicant savedata(@RequestBody Applicant a)
	{
		System.out.println("save");
		return as.savedata(a);
	}
	@RequestMapping(value="/getapplidata",method = RequestMethod.GET)
	public Iterable<Applicant> getdata()
	{
		return as.getdata();
	}
	
	@RequestMapping(value="/updateapplidata",method = RequestMethod.PUT)
	public void updatedata(@RequestBody Applicant a)
	{
		 as.updatedata(a);
	}
	@RequestMapping(value="/deleteapplidata/{id}",method = RequestMethod.DELETE)
	public Iterable<Applicant>  deletedata(@PathVariable ("id") int id)
	{
		return as.deletedata(id);
	}
	
	@GetMapping(value ="/getbystatusaplicant/{status}")
	public List<Applicant> getApplicantListByStatuss(@PathVariable("status") String status)
	{
		return as.getByStatus(status);
	}
	
	
	@PostMapping("/mailsendDisbursment/{id}")
	public Applicant sendDisbursmentMail(@PathVariable int id) 
   {
	   
   
	    Applicant u = as.getSingleData(id);		
				
				SimpleMailMessage m=new SimpleMailMessage();
				m.setTo(u.getEmailid());
				m.setSubject("Loan Disbursment Mail");
				m.setText(u.getName()+" congratulation your loan request is accepted, following are the details of your disbursement kindly check your account for the same."
						+"\n"+"AgreementId: "+u.getLoanDisbursementDetails().getAgreementId()+"\n"
						+"LoanNo: "+u.getLoanDisbursementDetails().getLoanNo()+"\n"
						+"AgreementDate: "+u.getLoanDisbursementDetails().getAgreementDate()+"\n"
						+"AmountPayType: "+u.getLoanDisbursementDetails().getAmountPayType()+"\n"
						+"TotalAmount: "+u.getLoanDisbursementDetails().getTotalAmount()+"\n"
						+"BankName: "+u.getLoanDisbursementDetails().getBankName()+"\n"
						+"AccountNumber: "+u.getLoanDisbursementDetails().getAccountNo()+"\n"
						+"IFSCCode: "+u.getLoanDisbursementDetails().getIfscCode()+"\n"
						+"AccountType: "+u.getLoanDisbursementDetails().getAccountType()+"\n"
						+"TransferAmount: "+u.getLoanDisbursementDetails().getTransferAmount()+"\n"
						+"PaymentStatus: "+u.getLoanDisbursementDetails().getPaymentStatus()+"\n"
						+"AmountPaidDate: "+u.getLoanDisbursementDetails().getAmountPaidDate()+"\n"
						
						
						);			
				javamailsender.send(m);	
			
		
				
					
		return u;
	}    
	
	
	@GetMapping("/getapplicant/{id}")
	public String getDataById(@PathVariable int id) throws ApplicantServiceException {
		Applicant applicant=as.getApplicantdatabyId(id);
		System.out.println("2.5");
		return applicant.getId() +"id name is "+applicant.getName();
		
	}
}
