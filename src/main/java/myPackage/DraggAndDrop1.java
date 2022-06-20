package myPackage;

import java.util.List;
import java.util.concurrent.TimeUnit;

import javax.lang.model.element.Element;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DraggAndDrop1 {

	public static void main(String[] args) {
	
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit. SECONDS);
		driver.get("https://jqueryui.com/sortable/");
		
		//Print total no. frames
		
		List<WebElement> allFrames = driver.findElements(By.tagName("iframe"));
		System.out.println("Total No. of frames are : " + allFrames.size());
		
		//Perform Drag & Drop
		for(int i=0; i<allFrames.size();i++)
		{
			driver.switchTo().frame(i);
			List<WebElement> alloptions = driver.findElements(By.xpath("//ul[@id='sortable']/li"));
			Actions action = new Actions(driver);
			WebElement element = driver.findElement(By.xpath("//*[text()='Item 1']  "));
			if(element !=null)
			{
			action.dragAndDrop(alloptions.get(i),element).perform();
			
		
			}
			
		}
System.out.println("Performed....");
	}

}
