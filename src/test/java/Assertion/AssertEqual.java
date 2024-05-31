package Assertion;

import static org.testng.Assert.assertEquals;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class AssertEqual extends BaseClass {
@Test
	public void hardAssert(){
		String expected_url="https://demowebshop.tricentis.com/";
//		WebDriver driver=new ChromeDriver();
//		driver.manage().window().maximize();
//		//implicitely wait
//		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
//		//enter into page
//		driver.get("https://demowebshop.tricentis.com/");
		String actual_result=driver.getCurrentUrl();
		assertEquals(expected_url, actual_result);
		driver.findElement(By.id("small-searchterms")).sendKeys("bags");
		driver.findElement(By.cssSelector("input[type='submit']")).click();
				
		
	}
}
