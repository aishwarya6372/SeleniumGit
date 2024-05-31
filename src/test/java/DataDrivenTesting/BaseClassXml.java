package DataDrivenTesting;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;

public class BaseClassXml {

	// make webdriver global
    WebDriver driver;
	@BeforeSuite
	public void beforeSuit()
	{
		System.out.println("connecting to database");
	}

   @BeforeTest
  public void beforeTest()
  {
	System.out.println("precondtion for test runner");
   }

   @Parameters("url")
   @BeforeClass
   public void beforeClass(String url)
	{
  	 driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		driver.get (url);
	}

   @Parameters({"username","password"})
   @BeforeMethod
   public void beforeMehod(String username,String password)
	{
  	 //click on login
  	 driver.findElement(By.className("ico-login")).click();
  	 //enter email and password
		driver.findElement(By.id("Email")).sendKeys(username);
		driver.findElement(By.id("Password")).sendKeys(password);
		//click on Login button
	    driver.findElement(By.xpath("//input[@value='Log in']")).click();
	 }
    @AfterMethod
    //click on logout
   public void afterMethod()
	{
		driver.findElement(By.xpath("//a[@class='ico-logout']")).click();
	}

   @AfterClass
   //close
   public void afterClass()
	{
	    driver.close();
	}

   @AfterTest
   public void afterTest()
	{
		System.out.println("Preconditions for test runner");
	}

   @AfterSuite
   public void afterSuite()
	{
		System.out.println("Disconnectiong from database");
	}

}
