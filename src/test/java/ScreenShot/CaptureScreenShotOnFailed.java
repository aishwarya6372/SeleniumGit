package ScreenShot;

import static org.testng.Assert.assertEquals;

import org.openqa.selenium.By;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.crm.BaseClass.BaseClassDws;
import com.crm.pom.DWSLoginPage;
@Listeners(com.crm.listnersCode.CaptureFailedScreenShot.class)
public class CaptureScreenShotOnFailed extends BaseClassDws{

 @Test
	public void dwsLoginCorrect() {
	 driver.get("https://demowebshop.tricentis.com/");
		DWSLoginPage dws = new DWSLoginPage(driver);
		driver.findElement(By.xpath("//a[text()='Log in']")).click();
		dws.username("aishwaryadeshpande33@gmail.com");
		dws.password("aishwarya");
		dws.login_button();
		driver.findElement(By.xpath("//a[text()='Log out']")).click();
		
	}
	@Test
	public void dwsLoginWrong() {
		driver.get("https://demowebshop.tricentis.com/");
		DWSLoginPage dws = new DWSLoginPage(driver);
		driver.findElement(By.xpath("//a[text()='Log in']")).click();
		dws.username("aishwaryadeshpande333@gmail.com");
		dws.password("aishwarya");
		dws.login_button();
		driver.findElement(By.xpath("//a[text()='Log out']")).click();
		
	}
	@Test
	public void redBus() {
		driver.get("https://www.redbus.in/");
		assertEquals("aishu", "aish");
	}	

	}
