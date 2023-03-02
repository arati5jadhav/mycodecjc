package com.cjc.main.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.cjc.main.model.SanctionLetter;

@Repository
public interface RepoSanctionLetter extends CrudRepository<SanctionLetter, Integer>{

	public SanctionLetter findBySanctionId(int sanctionId);
}
