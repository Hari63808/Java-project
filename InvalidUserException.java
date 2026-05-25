package com.wipro.cws.util;

public class InvalidUserException extends Exception {

    /**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Override
    public String toString() {
        return "InvalidUserException: User ID not found!";
    }
}