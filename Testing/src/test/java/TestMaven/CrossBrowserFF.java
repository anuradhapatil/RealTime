package TestMaven;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.testng.annotations.Test;

public class CrossBrowserFF {
	
	@Test
	public void start() {
		
		System.setProperty("webdriver.gecko.driver","C:\\Users\\shpatil\\Downloads\\geckodriver-v0.21.0-win64\\geckodriver.exe");
		   WebDriver driver = new  FirefoxDriver();
		   driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		 driver.get("http://www.amazon.com");
		System.out.println("Hi in 3 Node");
	
		   
	}

}
