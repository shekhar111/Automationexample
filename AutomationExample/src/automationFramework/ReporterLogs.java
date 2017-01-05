package automationFramework;
import java.util.concurrent.TimeUnit;
import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
//import POM classes in utility package
import utility.Constant;
import utility.Log;
import org.testng.Reporter;


import org.apache.log4j.LogManager;
//import log.xml file
import org.apache.log4j.Logger;
import org.apache.log4j.xml.DOMConfigurator;
import utility.Constant;

public class ReporterLogs {
	private static WebDriver driver;
	private static Logger Log=LogManager.getLogger(Log.class.getName());
	
	@Test
	public static void test()
	{
		DOMConfigurator.configure("log4j.xml");
		driver = new FirefoxDriver();
		Log.info("New driver instantiated");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		Log.info("Implicit wait applied on the driver for 10 seconds");
		driver.get(Constant.url);
		Log.info("Web application launched");
		  // Our first step is complete, so we produce a main event log here for our reports
		Reporter.log("Application Lauched successfully | ");
		driver.findElement(By.id("email")).sendKeys(Constant.UserName);
		Log.info("Username entered in the Username text box");
		driver.findElement(By.id("pass")).sendKeys(Constant.passWord);
		Log.info("Password entered in the Password text box");
		driver.findElement(By.id("loginbutton")).click();
		 Log.info("Click action performed on Submit button");
		// Here we are done with our Second main event
		 Reporter.log("Sign In Successful | " );
		 driver.findElement(By.id("userNavigationLabel")).click();
		 driver.findElement(By.xpath("//*[@id='BLUE_BAR_ID_DO_NOT_USE']/div/div/div[1]/div/div/ul/li[16]/a/span/span[contains(text(),'Log Out')]")).click();
		 Log.info("Click action performed on Log out link");
		 driver.quit();
		 Log.info("Browser closed");
		 //Third main event
		 Reporter.log("User is Logged out and Application is closed | ");
		 
		 
	}

}
