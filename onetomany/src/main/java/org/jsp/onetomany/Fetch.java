package org.jsp.onetomany;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class Fetch {
 public static void main(String[] args) {
	
	Configuration cfg=new Configuration();
	cfg.configure();
	SessionFactory factory=cfg.buildSessionFactory();
    Session session=factory.openSession();
    Transaction  tx= session.beginTransaction();
     Branch op=(Branch)session.get(Branch.class,1);
     System.out.println(op.getBranchname());
 }
    

}
