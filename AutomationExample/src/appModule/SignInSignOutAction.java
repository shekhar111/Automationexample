package appModule;
import org.openqa.selenium.WebDriver;
import pageObjects.HomePage;
import pageObjects.LoginPage;

public class SignInSignOutAction {
	
	public static void Execute(WebDriver driver)
	{
		LoginPage.User_name_txtBox(driver).sendKeys("shekhar.shashi111@gmail.com");
		LoginPage.User_pass_txtBox(driver).sendKeys("shekhar17090");
		LoginPage.User_loginButton(driver).click();
	}
	public static void ExecuteLogOut(WebDriver driver)
	{
		HomePage.NavigationLink(driver).click();
		HomePage.LogoutLink(driver).click();
	}

}
