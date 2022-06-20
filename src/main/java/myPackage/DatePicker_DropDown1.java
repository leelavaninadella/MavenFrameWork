package myPackage;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import io.github.bonigarcia.wdm.WebDriverManager;

public class DatePicker_DropDown1 {
public static void main(String[] args) {
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver(); 
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.get("https://www.dummyticket.com/dummy-ticket-for-visa-application/");
		
		driver.findElement(By.xpath("//input[@id='dob']")).click(); //Click on DOB
		
		Select drpMonth = new Select(driver.findElement(By.xpath("//select[@class='ui-datepicker-month']")));
		drpMonth.selectByVisibleText("Oct");
		
		Select drpYear = new Select(driver.findElement(By.xpath("//select[@class='ui-datepicker-year']")));
		drpYear.selectByVisibleText("1994");
		
		String expectedDate = "5";
		
		
		List<WebElement> alldates=driver.findElements(By.xpath("//table[@class='ui-datepicker-calendar']/tbody/tr/td"));
		
		for(WebElement dt : alldates)
		{
			
			if(dt.getText().equals(expectedDate))
			{
				dt.click();
				break;
			}
		}	
		
	}

}
