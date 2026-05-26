package com.wipro.cws.util;

public class BookingOperationException extends Exception {
    public BookingOperationException(String Message) {
    	super(Message);
    }
	@Override
	public String toString() {
		return "BookingOperationException: Invalid booking operation!";
	}
}
