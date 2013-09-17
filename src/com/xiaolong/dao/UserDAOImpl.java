package com.xiaolong.dao;

import java.util.List;

import org.hibernate.SessionFactory;

import com.xiaolong.model.User;

public class UserDAOImpl implements UserDAO {
	private SessionFactory sessionFactory;

	public SessionFactory getSessionFactory() {
		return sessionFactory;
	}

	public void setSessionFactory(SessionFactory sessionFactory) {
		this.sessionFactory = sessionFactory;
	}

	@Override
	public String getPasswordByUserId(int id) {
		User user = (User) sessionFactory.getCurrentSession().get(com.xiaolong.model.User.class, id);
		return user.getPassword();
	}

	@SuppressWarnings("unchecked")
	@Override
	public List<User> listUser() {
		return sessionFactory.getCurrentSession().createCriteria(com.xiaolong.model.User.class).list();
	}

}
