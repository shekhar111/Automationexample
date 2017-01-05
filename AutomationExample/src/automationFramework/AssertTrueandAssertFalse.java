package automationFramework;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.annotations.Test;

public class AssertTrueandAssertFalse {
	private static WebDriver driver;
  @Test
  public void AssertTest() {
	  driver = new FirefoxDriver();
	  driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
      driver.get("https://facebook.com");
   // Here driver will try to find out submit button on the application
      driver.findElement(By.id("email")).sendKeys("shekhar.shashi111@gmail.com");
      driver.findElement(By.id("pass")).sendKeys("shekhar17090");
      WebElement subButton=driver.findElement(By.id("loginbutton"));
      WebElement logoutLink=driver.findElement(By.id("userNavigationLabel"));
    //Test will only continue, if the below statement is true
      //This is to check whether the link is displayed or not
      Assert.assertTrue(subButton.isDisplayed(),"Login button is not present");
    
      Assert.assertFalse(logoutLink.isEnabled());
    //Login button will be clicked only if the above Assert.assertTrue condition is true
      subButton.click();
      
  }
}
