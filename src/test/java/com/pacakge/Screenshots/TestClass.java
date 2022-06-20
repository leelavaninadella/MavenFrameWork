package com.pacakge.Screenshots;

import static org.testng.Assert.assertEquals;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.testng.annotations.Test;
import org.testng.Assert.*;

public class TestClass extends BaseTestClass {

	@Test()
	public static void testGoogle() {
		driver.get("https://www.google.com/");
		driver.findElement(By.name("q")).sendKeys("HYR Tutorials", Keys.ENTER);
		String expectedTitle = "HYR Tutorials - Google Search1";
		String actualTitle = driver.getTitle();
		assertEquals(actualTitle, expectedTitle, "Title is mismatch");
		
	}

	
	@Test()
	public static void testFacebook()
	{
		driver.get("https://www.facebook.com");
		driver.findElement(By.id("email")).sendKeys("abc@gmail.com");
		driver.findElement(By.id("pass")).sendKeys("1234561");
		driver.findElement(By.name("login")).click();
		
	}
	
	@Test(dataProvider = "testData", dataProviderClass = XLDataProvider.class)
	public static void testOrangeHRM(String userName, String password)
	{
		driver.get("https://opensource-demo.orangehrmlive.com/");
		driver.findElement(By.id("txtUsername")).sendKeys(userName);
		driver.findElement(By.id("txtPassword")).sendKeys(password);
		driver.findElement(By.id("btnLogin")).click();
	}
	
	
	
}
