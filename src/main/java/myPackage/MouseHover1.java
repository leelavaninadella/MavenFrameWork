package myPackage;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class MouseHover1 {

	public static void main(String[] args) throws Exception {

		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.get("https://www.flipkart.com/");
		Thread.sleep(3000);
		driver.findElement(By.xpath("/html[1]/body[1]/div[2]/div[1]/div[1]/button[1]")).click();

		WebElement fashion = driver.findElement(By.xpath("//div[contains(@class,'xtXmba')][text()='Fashion']"));

		Actions action = new Actions(driver);
		action.moveToElement(fashion).build().perform();
		action.clickAndHold(fashion).build().perform();

		Thread.sleep(3000);
		driver.findElement(By.xpath(
				"/html[1]/body[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[4]/a[1]/div[2]/div[2]/div[2]/div[1]/div[1]/div[1]/a[3]"))
				.click();
		
		action.release(fashion).build().perform();
		

		/*
		 * WebElement home = driver.findElement(By.xpath("//*[text()='Home')"));
		 * action.moveToElement(home).build().perform();
		 * driver.findElement(By.xpath("//*[text()='Living Room']")).click();
		 * System.out.println("Living room clicked.......");
		 */
	}

}
