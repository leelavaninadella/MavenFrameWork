package myPackage;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class WebTable4 {
	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		ChromeOptions  options = new ChromeOptions();
	//	options.setExperimentalOption("excludeSwitches", new String[] {"eanble-automation"});
		//options.setExperimentalOption("excludeSwitches", Arrays.asList("enable-automation"));
		//options.setExperimentalOption("excludeSwitches", Collections.singleton("enable-automation"));
		//options.setExperimentalOption("excludeSwitches", Collections.singletonList("enable-automation"));
		
		List<String> eSwitches = new ArrayList<String>();
		eSwitches.add("enable-automation");
		options.setExperimentalOption("excludeSwitches", eSwitches);
		WebDriver driver = new ChromeDriver(options);
		
		driver.manage().window().maximize();
		Dimension d = new Dimension(0, 300);
		driver.manage().window().setSize(d);
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.get("https://money.rediff.com/gainers");
		driver.navigate().refresh();
		
		List<WebElement> allCompaies = driver.findElements(By.xpath("//table[@class='dataTable']/tbody/tr/td/a"));
		System.out.println(allCompaies.size());
		
		List<WebElement> currentPriceEle = driver.findElements(By.xpath("//table[@class='dataTable']/tbody/tr/td[4]"));
		System.out.println("The total elements are : " + currentPriceEle.size());
		
		for(int i=0; i<allCompaies.size(); i++)
		{
			if(allCompaies.get(i).getText().equalsIgnoreCase("Birla Cable"))
			{
				allCompaies.get(i).click();
				driver.navigate().refresh();
				System.out.println(allCompaies.get(i).getText() + " ===" + currentPriceEle.get(i).getText());
			}
		}
		
	}

}
