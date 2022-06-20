package myPackage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class OpenHeadlessBrowser {

	public static void main(String[] args) throws Exception {

		WebDriverManager.chromedriver().setup();

		ChromeOptions options = new ChromeOptions();
		/* options.setHeadless(true); */
		options.addArguments("--headless");

		WebDriver driver = new ChromeDriver(options);

		driver.get("https://www.facebook.com/");
		System.out.println("The page title is : " + driver.getTitle());

		Thread.sleep(3000);
		driver.close();

	}

}
