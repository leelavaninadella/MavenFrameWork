package myPackage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;

import bsh.Remote;
import io.github.bonigarcia.wdm.WebDriverManager;

public class GetAndNavigateTo {

	public static void main(String[] args) {
		
		WebDriverManager.chromedriver().setup();
		RemoteWebDriver driver = new ChromeDriver();
		driver.get("https://www.google.com/");
		driver.navigate().to("https://www.google.com/");
		/*
		 * Both get() & navigate().to() are same. But, only the difference is in parameters. 
		 * get() is having only one parameter. That is String
		 * navigate().to() has 2 parameters. They are : string & URL Instance as parameter. 
		 * But, navigate().to() method calls get() method internally.
		 */
	}

}
