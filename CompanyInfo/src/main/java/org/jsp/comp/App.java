package org.jsp.comp;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import org.jsp.company.dto.Company;
import org.jsp.company.dto.Gst;

public class App {
	public static void main(String [] args)
	{
		EntityManagerFactory factory=Persistence.createEntityManagerFactory("dev");
		EntityManager manager=factory.createEntityManager();
		EntityTransaction tran=manager.getTransaction();
		Company com=new Company();
		com.setCompanyId(1);
		com.setCompName("ABC");
		com.setAddr("bengaluru");
		com.setPhone(789456);
		com.setEmail("ayush@gamil.com");
		
		Gst gt=new Gst();
		gt.setGstId(1);
		gt.setGstNumb("ezrpk");
		gt.setDateOfAlloc("12/2/2015");
		gt.setCompany(com);
		manager.persist(com);
		manager.persist(gt);
		tran.begin();
		tran.commit();
	}

}
