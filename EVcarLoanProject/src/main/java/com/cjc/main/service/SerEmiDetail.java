package com.cjc.main.service;

import com.cjc.main.model.EmiDetails;

public interface SerEmiDetail {

	EmiDetails savedata(EmiDetails e);
	
	EmiDetails getSingleData1(int cid);

	public Iterable<EmiDetails> getdata();

	public void updatedata(EmiDetails e);

	public Iterable<EmiDetails> deletedata(int id);

	public void savedataemidetails(EmiDetails l);

}
