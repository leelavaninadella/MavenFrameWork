package com.hyr.test;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import io.github.bonigarcia.wdm.WebDriverManager;

public class HardAsserions {
	
	static WebDriver driver;
	CaptureScreenShotOnFailure1 t1 = new CaptureScreenShotOnFailure1();
	static SoftAssert softAssert = new SoftAssert();

	@Test(priority = 1)
	public static void launchApp() {
		WebDriverManager.firefoxdriver().setup();
		driver = new FirefoxDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.get("https://www.facebook.com/");
	}

	@Test(priority = 2)
	public static void doLogin() {
		driver.findElement(By.id("email")).sendKeys("abc@gmail.com", Keys.ENTER);
	}

	@Test(priority = 3)
	public static void verifyLogin() {
		// Verify Title
		String expectedResult = "Facebook – log in or sign up";
		String actualResult = driver.getTitle();
		softAssert.assertEquals(actualResult, expectedResult, "Title is Mismatch..");

		// Verify URL
		String expectedURL = "https://www.facebook.com/";
		String actualURL = driver.getCurrentUrl();
		softAssert.	assertEquals(actualURL, expectedURL, "URL is Msmatched..");

		// Verify Text
		String expectedText = "abc@gmail.com";
		String actualText = driver.findElement(By.id("email")).getAttribute("value");
		softAssert.	assertEquals(actualText, expectedText, "Text is Msmatched..");

		// Verify Error Message
		String expectedMeseage = "You can't log in at the moment\r\n" + 
				"To help keep your account safe, we've temporarily locked it. Before you try logging in again, check your login info and make sure that you're using your usual device on a secure network.";
		String actualMessage = driver.findElement(By.id("error_box")).getText();
		softAssert.assertEquals(actualMessage, expectedMeseage, "Message is Msmatched..");
		driver.quit();
		softAssert.assertAll();
	}

}
