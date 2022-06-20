package myPackage;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class HeightAndWidth {

	public static void main(String[] args) throws Exception {
		
		WebDriverManager.firefoxdriver().setup();
		WebDriver driver = new FirefoxDriver();
		driver.manage().window().maximize();
		Dimension d = new Dimension(0, 300);
		driver.manage().window().setSize(d);
		Dimension windowsize = driver.manage().window().getSize();
		System.out.println("The browser window size is : " + windowsize);
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.get("https://www.facebook.com/");

	WebElement loginButtonEle =	driver.findElement(By.name("login"));
	int height = loginButtonEle.getSize().getHeight();
	int width = loginButtonEle.getSize().getWidth();
	System.out.println("The Height og login button is : " + height);
	System.out.println("The width of the login button is :" + width);
	Thread.sleep(3000);
	driver.quit();
	}

}
