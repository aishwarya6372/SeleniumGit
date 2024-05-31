package Listeners;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
@Listeners(com.crm.listnersCode.DWSLogin.class)

public class TcDSLogin1 {
	@Test
	public void login() {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		driver.get("https://demowebshop.tricentis.com/");
		//Click on Login Button
		driver.findElement(By.cssSelector("a[class='ico-login']")).click();
		//Enter the email
		driver.findElement(By.cssSelector("input[class='email']")).sendKeys("sakshirajmane4@gmail.com");
		//Enter the password
		driver.findElement(By.cssSelector("input[class='password']")).sendKeys("Sakshi@123");
		//Click on login button
		driver.findElement(By.xpath("//input[@value='Login']")).click();
		
		driver.close();
		}
	
	@Test
	public void redBus() {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		driver.get("https://www.redbus.in/");
		driver.close();
		
	}
	
	@Test(dependsOnMethods = "login")
	public void maniBiryani() {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		driver.get("https://www.redbus.in/");
		driver.close();
		
	}
}