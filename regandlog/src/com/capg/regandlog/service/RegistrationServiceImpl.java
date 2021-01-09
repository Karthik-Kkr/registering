package com.capg.regandlog.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.capg.regandlog.dao.RegistrationDao;
import com.capg.regandlog.model.RegAndLog;

@Service
public class RegistrationServiceImpl implements IRegistrationService{
	
	@Autowired
	RegistrationDao dao;
	
	RegAndLog reglog=new RegAndLog();
	
	public RegAndLog newRegistry(RegAndLog r) {
		System.out.println("Service");
		return dao.newRegisters(r);
	}
}
