package com.hyr.dpTests;

import java.util.concurrent.TimeUnit;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class OrangeHRM {

	@Test(dataProvider = "testData", dataProviderClass = XLDataSupplier.class)
	
	public static void loginTest(String userName, String password)
	{
		WebDriverManager.edgedriver().setup();
		WebDriver driver = new EdgeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.get("https://opensource-demo.orangehrmlive.com/");
		driver.findElement(By.id("txtUsername")).sendKeys(userName);
		driver.findElement(By.id("txtPassword")).sendKeys(password);
		driver.findElement(By.id("btnLogin")).click();
		/*
		 * WebElement errorMessage = driver.findElement(By.id("spanMessage"));
		 * System.out.println(errorMessage.getText());
		 * System.out.println(errorMessage.isDisplayed());
		 */
		
		driver.quit();
	}
	
	


}
