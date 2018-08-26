package TestCases;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class ParallelTestCases {
	public WebDriver driver;
	@Parameters({"browser","url"})
	@Test
	public void first(String browser,String url) {
		 System.setProperty("webdriver.chrome.driver", "C:\\\\WorkPractice\\\\chromedriver.exe");
			driver= new ChromeDriver();
			System.out.println(browser);
			driver.get(url);
			System.out.println("ParallelTesting in chrome");
	}

}
