package Org.jsp.orderinfo;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import Org.jsp.orderinfo.dto.Order;
import Org.jsp.orderinfo.dto.Product;

public class Main {
	public static void Persist()
	{
		EntityManagerFactory factory=Persistence.createEntityManagerFactory("dev");
		EntityManager manager=factory.createEntityManager();
		EntityTransaction tran=manager.getTransaction();
		Product pro1=new Product();
		pro1.setProdId(1);
		pro1.setProdNamee("apple laptop");
		pro1.setQuality(2);
		pro1.setCompanyName("apple");
		pro1.setPrice(58960);
		
		Product pro2=new Product();
		pro2.setProdId(2);
		pro2.setProdNamee("lenovo laptop");
		pro2.setQuality(3);
		pro2.setCompanyName("lenovo");
		pro2.setPrice(58000);
		
		Product pro3=new Product();
		pro3.setProdId(3);
		pro3.setProdNamee("hp laptop");
		pro3.setQuality(3);
		pro3.setCompanyName("hp");
		pro3.setPrice(80000);
		
		Order or=new Order();
		or.setOrderId(1);
		or.setCustName("ayush ayushman");
		or.setAddress("jp nagar 2nd phase");
		or.setPhone(78525415);
		or.setEmail("afssgdddndn.com");
		double d=(pro1.getQuality()*pro1.getPrice());
		double m=(pro2.getQuality()*pro2.getPrice());
		double l=(pro3.getQuality()*pro3.getPrice());
		double k=(d+m+l);
		or.setOrderTotal(k);
		pro1.setOrder(or);
		pro2.setOrder(or);
		pro3.setOrder(or);
		manager.persist(or);
		manager.persist(pro1);
		manager.persist(pro2);
		manager.persist(pro3);
	    tran.begin();
	    tran.commit();
		
	}
	public static void main(String [] args)
	{
		Persist();
	}

}
