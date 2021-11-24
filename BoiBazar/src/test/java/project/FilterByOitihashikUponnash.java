package project;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class FilterByOitihashikUponnash extends DriverSetup{
	
public static String url="https://www.boibazar.com/";
	
	@Test
	public static void BoiBazar() throws InterruptedException {
		
		driver.get(url);
		driver.manage().timeouts().implicitlyWait(0, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		//Thread.sleep(1000);
	
		
		
		        //to select the list		
				driver.findElement(By.xpath("(//button[@class='btn dropdown-toggle custom-dd-btn'])[1]")).click();
				Thread.sleep(1000);
				
				//to select Bisoy from the list
				driver.findElement(By.xpath("//li[@class='categoryIDs']//span[contains(text(),'বিষয়')]")).click();
				Thread.sleep(3000);
				
				//write in textbox
				driver.findElement(By.xpath("//input[@id='searchBox']")).sendKeys("ঐতিহাসিক উপন্যাস");
				Thread.sleep(6000);
		
						
		//driver.findElement(By.xpath("//body/div[1]/div[1]/nav[1]/div[1]/div[2]/div[1]/div[1]/div[2]/div[1]/div[2]/form[1]/div[1]/div[1]/div[1]/ul[1]/li[4]/a[1]/span[1]")).click();
		//Thread.sleep(4000);
		
		//driver.findElement(By.xpath("//input[@id='searchBox']")).sendKeys("ঐতিহাসিক উপন্যাস");
		//Thread.sleep(4000);
		
		//driver.findElement(By.xpath("//body/div[1]/div[1]/nav[1]/div[1]/div[2]/div[1]/div[1]/div[2]/div[1]/div[2]/form[1]/div[1]/div[3]/div[1]/button[1]/a[1]/img[1]")).click();
		//Thread.sleep(4000);
		
		//driver.findElement(By.xpath("//body/div[1]/div[1]/div[3]/div[1]/section[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/a[2]/img[1]")).click();
		//Thread.sleep(4000);
		
	}
	
}



