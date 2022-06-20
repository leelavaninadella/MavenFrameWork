package myPackage;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class RadioButton1 {

	public static void main(String[] args) {

		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		
		driver.findElement(By.xpath("//*[text()='Create New Account']")).click();
		List<WebElement> radioEle = driver.findElements(By.xpath("//span[contains(@class,'5dba')]"));
		
		for(WebElement option :radioEle)
		{
			
			String expectedResult = "custom";
			
			if(option.getText().equalsIgnoreCase(expectedResult))
			{
				option.click();
				System.out.println("The Selected radio button is : " + option.getText());
				break;
			}
		}
		
		

	}

}
