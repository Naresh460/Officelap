package test.test;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;
import net.bytebuddy.build.Plugin.Factory.UsingReflection.Priority;

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
		 public void urlAccess(String url) {
			 driver.get(url);
			 
		 }
		
		@Parameters("text")
		@Test (priority = 3)
		 public void enterText(String textt) {
			 driver.findElement(By.name("q")).sendKeys(textt);
			 driver.findElement(By.name("btnK")).sendKeys(Keys.ENTER);
			 
			 			 
		 }
		
		
//		@AfterTest
//		 public void tearDown() {
//			 driver.quit();
//			 
//		 }
//		
}
