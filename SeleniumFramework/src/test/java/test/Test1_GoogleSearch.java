package test;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;

public class Test1_GoogleSearch {

	public static void main(String[] args) throws InterruptedException {
		googleSearch();
	}
	
	public static void googleSearch() throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		
		//go to google
		driver.get("https://google.com");
		
		//enter text in search textbox
		driver.findElement(By.name("q")).sendKeys("Automation");
		driver.findElement(By.name("q")).sendKeys(Keys.RETURN);
		Thread.sleep(2000);
		
		//close the browser
		driver.close();
		driver.quit();
		
		System.out.println("Test completed successfully");
	}

}
