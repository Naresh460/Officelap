package test.test;

import java.io.IOException;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;
import io.github.bonigarcia.wdm.WebDriverManager;

public class ParallelExecution  {
	static WebDriver driver;
		
	
	@Test(dataProvider = "excel2dataprovider", dataProviderClass =DataSupplier.class )
	public void excelMultirecords(String Username, String Password) throws IOException, InterruptedException {
		WebDriverManager.chromedriver().setup();
		 driver = new ChromeDriver();
		driver.get("http://demowebshop.tricentis.com/") ; 
		driver.findElement(By.linkText("Log in")).click();
		driver.findElement(By.id("Email")).sendKeys(Username);
		driver.findElement(By.id("Password")).sendKeys(new String[]{Password});
		Thread.sleep(3000);
		driver.findElement(By.xpath("//input[@class='button-1 login-button']")).click();
		Thread.sleep(3000);
		driver.findElement(By.linkText("Log out")).click();
		Thread.sleep(2000);
		//driver.quit();


	}		

	

}



