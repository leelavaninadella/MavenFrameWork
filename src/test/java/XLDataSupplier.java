import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.annotations.DataProvider;

public class XLDataSupplier {

	@DataProvider()
	public static String[][] testData() throws IOException {

		File file = new File("./src/test/resources/LoginTestData.xlsx");
		System.out.println(file.exists());
		
		FileInputStream fis = new FileInputStream(file);
		XSSFWorkbook workbook = new XSSFWorkbook(fis);
		XSSFSheet sheet = workbook.getSheet("sheet1");
		int totalRows = sheet.getPhysicalNumberOfRows();
		int totalColumns = sheet.getRow(0).getLastCellNum();
		System.out.println(totalRows);
		System.out.println(totalColumns);
		String[][] data = new String[totalRows-1][totalColumns];
		for(int i=0; i<totalRows-1; i++)
		{
			XSSFRow row = sheet.getRow(i+1);
			for(int j=0; j<totalColumns; j++)
			{
				XSSFCell cell = row.getCell(j);
				DataFormatter df = new DataFormatter();
				data[i][j] = df.formatCellValue(cell);
				
				
				
			}
			System.out.println("*******************************");
		}
		return data;

	}

}
