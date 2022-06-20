package myPackage;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class JavaScriptExecutor {

	public static void main(String[] args) throws Exception {
		
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.get("https://www.facebook.com/");
		
		JavascriptExecutor jse = (JavascriptExecutor) driver;
		jse.executeScript("document.getElementById('email').value='abc@gmail.com'");
		jse.executeScript("document.getElementById('pass').value='123456789'");
		
		//Clicking operation on WebElement by using javaScript executor
		
		WebElement login = driver.findElement(By.name("login"));
		jse.executeScript("arguments[0].click(); ", login);
		
		Thread.sleep(3000);
		
		//Scroll down the page
		jse.executeScript("window.scrollBy(0,400)");
		
		Thread.sleep(3000);
		//Scroll up the page
		jse.executeScript("window.scrollBy(0,-400)");
		
		
		
	}

	
}
