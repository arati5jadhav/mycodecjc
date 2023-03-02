package com.cjc.main.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.cjc.main.model.Document;

@Repository
public interface RepoDocument extends CrudRepository<Document,Integer>{

}
