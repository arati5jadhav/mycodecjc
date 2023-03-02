package com.cjc.main.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.cjc.main.model.Cibil;

@Repository
public interface RepoCibil extends CrudRepository<Cibil, Integer>{

}
