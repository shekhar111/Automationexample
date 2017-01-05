package automationFramework;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DataProviderTestwithExcel {
	private static WebDriver driver;
	 @DataProvider(name="Authentication")
	  public Object[][] Credentials() {
	    return new Object[][] {
	      new Object[] { "shekhar.shashi111@gmail.com", "shekhar17090" },
	      new Object[] { "shekhar.shashi111@gmail.com", "shekhar17090" },
	    };
	  }
	// Here we are calling the Data Provider object with its Name
  @Test(dataProvider = "Authentication")
  public void test(String sUsername, String sPassword) {
	  driver = new FirefoxDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("https://www.facebook.com");
		driver.findElement(By.id("email")).sendKeys(sUsername);
		  driver.findElement(By.id("pass")).sendKeys(sPassword);
		  driver.findElement(By.id("loginbutton")).click();
		  driver.findElement(By.id("userNavigationLabel")).click();
		  driver.findElement(By.xpath("//*[@id='BLUE_BAR_ID_DO_NOT_USE']/div/div/div[1]/div/div/ul/li[16]/a/span/span[contains(text(),'Log Out')]")).click();
		  driver.quit();
  
  }

 
}
