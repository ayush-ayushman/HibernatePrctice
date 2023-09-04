package test_project;

import java.time.LocalDate;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class Main {
	public static void main(String  [] args)
	{
		EntityManagerFactory factory=Persistence.createEntityManagerFactory("dev");
		EntityManager manager=factory.createEntityManager();
		EntityTransaction transaction=manager.getTransaction();
		Person p=new Person();
		p.setName("assd");
		p.setPnone(7821111);
		p.setAge(41);
		PanCard c=new PanCard();
		c.setNumber("dfghj");
		c.setPincode(560078);
		p.setCard(c);
		c.setP(p);
		manager.persist(p);
		transaction.begin();
		transaction.commit();
		
		
	}
  

}
