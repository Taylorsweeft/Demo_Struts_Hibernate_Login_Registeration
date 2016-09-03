package com.taylosweeft.dao.impl;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.criterion.Restrictions;

import com.taylosweeft.dao.Userdao;
import com.taylosweeft.model.User;
import com.taylosweeft.util.HibernateUtil;

public class UserdaoImpl implements Userdao {

	public void addUser(User u){
		// System.out.println(u.getUsername() + " " + u.geteMail());
		Session session = HibernateUtil.getSessionFactory().getCurrentSession();
		session.beginTransaction();
		session.save(u);
		System.out.println("saveruser");
		session.getTransaction().commit();
	}

	@SuppressWarnings("deprecation")
	public boolean userExit(User u) {
		Session session = HibernateUtil.getSessionFactory().getCurrentSession();
		session.beginTransaction();
		Criteria criteria = session.createCriteria(User.class);
		criteria.add(Restrictions.eq("username", u.getUsername()));
		System.out.println("criteria.list().size()" + criteria.list().size());
		if (criteria.list().size() == 0) {
			session.getTransaction().commit();
			return false;
		}
		session.getTransaction().commit();
		return true;
	}

	@SuppressWarnings("deprecation")
	public boolean login(User u) {
		Session session = HibernateUtil.getSessionFactory().getCurrentSession();
		session.beginTransaction();
		Criteria criteria = session.createCriteria(User.class);
		criteria.add(Restrictions.eq("username", u.getUsername()));
		criteria.add(Restrictions.eq("password", u.getPassword()));
		if (criteria.list().size() > 0) {
			// System.out.println("login success" + criteria.list().size());
			return true;

		}
		// System.out.println("login fail" + criteria.list().size());
		session.getTransaction().commit();
		return false;
	}
}
