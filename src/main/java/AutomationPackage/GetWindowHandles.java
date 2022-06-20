package AutomationPackage;

import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class GetWindowHandles {

	public static void main(String[] args) throws Exception {

		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

		driver.get("https://www.hyrtutorials.com/p/window-handles-practice.html");

		WebElement ele = driver.findElement(By.id("newTabsWindowsBtn"));
		JavascriptExecutor jse = (JavascriptExecutor) driver;
		jse.executeScript("arguments[0].click();", ele);

		String parentWindow = driver.getWindowHandle();
		System.out.println(parentWindow);
		System.out.println(driver.getTitle());

		Set<String> popupIDs = driver.getWindowHandles();
		Iterator<String> windows = popupIDs.iterator();

		while (windows.hasNext()) {
			String childWindow = windows.next();

			if (!parentWindow.equals(childWindow)) {
				driver.switchTo().window(childWindow);
				Thread.sleep(3000);
				System.out.println(childWindow);
				Thread.sleep(3000);
				System.out.println(driver.getTitle());
				Thread.sleep(3000);
				driver.close();
			}
			System.out.println("***********************");

		}

		Thread.sleep(3000);
		driver.switchTo().window(parentWindow);
		System.out.println(parentWindow);
		System.out.println(driver.getTitle());
		driver.quit();

	}

}
