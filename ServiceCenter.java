package com.wipro.cws.entity;

public class ServiceCenter {
    private String centerId;
    private String centerName;
    private String location;
    
	public ServiceCenter(String centerId, String centerName, String location) {
		super();
		this.centerId = centerId;
		this.centerName = centerName;
		this.location = location;
	}
	public String getCenterId() {
		return centerId;
	}
	public void setCenterId(String centerId) {
		this.centerId = centerId;
	}
	public String getCenterName() {
		return centerName;
	}
	public void setCenterName(String centerName) {
		this.centerName = centerName;
	}
	public String getLocation() {
		return location;
	}
	public void setLocation(String location) {
		this.location = location;
	}
    
}
