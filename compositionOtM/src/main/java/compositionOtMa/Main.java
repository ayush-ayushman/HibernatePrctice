package compositionOtMa;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import compositionOtM.dto.Employee;
import compositionOtM.dto.Project;


public class Main {
	public static void Persist()
	{
	 
		EntityManagerFactory factory=Persistence.createEntityManagerFactory("dev");
		EntityManager manager=factory.createEntityManager();
		EntityTransaction tran=manager.getTransaction();
		Employee emp1=new Employee();
		emp1.setEmpId(1);
		emp1.setEmpName("ram");
		emp1.setEmpType("regular");
		emp1.setJobDes("tester");
		
		Employee emp2=new Employee();
		emp2.setEmpId(2);
		emp2.setEmpName("ramesh");
		emp2.setEmpType("regular");
		emp2.setJobDes("programmer");
		Employee emp3=new Employee();
		emp3.setEmpId(3);
		emp3.setEmpName("anagha");
		emp3.setEmpType("contract");
		emp3.setJobDes("dev-ops");
		Project pro=new Project();
		pro.setProjectId(1);
		pro.setProjectName("mobile Application");
		pro.setProjManager("AYUSH Ayushman");
		pro.setDomain("tele-com");

	
		List<Employee> pr=new ArrayList<Employee>();
		pr.add(emp1);
		pr.add(emp2);
		pr.add(emp3);
		pro.setListOfEmployee(pr);
	    manager.persist(emp1);
	    manager.persist(emp2);
	    manager.persist(emp3);
	    manager.persist(pro);
	    tran.begin();
	    tran.commit();

	}
	public static void findById()
	{
		EntityManagerFactory factory=Persistence.createEntityManagerFactory("dev");
		EntityManager manager=factory.createEntityManager();
		EntityTransaction tran=manager.getTransaction();
		Project p=manager.find(Project.class,1);
		if(p!=null)
		{
			System.out.println(p);
		}
		
	}
	public static void Update()
	{
		EntityManagerFactory factory=Persistence.createEntityManagerFactory("dev");
		EntityManager manager=factory.createEntityManager();
		EntityTransaction tran=manager.getTransaction();
		tran.begin();
		Project tr=manager.find(Project.class, 1);
		if(tr!=null)
		{
			tr.setProjManager("Ritu");
		}
		tran.commit();
		

	}
	public static void Delete()
	{
		EntityManagerFactory factory=Persistence.createEntityManagerFactory("dev");
		EntityManager manager=factory.createEntityManager();
		EntityTransaction tran=manager.getTransaction();
		Project tr=manager.find(Project.class, 1);
		tran.begin();
		if(tr!=null)  {
		List<Employee> e=tr.getListOfEmployee();
		for (Employee employee : e) {
			manager.remove(employee);
			
		}
		manager.remove(tr);
		}
		tran.commit();

	}
	public static void main(String [] args)
	{
		Persist();
		//findById();
		//Update();
		//Delete();
	}
}
