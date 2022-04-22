package com.cm;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LogintoGC {	
	
	static  WebDriver driver;
 
	@Test
	public static void loginGC() throws InterruptedException {
		 WebDriverManager.chromedriver().setup();
		 driver = new ChromeDriver();
		driver.manage().window().maximize();
			
		String valuee = "ahs_nbusireddy";
		driver.get("https://uph-uat.guidingcare.com/Portal/");
		driver.findElement(By.id("UserName")).sendKeys(valuee);  //sending element
		driver.findElement(By.id("Password")).sendKeys("Nari@1234567890");
		driver.findElement(By.id("btnLogin")).click();
		Thread.sleep(5000);
		
	}
	
	
}
