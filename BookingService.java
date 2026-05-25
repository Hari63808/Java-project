package com.wipro.cws.service;
import com.wipro.cws.entity.*;
import com.wipro.cws.util.*;
import java.util.ArrayList;

public class BookingService {
	private ArrayList<User> users;
	private ArrayList<ServiceCenter> centers;
	private ArrayList<Package> packages;
	private ArrayList<Booking> bookings;
	public BookingService(ArrayList<User> users, ArrayList<ServiceCenter> centers, ArrayList<Package> packages,
			ArrayList<Booking> bookings) {
		super();
		this.users = users;
		this.centers = centers;
		this.packages = packages;
		this.bookings = bookings;
	}

	public boolean validateUser(String userId) throws InvalidUserException{
		for(User user:users)
		{
		if(user.getUserId().equals(userId))
		{
			return true;
		}
		}
		throw new InvalidUserException("Invalid User"); 
	}
	public ServiceCenter findCenter(String centerId)throws CenterNotFoundException{
		for(ServiceCenter center : centers) {
			if(center.getCenterId().equals(centerId))
			{
				return center;
			}
		}
		throw new CenterNotFoundException("Center not found");
	}
	public Package findPackage(String packageId) throws BookingOperationException{
		for(Package package1: packages)
		{
			if(package1.getPackageId().equals(packageId))
			{
				return package1;
			}
		}
		throw new BookingOperationException("Package Not Available");
	}
	public boolean checkSlotAvailability(String centerId,String date, String timeSlot) throws
			SlotUnavailableException{
		   for(Booking booking: bookings)
		   {
			   if(!booking.getCenterId().equals(centerId)&&!booking.getDate().equals(date)&&!booking.getTimeSlot().equals(timeSlot)) {
				   return true;
			   }
		   }
		   throw new SlotUnavailableException("Slot Unavailable");
		
	}
	public Booking bookService(String userId, String centerId, String packageId, String date, String
			timeSlot) throws Exception{
		boolean validateuser= validateUser(userId);
		ServiceCenter findcenter= findCenter(centerId);
		boolean checkslot = checkSlotAvailability(centerId,date,timeSlot);
		Package findpackage= findPackage(packageId);
		boolean checkpackage=true;
		double totalFare = calculateFare(findpackage);
		if(validateuser&&checkslot&&checkpackage)
		{
		 Booking booking =new Booking("1#2d343r",userId,centerId,packageId,date,timeSlot,totalFare);	
		}
		    
	}
	private double calculateFare(Package pkg)
	{
		return pkg.getPrice();
	}
	public void cancelBooking(String bookingId) throws
			BookingNotFoundException{
		for(Booking booking : bookings )
		{
			if(booking.getBookingId().equals(bookingId))
			{
				bookings.remove(booking);
				return ;
			}
		}
		throw new BookingNotFoundException("Booking not found");
	}
	public void printUserBookings(String userId) {
		for(Booking booking : bookings )
		{
			if(booking.getUserId().equals(userId))
			{
				System.out.println("Center Id :"+booking.getCenterId()+"Date :"+booking.getDate()+"Time :"+booking.getTimeSlot()+"Package Id:"+booking.getPackageId());
			}
		}
	}
	public void printCenterSchedule(String centerId,
	String date) {
		for(Booking booking:bookings) {
			if(booking.getCenterId().equals(centerId)&&booking.getDate().equals(date)) {
				System.out.println("booking Id"+booking.getBookingId());
			}
		}
	}
}
