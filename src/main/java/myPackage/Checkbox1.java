package myPackage;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Checkbox1 {
	
	public static void main(String[] args) throws Exception {
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://itera-qa.azurewebsites.net/");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//a[text()='Test Automation']")).click();
		List<WebElement> chkele = driver.findElements(By.xpath("//input[contains(@id,'day')]"));
		System.out.println("All Checkboxes : " + chkele.size());
		for(WebElement option : chkele)
		{
			String expectedResult="tuesday";
			String actualResult = option.getAttribute("id");
			if(actualResult.equalsIgnoreCase(expectedResult))
			{
				Thread.sleep(30);
				option.click();
				
				
				//System.out.println("The Selected Check Box is : " + option.getText());
				Thread.sleep(30);
				
				option.click();
				break;
			}
			
			
			if(actualResult.equals("monday") || actualResult.equals("friday") || actualResult.equals("wednesday"))
			{
				option.click();
				Thread.sleep(30);
				
			}
			
			
			
			
			
		}
		System.out.println("Successful");
		
		
		
	}

}
