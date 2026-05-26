package com.wipro.cws.util;

public class InvalidUserException extends Exception {
    public InvalidUserException(String Message) {
    	super(Message);
    }
	@Override
    public String toString() {
        return "InvalidUserException: User ID not found!";
    }
}
