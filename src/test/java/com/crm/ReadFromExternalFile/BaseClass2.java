package com.crm.ReadFromExternalFile;
import java.io.IOException;
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

	public class BaseClass2 extends ReadFileUtility {

		protected WebDriver driver;
		String url;
		String username;
		String password;
		@BeforeSuite
		public void beforeSuite() throws IOException {
			System.out.println("Connecting to the DataBase");
			url=ReadFileUtility.propertiesfile("url");
			username = ReadFileUtility.propertiesfile("username");
			password = ReadFileUtility.propertiesfile("password");
		}
		
		@BeforeTest
		public void beforeTest() {
			System.out.println("Pre-condition for test runner");
		}
		
		@BeforeClass
		public void beforeClass() throws IOException {
			
			//Open the browser
			driver = new ChromeDriver();	
			//Maximize the browser
			driver.manage().window().maximize();
			//Implicit wait
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));		
			//Enter into DWS page
			driver.get(url);
		}
		
		@BeforeMethod
		public void beforeMethod() throws IOException {
			//Enter into login page
			driver.findElement(By.cssSelector("[class='ico-login']")).click();
			driver.findElement(By.id("Email")).sendKeys(username);
			driver.findElement(By.id("Password")).sendKeys(password);
			driver.findElement(By.xpath("//input[@value='Log in']")).click();	
		}
		
		@AfterMethod
		public void afterMethod() {
			//Logout the WebPage
		    driver.findElement(By.xpath("//a[@class='ico-logout']")).click();
		}
		
		@AfterClass
		public void afterClass() {
			//Close the browser
		    driver.close();
		}
		
		@AfterTest
		public void afterTest() {
			System.out.println("Post-condition for test runner");
		}
		
		@AfterSuite
		public void afterSuite() {
			System.out.println("Disconnecting the DataBase");
		}


	}