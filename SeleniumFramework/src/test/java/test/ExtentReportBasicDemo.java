package test;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

public class ExtentReportBasicDemo {

	private static WebDriver driver = null;

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		ExtentReports extent = new ExtentReports();
		ExtentSparkReporter spark = new ExtentSparkReporter("Spark.html");
		driver = new ChromeDriver();

		extent.attachReporter(spark);
		ExtentTest test = extent.createTest("Google Search Test", "This is to test Google search functionality");

		test.log(Status.INFO, "Starting Test Case");
		driver.get("https://google.com");
		test.pass("Navigated to google.com");

		// enter text in search textbox
		driver.findElement(By.name("q")).sendKeys("Automation");
		driver.findElement(By.name("q")).sendKeys(Keys.RETURN);
		test.fail("Entered text in search box");

		Thread.sleep(2000);

		// close the browser
		driver.close();
		driver.quit();
		test.pass("closed the browser");
		
		test.info("Test completed");

		
		extent.flush();
	}

}
