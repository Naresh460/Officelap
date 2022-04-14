package test.test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class OptionalParameters {
	
	WebDriver driver;
	
	@Parameters("browserName")
	@Test	
	public void method1(@Optional("chrome") String browserName) {
		
		switch (browserName) {
		case "chrome":
			WebDriverManager.chromedriver().setup();
			 driver = new ChromeDriver();			
			break;
			
		case "edge":
			WebDriverManager.edgedriver().setup();
			 driver = new EdgeDriver();			
			break;

		default:
			break;			
			
		}
		
		driver.get("https://www.google.com");
		
	}

}
