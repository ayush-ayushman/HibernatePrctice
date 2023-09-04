package many2many_uni.dao;

import java.util.ArrayList;
import java.util.Arrays;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.transaction.Transaction;

import many2many_uni.dto.Batch;
import many2many_uni.dto.Student;

public class SaveBatchAndStudent {
	public static void main(String[] args) {
		Student s1=new Student();
		s1.setName("Ayush");
		s1.setPhone(8524);
		
		Student s2=new Student();
		s2.setName("Ayush");
		s2.setPhone(8524);
		
		Student s3=new Student();
		s3.setName("Ayush");
		s3.setPhone(8524);
		
		Batch b1=new Batch();
		b1.setCode("89746");
		b1.setSubject("hibernate ");
		b1.setStudents(new ArrayList<Student>(Arrays.asList(s1,s2,s3)));
		
		Batch b2=new Batch();
		b2.setCode("8974");
		b2.setSubject("spring ");
		b2.setStudents(new ArrayList<Student>(Arrays.asList(s1,s2,s3)));
		
		Batch b3=new Batch();
		b3.setCode("89746");
		b3.setSubject("hibernate ");
		b3.setStudents(new ArrayList<Student>(Arrays.asList(s1,s2,s3)));
		
		EntityManagerFactory factory=Persistence.createEntityManagerFactory("dev");
		EntityManager manager=factory.createEntityManager();
	 Transaction transaction=manager.getTransaction();
	 
	 tr
		
	}
}
