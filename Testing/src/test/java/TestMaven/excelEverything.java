package TestMaven;


import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class excelEverything {

	@Test
	public void sample() {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\shpatil\\Downloads\\chromedriver_win32 (1)\\chromedriver.exe");
		   WebDriver driver = new ChromeDriver();
		   
		   driver.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS);

		 driver.get("http://www.ebay.com");
		 
		 driver.manage().window().maximize();

			
	/*	 FileInputStream fis = new FileInputStream(‪"D:\\\\selenium\\\\WorkPractice\\\\ebayRegister.xlsx");
		 
		 XSSFWorkbook wb = new XSSFWorkbook(fis);
		XSSFSheet  sheet =  wb.getSheetAt(0);
		System.out.println(sheet.getLastRowNum());
		 
		driver.findElement(By.xpath("//a[text()='register']")).click();*/
		 
		 
		 System.out.println(driver.getTitle());
		 System.out.println(driver.getWindowHandle());
		 
		 driver.findElement(By.xpath("//a[@title='Advanced Search']")).click();
		 String ExpectedTitle = "Advanced Search";
		 System.out.println(driver.getTitle());
		 Set<String> ids = driver.getWindowHandles();
		 
	Iterator<String> id = 	 ids.iterator();
		while(id.hasNext()){
			
			driver.switchTo().window(id.next());
			if(driver.findElement(By.xpath("//*[@id='gh-title']")).isDisplayed()){
				System.out.println("Navigated to correct page");
				System.out.println(driver.getTitle());
				break;
			}
			
			
		}
		driver.navigate().back();
	}
	
	
}
