package com.hyr.test;

import java.io.File;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.testng.ITestResult;

public class CaptureScreenShotOnFailure1 {

static	WebDriver driver;

public static void caputureScreenshot(ITestResult Result) throws Exception
{
if(ITestResult.FAILURE == Result.getStatus())
{
	TakesScreenshot ts = (TakesScreenshot) driver;
File source =ts.getScreenshotAs(OutputType.FILE);
FileUtils.copyFile(source, new File("./Screenshots/" + Result.getName() + ".png"));
System.out.println(Result.getName() + "method() screenshot is capured....");
}
}
	

}
