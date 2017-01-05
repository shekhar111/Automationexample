package automationFramework;
import org.testng.annotations.*;

public class Sequencing {
	
	@Test
	public void testCase1()
	{
		System.out.println("This is Test Case 1");
	}
	@Test
	public void testCase2()
	{
		System.out.println("This is Test Case 2");
	}
	@BeforeMethod
	 
	public void beforeMethod() {

		System.out.println("@BeforeMethod : This will execute before every Method");

	}
	@AfterMethod
	 
	public void afterMethod() {

		System.out.println("@AfterMethod : This will execute after every Method");

	}
	@BeforeClass
	 
	public void beforeClass() {

		System.out.println("@BeforeClass : This will execute before the Class");

	}
	@AfterClass
	 
	public void afterClass() {

		System.out.println("@AfterClass : This will execute after the Class");

	}
	@BeforeTest
	 
	public void beforeTest() {

		System.out.println("@BeforeTest : This will execute before the Test");

	}
	@AfterTest
	 
	public void afterTest() {

		System.out.println("@AfterTest : This will execute after the Test");

	}
	@BeforeSuite
	 
	public void beforeSuite() {

		System.out.println("@BeforeSuite : This will execute before the Test Suite");

	}
	@AfterSuite
	 
	public void afterSuite() {

		System.out.println("@AfterSuite: This will execute after the Test Suite");

	}
}
