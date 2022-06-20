package AutomationPackage;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class CheckBox3 {

	public static void main(String[] args) {
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
		driver.get("https://itera-qa.azurewebsites.net/home/automation");
		
		List<WebElement> allCheckBox = driver.findElements(By.xpath("//*[contains(@id,'day')]"));
		System.out.println("The total check boxes are : " + allCheckBox.size());
		
		int totalCheckBoxes = allCheckBox.size();
		
		for(int i=0; i<totalCheckBoxes-4; i++)
		{
			allCheckBox.get(i).click();
		}
		
		for(int i=totalCheckBoxes-3; i<totalCheckBoxes; i++)
		{
			allCheckBox.get(i).click();
		}

	}

}
