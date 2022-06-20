package myPackage;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class WebTable3 {

	public static void main(String[] args) {

		// Lanuch chrome driver
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.get("https://money.rediff.com/gainers");

		// Locating current company column

		List<WebElement> allCompanies = driver.findElements(By.xpath("//table[@class='dataTable']/tbody/tr/td/a"));
		System.out.println("Total companies : " + allCompanies.size());

		// Locating currenprice column
		List<WebElement> allCurrentPrice = driver.findElements(By.xpath("//table[@class='dataTable']/tbody/tr/td[4]"));
		System.out.println("Total price elements : " + allCurrentPrice.size());

		String expectedCompany = "Orient Bell";

		for (int i = 0; i < allCompanies.size(); i++) {

			if (allCompanies.get(i).getText().equalsIgnoreCase(expectedCompany)) {
				System.out.println(allCompanies.get(i).getText() + "=== " + allCurrentPrice.get(i).getText());

				allCompanies.get(i).click();
				System.out.println("Company clicked....");
			}
		}
	}

}
