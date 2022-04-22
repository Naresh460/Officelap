package com.shushil;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;
import io.reactivex.rxjava3.functions.Action;

public class SuushulPage2 {
	
	@Test
	public static void page2() {
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("http://codewithsushil.in/2.01alert.html");
		driver.findElement(By.xpath("//div[@class=\"container\"]/button[2]")).click();
		driver.switchTo().alert().accept();
		driver.findElement(By.partialLinkText("Next")).click();
		String parentwindow = driver.getWindowHandle();
		driver.findElement(By.xpath("//div[@class=\"container\"]/button[2]")).click();
		Set<String> childwindows = driver.getWindowHandles();
		for (String child : childwindows) {
			if(!child.equals(parentwindow)) {
				driver.switchTo().window(child);
				driver.close();
			}
		}
		
		driver.switchTo().window(parentwindow);
		driver.findElement(By.partialLinkText("Next")).click();
		driver.findElement(By.xpath("//body/div[2]/div[1]/iframe[1]")).click();
		driver.switchTo().alert().accept();
		driver.findElement(By.partialLinkText("Next")).click();
		String tooltip = driver.findElement(By.xpath("//div[@class=\"container\"]/h3/a")).getAttribute("title");
		driver.findElement(By.name("mouseovertext")).sendKeys(tooltip);
		driver.findElement(By.partialLinkText("Next")).click();
		Actions builder = new Actions(driver);
		WebElement element = driver.findElement(By.name("resizeArea"));
		JavascriptExecutor executor = (JavascriptExecutor) driver;
		executor.executeScript("arguments[0].setAttribute('style', 'WIDTH:1259px;HEIGHT:150px');", element);
		driver.findElement(By.partialLinkText("Next")).click();
		
	}
	
	@Test
	public void testmethod() throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("http://codewithsushil.in/2.05resize.html");		
		
			}

}
