package com.hyr.dpTests;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Arrays;

import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.annotations.DataProvider;

public class XLDataSupplier {
@DataProvider()
	public static String[][] testData() throws Exception {

		File file = new File("./src/test/resources/LoginTestData.xlsx");
		System.out.println(file.exists());
		FileInputStream fis = new FileInputStream(file);
		XSSFWorkbook workBook = new XSSFWorkbook(fis);
		XSSFSheet sheet = workBook.getSheet("Sheet1");
//int totalRows = sheet.getLastRowNum();
		int totalRows = sheet.getPhysicalNumberOfRows();
		System.out.println(totalRows);
		int totalColumns = sheet.getRow(0).getLastCellNum();
		System.out.println(totalColumns);
		String[][] data = new String[totalRows-1][totalColumns];
		for(int i=0; i<totalRows-1; i++)
		{
			XSSFRow row = sheet.getRow(i+1);
			for(int j=0; j<totalColumns; j++)
			{
				
				DataFormatter df = new DataFormatter();
				
				XSSFCell cell = row.getCell(j);
				data[i][j] =df.formatCellValue(cell);
				
			}
			
		}
		
		workBook.close();
		fis.close();
		return data;
		
		
	}

}
