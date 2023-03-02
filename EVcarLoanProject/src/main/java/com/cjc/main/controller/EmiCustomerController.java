package com.cjc.main.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.cjc.main.model.EmiCustomer;
import com.cjc.main.model.EmiDetails;
import com.cjc.main.service.SerEmiCustomer;

@CrossOrigin("*")
@RequestMapping(value = "/emicustreg")
@RestController
public class EmiCustomerController {

	@Autowired
	SerEmiCustomer er;
	
	@RequestMapping(value="/saveemicust",method = RequestMethod.POST)
	public EmiCustomer savedata(@RequestBody EmiCustomer l)
	{
		return er.savedata(l);
	}	
		@GetMapping(value="/getSingleDataEmiCustomer/{custid}")
		public EmiDetails getSingledatcustomer(@PathVariable int custid) {
			EmiDetails e=er.getSingleDatacustomer(custid);
				return e;
			}
	
	@RequestMapping(value="/getemicust",method = RequestMethod.GET)
	public Iterable<EmiCustomer> getdata()
	{
		return er.getdata();
	}
	
	@RequestMapping(value="/updateemicustdata",method = RequestMethod.PUT)
	public void updatedata(@RequestBody EmiCustomer e)
	{
		 er.updatadata(e);
	}
	@RequestMapping(value="/deleteemicustdata/{custid}",method = RequestMethod.DELETE)
	public Iterable<EmiCustomer>  deletedata(@PathVariable ("custid") int custid)
	{
		return er.deletedata(custid);
	}
}
