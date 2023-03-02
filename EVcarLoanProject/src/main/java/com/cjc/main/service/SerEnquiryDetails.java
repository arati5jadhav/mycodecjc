package com.cjc.main.service;

import java.util.Optional;

import com.cjc.main.model.EnquiryDetails;

public interface SerEnquiryDetails {

	public	Iterable<EnquiryDetails> savelist(Iterable<EnquiryDetails> ed);

	public Iterable<EnquiryDetails> getAllList();

	public Optional<EnquiryDetails> getById(int enqid);

	public EnquiryDetails savedataenq(EnquiryDetails edd);

	public EnquiryDetails savedataenquiry(EnquiryDetails edd);

	public void updateEnq(EnquiryDetails enqup);

	public void delenq(int eId);

	public void saveEnqlist(EnquiryDetails ed);




}
