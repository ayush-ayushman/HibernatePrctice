package org.jsp.exam;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class Main {
	public static void main(String [] args)
	{
		Configuration cfg=new Configuration();
        cfg.configure("hibernate.cfg.xml");
        SessionFactory factory=cfg.buildSessionFactory();
        Session session=factory.openSession();
        Transaction  tx= session.beginTransaction();
        child op=new child();
        op.setId(11);
        op.setPhone(784596213);
        
        Student ol=new Student();
        ol.setName("Ayush Ayushman");
        ol.setCity("calicut");
        ol.setChi(op);
        session.save(ol);
       /* Student s = (Student) session.get(Student.class,11);
        System.out.println(s.getCity());
        System.out.println(s.getChi().getId());
        System.out.println(s.getChi().getPhone());*/
        tx.commit();
        session.close();
        factory.close();
	}

}
