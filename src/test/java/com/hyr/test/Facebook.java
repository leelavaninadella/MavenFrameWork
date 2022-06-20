package com.hyr.test;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.ITestResult;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Facebook {
	
	/* static WebDriver driver; */
	CaptureScreenShotOnFailure1 t1 = new CaptureScreenShotOnFailure1();
	
	
	@Test(priority = 1)
	
	public  void launchApp()
	{
		WebDriverManager.edgedriver().setup();
		CaptureScreenShotOnFailure1.driver = new EdgeDriver();
		CaptureScreenShotOnFailure1.driver.manage().window().maximize();
		CaptureScreenShotOnFailure1.driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		CaptureScreenShotOnFailure1.driver.get("https://www.facebook.com/");
	}
	
	@Test (priority = 2)
	
	public static void doLogin() throws Exception
	{
		CaptureScreenShotOnFailure1.driver.findElement(By.id("email")).sendKeys("abc@gmail.com");
		Thread.sleep(3000);
		CaptureScreenShotOnFailure1.driver.findElement(By.id("pass")).sendKeys("123456789");
		Thread.sleep(3000);
		CaptureScreenShotOnFailure1.driver.findElement(By.name("login1")).click();
		
	}
	
	@Test (priority = 3)
	public static void takeScreenshotOnFailure(ITestResult result) throws Exception
	{
		CaptureScreenShotOnFailure1.caputureScreenshot(result);
	}

}
