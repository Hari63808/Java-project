package com.wipro.cws.util;

public class SlotUnavailableException extends Exception {

    /**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Override
    public String toString() {
        return "SlotUnavailableException: Selected slot is already booked!";
    }
}