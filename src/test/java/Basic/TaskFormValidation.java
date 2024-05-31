package Basic;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;


public class TaskFormValidation {
	WebDriver driver;
      @BeforeTest

	public void demo()
	{
		 driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		driver.get("https://demoapps.qspiders.com/ui?scenario=1");
	
	}
     public void display() {
    	 driver.findElement(By.xpath("//input[@type='text']")).sendKeys("aishwarya");
    	 driver.findElement(By.xpath("//input[@type='password']")).sendKeys("aishu");
    	 driver.findElement(By.xpath("//input[@name='confirmpass']")).sendKeys("aishu");
    	 driver.findElement(By.xpath("//input[@name='email']")).sendKeys("aishwarya@1");
    	 driver.findElement(By.xpath("//input[@name='url']")).sendKeys("www.abc.com");
    	 driver.findElement(By.xpath("//input[@name='digits']")).sendKeys("122456");
     
    	 
     }
}
