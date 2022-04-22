package com.cm;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class NavtoActivityrecord extends LogintoGC {
	
	@Test
	public static void navToActivityrecordsection() throws InterruptedException {
		
		driver.findElement(By.id("btnClickActivityRecord")).click();
		Thread.sleep(4000);	
		
	}

}
