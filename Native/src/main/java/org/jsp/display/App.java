package org.jsp.display;

import java.util.Arrays;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.hibernate.query.NativeQuery;

public class App {
	public static void main(String[] args) {
		Configuration cfg=new Configuration();
		cfg.configure();
		SessionFactory fac=cfg.buildSessionFactory();
		Session session=fac.openSession();
		org.hibernate.Transaction tx=session.beginTransaction();
		String s="select * from Produce";
		NativeQuery q=session.createSQLQuery(s);
		List<Object[]> pro=q.list();
		for(Object[] p:pro)
		{
			System.out.println(p[2]);
			
		}
		
	}

}
