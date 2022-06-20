package com.pacakge.Screenshots;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;

import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.annotations.DataProvider;

public class XLDataProvider {
	
	@DataProvider

	public static String[][] testData() throws Exception {
		
		File file = new File("./src/test/resources/LoginTestData.xlsx");
		System.out.println(file.exists());
		FileInputStream fis = new FileInputStream(file);
		XSSFWorkbook workBook = new XSSFWorkbook(fis);
		XSSFSheet sheet = workBook.getSheet("sheet1");
		int totalRows = sheet.getPhysicalNumberOfRows();
		int totalColoumns = sheet.getRow(0).getLastCellNum();
		System.out.println("TOTAL ROWS : " + totalRows);
		System.out.println("Total No. of Coloumns : " + totalColoumns);
		
		String[][] dataArray = new String[totalRows-1][totalColoumns];
		for(int i=0; i<totalRows-1; i++)
		{
			XSSFRow row = sheet.getRow(i+1);
			for(int j=0; j<totalColoumns; j++)
			{
				XSSFCell cell = row.getCell(j);
				DataFormatter df = new DataFormatter();
				dataArray[i][j]=df.formatCellValue(cell);
				
			}
		}
		return dataArray;

	}

}
