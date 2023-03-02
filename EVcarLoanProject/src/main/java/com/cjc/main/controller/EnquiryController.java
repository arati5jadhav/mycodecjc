package com.cjc.main.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;

import org.springframework.web.bind.annotation.RestController;

import com.cjc.main.model.Cibil;
import com.cjc.main.model.EnquiryDetails;
import com.cjc.main.service.SerEnquiryDetails;

@CrossOrigin("*")
@RestController
public class EnquiryController {

	@Autowired
	SerEnquiryDetails serviceenq;
	
	@Autowired
	public JavaMailSender jms;
	
	
	@PostMapping("/saveenq")
	public String saveenqlist(@RequestBody EnquiryDetails ed)
	{
		
	System.out.println("Enquiry details saved" + ed);
	if( ed.getCibil() == null ) {
		Cibil cbil = new Cibil();
		cbil.setCibilStatus("Pending");
		ed.setCibil(cbil);
	}
	serviceenq.saveEnqlist(ed);
	
	return "Success";
		
	}
	
	@GetMapping("/getenqlist")
	public Iterable<EnquiryDetails> getlist()
	{
		return serviceenq.getAllList();
	}
	
	@GetMapping("/getcibil/{eId}")
		public String getlist( @PathVariable ("eId") int enqid )
		{
			int min = 600;
			int max = 800;
			
			int a = (int) (Math.random() * (max - min + 1) + min);

			System.out.println("cibil generted :" + a);
			Optional<EnquiryDetails> edd = serviceenq.getById(enqid);
			EnquiryDetails ed = edd.get();
			
			ed.getCibil().setCibilScore(a);
	    	
	    	if(ed.getCibil().getCibilScore()>650)
	    	{
	    		ed.getCibil().setCibilStatus("Approved");
	    		EnquiryDetails ee=serviceenq.savedataenq(ed);
	    		
	    		
				/*
				 * SimpleMailMessage m=new SimpleMailMessage(); m.setTo(ed.getEmail());
				 * m.setSubject("CIBIL check");
				 * m.setText("Your Application form has been approved for loan");
				 * 
				 * jms.send(m);
				 */
	    	}
	    	else 
	    		{
	    		ed.getCibil().setCibilStatus("Rejected");
	    		EnquiryDetails ee1=serviceenq.savedataenquiry(ed);

				/*
				 * SimpleMailMessage m=new SimpleMailMessage(); m.setTo(ee1.getEmail());
				 * m.setSubject("CIBIL check");
				 * m.setText("Your Application form has NOT been approved for loan");
				 * jms.send(m);
				 */
	    		}

			
			return null;
		}
	
	
    @GetMapping("/getbyId/{eId}")
	public Optional<EnquiryDetails> getbyid(@PathVariable ("eId") int enqid)
	{
		return serviceenq.getById(enqid);
	}
	  
    
    @PostMapping("/saveenq1")
    public ResponseEntity<Cibil> cibilcheck(@RequestBody  EnquiryDetails edd)
    {
    	//EnquiryDetails ed= serviceenq.enquiry(eId);
    	//EnquiryDetails edetail=new EnquiryDetails();
    	
    	int min = 600;
		int max = 800;
		
		int a = (int) (Math.random() * (max - min + 1) + min);

		System.out.println("cibil generted :" + a);
		
		if( edd.getCibil() == null ) {
			Cibil cbil = new Cibil();
			
			edd.setCibil(cbil);
		}
		edd.getCibil().setCibilScore(a);
		
    	
    	if(edd.getCibil().getCibilScore()>700)
    	{
    		edd.getCibil().setCibilStatus("Approved");
    		EnquiryDetails ee=serviceenq.savedataenq(edd);
    		
    		
    		SimpleMailMessage m=new SimpleMailMessage();
    		m.setTo(edd.getEmail());
    		m.setSubject("CIBIL check");
    		m.setText("Your Application form has been approved for loan");
            
    		jms.send(m);
    	}
    	else 
    		{
    		edd.getCibil().setCibilStatus("Rejected");
    		EnquiryDetails ee1=serviceenq.savedataenquiry(edd);

    		SimpleMailMessage m=new SimpleMailMessage();
    		m.setTo(ee1.getEmail());
    		m.setSubject("CIBIL check");
    		m.setText("Your Application form has NOT been approved for loan");
    		jms.send(m);
    		}
		
    	
    	return new ResponseEntity<Cibil>(edd.getCibil(), HttpStatus.OK); 
    }
     
    @PutMapping("/enqupdatedata")
    public String enqUpdate(@RequestBody EnquiryDetails enqup)
    {
    	serviceenq.updateEnq(enqup);
    	
    	return "Data Updated Sucessfully";
    }
    
    @DeleteMapping("/enqdeletedata/{eId}")
    public String enqDelete(@PathVariable int eId)
    {
    	serviceenq.delenq(eId);
    	return "Data deleted successfully";
    }
}
