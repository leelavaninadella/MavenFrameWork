package myPackage;

import java.util.Arrays;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchFrameException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class NestedFrames {
	
	static WebDriver driver;
	
	public static void main(String[] args) {
		
		WebDriverManager.chromedriver().setup();
		ChromeOptions options = new ChromeOptions();
		options.setExperimentalOption("excludeSwitches", Arrays.asList("enable-automation"));
		WebDriver driver = new ChromeDriver(options);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.get("https://demoqa.com/nestedframes");
		
		int allFrames = driver.findElements(By.tagName("iframe")).size();
		System.out.println("Total frames are : " + allFrames);
		WebElement parentFrame = driver.findElement(By.id("frame1"));
		WebElement childFrame = driver.findElement(By.tagName("body"));
		driver.switchTo().frame(parentFrame).switchTo().frame(childFrame);
		System.out.println("Switch to child frame");
		driver.switchTo().defaultContent();
		
		
		driver.quit();
		
	
	}
	
	
	/*
	 * public static void switchToFrame(WebElement parentFrame, WebElement
	 * childFrame) {
	 * driver.switchTo().frame(parentFrame).switchTo().frame(childFrame);
	 * 
	 * 
	 * driver.switchTo().defaultContent();
	 * 
	 * 
	 * }
	 */
}
