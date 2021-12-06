package project;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class ProvideNumberAndClickNextButton extends DriverSetup {

	public static String baseurl="https://www.boibazar.com/";

	@Test
		public static void BoiBazar() throws InterruptedException {
			
			driver.get(baseurl);
			driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);
			driver.manage().window().maximize();
			//Thread.sleep(1000);
			
		
			//to select the list		
			driver.findElement(By.xpath("(//button[@class='btn dropdown-toggle custom-dd-btn'])[1]")).click();
			Thread.sleep(1000);
			
			//to select Bisoy from the list
			driver.findElement(By.xpath("//li[@class='categoryIDs']//span[contains(text(),'বিষয়')]")).click();
			Thread.sleep(1000);
			
			//write in textbox
			driver.findElement(By.xpath("//input[@id='searchBox']")).sendKeys("ঐতিহাসিক উপন্যাস");
			Thread.sleep(1000);
	
			//search		
	        driver.findElement(By.xpath("//img[@src='https://www.boibazar.com/asset/images/search_button.png']")).click();
	        Thread.sleep(1000);
	        
	        //find
	        driver.findElement(By.xpath("//img[@class='group list-group-image']")).click();
	        Thread.sleep(1000);
	
	        driver.findElement(By.xpath("//img[@alt='ক্যাপ্টেন কুলঃ এম,এস ধোনি ']")).click();
	        Thread.sleep(1000);
	
	        driver.findElement(By.xpath("//img[@class='cart-zoom']")).click();
	        Thread.sleep(9000);
	        
	        driver.findElement(By.xpath("//span[@id='cartCost']")).click();
	        Thread.sleep(4000);
	        
	        driver.findElement(By.xpath("//button[@id='checkout-btn']")).click();
	        Thread.sleep(4000);
	        
	        driver.findElement(By.xpath("//span[@id='cartCost']")).sendKeys("01625154563");
	        Thread.sleep(4000);
	        
	        driver.findElement(By.xpath("//button[@id='next-btn-shipping']")).click();
	        Thread.sleep(4000);
	}
	
}
