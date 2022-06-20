package myPackage;

import org.apache.commons.lang3.math.IEEE754rUtils;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class OpenURL {

	public static void main(String[] args) throws Exception {

		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		System.out.println("FaceBook opened sucessfully.");
		System.out.println("***********************************");

		Thread.sleep(3000);

		/*
		 * WebDriverManager.geckodriver().setup(); WebDriver firefoxDriver = new
		 * FirefoxDriver(); firefoxDriver.get("https://www.gmail.com/");
		 * driver.manage().window().maximize();
		 * System.out.println("Firefox browser opened successfully.");
		 * System.out.println("***********************************");
		 */
		/*
		 * Thread.sleep(3000);
		 * 
		 * WebDriverManager.iedriver().setup(); WebDriver ieDriver = new
		 * InternetExplorerDriver(); ieDriver.get("https://www.myntra.com/");
		 * ieDriver.manage().window().maximize();
		 * System.out.println("IE browser opened successfully.");
		 * System.out.println("***********************************");
		 */

		Thread.sleep(3000);

		WebDriverManager.edgedriver().setup();
		WebDriver edgeDriver = new EdgeDriver();
		edgeDriver.get("https://www.amazon.com/");
		edgeDriver.manage().window().maximize();
		System.out.println("Edge browser opened successfully.");
		System.out.println("***********************************");

	}

}
