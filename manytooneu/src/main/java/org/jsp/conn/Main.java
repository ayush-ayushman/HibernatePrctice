package org.jsp.conn;

import java.util.ArrayList;
import java.util.Arrays;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class Main {
	public static void main(String[] args) {
		Configuration cfg=new Configuration();
		cfg.configure();
		SessionFactory factory=cfg.buildSessionFactory();
        Session session=factory.openSession();
        Transaction  tx= session.beginTransaction();
        Question q=new Question();
        q.setQuestion("what is java");
        Answer an=new Answer();
        an.setAnswer("object");
        an.setQusetion(q);
        Answer an1=new Answer();
        an1.setAnswer("dynamic");
        an1.setQusetion(q);
        session.save(an);
        session.save(an1);
        tx.commit();
        session.close();
        factory.close();
        
        
	}

}
