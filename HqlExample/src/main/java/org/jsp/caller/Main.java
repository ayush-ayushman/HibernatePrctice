package org.jsp.caller;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.hibernate.query.NativeQuery;
import org.jsp.call.Product;

public class Main {
	public static void main(String[] args) {
		 Configuration cfg=new Configuration();
		 cfg.configure();
	     SessionFactory factory=cfg.buildSessionFactory();
	     Session session=factory.openSession();
	     Transaction  tx= session.beginTransaction();
	      String q="select * from Product";
	      NativeQuery qry=session.createSQLQuery(q);
	      List<Product> pro=qry.list();
	      for(Product p:pro)
	      {
	    	  System.out.println(p.getPname());
	    	  System.out.println(p.getProductcode());
	      }
	      session.close();
	      tx.commit();
	      factory.close();
	     
	}

}
