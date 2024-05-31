package Assertion;

import static org.testng.Assert.assertEquals;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.asserts.SoftAssert;

public class AssertSoft {

	public void assertMethod() {
		String expected_url="https://demowebshop.tricentis.com/";
		String a="aishwarya";
		String b=null;
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		//implicitely wait
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		driver.get("https://demowebshop.tricentis.com/");
		SoftAssert ass=new SoftAssert();
		String actual_result=driver.getCurrentUrl();
	//	assertEquals(expected_url, actual_result);
		boolean result=expected_url.equals(actual_result);
		ass.assertTrue(result);
		driver.findElement(By.id("small-searchterms")).sendKeys("bags");
		ass.assertNull(a);
		driver.findElement(By.cssSelector("input[type='submit']")).click();
		ass.assertAll();
	}
}
