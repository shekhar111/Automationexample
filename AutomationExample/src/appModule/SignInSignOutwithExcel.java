package appModule;
import org.openqa.selenium.WebDriver;
import pageObjects.HomePage;
import pageObjects.LoginPage;
import utility.ExcelUtils;

public class SignInSignOutwithExcel {
	public static void Execute(WebDriver driver) throws Exception
	{
		//This is to get the values from Excel sheet, passing parameters (Row num &amp; Col num)to getCellData method
		String uName=ExcelUtils.getCellData(1, 1);
		String passWord=ExcelUtils.getCellData(1, 2);
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
