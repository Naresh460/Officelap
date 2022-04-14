package test.test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class testNgdemo1 {
	static WebDriver driver;

	@BeforeTest
	public void initiliazewindow() {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.manage().window().maximize();
	}

	@AfterTest
	public void closebrowser() {

		driver.quit();
	}

	@Test
	public void testing() {

		driver.get("https://opensource-demo.orangehrmlive.com");

	}

	@Test
	public void credentials() {
		driver.findElement(By.id("txtUsername")).sendKeys("admin");
		driver.findElement(By.id("txtPassword")).sendKeys("admin123");
		driver.findElement(By.id("btnLogin")).click();
	}

	@Test
	public void myinfo() {
		driver.findElement(By.id("menu_pim_viewMyDetails")).click();
	}

//	@Test
//	public void verifyinfo() {
//		System.out.println(driver.findElement(By.id("employee-details")).isDisplayed());
//	}

}
