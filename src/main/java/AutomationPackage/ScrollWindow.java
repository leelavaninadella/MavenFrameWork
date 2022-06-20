package AutomationPackage;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ScrollWindow {

	public static void main(String[] args) throws Exception {

		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.get("https://www.facebook.com/");

		WebElement emailEle = driver.findElement(By.id("email"));
		WebElement passwordEle = driver.findElement(By.id("pass"));
		WebElement loginEle = driver.findElement(By.name("login"));

		JavascriptExecutor jse = (JavascriptExecutor) driver;
		jse.executeScript("arguments[0].value='abc@gmail.com'", emailEle);
		Thread.sleep(3000);
		jse.executeScript("arguments[0].value='123456'", passwordEle);
		Thread.sleep(3000);
		jse.executeScript("arguments[0].click();", loginEle);
		Thread.sleep(3000);
		jse.executeScript("window.scrollBy(0,-400)");
		Thread.sleep(3000);
		jse.executeScript("window.scrollBy(0,400)");
		Thread.sleep(3000);
		jse.executeScript("window.open()");
		Thread.sleep(3000);
		driver.quit();

	}

}
