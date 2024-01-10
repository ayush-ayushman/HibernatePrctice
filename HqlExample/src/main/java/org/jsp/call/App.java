package org.jsp.call;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Query.*;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;


public class App {
	public static void main(String[] args) {
	 Configuration cfg=new Configuration();
	 cfg.configure();
     SessionFactory factory=cfg.buildSessionFactory();
     Session session=factory.openSession();
     Transaction  tx= session.beginTransaction();
    // Query q=session.createQuery("update Product p  set p.productcode=:x where p.pname=:y");
     Query q=session.createQuery("delete from  Product p  where p.pname=:y");
    // q.setParameter("x", "k11");
     q.setParameter("y","jeans" );
     int r=q.executeUpdate();
    System.out.println(r);
    
     tx.commit();
     session.close();
     factory.close();
     
     
	}
}
