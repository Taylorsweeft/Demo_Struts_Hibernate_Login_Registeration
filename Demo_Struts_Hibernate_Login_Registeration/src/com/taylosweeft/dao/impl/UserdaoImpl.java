package com.taylosweeft.dao.impl;

import org.hibernate.Session;

import com.taylosweeft.dao.Userdao;
import com.taylosweeft.model.User;
import com.taylosweeft.util.HibernateUtil;

public class UserdaoImpl implements Userdao {

	public void addUser(User u) {
		//System.out.println(u.getUsername() + " " + u.geteMail());
		Session s = HibernateUtil.getSession();
		s.save(u);
		s.getTransaction().commit();
		s.close();

	}

	public boolean userExit(String username) {
		
		return false;
	}

	public void login(User u) {

	}

}
