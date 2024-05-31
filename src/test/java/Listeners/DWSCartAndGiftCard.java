package Listeners;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.List;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.crm.listenersCode.DWSBaseClass;
@Listeners(com.crm.listenersCode.DWSListeners.class)

public class DWSCartAndGiftCard extends DWSBaseClass{
	@Test
	public void addCart() throws InterruptedException, IOException {
		driver.findElement(By.xpath("//a[contains(text(),'Digital downloads')]")).click();
		List<WebElement> web = driver.findElements(By.xpath("//input[@value='Add to cart']"));
		for(WebElement cart : web) {
			cart.click();
			Thread.sleep(2000);
		}
		
	}
	
	@Test
	public void giftCart() throws InterruptedException, EncryptedDocumentException, IOException {
		File path = new File("C:\\Users\\ASUS\\Desktop\\Selenium\\DWs Login.xlsx");
		FileInputStream file = new FileInputStream(path);
		Workbook wb = WorkbookFactory.create(file);
		Sheet sheet = wb.getSheet("Sheet1");
		String rece_username = sheet.getRow(1).getCell(0).toString();
		String rece_email = sheet.getRow(2).getCell(0).toString();
		String username = sheet.getRow(3).getCell(0).toString();
		String email = sheet.getRow(4).getCell(0).toString();
		
		driver.findElement(By.xpath("//a[contains(text(),'Gift Cards')]")).click();
		driver.findElement(By.xpath("//input[@value='Add to cart']")).click();
		driver.findElement(By.id("giftcard_1_RecipientName")).sendKeys(rece_username);
		driver.findElement(By.id("giftcard_1_RecipientEmail")).sendKeys(rece_email);
		driver.findElement(By.id("giftcard_1_SenderName")).sendKeys(username);
		driver.findElement(By.id("giftcard_1_SenderEmail")).sendKeys(email);
		driver.findElement(By.id("giftcard_1_Message")).sendKeys("Hello!!");
		driver.findElement(By.id("addtocart_1_EnteredQuantity")).sendKeys("23");
		
	}

}