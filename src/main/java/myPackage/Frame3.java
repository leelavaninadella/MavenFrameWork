package myPackage;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Frame3 {

	public static void main(String[] args) throws Exception {

		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.get("https://www.paytm.com/");
		driver.findElement(By.xpath("//span[text()='Sign In']")).click();
		List<WebElement> allFrames = driver.findElements(By.tagName("iframe"));
		System.out.println(allFrames.size());
		for(int i=0; i<allFrames.size(); i++)
		{
			driver.switchTo().frame(i);
			driver.findElement(By.xpath("//*[contains(text(),'Watch Video')]")).click();
			Thread.sleep(3000);
			driver.findElement(By.xpath("//*[text()='close']")).click();
			Thread.sleep(3000);
			driver.findElement(By.xpath("//a[contains(@class,'1JDSA')]/img")).click();



			
		}
		driver.switchTo().defaultContent();
		

	}
}


