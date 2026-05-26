package com.wipro.cws.entity;

public class Booking {
	private String bookingId;
	private String userId;
	private String centerId;
	private String packageId;
	private String date;
	private String timeSlot;
	private double totalFare;
	
	public Booking(String bookingId,String userId, String centerId, String packageId, String date, String timeSlot, double totalFare) {
		super();
		this.bookingId=bookingId;
		this.userId = userId;
		this.centerId = centerId;
		this.packageId = packageId;
		this.date = date;
		this.timeSlot = timeSlot;
		this.totalFare = totalFare;
	}
	public String getUserId() {
		return userId;
	}
	public void setUserId(String userId) {
		this.userId = userId;
	}
	public String getBookingId() {
		return bookingId;
	}
	public String getCenterId() {
		return centerId;
	}
	public void setCenterId(String centerId) {
		this.centerId = centerId;
	}
	public String getPackageId() {
		return packageId;
	}
	public void setPackageId(String packageId) {
		this.packageId = packageId;
	}
	public String getDate() {
		return date;
	}
	public void setDate(String date) {
		this.date = date;
	}
	public String getTimeSlot() {
		return timeSlot;
	}
	public void setTimeSlot(String timeSlot) {
		this.timeSlot = timeSlot;
	}
	public double getTotalFare() {
		return totalFare;
	}
	public void setTotalFare(double totalFare) {
		this.totalFare = totalFare;
	}
	

}
