package com.test;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Parametersdemo {

	 WebDriver driver;
		//I want to open browser based on the Parameters
		
		@Parameters("browserName")
	  @Test (priority = 1)
	  public void browserDetails(String browserName) throws InterruptedException {
		  
		  switch (browserName) {
		case "chrome":
		WebDriverManager.chromedriver().setup();
		driver=new ChromeDriver();
		Thread.sleep(3000);
			break;
			
		case "firefox":
			WebDriverManager.firefoxdriver().setup();
			driver=new FirefoxDriver();
				break;
		case "edge":
			WebDriverManager.edgedriver().setup();
			driver=new EdgeDriver();
				break;

		default:
			break;
		}
		  
		  
	  }
		
		@Parameters("url")
		@Test (priority = 2)
		 public void urlAccess(String url) throws InterruptedException {
			Thread.sleep(2000);
			 driver.get(url);
			 Thread.sleep(2000);
		 }
		
		@Parameters("text")
		@Test (priority = 3)
		 public void enterText(String textt) throws InterruptedException {
			 driver.findElement(By.name("q")).sendKeys(textt);
			 Thread.sleep(2000);
			 driver.findElement(By.name("btnK")).submit();
			 
			 			 
		 }
		
		
//		@AfterTest
//		 public void tearDown() {
//			 driver.quit();
//			 
//		 }
//		
}
