package one_to_many_bidirectional.controller;

import java.util.ArrayList;
import java.util.Arrays;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import one_to_many_bidirectional.dto.Department;
import one_to_many_bidirectional.dto.Employee;

public class SaveDeptAndEmp {
public static void main(String[] args) {
	Department d=new Department();
	d.setLoc("london");
	d.setName("development");
	
	
	
	Employee e1=new Employee();
	e1.setDesg("manager");
	e1.setName("joe");
	e1.setSalary(4441.66);
	e1.setDepts(d);
	
	
	Employee e2=new Employee();
	e2.setDesg("ASE");
	e2.setName("martin");
	e2.setSalary(41.66);
	e2.setDepts(d);
	
	Employee e3=new Employee();
	e3.setDesg("jr dev");
	e3.setName("ronaldo");
	e3.setSalary(4465.66);
	e3.setDepts(d);
	d.setEmps(new ArrayList<Employee>(Arrays.asList(e1,e2,e3)));	
	
EntityManagerFactory factory=Persistence.createEntityManagerFactory("dev");
EntityManager manager=factory.createEntityManager();
EntityTransaction transaction=manager.getTransaction();
manager.persist(d);
transaction.begin();
transaction.commit();
	
}
}
