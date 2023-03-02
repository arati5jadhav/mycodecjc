package com.cjc.main.service;
import com.cjc.main.model.EmiCustomer;
import com.cjc.main.model.EmiDetails;

public interface SerEmiCustomer {

	public EmiCustomer savedata(EmiCustomer e);

	public Iterable<EmiCustomer> getdata();

	public void updatadata(EmiCustomer e);

	public Iterable<EmiCustomer> deletedata(int custid);

	public EmiDetails getSingleDatacustomer(int custid);
	
}
