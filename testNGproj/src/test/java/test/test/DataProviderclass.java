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

public class DataProviderclass {
	@Test (dataProvider = "data values2", dataProviderClass = DataSupplier.class)
	public void method1(String name) {		
		System.out.println("Name is-->" +name);
	}
	
}

