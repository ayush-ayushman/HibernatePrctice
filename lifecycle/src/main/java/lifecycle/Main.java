package lifecycle;

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
        Transaction tx= session.beginTransaction();
        Student op=new Student();
        op.setName("kabir");
        op.setInde("dfghjkl");
        session.save(op);
        op.setName("kamal");
        session.update(op);
        tx.commit();
        
        session.close();
        factory.close();
        
        
		
	}

}
