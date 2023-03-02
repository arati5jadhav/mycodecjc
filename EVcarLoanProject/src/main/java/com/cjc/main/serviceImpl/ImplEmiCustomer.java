package com.cjc.main.serviceImpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cjc.main.model.EmiCustomer;
import com.cjc.main.model.EmiDetails;
import com.cjc.main.repository.RepoEmiCustomer;
import com.cjc.main.service.SerEmiCustomer;

@Service
public class ImplEmiCustomer implements SerEmiCustomer{

	@Autowired
	RepoEmiCustomer er;
	
	@Override
	public EmiCustomer savedata(EmiCustomer e) {
		// TODO Auto-generated method stub
		return er.save(e);
	}

	@Override
	public Iterable<EmiCustomer> getdata() {
		// TODO Auto-generated method stub
		return er.findAll();
	}

	@Override
	public void updatadata(EmiCustomer e) {
		// TODO Auto-generated method stub
		 er.save(e);	
	}

	@Override
	public Iterable<EmiCustomer> deletedata(int custid) {
		// TODO Auto-generated method stub
		
		er.deleteById(custid);
		
		return getdata();
		
	}

	@Override
	public EmiDetails getSingleDatacustomer(int custid) {
		// TODO Auto-generated method stub
		return er.findByCustid(custid);
	}
}
