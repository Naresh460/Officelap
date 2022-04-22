package com.test;

import org.testng.annotations.Test;

public class PriorityTestNG {

	@Test (priority = 1)
	public void signup() {
		System.out.println("Signup");
	}
	
	@Test (priority = 2)
	public void login() {
		System.out.println("Login");
	}
	
	@Test (priority = 3)
	public void bookingPage() {
		System.out.println("BookingPage");
	}
	
	@Test (priority = 4)
	public void selectRoute() {
		System.out.println("Select route");
	}
}
