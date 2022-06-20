package myPackage;

import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class WindowHandle3 {

	public static void main(String[] args) throws Exception {

		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.get("https://opensource-demo.orangehrmlive.com/index.php/auth/login");
		Thread.sleep(3000);
		driver.findElement(By.xpath("//a[text()='OrangeHRM, Inc']")).click();

		String parentWindow = driver.getWindowHandle();
		System.out.println(parentWindow);

		Set<String> popupID = driver.getWindowHandles();
		System.out.println(popupID);
		System.out.println("The total windows present on webpage are : " + popupID);

		Iterator<String> window = popupID.iterator();
		String window1 = window.next();
		String window2 = window.next();

		Thread.sleep(3000);
		driver.switchTo().window(window2);
		driver.findElement(By.xpath("//a[text()='FREE TRIAL']")).click();

		Thread.sleep(3000);
		WebElement platform = driver.findElement(By.xpath("//a[@class='link'][normalize-space()='Platform']"));
		Actions abcd = new Actions(driver);
		Thread.sleep(3000);
		abcd.moveToElement(platform).build().perform();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//a[text()='HR Administration']")).click();

		
		driver.switchTo().window(window1);
		WebDriverWait wt = new WebDriverWait(driver, 10);
		wt.until(ExpectedConditions.visibilityOfElementLocated(By.id("divUsername"))).sendKeys("Admin");
		wt.until(ExpectedConditions.visibilityOfElementLocated(By.id("divPassword"))).sendKeys("admin123");
		
		driver.findElement(By.id("btnLogin")).click();
		driver.close();
		Thread.sleep(3000);
		driver.quit();

	}

}
