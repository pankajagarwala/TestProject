package test;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

public class ExtentReportsDemoWithTestNG {
	
	private static WebDriver driver = null;
	ExtentReports extent;
	ExtentSparkReporter spark;
	ExtentTest test;

	@BeforeSuite
	public void setUp() {
		extent = new ExtentReports();
		spark = new ExtentSparkReporter("Spark.html");
		extent.attachReporter(spark);
		
		driver = new ChromeDriver();
	}
	
	@Test
	public void test1() {
		test = extent.createTest("Google Search Test", "This is to test Google search functionality");
		test.log(Status.INFO, "Starting Test Case");
		driver.get("https://google.com");
		test.pass("Navigated to google.com");

		// enter text in search textbox
		driver.findElement(By.name("q")).sendKeys("Automation");
		driver.findElement(By.name("q")).sendKeys(Keys.RETURN);
		test.pass("Entered text in search box");

		
	}
	
	@AfterSuite
	public void tearDown() {
		driver.close();
		driver.quit();
		test.pass("closed the browser");
		
		test.info("Test completed");

		extent.flush();
	}
	
}
