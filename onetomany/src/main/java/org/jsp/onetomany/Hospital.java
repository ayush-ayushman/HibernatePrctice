package org.jsp.onetomany;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class Hospital {
 @Id
 @GeneratedValue(strategy=GenerationType.IDENTITY)
 private int id;
 private String hospitalname;
 @OneToMany(cascade =CascadeType.ALL ,fetch=FetchType.EAGER)
 private List<Branch> br;
public int getId() {
	return id;
}
public void setId(int id) {
	this.id = id;
}
public String getHospitalname() {
	return hospitalname;
}
public void setHospitalname(String hospitalname) {
	this.hospitalname = hospitalname;
}
public List<Branch> getBr() {
	return br;
}
public void setBr(List<Branch> br) {
	this.br = br;
}
 
}
