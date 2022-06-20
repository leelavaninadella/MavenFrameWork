package myPackage;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class OpenNewTab {

	public static void main(String[] args) {
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--opennewwindow");
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver(options);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.get("https://www.facebook.com/");
		
		
		
		
		/*
		 * WebElement newtab = driver.findElement(By.tagName("body"));
		 * newtab.sendKeys(Keys.CONTROL+"T");
		 */
		
		JavascriptExecutor jse = (JavascriptExecutor) driver;
		 jse.executeScript("window.open()");
		 
		
		
		
	}

}
