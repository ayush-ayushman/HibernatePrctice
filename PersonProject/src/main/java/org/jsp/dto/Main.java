package org.jsp.dto;

import java.util.Scanner;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import org.jsp.dao.Person;

public class Main {
	public static void insert()
	{
		EntityManagerFactory factory=Persistence.createEntityManagerFactory("developer");
		EntityManager manager=factory.createEntityManager();
		EntityTransaction transaction=manager.getTransaction();
		Person p=new Person();
		p.setPersonId(1);
		p.setName("AYUSH AYUSHMAN");
		p.setAddress("jp nagar 2nd phase");
		p.setState("Karanataka");
		p.setCity("Bengaluru");
		p.setPincode(560078);
		p.setPanCard("ezrpk4");
		p.setAadharNumber(4789555);
		p.setEmail("ayushmanofayush@gmail.com");
		p.setPhone(8955555);
		manager.persist(p);
		transaction.begin();
		transaction.commit();
		
	}
	public static void update()
	{
		EntityManagerFactory factory=Persistence.createEntityManagerFactory("developer");
		EntityManager manager=factory.createEntityManager();
		EntityTransaction transaction=manager.getTransaction();
		Person p=manager.find(Person.class,1);
		if(p!=null)
		{
		    p.setCity("new delhi");
		    manager.merge(p);
		    transaction.begin();
		    transaction.commit();
		}
	}
	public static void delete()
	{
		EntityManagerFactory factory=Persistence.createEntityManagerFactory("developer");
		EntityManager manager=factory.createEntityManager();
		EntityTransaction transaction=manager.getTransaction();
		Person p=manager.find(Person.class,1);
		if(p!=null)
		{
			manager.remove(p);
		}
		transaction.begin();
		transaction.commit();
	}
	public static void search()
	{
		EntityManagerFactory factory=Persistence.createEntityManagerFactory("developer");
		EntityManager manager=factory.createEntityManager();
		EntityTransaction transaction=manager.getTransaction();
		Person p=manager.find(Person.class,1);
		if(p!=null)
		{
			System.out.println(p.getCity());
			System.out.println(p.getEmail());
		}
	}
	public static void main(String [] args)
	{
		System.out.println("1 for insert\n2 for update\n3 for search\n4 for delete");
		Scanner op=new Scanner(System.in);
		int crud=op.nextInt();
		if(crud==1)
		{
		
			     insert();
			     System.out.println("data insert completed");
		}
		else if(crud==2)
		{
			    update();
			    System.out.println("data update completed");
		}
		else if(crud==3)
		{
			   search();
			   System.out.println("data serach completed");
		}
		else if(crud==4)
		{
			  delete();
			  System.out.println("data delete completed");
		}
		else
		{
			System.out.println("you have enter more than 4");
		}
			     
			 
		
		
		
	}

}
