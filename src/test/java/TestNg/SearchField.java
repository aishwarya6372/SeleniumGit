package TestNg;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class SearchField extends BaseClass{

	@Test
	public void SearchField() throws InterruptedException {
		
		driver.findElement(By.id("small-searchterms")).sendKeys("Bags");
		Thread.sleep(5000);
		
	}
}
