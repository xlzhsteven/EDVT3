package com.xiaolong.svc;

import java.util.List;

import org.springframework.transaction.annotation.Transactional;

import com.xiaolong.dao.UserDAO;
import com.xiaolong.model.User;

public class UserSvcImpl implements UserSvc {

	private UserDAO userDao;

	public UserDAO getUserDao() {
		return userDao;
	}

	public void setUserDao(UserDAO userDao) {
		this.userDao = userDao;
	}

	@Override
	@Transactional
	public String getPasswordByUserId(int id) {
		return userDao.getPasswordByUserId(id);
	}

	@Override
	@Transactional
	public List<User> listUser() {
		return userDao.listUser();
	}

}
