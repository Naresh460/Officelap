package test.test;

import org.testng.annotations.Test;


public class GroupDependencies {
	
	@Test   (groups = "smoke")
	public void signup() {
		System.out.println("smoke1");
	}

	@Test (groups = "smoke")
	public void login1() {
		System.out.println("smoke2");
	}
	
	@Test (groups = "sanity")
	public void login2() {
		System.out.println("snaity");
	}
	
	@Test (groups = "regression")
	public void login() {
		System.out.println("regression");
	}

	@Test  (groups = "sanity")
	public void bookingPage() {
		System.out.println("sanity2");
	}

	@Test (groups = "smoke")
	public void selectRoute() {
		System.out.println("smoke3");
	}
}
