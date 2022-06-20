package com.pacakge.Screenshots;
import java.io.File;
import java.io.IOException;
import java.text.DateFormat;
import java.time.format.DateTimeFormatter;
import java.util.concurrent.TimeUnit;

import javax.swing.text.DateFormatter;

import org.apache.commons.io.FileUtils;
import org.joda.time.LocalDateTime;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Optional;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseTestClass {
	static WebDriver driver;
	
	@BeforeTest
	public static void launchBrowser(@Optional("chrome") String browserName)
	{
		switch (browserName) {
		case "chrome":
			WebDriverManager.chromedriver().setup();
			driver = new ChromeDriver();
			break;
			
		case "firefox":
			WebDriverManager.firefoxdriver().setup();
			driver = new FirefoxDriver();
			break;
			
		case "edge" : 
			WebDriverManager.edgedriver().setup();
			driver = new EdgeDriver();
			break;
		default:
			System.err.println("Invalid browser name...");
			break;
		}
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
		}
	@AfterMethod
	public static void screenshotCapture(ITestResult result)
	{
		if(result.getStatus() == ITestResult.FAILURE)
			System.out.println(result.getTestContext().getName() + "-" + result.getMethod().getMethodName() + ".jpg");
	}
		
@AfterTest
public static void tearDown()
{
	
driver.quit();
}
static String screenshotsSubFolderName;
public static void captureScreenshot(String fileName) throws Exception
{
		/*
		 if(screenshotsSubFolderName == null) { LocalDateTime myDateObj =
		 LocalDateTime.now();
		 
		 DateTimeFormatter myFormatterObj =
		 DateTimeFormatter.ofPattern("ddMMyyyyHHmmSS"); screenshotsSubFolderName =
		 myDateObj.format(myFormatterObj); }*/
		
	TakesScreenshot ts = (TakesScreenshot) driver;
	File src = ts.getScreenshotAs(OutputType.FILE);
	try
	{
	FileUtils.copyFile(src, new File("./screenshots/" +screenshotsSubFolderName+"/"+ fileName + ".png"));
	}
	catch (Exception e) {
	e.printStackTrace();
	}
	System.out.println("Scrrenshot done successfully...");

}
			
			

		
	

}
