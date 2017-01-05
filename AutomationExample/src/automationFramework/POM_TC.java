package automationFramework;
import org.openqa.selenium.*;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.firefox.FirefoxDriver;
import pageObjects.HomePage;
import pageObjects.LoginPage;

public class POM_TC {
	
	private static WebDriver driver = null;
	public static void main(String[] args) {
		 driver = new FirefoxDriver();
		 driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	     driver.get("https://www.facebook.com/");
	     // // Use page Object library now
	     LoginPage.User_name_txtBox(driver).sendKeys("shekhar.shashi111@gmail.com");
	     LoginPage.User_pass_txtBox(driver).sendKeys("shekhar17090");
	     LoginPage.User_loginButton(driver).click();
	     System.out.println("Login Successfull!!!");
	     HomePage.NavigationLink(driver).click();
	     HomePage.LogoutLink(driver).click();
	     System.out.println("Successful Logout!!!");

	}

}
