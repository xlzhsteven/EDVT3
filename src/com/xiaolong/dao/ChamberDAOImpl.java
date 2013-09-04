package com.xiaolong.dao;

import java.util.List;

import org.hibernate.SessionFactory;
import org.springframework.orm.hibernate3.HibernateTemplate;

import com.xiaolong.model.Chamber;

public class ChamberDAOImpl implements ChamberDAO {

	private SessionFactory sessionFactory;
	
	public SessionFactory getSessionFactory() {
		return sessionFactory;
	}

	public void setSessionFactory(SessionFactory sessionFactory) {
		this.sessionFactory = sessionFactory;
	}

	@Override
	public void addChamber(Chamber chamber) {
		sessionFactory.getCurrentSession().save(chamber);
	}

	@Override
	public void removeChamber(Chamber chamber) {
		// TODO Auto-generated method stub

	}

	@SuppressWarnings("unchecked")
	@Override
	public List<Chamber> listAll() {
		/*Criteria criteria = sessionFactory.getCurrentSession().createCriteria(Chamber.class);
		return criteria.list();*/
		return sessionFactory.getCurrentSession().createCriteria(Chamber.class).list();
	}

}
