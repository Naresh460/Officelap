package com.cm;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class AccessMember extends LogintoGC{
	
	@Test
	public static void accessMember() throws InterruptedException {
		
		driver.findElement(By.className("selectBox")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//li[contains(text(),'ALTRUISTA ID')]")).click();
		Thread.sleep(2000);
		driver.findElement(By.id("txtSearch")).sendKeys("ALT875107");
		Thread.sleep(2000);
		driver.findElement(By.className("findIcon")).click();
		Thread.sleep(4000);		
		
		
	}
	

}
