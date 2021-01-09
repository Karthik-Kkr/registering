package com.capg.regandlog.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.capg.regandlog.dao.LoginDao;
import com.capg.regandlog.model.RegAndLog;

@Service
public class LoginServiceImpl implements ILoginService {
	
	@Autowired
	LoginDao loginDao;

	@Override
	public boolean login(RegAndLog regAndLog) {
		
		return loginDao.getUser(regAndLog);
	}

}
