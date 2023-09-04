package com.ty.shoppingkart.dto;

public class Product {
	private int prodId;
	private String prodNamee;
	private double productPrice;
	private String prodType;
	private int quality;
	private String companyName;
	public double getProductPrice() {
		return productPrice;
	}
	public void setProductPrice(double productPrice) {
		this.productPrice = productPrice;
	}
	public String getCompanyName() {
		return companyName;
	}
	public void setCompanyName(String companyName) {
		this.companyName = companyName;
	}
	public int getProdId() {
		return prodId;
	}
	public void setProdId(int prodId) {
		this.prodId = prodId;
	}
	public String getProdNamee() {
		return prodNamee;
	}
	public void setProdNamee(String prodNamee) {
		this.prodNamee = prodNamee;
	}
	public String getProdType() {
		return prodType;
	}
	public void setProdType(String prodType) {
		this.prodType = prodType;
	}
	public int getQuality() {
		return quality;
	}
	public void setQuality(int quality) {
		this.quality = quality;
	}
	@Override
	public String toString() {
		return "Product [prodId=" + prodId + ", prodNamee=" + prodNamee + ", productPrice=" + productPrice
				+ ", prodType=" + prodType + ", quality=" + quality + ", companyName=" + companyName + "]";
	}
	
	

}
