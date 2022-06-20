package myPackage;

import java.net.HttpURLConnection;
import java.util.List;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import io.github.bonigarcia.wdm.WebDriverManager;

public class HandleBrokenLinks {

	public static void main(String[] args) throws Exception {
		int brokenLinks = 0;
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.get("http://www.deadlinkcity.com/");

		List<WebElement> links = driver.findElements(By.tagName("a"));
		System.out.println("Total Links present : " + links.size());
		for (WebElement ele : links) {
			String url = ele.getAttribute("href");

			if (url == null || url.isEmpty()) {
				System.out.println("URl is empty.");
				continue;
			}
			java.net.URL link = new java.net.URL(url);
			HttpURLConnection urlcoon = (HttpURLConnection) link.openConnection();
			urlcoon.connect();
			if (urlcoon.getResponseCode() >= 400) {
				System.out.println(urlcoon.getResponseCode() + url + "      is       -Broken Link ");
				brokenLinks++;
			} else {
				System.out.println(urlcoon.getResponseCode() + url + "     is          - Valid Link");
			}

			System.out.println("Total Broken Links : " + brokenLinks);
			System.out.println("Total valid links : " + (links.size() - brokenLinks));
		}
		driver.quit();
	}
}
