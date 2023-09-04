package org.jsp.dto;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToMany;

@Entity
public class Book {
	@Id
	private int bookId;
	private String bookName;
	private String publication;
	private String isbnNumber;
	@ManyToMany
	List<Author> listOfAuthor;
	public int getBookId() {
		return bookId;
	}
	public void setBookId(int bookId) {
		this.bookId = bookId;
	}
	public String getBookName() {
		return bookName;
	}
	public void setBookName(String bookName) {
		this.bookName = bookName;
	}
	public String getPublication() {
		return publication;
	}
	public void setPublication(String publication) {
		this.publication = publication;
	}
	public String getIsbnNumber() {
		return isbnNumber;
	}
	public void setIsbnNumber(String isbnNumber) {
		this.isbnNumber = isbnNumber;
	}
	public List<Author> getListOfAuthor() {
		return listOfAuthor;
	}
	public void setListOfAuthor(List<Author> listOfAuthor) {
		this.listOfAuthor = listOfAuthor;
	}
	

}
