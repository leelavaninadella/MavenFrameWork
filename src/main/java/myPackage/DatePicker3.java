package myPackage;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DatePicker3 {

	public static void main(String[] args) {
		
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
		driver.get("https://www.abhibus.com/");
		
		driver.findElement(By.xpath("//input[@id='datepicker1']")).click();
		
		String expectedYear = "2022";
		String expectedMonth = "March";
		String expectedDate = "9";
		
		List<WebElement> allMonthYearOptions = driver.findElements(By.xpath("//div[@class='ui-datepicker-title']"));
		String[] array ;
		for(int i=0;i<allMonthYearOptions.size();i++)
		{
			String monthYear = allMonthYearOptions.get(i).getText();
			System.out.println(monthYear);
			/*
			 * array = monthYear.split(" "); System.out.println(array[i]);
			 * System.out.println(array.length);
			 */
			/*
			 * if(monthYear.equalsIgnoreCase(expectedMonth+expectedYear) ) break; else
			 * driver.findElement(By.xpath("//span[text()='Next']")).click();
			 */
		
		}
		
		
		

	}

}
