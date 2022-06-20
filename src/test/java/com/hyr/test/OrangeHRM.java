package com.hyr.test;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class OrangeHRM {
	static WebDriver driver;
	
	
	@BeforeTest
	public static void initializeBrowser()
	{
		WebDriverManager.firefoxdriver().setup();
		driver = new FirefoxDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	}
	
	@AfterTest
	public static void tearDown()
	{
		driver.quit();
	}

	@Test
	public  void launchApp() {
		
		driver.get("https://opensource-demo.orangehrmlive.com/");
	}

	@Test
	public  void enterLoginDetails() {
		driver.findElement(By.id("txtUsername")).sendKeys("Admin");
		driver.findElement(By.id("txtPassword")).sendKeys("admin123");
		driver.findElement(By.id("btnLogin")).click();
	}

	@Test
	public  void navigateToMyInfo() {
		driver.findElement(By.id("menu_pim_viewMyDetails")).click();
	}

	@Test
	public  void verifyMyInfo() {
		System.out.println(driver.findElement(By.xpath("//div[@id='employee-details']")).isDisplayed());
		
	}
	
	@Test
	public  void verifyLogin()
	{
		WebElement ele = driver.findElement(By.id("welcome"));
		System.out.println(ele.isDisplayed());
		System.out.println(ele.getText());
		
		
	}
}
