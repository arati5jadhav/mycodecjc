package com.cjc.main.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.cjc.main.model.EmiDetails;
import com.cjc.main.service.SerEmiDetail;

@CrossOrigin("*")
@RequestMapping(value = "/emireg")
@RestController

public class EmiController {

	@Autowired
	SerEmiDetail er;
	
	@PostMapping("/saveEmiDetaildataa")
	public EmiDetails savedataa(@RequestBody EmiDetails l)
	{
		return er.savedata(l);
	}


	@PostMapping("/saveEmiDetailsdataa")
	public String savedataaa(@RequestBody EmiDetails l)
	{
		er.savedata(l);
	   return "Success";
	}
	
	@RequestMapping(value="/saveEmiDetaildata",method = RequestMethod.POST)
	public String savedataemidetails(@RequestBody EmiDetails l)
	{
		er.savedataemidetails(l);
		return "Success";
	}

	@GetMapping(value="/getSingleDataEmiDetail/{id}")
	public EmiDetails getSingledata1(@PathVariable int id) {
		EmiDetails e=er.getSingleData1(id);
			return e;
		}
	@RequestMapping(value="/getEmiDetaildata",method = RequestMethod.GET)
	public Iterable<EmiDetails> getdata()
	{
		return er.getdata();
	}

	@RequestMapping(value="/updateEmiDetaildata",method = RequestMethod.PUT)
	public void updatedata(@RequestBody EmiDetails l)
	{
		 er.updatedata(l);
	}
	@RequestMapping(value="/deleteEmiDetaildata/{id}",method = RequestMethod.DELETE)
	public Iterable<EmiDetails>  deletedata(@PathVariable ("id") int id)
	{
		return er.deletedata(id);
	}
}
