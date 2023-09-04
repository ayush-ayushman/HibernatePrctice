package org.jsp.conn;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

@Entity
public class Answer {
	@Id
	@GeneratedValue(strategy =GenerationType.IDENTITY)
	private int id;
	private String answer;
	@ManyToOne(cascade =CascadeType.ALL)
	private Question qusetion;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getAnswer() {
		return answer;
	}
	public void setAnswer(String answer) {
		this.answer = answer;
	}
	public Question getQusetion() {
		return qusetion;
	}
	public void setQusetion(Question qusetion) {
		this.qusetion = qusetion;
	}
	
	
	

}
