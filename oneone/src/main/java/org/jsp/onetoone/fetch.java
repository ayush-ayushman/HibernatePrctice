package org.jsp.onetoone;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class fetch {
 public static void main(String[] args) {
	    Configuration cfg=new Configuration();
		cfg.configure();
		SessionFactory factory=cfg.buildSessionFactory();
        Session session=factory.openSession();
        Person p=(Person)session.get(Person.class,1);
        System.out.println(p.getName());
        System.out.println(p.getAd().getAdharno());
        
  
}
}
