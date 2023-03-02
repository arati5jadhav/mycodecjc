package com.cjc.main.service;

import java.util.List;

import javax.servlet.http.HttpServletResponse;

import com.cjc.main.model.Ledger;

public interface SerLedger {

	Ledger saveData(Ledger ledg);

	Iterable<Ledger> getAllLedger();

	void generateExel(HttpServletResponse response);

	void generatePdf(HttpServletResponse response1);

	List<Ledger> getTheListLedger();

}
