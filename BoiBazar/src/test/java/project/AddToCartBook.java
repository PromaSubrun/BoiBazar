package project;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.testng.annotations.Test;



public class AddToCartBook extends DriverSetup{
	
public static String baseurl="https://www.boibazar.com/";

@Test
	public static void BoiBazar() throws InterruptedException {
		
		driver.get(baseurl);
		driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		//Thread.sleep(1000);
		
	
		//to select the cetegory		
		driver.findElement(By.xpath("//ul[@class='nav navbar-nav home-menu-ul']//a[contains(text(),'বইবাজার অফার')]")).click();
		Thread.sleep(1000);
		
		
		//to select the book
		driver.findElement(By.xpath("//img[@alt='বেস্ট অব মুনজেরিন (২টি বই একত্রে) ']")).click();
		Thread.sleep(1000);
		
		//add to cart
		driver.findElement(By.xpath("//img[@class='cart-zoom']")).click();
		Thread.sleep(1000);
	
	}
}
