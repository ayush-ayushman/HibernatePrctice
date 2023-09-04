package org.jsp.display;


import org.hibernate.Transaction;


import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class Main {
	public static void main(String[] args) {
		Configuration cfg=new Configuration();
		cfg.configure();
		SessionFactory fac=cfg.buildSessionFactory();
		Session session=fac.openSession();
		org.hibernate.Transaction tx=session.beginTransaction();
		Produce prod=new Produce();
		prod.setPname("pen");
		prod.setProductcode("cd");
		session.save(prod);
		Produce prod1=new Produce();
		prod1.setPname("penpencil");
		prod1.setProductcode("cdef");
		session.save(prod1);
		tx.commit();
		session.close();
		fac.close();
		
		
		
	}

}
