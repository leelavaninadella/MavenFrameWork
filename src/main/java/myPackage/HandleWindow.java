package myPackage;

import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class HandleWindow {

	public static void main(String[] args) throws Exception {

		// Launching ChromeDriver
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.get("https://opensource-demo.orangehrmlive.com/");
		driver.findElement(By.xpath("//a[text()='OrangeHRM, Inc']")).click();

		// Print curren window adress
		String currentpopupID = driver.getWindowHandle();
		System.out.println(currentpopupID);

		// Print how many windows are present on webpage
		Set<String> popID = driver.getWindowHandles();
		System.out.println(popID); // AlphaNumeric ID for all webpages
		System.out.println("The total no. of popups are : " + popID.size());

		Iterator<String> window = popID.iterator();
		String window1 = window.next();
		String window2 = window.next();

		Thread.sleep(3000);
		driver.switchTo().window(window2);
		System.out.println("The popwindow title is : " + driver.getTitle());
		System.out.println("The popup window current url is : " + driver.getCurrentUrl());

		Thread.sleep(3000);
		driver.findElement(By.xpath("//*[text()='FREE TRIAL']")).click();


		System.out.println("*****************************************************");

		Thread.sleep(3000);
		driver.switchTo().window(window1);
		System.out.println("The parent window title is : " + driver.getTitle());
		System.out.println("The parent window current title is : " + driver.getCurrentUrl());
		System.out.println("*****************************************************");

		Thread.sleep(3000);
		driver.close();// Close current window only
		System.out.println("The current opened window is closed.");
		
		Thread.sleep(3000);
		driver.quit();// close all opened windows
		System.out.println("All opened windows are closed...");
	}
}
