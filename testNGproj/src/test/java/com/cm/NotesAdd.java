package com.cm;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class NotesAdd extends LogintoGC{
	
	@Test
	public static void addNotes() throws InterruptedException {
		driver.findElement(By.id("btnHealthNotesAdd")).click();
		Thread.sleep(4000);	
		driver.findElement(By.id("selectHealthNoteType")).click();
		Thread.sleep(3000);	
		driver.findElement(By.xpath("//option[contains(text(),'General')]")).click();
		Thread.sleep(3000);	
		driver.findElement(By.id("txtNotes")).sendKeys("test notes");
		Thread.sleep(3000);	
		driver.findElement(By.id("btnHealthNotesSave")).click();
		
	}

}
