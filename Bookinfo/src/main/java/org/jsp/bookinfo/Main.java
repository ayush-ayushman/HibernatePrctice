package org.jsp.bookinfo;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import org.jsp.dto.Author;
import org.jsp.dto.Book;

public class Main {
	public static void Persist()
	{
		EntityManagerFactory fac=Persistence.createEntityManagerFactory("dev");
		EntityManager manager=fac.createEntityManager();
		EntityTransaction tra=manager.getTransaction();
		Author or=new Author();
		or.setAuthorId(1);
		or.setAuthorName("H C VERMA");
		or.setGenre("12/74");
		Author or1=new Author();
		or1.setAuthorId(2);
		or1.setAuthorName(" VERMA");
		or1.setGenre("12174");
		Author or2=new Author();
		or2.setAuthorId(2);
		or2.setAuthorName("wiki");
		or2.setGenre("1217496");
		
		Book b=new Book();
		b.setBookId(1);
		b.setBookName("physics");
		b.setPublication("cambridge");
		b.setIsbnNumber("asktoyou");
		
		Book b1=new Book();
		b1.setBookId(2);
		b1.setBookName("chemis");
		b1.setPublication("cambridge");
		b1.setIsbnNumber("789yt");
		
		Book b2=new Book();
		b2.setBookId(3);
		b2.setBookName("bio");
		b2.setPublication("harvard");
		b2.setIsbnNumber("789lkd");
		
		List<Book> bk=new ArrayList<Book>();
		bk.add(b);
		bk.add(b1);
		bk.add(b2);
		
		List<Book> bk1=new ArrayList<Book>();
		bk.add(b);
		bk.add(b1);
		
		
		List<Author> au=new ArrayList<Author>();
		au.add(or);
		au.add(or1);
		au.add(or2);
		
		List<Book> bk2=new ArrayList<Book>();
		bk.add(b);
		
		or.setListofBook(bk);
		or1.setListofBook(bk1);
		or2.setListofBook(bk2);
		tra.begin();
		manager.persist(b);
		manager.persist(b1);
		manager.persist(bk2);
		manager.persist(or);
		manager.persist(or1);
		manager.persist(or2);
		tra.commit();
		
		
	}
	public static void main(String args)
	{
		Persist();
	}

}
