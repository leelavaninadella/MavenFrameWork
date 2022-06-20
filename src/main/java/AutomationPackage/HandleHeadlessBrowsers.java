package AutomationPackage;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.htmlunit.HtmlUnitDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class HandleHeadlessBrowsers {

	public static void main(String[] args) throws Exception {
		
		
		WebDriver driver = new HtmlUnitDriver();
		driver.get("https://www.facebook.com/");
		System.out.println("The title of page is :" + driver.getTitle());
		
		WebDriverManager.chromedriver().setup();
		ChromeOptions options = new ChromeOptions();
		//options.addArguments("--headless");
		options.setHeadless(true);
		WebDriver driver1 = new ChromeDriver(options);
		driver1.get("https://www.google.com/");
		System.out.println("The title is : " + driver.getTitle());

		
		WebDriverManager.edgedriver().setup();
		WebDriver edgeDriver = new EdgeDriver();
		Dimension d = new Dimension(0, 300);
		edgeDriver.manage().window().setSize(d);
		Thread.sleep(3000);
		System.out.println("The window size is : " + edgeDriver.manage().window().getSize());
		Thread.sleep(3000);
		edgeDriver.manage().window().maximize();
		edgeDriver.get("https://www.facebook.com/");
		System.out.println("Facebook url opened in edgebrowser sucessfully..");
		edgeDriver.quit();
	}

}
