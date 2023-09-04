package org.jso.kartshoping;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import org.jsp.dto.Order;
import org.jsp.dto.Product;



public class App {
	public static void Persist()
	{
		EntityManagerFactory factory=Persistence.createEntityManagerFactory("dev");
		EntityManager manager=factory.createEntityManager();
		EntityTransaction tran=manager.getTransaction();

		
	}
	public static void main(String [] args)
	{
		Persist();
	}

}
