package com.cjc.main.controller;

import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.cjc.main.model.Ledger;
import com.cjc.main.service.SerLedger;

@CrossOrigin("*")
@RestController
@RequestMapping(value = "/legreg")
public class LedgerController {
	@Autowired
	SerLedger ls;
	
	@RequestMapping(value="/saveLedgerData" ,method = RequestMethod.POST)
	public Ledger saveData(@RequestBody Ledger ledg) 
	{
		
		Ledger ld=ls.saveData(ledg);
		return ld;
	}

	@RequestMapping(value = "/getAllLedger" ,method = RequestMethod.GET)
	public Iterable<Ledger> getAllLedger()
	{
		Iterable< Ledger> list=ls.getAllLedger();
		System.out.println(list);
		return list;
	}
	@GetMapping("/excelfile")
	public void createExcel(HttpServletResponse response)
	{
		response.setContentType("application/octet-stream");
		response.setHeader("Content-Disposition", "attachment;filename=data.xls");
		ls.generateExel(response);
	}
	@GetMapping("/excelfilee/{ledgerId}")
	public void createExcell(HttpServletResponse response,@PathVariable int ledgerId )
	{
		response.setContentType("application/octet-stream");
		response.setHeader("Content-Disposition", "attachment;filename=data.xls");
		ls.generateExel(response);
	}
	
	
	
	@GetMapping("/pdfgenerate")
	public void createpdf(HttpServletResponse response1)
	{
		response1.setContentType("application/pdf");
		
		response1.setHeader("Content-Disposition", "attachment;filename=.pdf");
		ls.generatePdf(response1);
		}
	
}
