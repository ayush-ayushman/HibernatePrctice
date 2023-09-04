package org.jsp.exam;

import java.io.Serializable;

import javax.persistence.Embeddable;

@Embeddable
public class child implements Serializable {
	private  int id;
	private  long phone;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public long getPhone() {
		return phone;
	}
	public void setPhone(long phone) {
		this.phone = phone;
	}
  
}
