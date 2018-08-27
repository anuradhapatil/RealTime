package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LoginPage {
	
	public WebDriver driver;
	public LoginPage(WebDriver driver) {
		this.driver = driver;
	}
	
	By username = By.xpath("//*[@id='email']");
	By password = By.xpath("//*[@id='pass']");
	By submit = By.xpath("//input[@type='submit']");
	public WebElement email() {
		return driver.findElement(username);
	}
	public WebElement password() {
		return driver.findElement(password);
	}
	
	public WebElement submit() {
		return driver.findElement(submit);
	}


}
