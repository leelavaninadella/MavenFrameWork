package myPackage;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Frame1 {
	public static void main(String[] args) throws Exception {

		// Lauch Chrome Browser
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.get("https://www.paytm.com/");
		// click on sign in button
		driver.findElement(By.xpath("//*[text()='Sign In']")).click();

		// find total no. frames on webpage
		int totalFrames = driver.findElements(By.tagName("iframe")).size();
		System.out.println(totalFrames);

		for (int i = 0; i < totalFrames; i++) {
			driver.switchTo().frame(i);
			Thread.sleep(3000);
			driver.findElement(By.xpath("//span[contains(text(),'Watch Video')]")).click();
			Thread.sleep(3000);
			driver.close();

		}
	}

}
