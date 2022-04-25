package test.test;

import org.testng.annotations.*;

public class Annotationdemo {

	@Test
	public void testdemo() {
		System.out.println("Test");
		System.out.println("Test");
	}

	@BeforeMethod
	public void beforeMethod() {
		System.out.println("Before Method");
	}

	@AfterMethod
	public void afterMethod() {
		System.out.println("After Method");
	}

	@BeforeClass
	public void beforeClass() {
		System.out.println("Before Class");
	}

	@AfterClass
	public void afterClass() {
		System.out.println("After Class");
	}

	@BeforeTest
	public void beforeTest() {
		System.out.println("Before Test");
	}

	@AfterTest
	public void afterTest() {
		System.out.println("After test");
	}

	@BeforeSuite
	public void aeforeSuite() {
		System.out.println("Before Suite1");
	}

	@BeforeSuite
	public void afterSuite() {
		System.out.println("Before Suite2");
	}

}
