package org.jsp.controller;

import java.util.List;
import java.util.Scanner;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;

import org.jsp.manytoone.dto.Answer;

public class Fetch {
	public static void main(String [] args)
	{
		Scanner s=new Scanner(System.in);
		System.out.println("enter the Question id to find the answer");
		int qid=s.nextInt();
		String qry="select a from Answer a where a.question.id=:id";
		EntityManagerFactory factory=Persistence.createEntityManagerFactory("dev");
		EntityManager manager=factory.createEntityManager();
		Query q=manager.createQuery(qry);
		q.setParameter("id", qid);
		List<Answer> answers=q.getResultList();
		for(Answer a: answers)
		{
			System.out.println(a.getAnswer());
		}
		
		
	}

}
