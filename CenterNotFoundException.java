package com.wipro.cws.util;

public class CenterNotFoundException extends Exception {
   public CenterNotFoundException(String Message){
    super(Message);
   }
	@Override
    public String toString() {
        return "CenterNotFoundException: Service center does not exist!";
    }
}
