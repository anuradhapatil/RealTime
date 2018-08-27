package TestCases;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import pageObjects.LoginPage;



public class Login {
@Test
	public void databaseTesting() throws SQLException{
		// TODO Auto-generated method stub
   String host = "localhost";
   String port = "3306";
 Connection con = DriverManager.getConnection("jdbc:mysql://"+ host +":"+ port +"/SampleDB", "root","pasword1");
 Statement st = con.createStatement();
 ResultSet rs = st.executeQuery("select * from LoginCred");
 while(rs.next()) {
	   System.setProperty("webdriver.chrome.driver","C:\\Users\\shpatil\\Downloads\\chromedriver_win32 (1)\\chromedriver.exe");
	   WebDriver driver = new ChromeDriver();

	 driver.get("http://www.facebook.com");
	 LoginPage LP = new LoginPage(driver);
	 LP.email().sendKeys(rs.getString("Username"));
 //driver.findElement(By.xpath("//*[@id='email']")).sendKeys(rs.getString("Username"));
 //Thread.sleep(1000);
 LP.password().sendKeys(rs.getString("Password"));
// Thread.sleep(1000);
 LP.submit().click();
 driver.findElement(By.xpath("//input[@type='password']")).click();
 if(driver.findElement(By.xpath("//a[contains(@href,'recover/initiate')]/parent::div")).getText().equalsIgnoreCase("The password that you've entered is incorrect"))
 
		 {
	 
	//con.prepareStatement("insert into LoginCred values('','','Invalid Credentials')");
	 System.out.println("pass");
	 
		 }
	else {
		System.out.println("Fail");
	
 		
	}
 driver.quit();

}
	}
	}