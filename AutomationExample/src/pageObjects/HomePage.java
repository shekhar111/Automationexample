package pageObjects;
import org.openqa.selenium.*;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class HomePage {
	
	public static WebElement element;
	public static WebElement NavigationLink(WebDriver driver)
	{
		element =driver.findElement(By.id("userNavigationLabel"));
		return element;
	}
	public static WebElement LogoutLink(WebDriver driver)
	{
		element =driver.findElement(By.xpath("//*[@id='BLUE_BAR_ID_DO_NOT_USE']/div/div/div[1]/div/div/ul/li[16]/a/span/span[contains(text(),'Log Out')]"));
		return element;
	}

}
