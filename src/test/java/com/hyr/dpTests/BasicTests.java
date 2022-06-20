package com.hyr.dpTests;

import java.util.Arrays;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;


public class BasicTests {
	static WebDriver driver;

	@Test(dataProvider = "LoginTestData")
	public static void testLogin(String userName, String password) throws Exception {
		WebDriverManager.chromedriver().setup();
		ChromeOptions options = new ChromeOptions();
		options.setExperimentalOption("excludeSwitches", Arrays.asList("enable-automation"));
		driver = new ChromeDriver(options);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.get("https://opensource-demo.orangehrmlive.com/");
		driver.findElement(By.id("txtUsername")).sendKeys(userName);
		driver.findElement(By.id("txtPassword")).sendKeys(password);
		driver.findElement(By.id("btnLogin")).click();
		//Assert.assertTrue(driver.findElement(By.id("welcome")).isDisplayed());
	WebElement errorMessage =	driver.findElement(By.id("spanMessage"));
	System.out.println(errorMessage.getText());
	System.out.println(errorMessage.isDisplayed());
		Thread.sleep(3000);
		driver.quit();
		
}
	@DataProvider(name = "LoginTestData", parallel = true)
	public static Object[][] testData()
	{
		Object[][] loginData = new Object[8][2] ;
		
		loginData[0][0]="Admin";
		loginData[0][1]="admin123";
		
		loginData[1][0]="Admin";
		loginData[1][1]="123";
		
		loginData[2][0]="User";
		loginData[2][1]="Admin";
		
		loginData[3][0]="User";
		loginData[3][1]="123";
		
		loginData[4][0]="pod";
		loginData[4][1]="admin123";
		
		loginData[5][0]="Admin";
		loginData[5][1]="pod123";
		
		loginData[6][0]="User";
		loginData[6][1]="userAdmin";
		
		loginData[7][0]="123User";
		loginData[7][1]="123";
		
		return loginData;
	}

}
