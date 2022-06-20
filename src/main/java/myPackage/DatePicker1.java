package myPackage;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;
import javaPackage.AcessModifiers2;

public class DatePicker1{

	public static void main(String[] args) {

		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.get("https://www.redbus.in/");

		String year = "2026";
		String month = "July";
		String date = "5";

		// Click on the date picker
		driver.findElement(By.xpath("//*[@id='onward_cal']")).click();

		while (true) {
			String monthYear = driver.findElement(By.xpath("//*[@class='monthTitle']")).getText();
			String arr[] = monthYear.split(" ");
			String mnth = arr[0];
			String yr = arr[1];

			if (mnth.equalsIgnoreCase(month) && yr.equals(year))
				break;
			
			else
				driver.findElement(By.xpath("//*[text()='>']")).click();
			}
		
		//Select the Date
		
		List<WebElement> allDates = driver.findElements(By.xpath("//table[@class='rb-monthTable first last']/tbody/tr/td"));
		for(WebElement dateEle : allDates)
		{
			String dt = dateEle.getText();
			if(dt.equals(date))
			{
				dateEle.click();
				break;
			}
		}

	}

}
