package pageObjects;
import org.openqa.selenium.*;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LoginPage {
	public static WebElement element=null;
	//Driver is being passed as an Argument so that Selenium is able to locate the element on the browser (driver).
	//Element is returned, so that an Action can be performed on it.
	//Method is declared as Public Static, so that it can be called in any other method without instantiate the class.
	public static WebElement User_name_txtBox(WebDriver driver)
	{
		element=driver.findElement(By.id("email"));
		return element;
	}
	public static WebElement User_pass_txtBox(WebDriver driver)
	{
		element= driver.findElement(By.id("pass"));
		return element;
	}
	public static WebElement User_loginButton(WebDriver driver)
	{
		element= driver.findElement(By.id("loginbutton"));
		return element;
	}

}
