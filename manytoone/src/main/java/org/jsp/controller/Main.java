package org.jsp.controller;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import org.jsp.manytoone.dto.Answer;
import org.jsp.manytoone.dto.Question;

public class Main {
	public static void main(String [] args)
	{
		Question a=new Question();
		a.setQuestion("what is java");
		a.setQuestionBy("Ayush Ayushman");
		
		Answer q1=new Answer();
		q1.setAnswer("object");
		q1.setAnswerBy("Ayush");
		q1.setQuestion(a);
		
		Answer q2=new Answer();
		q2.setAnswer("multithreading");
		q2.setAnswerBy("Ayush Ayushman");
		q2.setQuestion(a);
		
		Answer q3=new Answer();
		q3.setAnswer("multithreading");
		q3.setAnswerBy("Ayush Ayushman");
		q3.setQuestion(a);

		EntityManagerFactory factory=Persistence.createEntityManagerFactory("dev");
		EntityManager manager=factory.createEntityManager();
		EntityTransaction transaction=manager.getTransaction();
		manager.persist(q1);
		manager.persist(q2);
		manager.persist(q3);
		transaction.begin();
		transaction.commit();
		
		
		
		
	}

}
