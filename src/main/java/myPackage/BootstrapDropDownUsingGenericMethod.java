package myPackage;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BootstrapDropDownUsingGenericMethod {

	public static void main(String[] args) {
		
		ChromeOptions options = new ChromeOptions();
		options.addArguments("disable-notifications");

		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver(options);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.get("https://www.hdfcbank.com/");
		
		//For Product Type DropDown
		driver.findElement(By.xpath("//*[@class='drp1']")).click();
		List<WebElement> allproductTypeoptions = driver.findElements(By.xpath("//*[@class='dropdown open']/ul/li"));
		System.out.println(allproductTypeoptions.size());
		selectDrpDownOption(allproductTypeoptions, "Vehicle Insurance");
		
		//Select option for product dropdown
		driver.findElement(By.xpath("//*[@class='drp2']")).click();
		List<WebElement> allProductOptions = driver.findElements(By.xpath("//*[@class='dropdown open']/ul/li"));
		System.out.println("The total options in product dropdown : " + allProductOptions.size());
		selectDrpDownOption(allProductOptions, "Commercial Vehicle Insurance");
		
		//Click Apply
		driver.findElement(By.xpath("//*[text()='Apply online']")).click();

	}

	

	public static void selectDrpDownOption(List<WebElement> alloptions, String value) {
		for (WebElement option : alloptions) {
			if (option.getText().equalsIgnoreCase(value)) {
				option.click();
				System.out.println("The selected option is : " + option.getText());
				break;
			}
		}

	}
}
