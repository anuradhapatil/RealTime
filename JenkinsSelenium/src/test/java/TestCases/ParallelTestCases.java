package TestCases;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import resources.base;

public class ParallelTestCases {
	
	public static Logger log =LogManager.getLogger(ParallelTestCases.class.getName());
	public WebDriver driver;
	@Parameters({"browser","url"})
	@Test
	public void first(String browser,String url) {
		 System.setProperty("webdriver.chrome.driver", "C:\\\\WorkPractice\\\\chromedriver.exe");
			driver= new ChromeDriver();
			System.out.println(browser);
			driver.get(url);
			System.out.println("ParallelTesting in chrome");
			log.info("In chrome for log");
	}

}
