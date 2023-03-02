package com.cjc.main.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.cjc.main.model.Customer;
import com.cjc.main.model.LoanDisbursement;

@Repository
public interface RepoLoanDisbursement extends CrudRepository<LoanDisbursement, Integer>{

	Customer findById(int custId);
}
