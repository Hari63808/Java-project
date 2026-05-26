package com.wipro.cws.util;

public class BookingNotFoundException extends Exception {
public BookingNotFoundException(String Message) {
	super(Message);
}
	@Override
    public String toString() {
        return "BookingNotFoundException: Booking ID not found!";
    }
}
