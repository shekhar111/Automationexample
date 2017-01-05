package automationFramework;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import appModule.SignInSignOutAction;
import appModule.SignInSignOutwithParams;

public class Module_Params_TC {

	private static WebDriver driver = null;

	public static void main(String[] args) {
		driver = new FirefoxDriver();
		 driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	     driver.get("https://www.facebook.com/");
	  // Use your Module SignIn with Params now
	     //// Pass the Arguments (Username and Password) to this method
	     SignInSignOutwithParams.Execute(driver,"shekhar.shashi111@gmail.com","shekhar17090");
	     System.out.println("Login Successfull!!!");
	     SignInSignOutwithParams.ExecuteLogOut(driver);
	     System.out.println("Successful Logout!!!");
	     driver.quit();

	}

}
