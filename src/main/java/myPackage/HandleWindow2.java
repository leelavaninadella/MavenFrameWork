package myPackage;

import java.awt.Frame;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class HandleWindow2 {

	public static void main(String[] args) throws Exception {

		// Launching chrome browser
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.get("https://opensource-demo.orangehrmlive.com/");

		Thread.sleep(3000);
		driver.findElement(By.xpath("//a[text()='OrangeHRM, Inc']")).click();

		// Print parent window ID
		String parentWindow = driver.getWindowHandle(); // AlphaNumeric ID of Parent Window
		System.out.println("The parent window title is : " + driver.getTitle());
		System.out.println("The parent window Title is : " + driver.getCurrentUrl());
		System.out.println("***************************************");

		// Pint howmay windows are present on webpage
		Set<String> popID = driver.getWindowHandles(); // Alphanumeric IDs for all windows
		System.out.println(popID);
		System.out.println("The total popup windows are : " + popID.size());

		System.out.println("***************************************");

		// getting ids

		Iterator<String> windows = popID.iterator();
		String window1 = windows.next();
		String window2 = windows.next();

		// Print title of window2
		Thread.sleep(3000);
		driver.switchTo().window(window2);
		System.out.println("The current window title is : " + driver.getTitle());

		Thread.sleep(3000);
		driver.findElement(By.xpath("//*[text()='Contact Sales']")).click();
		WebElement frame = driver.findElement(By.tagName("iframe"));
		driver.switchTo().frame(frame);
		Thread.sleep(3000);
		driver.findElement(By.xpath("//*[@id='recaptcha-anchor']")).click();
		System.out.println("Robot Check Box is clicked");
		System.out.println("*********************************************");

		// Move to parent window from current window
		Thread.sleep(3000);
		driver.switchTo().window(window1);
		System.out.println("The parent window title is : " + driver.getTitle());
		System.out.println("The parent window url is : " + driver.getCurrentUrl());
		System.out.println("*******************************");

		Thread.sleep(3000);
		driver.close();
		System.out.println("The current opened window is closed.....");
		Thread.sleep(3000);
		driver.quit();
		System.out.println("The all opened windows are closed......");

	}

}
