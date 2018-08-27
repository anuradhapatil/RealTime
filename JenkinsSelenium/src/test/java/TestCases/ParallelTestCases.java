package TestCases;

import java.io.File;
import java.io.IOException;


import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import resources.base;

public class ParallelTestCases {
	
	public  Logger log =LogManager.getLogger(ParallelTestCases.class.getName());
	public WebDriver driver;
	@Parameters({"browser","url"})
	@Test
	public void first(String browser,String url) throws IOException {
		 System.setProperty("webdriver.chrome.driver", "C:\\\\WorkPractice\\\\chromedriver.exe");
			driver= new ChromeDriver();
			System.out.println(browser);
			driver.get(url);
			System.out.println("ParallelTesting in chrome");
			log.info("In chrome for log");
			/*File src=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
			FileUtils.copyFile(src, new File("D:\\selenium\\WorkPractice\\"+screen1+" screenshot.png"));*/
			
	
	}

	@DataProvider
	public Object[][] getdata(){
		Object[][] data =new Object[2][2];
		data[0][0]="firstus";
		data[0][1]="firstpass";
		data[1][0]="secus";
		data[1][1]="secpass";
		return data;
		
	}
	
	
	@Test(dataProvider="getdata")
	public void scan(String user,String pass) {
		System.out.println(user);
		System.out.println(pass);
	}
}
