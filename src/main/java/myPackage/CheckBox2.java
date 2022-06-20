package myPackage;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class CheckBox2 {

	public static void main(String[] args) throws InterruptedException {
		
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.get("https://itera-qa.azurewebsites.net/home/automation");
		driver.manage().window().maximize();
		List<WebElement> alloptins = driver.findElements(By.xpath("//input[contains(@id,'day')]"));
		System.out.println("The total elements are : " + alloptins.size() );
		
		int totalElements = alloptins.size();
		
		for(int i=totalElements-3; i<totalElements; i++)
		{
			alloptins.get(i).click();
			
			
		}
		
		for(int j=0; j<2; j++)
		{
			alloptins.get(j).click();
		}
		

	}

}
