package automationFramework;
import org.openqa.selenium.*;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.firefox.FirefoxDriver;
import pageObjects.HomePage;
import pageObjects.LoginPage;
import appModule.SignInSignOutAction;

public class Module_TC {
	private static WebDriver driver = null;

	public static void main(String[] args) {
		driver = new FirefoxDriver();
		 driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	     driver.get("https://www.facebook.com/");
	  // Use your Module SignIn now
	     SignInSignOutAction.Execute(driver);
	     System.out.println("Login Successfull!!!");
	     SignInSignOutAction.ExecuteLogOut(driver);
	     System.out.println("Successful Logout!!!");

	}

}
