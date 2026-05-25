package com.wipro.cws.util;

public class BookingNotFoundException extends Exception {

    /**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Override
    public String toString() {
        return "BookingNotFoundException: Booking ID not found!";
    }
}