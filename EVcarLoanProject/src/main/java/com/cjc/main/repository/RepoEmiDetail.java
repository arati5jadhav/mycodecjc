package com.cjc.main.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.cjc.main.model.EmiDetails;

@Repository
public interface RepoEmiDetail extends CrudRepository<EmiDetails, Integer>{

	Iterable<EmiDetails> findAll();
	EmiDetails findById(int id);
}
