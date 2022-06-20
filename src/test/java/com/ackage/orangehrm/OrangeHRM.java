package com.ackage.orangehrm;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import io.github.bonigarcia.wdm.WebDriverManager;

public class OrangeHRM {
	static WebDriver driver;
	static SoftAssert softAssert = new SoftAssert();

	@Parameters("BrowserName")
	@BeforeTest
	public static void initializeBrowser( @Optional("edge") String browserName) {
		switch (browserName.toLowerCase()) {
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
			System.err.println("Browser is Invalid");
			break;
		}
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	}

	@Parameters("URL")
	@Test(priority = 1)
	public static void launchApp(String url) {
		
		driver.get(url);
	}
@Parameters({"userName", "password"})
	@Test(priority = 2)
	public static void doLogin( String userName, String password) {
		driver.findElement(By.id("txtUsername")).sendKeys(userName);
		driver.findElement(By.id("txtPassword")).sendKeys(password);
		driver.findElement(By.id("btnLogin")).click();
	}

	@Test(priority = 3)
	public static void verifyLogin() {
		WebElement ele = driver.findElement(By.id("welcome"));
		System.out.println(ele.getText());
		String expectedText = "Welcome Paul";
		String actualText = ele.getText();
		softAssert.assertEquals(actualText, expectedText, "Text is mismatched..");

	}
	@Parameters("sleepTime")

	@Test(priority = 4)
	public static void navigateToLeave(String sleepTime) throws Exception {
		Thread.sleep(Long.valueOf(sleepTime));
		System.out.println(sleepTime);
		driver.findElement(By.id("menu_leave_viewLeaveModule")).click();
		Thread.sleep(5000);
	}

	@Test(priority = 5)
	public void verifyLeave() throws Exception {
		WebElement ele = driver.findElement(By.id("content"));
		Thread.sleep(5000);
		System.out.println(ele.isDisplayed());

	}

	@Test(priority = 6)
	public static void selectFromDate() {
		driver.findElement(By.id("calFromDate")).click();
		WebElement eleMonth = driver.findElement(By.xpath("//select[@class='ui-datepicker-month']"));
		Select drpMonth = new Select(eleMonth);
		drpMonth.selectByVisibleText("Aug");

		WebElement eleYear = driver.findElement(By.xpath("//select[@class='ui-datepicker-year']"));
		Select drpYear = new Select(eleYear);
		drpYear.selectByVisibleText("2022");

		String expectedDate = "5";

		List<WebElement> alldates = driver
				.findElements(By.xpath("//table[@class='ui-datepicker-calendar']/tbody/tr/td"));

		for (WebElement date : alldates) {
			if (date.getText().equals(expectedDate)) {
				date.click();
				break;
			}
		}

	}

	@Test(priority = 7)
	public static void selectToDate() {
		driver.findElement(By.id("calToDate")).click();

		WebElement eleMonth = driver.findElement(By.xpath("//*[@class='ui-datepicker-month']"));
		Select drpMonth = new Select(eleMonth);
		drpMonth.selectByVisibleText("Sep");

		WebElement eleYear = driver.findElement(By.xpath("//*[@class='ui-datepicker-year']"));
		Select drpYear = new Select(eleYear);
		drpYear.selectByVisibleText("2025");

		String expectedDate = "10";

		List<WebElement> allDates = driver
				.findElements(By.xpath("//table[@class='ui-datepicker-calendar']/tbody/tr/td"));

		for (WebElement dt : allDates) {
			if (dt.getText().equals(expectedDate)) {
				dt.click();
				break;
			}
		}

		WebElement toEle = driver.findElement(By.id("calToDate"));
		System.out.println(toEle.getText());

	}

	@AfterTest
	public void tearDown() throws Exception {
		Thread.sleep(5000);
		driver.quit();
		softAssert.assertAll();
	}

}
