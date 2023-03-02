package com.cjc.main.serviceImpl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cjc.main.model.EnquiryDetails;
import com.cjc.main.repository.RepoEnquiryDetails;
import com.cjc.main.service.SerEnquiryDetails;

@Service
public class ImplEnquiryDetails implements SerEnquiryDetails{

	@Autowired
	RepoEnquiryDetails repoed;

	@Override
	public Iterable<EnquiryDetails> savelist(Iterable<EnquiryDetails> ed) {
		
		return repoed.saveAll(ed);
	}

	@Override
	public Iterable<EnquiryDetails> getAllList() {
		
		Iterable<EnquiryDetails> enqList = repoed.findAll();
		for( EnquiryDetails en : enqList ) {
			System.out.println(en.getCibil().getCibilScore());
		}
		return enqList;
	}

	@Override
	public Optional<EnquiryDetails> getById(int enqid) {
		
		return repoed.findById(enqid);
	}
	
//	@Override
//	public EnquiryDetails getEnquiryById(int eId) throws EnquiryDetailsServiceException {
//		EnquiryDetails enquiry = null;
//		String name = null;
//		try {
//			System.out.println("1");
//			enquiry = repoed.findById(eId);
//			name = enquiry.getFirstName();
//
//		} catch (Exception e) {
//			System.out.println("2");
//			throw new EnquiryDetailsServiceException("data not present");
//
//		}
//		return enquiry;
//	}
	

	@Override
	public EnquiryDetails savedataenq(EnquiryDetails edd) {
		return repoed.save(edd);
		
	}

	@Override
	public EnquiryDetails savedataenquiry(EnquiryDetails edd) {
		
		return repoed.save(edd);
	}

	@Override
	public void updateEnq(EnquiryDetails enqup) {
		repoed.save(enqup);
	}

	@Override
	public void delenq(int eId) {
		repoed.deleteById(eId);
		
	}
//1st : save enqdetails in db 
	@Override
	public void saveEnqlist(EnquiryDetails ed) {
		
		repoed.save(ed);
	}

	

}
