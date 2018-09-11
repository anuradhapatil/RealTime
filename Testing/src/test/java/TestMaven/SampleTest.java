package TestMaven;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.MediaEntityBuilder;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;

public class SampleTest {
	
	
	
    // Create global variable which will be used in all method
	 ExtentReports extent;
	 ExtentTest logger;
	 WebDriver driver;
	
        // This code will run before executing any testcase
	@BeforeMethod
	public void setup()
	{
	    ExtentHtmlReporter reporter=new ExtentHtmlReporter("./Reports/screenAuto2.html");
		
	    extent = new ExtentReports();
	    
	    extent.attachReporter(reporter);
	    
	    logger=extent.createTest("LoginTest");
	}
 
	
        // Actual Test which will start the application and verify the title
	@Test
	public void loginTest() throws IOException
	{
		System.setProperty("webdriver.chrome.driver", "C:\\\\Users\\\\shpatil\\\\Downloads\\\\chromedriver_win32 (1)\\\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.get("http://www.google.com");
		System.out.println("title is "+driver.getTitle());
		Assert.assertTrue(driver.getTitle().contains("Mukesh"));
	}
	
        // This will run after testcase and it will capture screenshot and add in report
	@AfterMethod
	public void tearDown(ITestResult result) throws IOException
	{
		
		if(result.getStatus()==ITestResult.FAILURE)
		{
			String temp=getScreenshot(driver);
			
			logger.fail(result.getThrowable().getMessage(), MediaEntityBuilder.createScreenCaptureFromPath(temp).build());
		}
		
		extent.flush();
		
		
	}
	
	
	/*@Test
public void first() throws IOException {
		System.out.println("Hello World");
		
		ExtentHtmlReporter reporter = new ExtentHtmlReporter("./Reports/sample.html");
		ExtentReports extent = new ExtentReports();
		
		extent.attachReporter(reporter);
		
		ExtentTest logger = extent.createTest("LaunchBrowser");
		logger.log(Status.INFO,"Started");
		logger.log(Status.PASS,"PASSED");
		 System.setProperty("webdriver.chrome.driver","C:\\Users\\shpatil\\Downloads\\chromedriver_win32 (1)\\chromedriver.exe");
		   WebDriver driver = new ChromeDriver();

		 driver.get("http://www.facebook.com");
		 
		 logger.pass("pased",MediaEntityBuilder.createScreenCaptureFromPath("‪C:\\WorkPractice\\searchscreenshot.png").build());
		// logger.addScreenCaptureFromPath("‪C:\\WorkPractice\\searchscreenshot.png");
		 extent.flush();
	}*/
	
	
	public static String getScreenshot(WebDriver driver)
	{
		TakesScreenshot ts=(TakesScreenshot) driver;
		
		File src=ts.getScreenshotAs(OutputType.FILE);
		
		String path=System.getProperty("base.dir")+"/Screenshot/"+System.currentTimeMillis()+".png";
		
		File destination=new File(path);
		
		try 
		{
			FileUtils.copyFile(src, destination);
		} catch (IOException e) 
		{
			System.out.println("Capture Failed "+e.getMessage());
		}
		
		return path;
	}
}
