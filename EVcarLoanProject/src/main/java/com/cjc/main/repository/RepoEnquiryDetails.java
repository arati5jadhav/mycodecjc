package com.cjc.main.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.cjc.main.model.EnquiryDetails;

@Repository
public interface RepoEnquiryDetails extends CrudRepository<EnquiryDetails, Integer>{


}
