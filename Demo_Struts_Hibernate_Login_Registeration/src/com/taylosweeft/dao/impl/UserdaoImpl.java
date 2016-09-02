package com.taylosweeft.dao.impl;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.criterion.Expression;

import org.hibernate.criterion.Restrictions;

import com.taylosweeft.dao.Userdao;
import com.taylosweeft.model.User;
import com.taylosweeft.util.HibernateUtil;

public class UserdaoImpl implements Userdao {

	public void addUser(User u) {
		// System.out.println(u.getUsername() + " " + u.geteMail());
		Session s = HibernateUtil.getSession();
		s.save(u);

	}

	public boolean userExit(String username) {
		System.out.println(username);
		Session session = HibernateUtil.getSession();
		Criteria criteria = session.createCriteria(User.class);
		criteria.add(Restrictions.eq("username", username));
		if (criteria.list().size() > 0) {
			System.out.println("user exit");
			return false;
		}
		session.getTransaction().commit();
		return true;
	}

	public boolean login(User u) {
		Session session = HibernateUtil.getSession();
		Criteria criteria = session
				.createCriteria(com.taylosweeft.model.User.class);
		criteria.add(Restrictions.eq("username", u.getUsername()));
		criteria.add(Restrictions.eq("password", u.getPassword()));
		List p = criteria.list();
		System.out.println("size" + p.size());
		if (criteria.list().size() > 0) {
			System.out.println("login success");
			return true;

		}
		session.getTransaction().commit();
		return false;
	}
}
