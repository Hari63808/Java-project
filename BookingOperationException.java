package com.wipro.cws.util;

public class BookingOperationException extends Exception {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Override
	public String toString() {
		return "BookingOperationException: Invalid booking operation!";
	}
}