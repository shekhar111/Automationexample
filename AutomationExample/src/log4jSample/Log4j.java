package log4jSample;
import java.util.concurrent.TimeUnit;
import org.apache.log4j.Logger;
import org.apache.log4j.xml.DOMConfigurator;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Log4j {
	private static WebDriver driver;
	private static Logger Log = Logger.getLogger(Log4j.class.getName());
	public static void main(String[] args) {
		DOMConfigurator.configure("log4j.xml");
		//// Create a new instance of the Firefox driver
		driver = new FirefoxDriver();
		Log.info("New driver instantiated");
		//Put a Implicit wait, this means that any search for elements on the page could take the time the implicit wait is set for before throwing exception
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		Log.info("Implicit wait applied on the driver for 10 seconds");
		//Launch the facebook website.
		driver.get("https://www.facebook.com/");
		Log.info("Web application launched");
		driver.findElement(By.id("email")).sendKeys("shekhar.shashi111@gmail.com");
		Log.info("Username entered in the Username text box");
        driver.findElement(By.id("pass")).sendKeys("shekhar17090");
        Log.info("Password entered in the Password text box");
        driver.findElement(By.id("loginbutton")).click();
        Log.info("Login button is clicked and used is logged to site");
     // Print a Log In message to the screen
        System.out.println(" Login Successfully, now it is the time to Log Off buddy.");
        driver.findElement(By.id("userNavigationLabel")).click();
        Log.info("Navigation button to display 'logout' link ");
        driver.findElement(By.xpath("//*[@id='BLUE_BAR_ID_DO_NOT_USE']/div/div/div[1]/div/div/ul/li[16]/a/span/span[contains(text(),'Log Out')]")).click();
        Log.info("Logout link is clicked");
     // Close the driver
        driver.quit();
        System.out.println("Successfully logged out!!!!!");
        Log.info("Browser closed");
        
		

	}

}
