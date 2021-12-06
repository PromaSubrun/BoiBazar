package project;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

public class CompleteTheOrder extends DriverSetup{


	public static String baseurl="https://www.boibazar.com/";

	@Test
		public static void BoiBazar() throws InterruptedException {
			
			driver.get(baseurl);
			driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);
			driver.manage().window().maximize();
			Thread.sleep(1000);
			
			
	driver.findElement(By.id("ca-name-input")).sendKeys("Proma");
	Thread.sleep(1000);
	driver.findElement(By.id("ca-email-input")).sendKeys("psubrun14@gmail.com");
	Thread.sleep(1000);
	
	driver.findElement(By.id("password-input-signup")).sendKeys("1234");
	Thread.sleep(1000);
	
	Select dist = new Select(driver.findElement(By.id("make")));
	dist.selectByValue("Narayanganj");
	Thread.sleep(2000);
	
	Select thana = new Select(driver.findElement(By.id("thana")));
	thana.selectByVisibleText("NarayanganjSadar");
	Thread.sleep(3000);
	
	driver.findElement(By.xpath("//textarea[@id='receiver-address-input']")).sendKeys("friends tower,391 main road, hirajheel,narayanganj");
	Thread.sleep(2000);
	driver.findElement(By.xpath("//button[@id='next-btn-shipping']")).click();
	Thread.sleep(1000);
	
	}
}
