package TestNg;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class AddToCart  extends BaseClass{

	@Test
	public void AddToCart() throws InterruptedException {
		 driver.findElement(By.xpath("//a[contains(text(),'Digital downloads')][1]")).click();
		 List<WebElement> add_cart = driver.findElements(By.xpath("//input[@value='Add to cart']"));
			for (WebElement web :add_cart) {
			       web.click();	
			      Thread.sleep(2000);
			}    
		 
		
			
		}
	}
	  

