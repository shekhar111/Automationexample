package appModule;
import org.openqa.selenium.WebDriver;
import pageObjects.HomePage;
import pageObjects.LoginPage;

public class SignInSignOutwithParams {
	
	public static void Execute(WebDriver driver,String uName,String passWord)
	{
		LoginPage.User_name_txtBox(driver).sendKeys(uName);
		LoginPage.User_pass_txtBox(driver).sendKeys(passWord);
		LoginPage.User_loginButton(driver).click();
	}
	public static void ExecuteLogOut(WebDriver driver)
	{
		HomePage.NavigationLink(driver).click();
		HomePage.LogoutLink(driver).click();
	}

}
