package org.jsp.exam;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class fetch {
  public static void main(String [] args)
  {
	  Configuration cfg=new Configuration();
      cfg.configure("hibernate.cfg.xml");
      SessionFactory factory=cfg.buildSessionFactory();
      Session session=factory.openSession();
      Student s =session.get(Student.class,11);
      System.out.println(s.getCity());
      
      
  }
}
