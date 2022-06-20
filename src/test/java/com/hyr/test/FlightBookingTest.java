package com.hyr.test;

import org.testng.annotations.Test;

public class FlightBookingTest {

	/*
	 * signUp Login SesrchForFlight BookFlight SaveTicket Logout
	 */

	@Test(priority = 1)
	public static void signUp() {
		System.out.println("SignUp Method..");
	}

	@Test
	public static void login() {
		System.out.println("Login Method..");
	}

	@Test(priority = -1)
	public static void searchFilght() {
		System.out.println("Search for flight method..");
	}

	@Test(priority = 4)
	public static void bookFlight() {
		System.out.println("Book Flight Method..");
	}

	@Test(priority = 5)
	public static void saveTicket() {
		System.out.println("save Ticket..");
	}

	@Test(priority = 5)
	public static void logOut() {
		System.out.println("Logout Method..");
	}

}
