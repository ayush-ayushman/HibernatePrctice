package onetomanyuni;

import java.util.Scanner;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class Fetch {
	public static void main(String [] args)
	{
		Scanner sc=new Scanner(System.in);
		int id=sc.nextInt();
		EntityManagerFactory factory=Persistence.createEntityManagerFactory("dev");
		EntityManager manager=factory.createEntityManager();
		EntityTransaction transaction=manager.getTransaction();
		Hospital h=manager.find(Hospital.class,id);
		if(h !=null)
		{
			
			System.out.println(h.getGst());
			System.out.println(h.getName());
			System.out.println(h.getFounder());
			
		}
		else
		{
			System.out.println("invalid id");
		}
		 
	}

}
