package com.capg.regandlog.dao;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.capg.regandlog.model.RegAndLog;

@Repository
@Transactional
public class LoginDao {

	@PersistenceContext
	EntityManager entityManager;

	public boolean getUser(RegAndLog regAndLog) {

		boolean flag = false;
		RegAndLog login = entityManager.find(RegAndLog.class, regAndLog.getUserId());
		if (login.getUserId() == regAndLog.getUserId() && login.getPassword().equals(regAndLog.getPassword())) {

			flag = true;
		}
		return flag;
	}
}
