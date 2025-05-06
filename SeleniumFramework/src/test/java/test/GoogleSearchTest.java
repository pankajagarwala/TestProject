package test;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;

import pages.GoogleSearchPage;

public class GoogleSearchTest {

	private static WebDriver driver = null;
	
	public static void main(String[] args) throws InterruptedException {
		System.out.println(10+20+"30"+10+20);
		//googleSearch();
	}
	
	public static void googleSearch() throws InterruptedException {
		driver = new ChromeDriver();
		
		//go to google
		driver.get("https://google.com");
		
		//enter text in search textbox
		GoogleSearchPage.textbox_search(driver).sendKeys("Automation" + Keys.RETURN);
		Thread.sleep(2000);
		
		//close the browser
		driver.close();
		driver.quit();
		
		System.out.println("Test completed successfully");
	}

}
