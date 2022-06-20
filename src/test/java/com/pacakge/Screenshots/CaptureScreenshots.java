package com.pacakge.Screenshots;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Base64;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class CaptureScreenshots {

	public static void main(String[] args) throws Exception {
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.get("https://itera-qa.azurewebsites.net/");
		captureScreenshot(driver, "img1");
		driver.findElement(By.xpath("//a[text()='Test Automation']")).click();
		captureScreenshot(driver, "img2");
		driver.quit();

	}

	public static void captureScreenshot(WebDriver driver, String fileName) throws Exception
	{
		TakesScreenshot ts = (TakesScreenshot) driver;
		/*
		 * File src = ts.getScreenshotAs(OutputType.FILE); FileUtils.copyFile(src, new
		 * File("./screenshots/" + fileName + ".png"));
		 */
		/*String base64 = ts.getScreenshotAs(OutputType.BASE64);
		byte[] byteArr = Base64.getDecoder().decode(base64);
		File dest = new File("./screenshots/" + fileName + ".jpeg");
		FileOutputStream fos = new FileOutputStream(dest);
		fos.write(byteArr);
		fos.close();*/
		byte[] byteArray = ts.getScreenshotAs(OutputType.BYTES);
		FileOutputStream fos = new FileOutputStream(new File("./screenshots/" + fileName + ".jpg"));
		fos.write(byteArray);
		fos.close();
		System.out.println("Screenshot captured sucessfully....");
		
	}
}
