package automationFramework;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
//import SignInSignOutwithExcel class
import appModule.SignInSignOutwithExcel;
import utility.ExcelUtils;
import utility.Constant;

public class Apache_POI_TC {
	private static WebDriver driver = null;

	public static void main(String[] args) throws Exception{
		//This is to open the Excel file. Excel path, file name and the sheet name are parameters to this method
		ExcelUtils.setExcelFile(Constant.Path_testData + Constant.File_TestData,"Sheet1");
		driver = new FirefoxDriver();
		driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
		driver.get(Constant.url);
		SignInSignOutwithExcel.Execute(driver);
		System.out.println("Login Successfull!!!");
		SignInSignOutwithExcel.ExecuteLogOut(driver);
		System.out.println("Successful Logout!!!");
		driver.quit();
		//This is to send the PASS value to the Excel sheet in the result column
		ExcelUtils.setCellData("P", 1,3);

	}

}
