package com.cjc.main.service;

import com.cjc.main.model.Customer;
import com.cjc.main.model.LoanDisbursement;

public interface SerLoanDisbursement {

	LoanDisbursement saveData(LoanDisbursement agreement);

	Iterable<LoanDisbursement> getAllLoanDisbursement();

	Customer getSingleData(int custId);
}
