package pageObjects;





import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
//rahulonlinetutor@gmail.com

public class HomePageObjects {
	
	public WebDriver driver;
	
	By search=By.xpath("//input[@id=\"lst-ib\"]");
	
	
	
	
	
	
	public HomePageObjects(WebDriver driver) {
		// TODO Auto-generated constructor stub
		
		this.driver=driver;
		
	}




	public WebElement getLogin()
	{
		return driver.findElement(search);
	}
	
	
	
}
