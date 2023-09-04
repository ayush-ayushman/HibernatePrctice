package org.jsp.onetomany;


import org.hibernate.Transaction;

import java.util.ArrayList;
import java.util.Arrays;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
public class main {
	public static void main(String[] args) {
		Configuration cfg=new Configuration();
		cfg.configure();
		SessionFactory factory=cfg.buildSessionFactory();
        Session session=factory.openSession();
        Transaction  tx= session.beginTransaction();
        Branch b1=new Branch();
        b1.setBranchname("appolobenga");
        b1.setEmail("@vai458");
        b1.setLoc("benga");
        Branch b2=new Branch();
        b2.setBranchname("appolomysoor");
        b2.setEmail("@myu458");
        b2.setLoc("mysure");
        Hospital h=new Hospital();
        h.setHospitalname("apollo");
        h.setBr(new ArrayList<Branch>(Arrays.asList(b1,b2)));
        session.save(h);
        tx.commit();
        session.close();
        factory.close();
        
        
		
	}

}
