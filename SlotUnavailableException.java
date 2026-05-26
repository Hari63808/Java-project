package com.wipro.cws.util;

public class SlotUnavailableException extends Exception {
 public SlotUnavailableException(String Message) {
	 super(Message);
 }
	@Override
    public String toString() {
        return "SlotUnavailableException: Selected slot is already booked!";
    }
}
