package org.jsp.manytomany;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;


@Entity
public class Student {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	private String name;
	@ManyToMany
	@JoinTable(name="studentcourse",joinColumns= {@JoinColumn(name="student id")},inverseJoinColumns = {@JoinColumn(name="cd_id")})
	private List<Course> cd;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public List<Course> getCd() {
		return cd;
	}
	public void setCd(List<Course> cd) {
		this.cd = cd;
	}
	
	
	

}
