package test.test;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.annotations.DataProvider;

public class DataSupplier {

	

	@DataProvider(name="data values")
	public String[] dataProvider() {   // if String return type
		String[] data = new String[] {
				"Naresh",
				"Suresh",
				"Mahesh"				
		};
		return data;		
	}
	
	@DataProvider(name="data values2")
	public String[] dataProvider2() {   // if String return type
		String[] data = new String[] {
				"Naresh2",
				"Suresh2",
				"Mahesh2"				
		};
		return data;		
	}
	
	@DataProvider
	public String[][] excel2dataprovider() throws IOException {
		File file = new File("C:\\Users\\nbusireddy\\Selenium\\IDE.xlsx");
		FileInputStream fis= new FileInputStream(file);
		XSSFWorkbook workbook = new XSSFWorkbook(fis);
		XSSFSheet sheet = workbook.getSheet("Naresh");
		int noOfRows = sheet.getPhysicalNumberOfRows();
		int cellcount= sheet.getRow(0).getLastCellNum();

		String[][] data = new String[noOfRows-1][cellcount];
		for (int i =0; i <noOfRows-1;i++) {
			for (int j = 0; j < cellcount; j++) {

				DataFormatter df = new DataFormatter();
				data[i][j] =df.formatCellValue(sheet.getRow(i+1).getCell(j));

			}
		}

		
		workbook.close();
		fis.close();
		return data;


	}

}
