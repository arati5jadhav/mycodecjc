package com.cjc.main.service;

import java.util.List;

import com.cjc.main.exception.ApplicantServiceException;
import com.cjc.main.model.Applicant;

public interface SerApplicant {

	public Applicant savedata(Applicant a);

	public Iterable<Applicant> getdata();

	public void updatedata(Applicant a);

	public Iterable<Applicant> deletedata(int id);

	public List<Applicant> getByStatus(String status);

	public Applicant getSingleData(int id);

	public Applicant getApplicantdatabyId(int id) throws ApplicantServiceException;
}
