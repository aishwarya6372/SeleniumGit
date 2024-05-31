package TestNg;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class GiftCard extends BaseClass {

	@Test
	public void GiftCard() throws InterruptedException {
		driver.findElement(By.xpath("(//a[contains(text(),'Gift Cards')])[3]")).click();
		//click on add to cart
    	driver.findElement(By.xpath("(//input[@value='Add to cart'])[1]")).click();
    	
    	//Fill the gift card information
    	
    	Thread.sleep(2000);
    	
    	//Enter the recipient name
    	driver.findElement(By.id("giftcard_1_RecipientName")).sendKeys("Supriya");
    	
    	//Enter the recipient email
    	driver.findElement(By.id("giftcard_1_RecipientEmail")).sendKeys("supriya@gmail.com");
    	
    	//Enter the sender name
    	driver.findElement(By.id("giftcard_1_SenderName")).sendKeys("Aishwarya");
    	
    	//Enter the sender email
    	driver.findElement(By.id("giftcard_1_SenderEmail")).sendKeys("aishwaryadeshpande33@gmail.com");
    	
    	//Enter the message
    	driver.findElement(By.id("giftcard_1_Message")).sendKeys("Wish you all the best");
    	
    	//Get price text
    	WebElement price = driver.findElement(By.xpath("//div[@class='product-price']/span"));
    	
    	System.out.println(price.getText());
    	
    	//Enter the quantity
    	WebElement quantity = driver.findElement(By.id("addtocart_1_EnteredQuantity"));
    	
    	quantity.clear();
    	quantity.sendKeys("5");
    	
    	//Click on add to cart button
    	driver.findElement(By.id("add-to-cart-button-1")).click();
	}
}
