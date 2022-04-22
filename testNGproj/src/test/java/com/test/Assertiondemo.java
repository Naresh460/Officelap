package com.test;

import static org.testng.Assert.*;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import com.github.dockerjava.api.model.Driver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Assertiondemo {
	static WebDriver driver;	
	@Test
	public  void assertion() {
	WebDriverManager.chromedriver().setup();
	driver = new ChromeDriver();		
	driver.manage().window().maximize();
	driver.get("https://opensource-demo.orangehrmlive.com");
	String actualresults = driver.getTitle();	
	String expectedresults="OrangeHRMss";
	assertEquals(actualresults, expectedresults, "Results mismatched");  //Hard Assert
	
	driver.quit();
}
	@Test
	public void softAssertion(){
		SoftAssert softassertion = new SoftAssert();
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();		
		driver.manage().window().maximize();
		driver.get("https://facebook.com");
		driver.findElement(By.name("email")).sendKeys("Naresh");
		driver.findElement(By.name("login")).click();
		
		//Title Assertion		
		String actualTitle = driver.getTitle();
		String expectedTitle="Log in to facebook";
		softassertion.assertEquals(actualTitle, expectedTitle, "Titile Mismatch");
		
		//URL assertion
		
		String actualURL = driver.getCurrentUrl();		
		String expectedURL="https://www.facebook.com/login/?privacy_mutation_token=";
		softassertion.assertEquals(actualTitle, expectedTitle, "URL Mismatch");
		
		
		//Error message
		String actualError = driver.findElement(By.id("error_box")).getAttribute("value");
		String expectedError="You can't log in at the moment";
		softassertion.assertEquals(actualTitle, expectedTitle, "Error Mismatch");
		
		//Border Assert
		String actualBorder= driver.findElement(By.id("error_box")).getCssValue("pam _3-95 _9ay3 uiBoxRed");
				
		String expectedBorder="border: 1px solid #dd3c10";
		softassertion.assertEquals(actualTitle, expectedTitle, "Error Mismatch");
		driver.quit();
	}
	}


