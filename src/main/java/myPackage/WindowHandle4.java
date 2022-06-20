package myPackage;

import java.util.HashMap;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class WindowHandle4 {

	public static void main(String[] args) {

		
		
		ChromeOptions options = new ChromeOptions();
		
		HashMap<String, Integer> content_Settings = new HashMap<String, Integer>();
		HashMap<String	, Object> profile = new HashMap<String, Object>();
		HashMap<String, Object> prefs = new HashMap<String, Object>();
		
		content_Settings.put("geolocation", 0);
		profile.put("managed_default_content_settings", content_Settings);
		prefs.put("profile", profile);
		options.setExperimentalOption("prefs", prefs);
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver(options);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.get("https://www.naukri.com/");
		//driver.findElement(By.xpath("//*[text()='Jobs']")).click();
		
		driver.findElement(By.xpath("//*[text()='Companies']")).click();
		driver.findElement(By.xpath("//*[text()='Recruiters']")).click();
		
		
		

	}

}
