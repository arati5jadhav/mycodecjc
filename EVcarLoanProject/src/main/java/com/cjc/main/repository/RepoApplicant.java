package com.cjc.main.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.cjc.main.model.Applicant;

@Repository
public interface RepoApplicant extends JpaRepository<Applicant,Integer>{

	List<Applicant> findByStatus(String status);
	Applicant findById(int id);
}
