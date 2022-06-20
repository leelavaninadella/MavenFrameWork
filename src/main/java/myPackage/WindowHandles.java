package myPackage;

import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class WindowHandles {
	
	public static void main(String[] args) throws Exception {
		WebDriverManager.firefoxdriver().setup();
		WebDriver driver = new FirefoxDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.get("https://www.hyrtutorials.com/p/window-handles-practice.html");
		driver.findElement(By.id("newTabsWindowsBtn")).click();
		
		String parentWindow = driver.getWindowHandle();
		System.out.println(parentWindow);
		System.out.println("*************************************");
		
		Set<String> popUpID=driver.getWindowHandles();
		
		System.out.println("Total popup windows are : " + popUpID.size());
		System.out.println(popUpID);
		
		Iterator<String> windows = popUpID.iterator();
		
		while (windows.hasNext())
		{
			String childWindow = windows.next();
			if(!parentWindow.equals(childWindow) )
			{
				Thread.sleep(3000);
				driver.switchTo().window(childWindow);
				Thread.sleep(3000);
				System.out.println(driver.switchTo().window(childWindow).getTitle());
				Thread.sleep(3000);
				driver.close();
			}
		}
		Thread.sleep(3000);
		driver.switchTo().window(parentWindow);
		driver.getTitle();
		Thread.sleep(3000);
		driver.quit();
			
		}
		
	
}

