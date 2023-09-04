package org.jsp.exam;

import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Student {
	@EmbeddedId
	private child chi;
	private String name;
	private String city;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public child getChi() {
		return chi;
	}
	public void setChi(child chi) {
		this.chi = chi;
	}
	
}
