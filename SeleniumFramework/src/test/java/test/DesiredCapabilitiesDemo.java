package test;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.DesiredCapabilities;

public class DesiredCapabilitiesDemo {

	private static WebDriver driver = null;
	static DesiredCapabilities caps = null;
	static ChromeOptions options = null;
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		caps = new DesiredCapabilities();
		options = new ChromeOptions();
		options.addArguments("--incognito");
		caps.setCapability(ChromeOptions.CAPABILITY, options);
		driver = new ChromeDriver(options);
		
		driver.get("https://google.com");
		driver.findElement(By.name("q")).sendKeys("Automation"+Keys.RETURN);
		
		driver.quit();
	}

}
