import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.*;

import io.github.bonigarcia.wdm.WebDriverManager;

public class OrangeHRM {
	static WebDriver driver;
//@Parameters("BrowserName")
	@BeforeTest
	public static void launchBrowser() {
		
	WebDriverManager.chromedriver().setup();
	driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	}

	@AfterTest

	public static void tearDown() throws Exception {
		Thread.sleep(5000);
		driver.quit();
	}
	
	@Test(priority = 1)
	public static void openUrl()
	{
		driver.get("https://opensource-demo.orangehrmlive.com/");
	}
	
	@Test(priority = 2, dataProvider = "testData", dataProviderClass = XLDataSupplier.class)
	public static void doLogin(String userName, String password)
	{
		driver.findElement(By.id("txtUsername")).sendKeys(userName);
		driver.findElement(By.id("txtPassword")).sendKeys(password);
		driver.findElement(By.id("btnLogin")).click();
	}

		
	

}
