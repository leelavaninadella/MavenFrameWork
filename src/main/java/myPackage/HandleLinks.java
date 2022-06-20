package myPackage;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class HandleLinks {

	public static void main(String[] args) throws Exception {

		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.get("https://www.amazon.in/");
		driver.findElement(By.linkText("Customer Service")).click();
		Thread.sleep(3000);
		driver.findElement(By.partialLinkText("Deal")).click();

		// Find all links ion web page
		List<WebElement> links = driver.findElements(By.tagName("a"));
		System.out.println("The total links present : " + links.size());

		// Print the links
		for (int i = 0; i < links.size(); i++) {
			
			System.out.println(links.get(i).getText());
			System.out.println(links.get(i).getAttribute("href"));

		}
		driver.quit();

	}
	

}
