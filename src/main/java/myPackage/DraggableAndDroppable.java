package myPackage;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DraggableAndDroppable {

	public static void main(String[] args) {

		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.get("https://jqueryui.com/droppable/");
		
		List<WebElement> allFrames = driver.findElements(By.tagName("iframe"));
		System.out.println("The total frames are :" + allFrames.size());
		
		for(int i=0; i<allFrames.size(); i++)
		{
			driver.switchTo().frame(i);
			
			WebElement draggable = driver.findElement(By.id("draggable"));
			WebElement droppable = driver.findElement(By.id("droppable"));
			
			Actions action = new Actions(driver);
			action.dragAndDrop(draggable, droppable).build().perform();
			
		}
		System.out.println("Drag & Drop Performed sucessfully...........");

	}

}
