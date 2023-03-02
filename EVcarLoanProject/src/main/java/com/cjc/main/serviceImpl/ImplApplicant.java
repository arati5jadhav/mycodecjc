package com.cjc.main.serviceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cjc.main.exception.ApplicantServiceException;
import com.cjc.main.model.Applicant;
import com.cjc.main.repository.RepoApplicant;
import com.cjc.main.repository.RepoEmiDetail;
import com.cjc.main.repository.RepoLedger;
import com.cjc.main.service.SerApplicant;

@Service
public class ImplApplicant implements SerApplicant{

	@Autowired
	RepoApplicant ar;
	
	@Autowired
	RepoEmiDetail er;
	
	@Autowired
	RepoLedger ld;
	
	
	@Override
	public Applicant savedata(Applicant a) {
		// TODO Auto-generated method stub
		return ar.save(a);
	}


	@Override
	public List<Applicant> getByStatus(String status) {
		// TODO Auto-generated method stub
		return ar.findByStatus(status);
	}
	@Override
	public Iterable<Applicant> getdata() {
		// TODO Auto-generated method stub
		return ar.findAll();
	}

	@Override
	public void updatedata(Applicant a) {
		// TODO Auto-generated method stub
		ar.save(a);
	}

	@Override
	public Iterable<Applicant> deletedata(int id) {
		// TODO Auto-generated method stub
		ar.deleteById(id);
		return getdata();
	}


	@Override
	public Applicant getSingleData(int id) {
		
		return ar.getById(id);
	}


	@Override
	public Applicant getApplicantdatabyId(int id) throws ApplicantServiceException {
		Applicant applicant = null;
		String name = null;
		try {
			System.out.println("1");
			applicant = ar.findById(id);
			name = applicant.getName();

		} catch (Exception e) {
			System.out.println("2");
			throw new ApplicantServiceException("data not present");

		}
		return applicant;
	}
	

}
