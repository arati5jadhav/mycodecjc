package com.cjc.main.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.cjc.main.model.EmiCustomer;
import com.cjc.main.model.EmiDetails;

@Repository
public interface RepoEmiCustomer extends JpaRepository<EmiCustomer,Integer>{

	EmiDetails findByCustid(int id);
}
