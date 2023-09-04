package com.test.projectfirst;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;


public class App 
{
    public static void main( String[] args ) {
       System.out.println("ayush ayushman");
       Configuration cfg=new Configuration();
       cfg.configure("hibernate.cfg.xml");
       SessionFactory factory=cfg.buildSessionFactory();
      Student s=new Student();
      s.setId(101);
      s.setName("ayush");
      s.setCity("bengaluru");
      Session session=factory.openSession();
      Transaction  tx= session.beginTransaction();
       session.save(s);
       tx.commit();
       session.close();
     
      
      
       
       
    }
}
