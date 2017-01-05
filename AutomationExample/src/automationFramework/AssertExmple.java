package automationFramework;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;
import utility.Constant;

public class AssertExmple {
	private WebDriver driver;
	@Test
	public void testCaseVerifyHomePage() {
		driver= new FirefoxDriver();
		driver.navigate().to("https://facebook.com");
		Assert.assertEquals("Facebook - Log In or Sign Up", driver.getTitle(), "Strings are not matching");
		//Write a code to login and write a method called isUserLoggedInSuccessfully and isUserLoggedOut which returns boolean.
		driver.findElement(By.id("email")).sendKeys(Constant.UserName);
		driver.findElement(By.id("pass")).sendKeys(Constant.passWord);
		driver.findElement(By.id("loginbutton")).click();
		Assert.assertTrue(driver.findElement(By.id("userNavigationLabel")).isDisplayed(),"User Navigation Label is not displayed");
		/*Assert.assertTrue(isUserLoggedInSuccessfully(), "User failed to login");
		Assert.assertFalse(isUserLoggedOut());*/
		driver.findElement(By.xpath("//*[@id='BLUE_BAR_ID_DO_NOT_USE']/div/div/div[1]/div/div/ul/li[16]/a/span/span[contains(text(),'Log Out')]"));
		driver.quit();
		Reporter.log("Logged Out and Browser closed");
	}
}
		

