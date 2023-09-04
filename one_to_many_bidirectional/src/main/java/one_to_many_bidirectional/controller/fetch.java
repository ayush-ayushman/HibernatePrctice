package one_to_many_bidirectional.controller;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import one_to_many_bidirectional.dto.Employee;

public class fetch {
	public static void main(String[] args) {
		EntityManagerFactory factory=Persistence.createEntityManagerFactory("dev");
		EntityManager manager=factory.createEntityManager();
		EntityTransaction transaction=manager.getTransaction();
		 Employee p=manager.find(Employee.class, 1);
		
	}

}
