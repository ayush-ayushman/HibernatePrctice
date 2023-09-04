package Org.jsp.orderinfo;

import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class Main1 {
	public static void main(String[] args) {
		EntityManagerFactory entityManagerFactory=Persistence.createEntityManagerFactory("dev");
	}
}
