package test;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import pages.GoogleSearchPageObjects;

public class GoogleSearchPageTest {

	private static WebDriver driver = null;
	
	public static void main(String[] args) throws InterruptedException {
		
		googleSearchTest();
		
	}
	
	public static void googleSearchTest() throws InterruptedException {
		driver = new ChromeDriver();
		
		GoogleSearchPageObjects searchPageObj = new GoogleSearchPageObjects(driver);

		driver.get("https://google.com");
		
		searchPageObj.setTextInSearchBox("Automation" + Keys.RETURN);
		
		Thread.sleep(2000);
		driver.close();
		
	}

}
