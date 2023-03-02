package com.cjc.main.serviceImpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cjc.main.model.EmiDetails;
import com.cjc.main.repository.RepoEmiDetail;
import com.cjc.main.service.SerEmiDetail;

@Service
public class ImplEmiDetail implements SerEmiDetail{

	@Autowired
	RepoEmiDetail er;
	
	@Override
	public EmiDetails savedata(EmiDetails e) {
		// TODO Auto-generated method stub
		return er.save(e);
	}
	
	@Override
	public EmiDetails getSingleData1(int id) {
		// TODO Auto-generated method stub
		
		return er.findById(id);
	}

	@Override
	public Iterable<EmiDetails> getdata() {
		// TODO Auto-generated method stub
		return er.findAll();
	}

	@Override
	public void updatedata(EmiDetails e) {
		// TODO Auto-generated method stub
		
		er.save(e);
	}

	@Override
	public Iterable<EmiDetails> deletedata(int id) {
		// TODO Auto-generated method stub
		
		er.deleteById(id);
		return getdata();
	}

	@Override
	public void savedataemidetails(EmiDetails l) {
		// TODO Auto-generated method stub
		er.save(l);
	}
}
