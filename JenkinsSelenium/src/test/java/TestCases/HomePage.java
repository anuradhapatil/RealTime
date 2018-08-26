package TestCases;





import java.io.IOException;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import pageObjects.HomePageObjects;

import resources.base;

public class HomePage extends base{
	
	 public static Logger log =LogManager.getLogger(base.class.getName());
	@BeforeTest
	public void initialize() throws IOException
	{
	
		 driver =initializeDriver();

	}
	@Test()
	
	public void search() throws IOException
	{

		//one is inheritance

		// creating object to that class and invoke methods of it
		driver.get(prop.getProperty("url"));
		HomePageObjects obj = new HomePageObjects(driver);
		obj.getLogin().sendKeys("selenium");
		log.info("Entered text");
		
System.out.println("In First Test Method");

		
		}

@Test()
	
	public void search1() throws IOException
	{

		//one is inheritance

		// creating object to that class and invoke methods of it
		driver.get(prop.getProperty("url"));
		HomePageObjects obj = new HomePageObjects(driver);
		obj.getLogin().sendKeys("selenium");
		log.info("Entered text");
		
System.out.println("In Second Test method");

		
		}

@Test()

public void search2() throws IOException
{

	//one is inheritance

	// creating object to that class and invoke methods of it
	driver.get(prop.getProperty("url"));
	HomePageObjects obj = new HomePageObjects(driver);
	obj.getLogin().sendKeys("selenium");
	log.info("Entered text");
	
System.out.println("In Third Test Method");

	
	}
	@AfterTest
	public void teardown()
	{
		
		driver.close();
		driver=null;
		
	}
}