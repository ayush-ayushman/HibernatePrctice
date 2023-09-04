package org.jsp.onetoone;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class Main {
	public static void main(String [] args)
	{
		Configuration cfg=new Configuration();
		cfg.configure();
		SessionFactory factory=cfg.buildSessionFactory();
        Session session=factory.openSession();
        Transaction  tx= session.beginTransaction();
        Adhar a=new Adhar();
        a.setAdharno(8217474);
        Person p=new Person();
        p.setName("ayushayushman");
        p.setAd(a );
        a.setP(p);
        session.save(p);
        tx.commit();
        session.close();
        factory.close();
	}

}
