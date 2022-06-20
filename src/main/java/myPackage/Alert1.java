package myPackage;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Alert1 {

	public static void main(String[] args) throws Exception {

		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

		driver.get("https://www.hyrtutorials.com/p/alertsdemo.html");
		driver.findElement(By.id("alertBox")).click();

		driver.switchTo().alert().accept();

		// Prompt Box Alert
		Thread.sleep(3000);
		driver.findElement(By.id("promptBox")).click();
		Thread.sleep(3000);
		driver.switchTo().alert().sendKeys("vani");
		Thread.sleep(3000);
		driver.switchTo().alert().accept();

		System.out.println(driver.findElement(By.id("output")).getText());

		// Conformation Alert
		Thread.sleep(3000);
		driver.findElement(By.id("confirmBox")).click();
		Thread.sleep(3000);
		driver.switchTo().alert().dismiss();
		System.out.println("Alert dismissed..");
		Thread.sleep(3000);
		driver.findElement(By.id("confirmBox")).click();
		Thread.sleep(3000);
		driver.switchTo().alert().accept();
		System.out.println("alert accepted....");
	}

}
