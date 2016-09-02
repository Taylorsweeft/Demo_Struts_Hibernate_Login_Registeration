package com.taylosweeft.util;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class HibernateUtil {
	private static SessionFactory sf;
	private static Session session;

	static {
		sf = new Configuration().configure().buildSessionFactory();
		session = sf.getCurrentSession();
		session.beginTransaction();
	}

	public static Session getSession() {
		return session;
	}

}
