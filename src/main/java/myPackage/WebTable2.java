package myPackage;

import java.text.NumberFormat;
import java.text.ParseException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class WebTable2 {
	static WebDriver driver;
	
	public static void main(String[] args) throws Exception {
		
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.get("https://money.rediff.com/gainers");
		//Locate the alloptions from current price coloumn
		List<WebElement> currentPriceAllOptions = driver.findElements(By.xpath("//table[@class='dataTable']/tbody/tr/td[4]"));
		System.out.println("The total elements in current price are : " + currentPriceAllOptions.size());
		ArrayList< Integer> array = new ArrayList<Integer>();
		for(int i=0;i<currentPriceAllOptions.size();i++)
		{
			String price = currentPriceAllOptions.get(i).getText();
			System.out.println(price);
			NumberFormat numberformat = NumberFormat.getInstance();
			Number num = numberformat.parse(price);
			price = num.toString();
					
			Double d = Double.parseDouble(price);
			
			int intprice = d.intValue();
			array.add(intprice);
			
		}
	Collections.sort(array);
	System.out.println(array);
	System.out.println(array.get(0));
	System.out.println(array.get(array.size()-1));
	}

}
