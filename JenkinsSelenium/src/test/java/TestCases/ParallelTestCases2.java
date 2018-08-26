package TestCases;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class ParallelTestCases2 {
	public WebDriver driver;
	@Parameters({"browser","url"})
	@Test
	public void first(String browser,String url) {
		 System.setProperty("webdriver.ie.driver","C:\\Users\\shpatil\\Downloads\\IEDriverServer_x64_3.1.0\\IEDriverServer.exe");
			driver= new InternetExplorerDriver();
			System.out.println(browser);
			driver.get(url);
			System.out.println("ParallelTesting in IE");
	}

}
