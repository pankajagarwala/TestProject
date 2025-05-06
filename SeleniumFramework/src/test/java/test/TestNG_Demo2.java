package test;

import org.testng.annotations.Test;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;

public class TestNG_Demo2 {

	static WebDriver driver = null;
	
	@BeforeTest
	public static void setUpTest() {
		driver = new ChromeDriver();
	}
	
	@Test
	public static void googleSearch2() throws InterruptedException {
		
		
		//go to google
		driver.get("https://google.com");
		
		//enter text in search textbox
		driver.findElement(By.name("q")).sendKeys("Automation");
		driver.findElement(By.name("q")).sendKeys(Keys.RETURN);
		Thread.sleep(2000);
	}
	
	@AfterTest
	public static void tearDownTest() {
		//close the browser
				driver.close();
				driver.quit();
				
				System.out.println("Test completed successfully");
	}


}
