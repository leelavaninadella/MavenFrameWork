package com.ackage.iteraqa;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.*;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class CheckBox1 {

	static WebDriver driver;

	@Parameters("BrowserName")
	@BeforeTest
	public void initializeBrowser(@Optional("firefox") String BrowserName) {
		switch (BrowserName.toLowerCase()) {
		case "chrome":
			WebDriverManager.chromedriver().setup();
			driver = new ChromeDriver();
			break;

		case "edge":
			WebDriverManager.edgedriver().setup();
			driver = new EdgeDriver();
			break;

		case "firefox":
			WebDriverManager.firefoxdriver().setup();
			driver = new FirefoxDriver();
			break;

		default:
			System.err.println("Invalid Browser");
			break;
		}

		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	}

	@AfterTest
	public static void tearDown() throws Exception {

		Thread.sleep(5000);
		driver.quit();
	}

	@Parameters("url")
	@Test
	public static void launchApp(String url) {
		driver.get(url);
	}

	@Test
	public static void clickOnCheckBox() throws Exception {
		List<WebElement> allChkEle = driver.findElements(By.xpath("//input[contains(@id,'day')]"));
		System.out.println("Total Check Box : " + allChkEle.size());
		for (int i = 0; i < allChkEle.size(); i++) {
			String actualResult = allChkEle.get(i).getAttribute("id");
			if (actualResult.equals("monday") || actualResult.equals("wednesday") || actualResult.equals("friday")) {
				Thread.sleep(5000);
				allChkEle.get(i).click();
				}
			}
		System.out.println("Clicked...");
		}
	@Ignore
	@Test
	public static void clickOnLast3CheckBox() throws Exception
	{
		List<WebElement> allChkEle = driver.findElements(By.xpath("//input[contains(@id,'day')]"));
		int totalCheckBox = allChkEle.size();
		for(int i=totalCheckBox-3; i<totalCheckBox; i++)
		{
			Thread.sleep(3000);
			allChkEle.get(i).click();
		}
		
	}
	@Test
	public static void clickOnFirst3CheckBoxes() throws Exception
	{
		List<WebElement> allChkEle = driver.findElements(By.xpath("//input[contains(@id,'day')]"));
		int totalCheckBox = allChkEle.size();
		for(int i=0; i<totalCheckBox-4; i++)
		{
			Thread.sleep(3000);
			allChkEle.get(i).click();
		}
	}
}
