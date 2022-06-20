package AutomationPackage;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class RadioButton1 {

	public static void main(String[] args) throws Exception {
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
		driver.get("https://www.facebook.com/");
		driver.findElement(By.xpath("//a[@data-testid='open-registration-form-button']")).click();
		
		//1st way to handle radio button
		Thread.sleep(3000);
		driver.findElement(By.xpath("//input[@value='1']")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//input[@value='2']")).click();
		/*
		 * Thread.sleep(3000);
		 * driver.findElement(By.xpath("//input[@value='-1']")).click();
		 */

		
		//2nd way to select radio button
		List<WebElement> allRadios = driver.findElements(By.xpath("//input[@name='sex']"));
		System.out.println("The total radio buttons : " + allRadios.size());
		
		for(int i=0; i<allRadios.size(); i++)
		{
			if(allRadios.get(i).getText().equalsIgnoreCase("Female"))
			{
				allRadios.get(i).click();
				break;
			}
		}
	}

}
