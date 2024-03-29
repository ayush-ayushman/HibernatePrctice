package org.jsp.onetoone;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;

@Entity
public class Person {
   @Id
   @GeneratedValue(strategy=GenerationType.IDENTITY)
   private int id;
   private String name;
   @OneToOne(cascade = CascadeType.ALL)
   @JoinColumn
   private Adhar ad;
public Adhar getAd() {
	return ad;
}
public void setAd(Adhar ad) {
	this.ad = ad;
}
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
   
   
}
