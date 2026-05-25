package com.wipro.cws.main;
import java.util.ArrayList;
import com.wipro.cws.entity.*;
import com.wipro.cws.service.BookingService;
import com.wipro.cws.util.*;
public class Main {
 public static void main(String[] args) {
 ArrayList<User> users = new ArrayList<>();
 users.add(new User("U001", "Vikram", "9876543210"));
 users.add(new User("U002", "Aisha", "9123456780"));
 ArrayList<ServiceCenter> centers = new ArrayList<>();
 centers.add(new ServiceCenter("C101", "Sparkle Wash", "Chennai"));
 centers.add(new ServiceCenter("C202", "Clean Ride", "Bangalore"));
 ArrayList<Package> packages = new ArrayList<>();
 packages.add(new Package("P001", "Basic Wash", 300.0));
 packages.add(new Package("P002", "Premium Wash", 600.0));
 ArrayList<Booking> bookings = new ArrayList<>();
 BookingService service = new BookingService(users, centers, packages, bookings);
 try {
 Booking b1 = service.bookService("U001", "C101", "P002", "2025-09-20", "10 AM - 11 AM");
 System.out.println("Booking Successful! ID: " + b1.getBookingId());
 System.out.println("\n--- User Bookings (U001) ---");
 service.printUserBookings("U001");
 System.out.println("\nCancelling booking...");
 service.cancelBooking(b1.getBookingId());
 System.out.println("Booking Cancelled Successfully!");
 } catch (InvalidUserException | CenterNotFoundException |
 SlotUnavailableException | BookingNotFoundException |
 BookingOperationException ex) {
 System.out.println(ex);
 }
 catch (Exception ex) {
 System.out.println("Unexpected Error: " + ex);
 }
 }
}