package AutomationPackage;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class RadioButton2 {

	public static void main(String[] args) {
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
		driver.get("https://www.facebook.com/");
		driver.findElement(By.xpath("//a[@data-testid='open-registration-form-button']")).click();
		
		List<WebElement> allRadios = driver.findElements(By.xpath("//label[contains(@class,'mt')]"));
		System.out.println("The total Gender radio buttons : " + allRadios.size());
		
		String expectedResult = "Male";
		
		for(WebElement option : allRadios)
		{
			if(option.getText().equalsIgnoreCase(expectedResult))
			{
				option.click();
				break;
			}
		}
		
		System.out.println(allRadios.get(2).getText());
		System.out.println(allRadios.get(1).isSelected());
		System.out.println(allRadios.get(0).isSelected());
		

	}

}
