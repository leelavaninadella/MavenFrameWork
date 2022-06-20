package com.hyr.test;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.*;
import org.testng.asserts.SoftAssert;

import io.github.bonigarcia.wdm.WebDriverManager;

public class OrangeHrm1 {

	static WebDriver driver;
static	SoftAssert softassert = new SoftAssert();

	@Parameters("BrowserName")
	@BeforeTest
	public static void launchBrowser(String browserName) {
		switch (browserName) {
		case "chrome":
			WebDriverManager.chromedriver().setup();
			driver = new ChromeDriver();
			break;
		case "firefox":
			WebDriverManager.firefoxdriver().setup();
			driver = new FirefoxDriver();
			break;

		case "edge":
			WebDriverManager.edgedriver().setup();
			driver = new EdgeDriver();
			break;

		default:
			System.err.println("Invalid browser..");
			break;
		}
		
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
		
	}
	@AfterTest
	public static void tearDown() throws Exception
	{
		Thread.sleep(3000);
		driver.quit();
		//softassert.assertAll();
	}
	@Parameters("URL")
	@Test
	public static void openUrl(String url)
	{
		driver.get(url);
	}
	
	@Test(dataProvider = "testData", dataProviderClass = com.hyr.dpTests.XLDataSupplier.class)
	public static void doLogin(String userName, String password)
	{
		driver.findElement(By.id("txtUsername")).sendKeys(userName);
		driver.findElement(By.id("txtPassword")).sendKeys(password);
		driver.findElement(By.id("btnLogin")).click();
	}
	
	@Test
	public static void verifyLogin()
	{
		
		WebElement verifyLogin=driver.findElement(By.id("welcome"));
		softassert.assertTrue(verifyLogin.isDisplayed(), "Login page is not displayed");
	}

}
