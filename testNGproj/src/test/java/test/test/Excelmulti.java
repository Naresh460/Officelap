package test.test;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Excelmulti {
	
	static WebDriver driver;

	@Parameters({ "UserName", "Password" })
@Test
	public static void excelMultirecords(String Username, String Password) throws IOException, InterruptedException {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();	
		driver.manage().window().maximize();
		Thread.sleep(3000);
	  driver.get("http://demowebshop.tricentis.com/");			  
	  
		File file = new File("C:\\Users\\nbusireddy\\Selenium\\IDE.xlsx");
		FileInputStream fis = new FileInputStream(file);
		XSSFWorkbook workbook = new XSSFWorkbook(fis);
		XSSFSheet sheet = workbook.getSheet("Naresh");		
		int totalrows=	sheet.getPhysicalNumberOfRows();
		XSSFRow row = sheet.getRow(0);

		int col_num = -1;
		int col_num2=-1;

		for(int i=0; i < row.getLastCellNum(); i++)
		{
			if(row.getCell(i).getStringCellValue().trim().equals(Username))
				col_num = i;
			
		}
		for(int i=0; i < row.getLastCellNum(); i++)
		{
			if(row.getCell(i).getStringCellValue().trim().equals(Password))
				col_num2 = i;
			
		}
	//	row = sheet.getRow(r);

		for (int j=1; j<=totalrows; j++){

		      String   loginemail = sheet.getRow(j).getCell(col_num).getStringCellValue();		
			  String   loginpassword = sheet.getRow(j).getCell(col_num2).getStringCellValue();
			
			  driver.findElement(By.linkText("Log in")).click();
				driver.findElement(By.id("Email")).sendKeys(loginemail);
				driver.findElement(By.id("Password")).sendKeys(new String[]{loginpassword});
				Thread.sleep(5000);
				driver.findElement(By.xpath("//input[@class='button-1 login-button']")).click();
				Thread.sleep(5000);
				driver.findElement(By.linkText("Log out")).click();
				Thread.sleep(5000);
			
				
		}		
		
workbook.close();

	}
}


