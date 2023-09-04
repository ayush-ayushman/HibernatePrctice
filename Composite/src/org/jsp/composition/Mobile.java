package org.jsp.composition;

public class Mobile{
	private int mobileId;
	private String companyName;
	private String processor;
	private int ram;
	private Sim sim;
	public Sim getSim() {
		return sim;
	}
	public void setSim(Sim sim) {
		this.sim = sim;
	}
	public int getMobileId() {
		return mobileId;
	}
	public void setMobileId(int mobileId) {
		this.mobileId = mobileId;
	}
	public String getCompanyName() {
		return companyName;
	}
	public void setCompanyName(String companyName) {
		this.companyName = companyName;
	}
	public String getProcessor() {
		return processor;
	}
	public void setProcessor(String processor) {
		this.processor = processor;
	}
	public int getRam() {
		return ram;
	}
	public void setRam(int ram) {
		this.ram = ram;
	}
	
	
	
	
	

}
