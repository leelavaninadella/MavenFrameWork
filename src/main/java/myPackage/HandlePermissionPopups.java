package myPackage;

import java.util.HashMap;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class HandlePermissionPopups {

	public static void main(String[] args) throws Exception {
		ChromeOptions options = new ChromeOptions();

		/*
		 * HashMap<String, Integer> contentSettings = new HashMap<String, Integer>();
		 * HashMap<String, Object> profiles = new HashMap<String, Object>();
		 * HashMap<String, Object> prefs = new HashMap<String, Object>();
		 * 
		 * 
		 * contentSettings.put("notifications", 1);
		 * profiles.put("managed_default_content_settings", contentSettings);
		 * prefs.put("profiles", profiles); options.setExperimentalOption("prefs",
		 * prefs);
		 */

		WebDriverManager.chromedriver().setup();

		options.addArguments("disable-notifications");
		WebDriver driver = new ChromeDriver(options);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.get("https://www.hdfcbank.com/");
		
		
		//For product Type
		driver.findElement(By.xpath("//div[@class='drp1']")).click();
		List<WebElement> alloptions=driver.findElements(By.xpath("//div[@class='dropdown open']/ul/li"));
		for(WebElement option : alloptions)
		{
			if(option.getText().equals("Life Insurance"))
			{
				Thread.sleep(3000);
				option.click();
				break;
			}
		}
		
		//For product
		driver.findElement(By.xpath("//div[@class='drp2']")).click();
		List<WebElement> allProductOptions=driver.findElements(By.xpath("//div[@class='dropdown open']/ul/li"));
		
		for(WebElement option : allProductOptions)
		{
			if(option.getText().equals("Investment Plan"))
			{
				option.click();
				break;
			}
		}
		
		
	}

}
