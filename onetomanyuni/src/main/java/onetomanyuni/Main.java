package onetomanyuni;

import java.util.ArrayList;
import java.util.Arrays;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class Main {
   public static void main(String [] args)
   {
	  
	    EntityManagerFactory factory=Persistence.createEntityManagerFactory("dev");
	    EntityManager manager=factory.createEntityManager();
		EntityTransaction transaction=manager.getTransaction();
		Hospital hospital=new Hospital();
		hospital.setName("Apollo");
		hospital.setGst("erty4555");
		hospital.setFounder("AYUSH AYUSHMAN");
	    Branch b1=new Branch(); 
	    b1.setName("ApoloBengaluru");
	    b1.setPhone(45256545);
	    b1.setEmail("@rtyhh");
	    Branch b2=new Branch();
	    b2.setName("ApoloMengalru");
	    b2.setPhone(4528999);
	    b2.setEmail("@rtyhh1");
	    Branch b3=new Branch();
	    b3.setName("ApoloMysuru");
	    b3.setPhone(452878);
	    b3.setEmail("@rtymy");
	    hospital.setGetBranches(new ArrayList<Branch>(Arrays.asList(b1,b2,b3)));
	    manager.persist(hospital);
	    transaction.begin();
	    transaction.commit();
	    
	    
	    
	    
   }
}
