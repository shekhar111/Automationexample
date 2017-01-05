package automationFramework;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.AfterClass;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.By;

public class MultiBrowser {
	public WebDriver driver;
	@Parameters("browser")
	 @BeforeClass
	 // Passing Browser parameter from TestNG xml
		public void beforeTest(String browser) {
	// If the browser is Firefox, then do this
			  if(browser.equalsIgnoreCase("firefox")) {
			  driver = new FirefoxDriver();
			 // If browser is Chrome, then do this	  
			 }else if (browser.equalsIgnoreCase("Chrome")) { 
			 // Here I am setting up the path for my ChromeDriver
			 System.setProperty("webdriver.chrome.driver", "D:\\Selenium files\\chromedriver_win32\\chromedriver.exe");
			 driver = new ChromeDriver();
			 } 
			 // Doesn't the browser type, launch the Website
			 driver.get("https://facebook.com/"); 
			 }
@Test
	public void login() throws InterruptedException {
		driver.findElement(By.id("email")).sendKeys("shekhar.shashi111@gmail.com");
		  driver.findElement(By.id("pass")).sendKeys("shekhar17090");
		  driver.findElement(By.id("loginbutton")).click();
		  driver.findElement(By.id("userNavigationLabel")).click();
		  driver.findElement(By.xpath("//*[@id='BLUE_BAR_ID_DO_NOT_USE']/div/div/div[1]/div/div/ul/li[16]/a/span/span[contains(text(),'Log Out')]")).click();
  }
 @AfterClass public void afterTest() {
		 driver.quit();
		 }

}
