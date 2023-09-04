package test_project;

import java.time.LocalDate;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;

import org.hibernate.annotations.Generated;
@Entity
public class PanCard {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int id;
	private String number;
	private int pincode;
	@OneToOne(mappedBy="card",cascade=CascadeType.ALL)
	private Person p;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getNumber() {
		return number;
	}
	public void setNumber(String number) {
		this.number = number;
	}
	public int getPincode() {
		return pincode;
	}
	public void setPincode(int pincode) {
		this.pincode = pincode;
	}
	public Person getP() {
		return p;
	}
	public void setP(Person p) {
		this.p = p;
	}
	
	
	
	
	
	

}
