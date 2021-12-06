package project;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class SelectBishoy extends DriverSetup{

public static String url="https://www.boibazar.com/";
	
	@Test
	public static void BoiBazar() throws InterruptedException {
		
		driver.get(url);
		driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		//Thread.sleep(1000);
	
		//to select the list		
		driver.findElement(By.xpath("(//button[@class='btn dropdown-toggle custom-dd-btn'])[1]")).click();
		Thread.sleep(1000);
		
		//to select Bisoy from the list
		driver.findElement(By.xpath("//li[@class='categoryIDs']//span[contains(text(),'বিষয়')]")).click();
		Thread.sleep(3000);
	}
	
}
