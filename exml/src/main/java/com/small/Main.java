package com.small;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;


public class Main {
	public static void main(String[] args) {
		Configuration cfg=new Configuration();
        cfg.configure("hibernate.hbm.xml");
        SessionFactory factory=cfg.buildSessionFactory();
        Session session=factory.openSession();
        Transaction  tx= session.beginTransaction();
        Person p=new Person();
        p.setId(10);
        p.setName("ayush ayushman");
        p.setPhone(8574);
        session.save(p);
        tx.commit();
        session.close();
        factory.close();
	}
}
