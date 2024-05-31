package TestNg;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class AddProduct {

	@Test
	public void addProduct() throws InterruptedException
	{
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		driver.get ("https://demowebshop.tricentis.com/");
	
		driver.findElement(By.className("ico-login")).click();
		driver.findElement(By.id("Email")).sendKeys("aishwaryadeshpande33@gmail.com");
		driver.findElement(By.id("Password")).sendKeys("aishwarya");
	    driver.findElement(By.xpath("//input[@value='Log in']")).click();
	    
	    
	    
	    driver.findElement(By.xpath("//a[contains(text(),'Digital downloads')][1]")).click();
		
		
		List<WebElement> add_cart = driver.findElements(By.xpath("//input[@value='Add to cart']"));
		for (WebElement web :add_cart) {
		       web.click();	
		      
		}    
		 driver.close();
	}
}
