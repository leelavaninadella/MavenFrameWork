package myPackage;

import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class WindowHandles6 {
	public static void main(String[] args) throws Exception {

		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.get("https://www.hyrtutorials.com/p/window-handles-practice.html");
		driver.findElement(By.id("newTabsWindowsBtn")).click();
		String parentWindow = driver.getWindowHandle();
		System.out.println(parentWindow);

		Set<String> popUpId = driver.getWindowHandles();
		System.out.println("The total Windows are : " + popUpId.size());
		System.out.println(popUpId);
		Iterator<String> windows = popUpId.iterator();

		while (windows.hasNext()) {
			String childWindow = windows.next();

			if (!parentWindow.equals(childWindow)) {
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
		System.out.println(driver.getTitle());
		Thread.sleep(3000);
		driver.quit();

	}

}
