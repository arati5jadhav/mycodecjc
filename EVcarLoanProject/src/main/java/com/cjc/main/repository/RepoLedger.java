package com.cjc.main.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.cjc.main.model.Ledger;

@Repository
public interface RepoLedger extends CrudRepository<Ledger, Integer>{

}
