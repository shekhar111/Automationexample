package automationFramework;

import java.util.concurrent.TimeUnit;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import appModule.SignInSignOutAction;
import appModule.SignInSignOutwithParams;
//import utility class
import utility.Constant;

public class Global_Var_TC {
	private static WebDriver driver=null;

	public static void main(String[] args) {
		driver = new FirefoxDriver();
		 driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	     //Launch the website using constant variable
		 driver.get(Constant.url);
		// Pass Constant Variables as arguments to Execute method
		 SignInSignOutwithParams.Execute(driver, Constant.UserName, Constant.passWord);
		 System.out.println("Login Successfull!!!");
	     SignInSignOutwithParams.ExecuteLogOut(driver);
	     System.out.println("Successful Logout!!!");
	     driver.quit();

	}

}
