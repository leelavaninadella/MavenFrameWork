package assertpackage;

import static org.testng.Assert.assertEquals;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class OrangeHRm {

	@Test

	public static void assertCheck() {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.get("https://www.facebook.com");

		driver.findElement(By.id("email")).sendKeys("abc@gmail.com");
		driver.findElement(By.id("pass")).sendKeys("123456");
		driver.findElement(By.name("login")).click();
String expectedResult = "You can't log in at the moment\r\n" + 
		"To help keep your account safe, we've temporarily locked it. Before you try logging in again, check your login info and make sure that you're using your usual device on a secure network.";

		String actualResult = driver.findElement(By.xpath("//div[@id='error_box']")).getText();

		assertEquals(actualResult, expectedResult, "Not matched");

	}

}
