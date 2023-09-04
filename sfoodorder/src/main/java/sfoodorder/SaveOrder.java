package sfoodorder;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.transaction.Transaction;

public class SaveOrder {
	public static void main(String[] args) {
		EntityManagerFactory  factory=Persistence.createEntityManagerFactory("dev");
		EntityManager manager=factory.createEntityManager();
		EntityTransaction tx=manager.getTransaction();
		FoodOrder order=new FoodOrder();
		order.setCost(450);
		order.setItem("biryani");
		manager.persist(order);
		tx.begin();
		tx.commit();
		
		
		
	}

}
