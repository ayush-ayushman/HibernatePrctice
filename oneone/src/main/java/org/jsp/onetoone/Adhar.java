package org.jsp.onetoone;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;
@Entity
public class Adhar {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int id;
	private long adharno;
	@OneToOne(cascade = CascadeType.ALL,mappedBy ="ad")
	private Person p;
	public Person getP() {
		return p;
	}
	public void setP(Person p) {
		this.p = p;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public long getAdharno() {
		return adharno;
	}
	public void setAdharno(long adharno) {
		this.adharno = adharno;
	}
	

}
