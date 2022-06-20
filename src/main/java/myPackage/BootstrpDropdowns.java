package myPackage;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BootstrpDropdowns {

	public static void main(String[] args) {
		
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
		driver.get("https://www.hdfcbank.com/");
		
		driver.findElement(By.xpath("//*[@class='drp1']")).click();
		List<WebElement> allProductTypeOptins = driver.findElements(By.xpath("//*[@class='dropdown open']/ul/li"));
		System.out.println("The total options in product type dropdown : " + allProductTypeOptins.size());
		String expectedValue = "Health Insurance";
		selectOptionFromDropdown(allProductTypeOptins,expectedValue );
		System.out.println("The selected value is : "+ expectedValue);
		
		driver.findElement(By.xpath("//*[@class='drp2']")).click();
		List<WebElement> allProductOptions = driver.findElements(By.xpath("//*[@class='dropdown open']/ul/li"));
		System.out.println("The total options from product dropdown : "+ allProductOptions.size());
		String expectedValueFromProduct = "Super Top-up Insurance";
		selectOptionFromDropdown(allProductOptions, expectedValueFromProduct);
		System.out.println("The selected value from product drop down is : "+expectedValueFromProduct);
		

	}
	
	public static void selectOptionFromDropdown(List<WebElement> options, String value)
	
	{
		for(WebElement option : options)
		{
			if(option.getText().equalsIgnoreCase(value))
			{
				option.click();
				break;
			}
		}
	}

}
