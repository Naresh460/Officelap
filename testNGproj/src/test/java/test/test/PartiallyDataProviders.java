package test.test;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import io.github.bonigarcia.wdm.WebDriverManager;

public class PartiallyDataProviders {
	@Test (dataProvider = "data values")
	public void method1(String name) {		
		System.out.println("Name is-->" +name);
	}
	
	@DataProvider(name="data values",indices = {0,2})
	public String[] dataProvider() {   // if String return type
		String[] data = new String[] {
				"Naresh",
				"Suresh",
				"Mahesh"				
		};
		return data;		
	}
	

}

