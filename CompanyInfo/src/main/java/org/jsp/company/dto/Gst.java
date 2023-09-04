package org.jsp.company.dto;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToOne;

@Entity
public class Gst {
	@Id
	private int gstId;
	private String gstNumb;
	private String dateOfAlloc;
	@OneToOne
	private Company company;
	public int getGstId() {
		return gstId;
	}
	public void setGstId(int gstId) {
		this.gstId = gstId;
	}
	public String getGstNumb() {
		return gstNumb;
	}
	public void setGstNumb(String gstNumb) {
		this.gstNumb = gstNumb;
	}
	public String getDateOfAlloc() {
		return dateOfAlloc;
	}
	public void setDateOfAlloc(String dateOfAlloc) {
		this.dateOfAlloc = dateOfAlloc;
	}
	public Company getCompany() {
		return company;
	}
	public void setCompany(Company company) {
		this.company = company;
	}
	
	
	

}
