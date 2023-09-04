package org.jsp.dto;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToMany;

@Entity
public class Author {
	@Id
	private int authorId;
	private String authorName;
	private String genre;
	@ManyToMany 
	List<Book> listofBook;
	public List<Book> getListofBook() {
		return listofBook;
	}
	public void setListofBook(List<Book> listofBook) {
		this.listofBook = listofBook;
	}
	public int getAuthorId() {
		return authorId;
	}
	public void setAuthorId(int authorId) {
		this.authorId = authorId;
	}
	public String getAuthorName() {
		return authorName;
	}
	public void setAuthorName(String authorName) {
		this.authorName = authorName;
	}
	public String getGenre() {
		return genre;
	}
	public void setGenre(String genre) {
		this.genre = genre;
	}
	
	

}
