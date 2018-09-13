package TestMaven;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import org.openqa.selenium.ie.InternetExplorerDriver;
import org.testng.annotations.Test;

public class CrossBrowserIE {

	
	
	@Test
	public void start() {
		
		System.setProperty("webdriver.ie.driver","C:\\Users\\shpatil\\Downloads\\IEDriverServer_x64_3.1.0\\IEDriverServer.exe");
		   WebDriver driver = new InternetExplorerDriver();
		   driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		 driver.get("http://www.amazon.com");
		System.out.println("Hi in 2 Node");
	
		   
	}
}
