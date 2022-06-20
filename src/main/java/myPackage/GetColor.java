package myPackage;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.Color;
import org.w3c.dom.css.CSSValue;

import io.github.bonigarcia.wdm.WebDriverManager;

public class GetColor {

	public static void main(String[] args) {

		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.get("https://www.linkedin.com/");
		WebElement element = driver.findElement(By.xpath("//icon[@data-test-id='nav-logo']"));
		String s = element.getCssValue("color");
	
		System.out.println(s);
		String hexaColor = Color.fromString(s).asHex();
		System.out.println(hexaColor);
		driver.quit();
	}

}
