package org.jsp.composition;

public class Main {
	public static void main(String [] args)
	{
		Mobile mb=new Mobile();
		mb.setMobileId(4565);
		mb.setCompanyName("samsung");
		mb.setProcessor("snapdragon 920");
		mb.setRam(12);
		Sim s=new Sim();
		s.setSimId(1);
		s.setProviderName("reliance");
		s.setFreeProvider("jio");
		mb.setSim(s);
	
	}

}
