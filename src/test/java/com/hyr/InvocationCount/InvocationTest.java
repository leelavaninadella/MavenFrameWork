package com.hyr.InvocationCount;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class InvocationTest {
	
	@Test(invocationCount = 6, threadPoolSize = 2)
	
	public static void test1() throws Exception
	{
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.get("https://randomuser.me/");
		WebElement user = driver.findElement(By.xpath("//li[@data-label='name']"));
		user.click();
		WebElement userName = driver.findElement(By.xpath("//p[@id='user_value']"));
		Thread.sleep(3000);
		System.out.println("The user : " + userName.getText());
		WebElement email = driver.findElement(By.xpath("//li[@data-label='email']"));
		email.click();
		Thread.sleep(3000);
		System.out.println("The eamail : " + userName.getText());
		driver.quit();
		
		
	}

}
