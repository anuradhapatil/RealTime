package TestMaven;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;

public class amazonEverything {
	
	
	@Test
	public void initialize() {
		
		System.out.println("Hi in  1 Node");
	
		 System.setProperty("webdriver.chrome.driver","C:\\Users\\shpatil\\Downloads\\chromedriver_win32 (1)\\chromedriver.exe");
		   WebDriver driver = new ChromeDriver();
		   driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		 driver.get("http://www.amazon.com");
		 
		 driver.manage().window().maximize();
		/* driver.findElement(By.xpath("//*[@class='nav-search-dropdown searchSelect']")).click();
		
		 
		 Select dropdown = new Select (driver.findElement(By.xpath("//*[@class='nav-search-dropdown searchSelect']")));
		 WebDriverWait wait = new WebDriverWait(driver,5);
		 wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@class='nav-search-dropdown searchSelect']/option[1]")));
		List<WebElement> options = dropdown.getOptions();
		
		ArrayList<String> check = new ArrayList<String>();
		
		for(WebElement ele : options)
		{
		
			check.add(ele.getText());
		
		}
		
		System.out.println(check + ": Before Sorting" );
		ArrayList<String> Sortedcheck = new ArrayList<String>();
for(int i=0;i< check.size();i++) {
	Sortedcheck.add(i,check.get(i).trim());
	
	
}

System.out.println(Sortedcheck + ": No Sorting" );

		Collections.sort(Sortedcheck);
		//Assert.assertEquals(check,Sortedcheck);
		System.out.println(Sortedcheck + ": After Sorting" );
		
		
	if(driver.findElement(By.xpath("//a/img[@alt='Amazon Gift Cards']")).isDisplayed())	{
		System.out.println("Image 1  displayed");
	}
	if(driver.findElement(By.xpath("//a[@class='a-link-normal']/img[contains(@alt,'Affordable')]")).isDisplayed())	{
		System.out.println("Image 2 displayed");
	}*/
		
	}

}
