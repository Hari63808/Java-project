package com.wipro.cws.util;

public class CenterNotFoundException extends Exception {

    /**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Override
    public String toString() {
        return "CenterNotFoundException: Service center does not exist!";
    }
}