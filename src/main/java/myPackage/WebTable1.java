package myPackage;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class WebTable1 {
	static WebDriver driver;

	public static void main(String[] args) {
		
		
		//Launching Chrome browser
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.get("https://money.rediff.com/gainers");
		List<WebElement> allOptions = driver.findElements(By.xpath("//table[@class='dataTable']/tbody/tr/td/a"));
		System.out.println("Total Element :" + allOptions.size());
		
		
		//Locating current price coloumn
		List<WebElement> currentPriceOptions = driver.findElements(By.xpath("//table[@class='dataTable']/tbody/tr/td[4]"));
		
		String expectedCompanyName = "Vanta Bioscience";
		
		for(int i=0; i<allOptions.size(); i++)
		{
			if(allOptions.get(i).getText().equalsIgnoreCase(expectedCompanyName))
			{
				System.out.println(allOptions.get(i).getText() + "===" + currentPriceOptions.get(i).getText());
				System.out.println("The selected company name is : " + allOptions.get(i).getText());
				allOptions.get(i).click();
				break;
			}
		}
		
			
			
			
		
		
		
		
		
		

	}

}
