 package com.ty.shoppingkart.dto;

import java.util.List;

public class Order {
	private int orderId;
	private double orderTotal;
	private String custName;
	private String address;
	private long phone;
	private String email;
	private List<Product> listofProducts;
	public List<Product> getListofProducts() {
		return listofProducts;
	}
	public void setListofProducts(List<Product> listofProducts) {
		this.listofProducts = listofProducts;
	}
	public int getOrderId() {
		return orderId;
	}
	public void setOrderId(int orderId) {
		this.orderId = orderId;
	}
	
	public double getOrderTotal() {
		return orderTotal;
	}
	public void setOrderTotal(double orderTotal) {
		this.orderTotal = orderTotal;
	}
	public String getCustName() {
		return custName;
	}
	public void setCustName(String custName) {
		this.custName = custName;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public long getPhone() {
		return phone;
	}
	public void setPhone(long phone) {
		this.phone = phone;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	@Override
	public String toString() {
		return "Order [orderId=" + orderId + ", orderTotal=" + orderTotal + ", custName=" + custName + ", address="
				+ address + ", phone=" + phone + ", email=" + email + ", listofProducts=" + listofProducts + "]";
	}
	
	

}
