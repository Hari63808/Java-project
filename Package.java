package com.wipro.cws.entity;

public class Package {
	private String packageId;
	private String packageName;
	private double price;
	
	public Package(String packageId, String packageName, double price) {
		super();
		this.packageId = packageId;
		this.packageName = packageName;
		this.price = price;
	}
	public String getPackageId() {
		return packageId;
	}
	public void setPackageId(String packageId) {
		this.packageId = packageId;
	}
	public String getPackageName() {
		return packageName;
	}
	public void setPackageName(String packageName) {
		this.packageName = packageName;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	

}
