package myPackage;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class CheckBox4 {

	public static void main(String[] args) {
		
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.get("https://itera-qa.azurewebsites.net/home/automation");
		
		List<WebElement> allChkBox = driver.findElements(By.xpath("//input[contains(@id,'day')]"));
		int totalChkBoxes = allChkBox.size();
		System.out.println("Total Check Boxes are: " + totalChkBoxes);
		
		//Select Monday,Wednesday & Friday Check Boxes
		
		for( int i=0; i<totalChkBoxes;i++)
		{
			String actualResult = allChkBox.get(i).getAttribute("id");
			if(actualResult.equals("monday")||actualResult.equals("wednesday")||actualResult.equals("friday"))
			{
				allChkBox.get(i).click();
			}
		}

	}

}
