package automationFramework;
import java.util.concurrent.TimeUnit;
import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class TestNG {
	public WebDriver driver;
  @Test
  public void main() {
	  driver.findElement(By.id("email")).sendKeys("shekhar.shashi111@gmail.com");
	  driver.findElement(By.id("pass")).sendKeys("shekhar17090");
	  driver.findElement(By.id("loginbutton")).click();
	  System.out.println("Logged in successfully.....");
	  driver.findElement(By.id("userNavigationLabel")).click();
	  driver.findElement(By.xpath("//*[@id='BLUE_BAR_ID_DO_NOT_USE']/div/div/div[1]/div/div/ul/li[16]/a/span/span[contains(text(),'Log Out')]")).click();
	  System.out.println("Logged Out successful.....");
  }
  @BeforeMethod
  public void beforeMethod() {
	  
	  driver = new FirefoxDriver();
		 driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	     driver.get("https://www.facebook.com/");
  }

  @AfterMethod
  public void afterMethod() {
	  
	  driver.quit();
  }

}
