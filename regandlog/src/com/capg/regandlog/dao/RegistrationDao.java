package com.capg.regandlog.dao;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.capg.regandlog.model.RegAndLog;

@Repository
@Transactional
public class RegistrationDao {
	
	@PersistenceContext
	EntityManager entityManager;
	
	public RegAndLog newRegisters(RegAndLog r) {
			entityManager.persist(r);
			return r;
	}
	
}
