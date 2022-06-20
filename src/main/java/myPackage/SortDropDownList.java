package myPackage;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.apache.hc.core5.util.Asserts;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class SortDropDownList {

	public static void main(String[] args) {
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.get("https://www.facebook.com/");
		driver.findElement(By.xpath("//*[@data-testid='open-registration-form-button']")).click();
		
		WebElement month= driver.findElement(By.xpath("//*[@id='month']"));
		Select drp = new Select(month);
		
		List<WebElement> alloptions = drp.getOptions();
		
		ArrayList originalList = new ArrayList();
		ArrayList tempList = new ArrayList();
		
		for(int i= 0; i<alloptions.size();i++)
		{
			String options = alloptions.get(i).getText();
			originalList.add(options);
			tempList.add(options);
			
		}
		
		Collections.sort(tempList);
		System.out.println(originalList);
		System.out.println(tempList);
		
		if(tempList.equals(originalList))
		{
			System.out.println("Options are sorted...");
		}
		else
		{
			System.out.println("options are not sorted....");
		}
		
		
		
		

	}

}
