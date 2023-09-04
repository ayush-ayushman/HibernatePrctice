package com.ty.shoppingkart;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import com.ty.shoppingkart.dto.Order;
import com.ty.shoppingkart.dto.Product;

public class App {
	public static void main(String [] args)
	{
		Product pro1=new Product();
		pro1.setProdId(1);
		pro1.setProdNamee("apple laptop");
		pro1.setProdType("Laptop");
		pro1.setQuality(2);
		pro1.setCompanyName("apple");
		pro1.setProductPrice(58960);
		
		Product pro2=new Product();
		pro2.setProdId(2);
		pro2.setProdNamee("lenovo laptop");
		pro2.setProdType("Laptop");
		pro2.setQuality(3);
		pro2.setCompanyName("lenovo");
		pro2.setProductPrice(58000);
		
		Product pro3=new Product();
		pro3.setProdId(1);
		pro3.setProdNamee("hp laptop");
		pro3.setProdType("Laptop");
		pro3.setQuality(3);
		pro3.setCompanyName("hp");
		pro3.setProductPrice(80000);
		
		Order or=new Order();
		or.setOrderId(1);
		or.setCustName("ayush ayushman");
		or.setAddress("jp nagar 2nd phase");
		or.setPhone(78525415);
		or.setEmail("afssgdddndn.com");
		List<Product> pr=new ArrayList<Product>();
		pr.add(pro1);
		pr.add(pro2);
		pr.add(pro3);
		or.setListofProducts(pr);
		double orderTotal=0.0;
		
	    for (Product product : pr) {
	    	double amt=product.getProductPrice()*product.getQuality();
	    	orderTotal=amt+orderTotal;
			
		}
	    or.setOrderTotal(orderTotal);
	    System.out.println(or);
		
		
		 
		
	}

}
