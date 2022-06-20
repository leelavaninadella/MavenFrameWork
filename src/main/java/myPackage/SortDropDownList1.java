package myPackage;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.Select;

import io.cucumber.java.it.E;
import io.github.bonigarcia.wdm.WebDriverManager;

public class SortDropDownList1 {

	public static void main(String[] args) {
		
		WebDriverManager.chromedriver().setup();
		ChromeOptions options = new ChromeOptions();
		options.setExperimentalOption("excludeSwitches", Arrays.asList("enable-automation"));
		WebDriver driver = new ChromeDriver(options);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.get("https://www.facebook.com/");
		driver.findElement(By.xpath("//*[@data-testid='open-registration-form-button']")).click();
		WebElement drpEle = driver.findElement(By.id("month"));
		Select ele = new Select(drpEle);
		List<WebElement> drpOptions = ele.getOptions();
		
		ArrayList originalList = new ArrayList();
		ArrayList tempList = new ArrayList();
		
		for(int i=0; i<drpOptions.size(); i++)
		{
			String alloptions = drpOptions.get(i).getText();
			originalList.add(alloptions);
			tempList.add(alloptions);
		}
		
		Collections.sort(tempList);
		
		if(originalList.equals(tempList))
		{
			System.out.println("DropDown Elements are sorted..");
		}
		else
		{
			System.out.println("DropDown Elements are not sorted..");
		}

	}

}
