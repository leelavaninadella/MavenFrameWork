package AutomationPackage;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class OpenURL {

	public static void main(String[] args) throws Exception {

		/*
		 * System.setProperty("webdriver.chrome.driver",
		 * "D:\\Softwares\\Chrome Driver\\chromedriver.exe");
		 */
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.get("https://www.facebook.com/");

		Thread.sleep(3000);
		driver.navigate().to("https://www.google.com/");
		System.out.println("The current Url is : " + driver.getCurrentUrl());
		System.out.println("The currnt page title is : " + driver.getTitle());
		
		Thread.sleep(3000);
		driver.navigate().back();
		System.out.println("The current url is : " + driver.getCurrentUrl());
		System.out.println("The current page title is : " + driver.getTitle());
		
		Thread.sleep(3000);
		driver.navigate().refresh();
		System.out.println("Webpage is refreshed.....");
		
		JavascriptExecutor jse = (JavascriptExecutor) driver;
		Thread.sleep(3000);
		jse.executeScript("window.open()");
		driver.navigate().to("https://www.facebook.com/");
		
		//Close current opened window
		Thread.sleep(3000);
		driver.close();
		
		//close all opened windows
		Thread.sleep(3000);
		driver.quit();
		

	}
}
