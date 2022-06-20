package myPackage;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DropDown1 {

	public static void main(String[] args) {

		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();

		driver.findElement(By.xpath("//a[@data-testid='open-registration-form-button']")).click();
		WebElement drpYearEle = driver.findElement(By.xpath("//select[@id='year']"));
		Select drp = new Select(drpYearEle);

		List<WebElement> alloptions = drp.getOptions();

		System.out.println(alloptions.size());

		for (WebElement option : alloptions) {
			if (option.getText().equalsIgnoreCase("1994")) {
				option.click();
				System.out.println("The Selected year is : " + option.getText());
				break;
			}
		}

	}

}
