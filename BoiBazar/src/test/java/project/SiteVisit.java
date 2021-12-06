package project;

import java.util.concurrent.TimeUnit;

import org.testng.annotations.Test;

public class SiteVisit extends DriverSetup{
	
	public static String url="https://www.boibazar.com/";
	
	@Test
	public static void BoiBazar() throws InterruptedException {
		
		driver.get(url);
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		Thread.sleep(1000);
		
		
		
	}

}
