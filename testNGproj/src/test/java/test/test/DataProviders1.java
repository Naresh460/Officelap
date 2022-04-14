package test.test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import io.github.bonigarcia.wdm.WebDriverManager;

public class DataProviders1 {
	static	WebDriver driver; 

	@Test (priority = 1)
	public static void main() {
		WebDriverManager.chromedriver().setup();	  
		driver = new ChromeDriver();			
		driver.manage().window().maximize();
		driver.get("http://demowebshop.tricentis.com");	
	}


	@Test (priority = 3, dataProvider = "dataProviders")
	public void excelMultirecords(String Username, String Password) throws InterruptedException  {
		driver.findElement(By.linkText("Log in")).click();
		driver.findElement(By.id("Email")).sendKeys(Username);
		driver.findElement(By.id("Password")).sendKeys(Password);
		Thread.sleep(5000);
		driver.findElement(By.xpath("//input[@class='button-1 login-button']")).click();
		Thread.sleep(5000);
		driver.findElement(By.linkText("Log out")).click();
		Thread.sleep(5000);			

	}

	@Test (priority = 2) @DataProvider() 
	public Object[][] dataProviders() {
		Object[][] data =new Object[2][2];
		data[0][0]="bluebird.460@gmail.com";
		data[0][1]="Nari@123";

		data[1][0]="blue.bird460@gmail.com";
		data[1][1]="Nari@123";

		return data;
	}
}

