package com.test;

import org.testng.annotations.Ignore;
import org.testng.annotations.Test;


public class IgnoreTestmethod {
	
	@Test  
	public void signup() {
		System.out.println("Signup");
	}

	@Test 
	public void login() {
		System.out.println("Login");
	}

	@Test 
	public void bookingPage() {
		System.out.println("BookingPage");
	}

	@Test 
	public void selectRoute() {
		System.out.println("Select route");
	}
}
