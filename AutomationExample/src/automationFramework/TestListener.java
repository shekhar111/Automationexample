package automationFramework;
import utility.Listener;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Listeners;
import org.testng.annotations.AfterMethod;


// This code will implement TestNG listeners
@Listeners(utility.Listener.class)
public class TestListener {
	 @BeforeMethod
	 public void beforeMethod() {
	 System.out.println("Execution of Before method is carring on");
	 }
     @Test
	 public void main() {
     System.out.println("Execution of Main test is carring on");
	 }
     @AfterMethod
     public void afterMethod() {
     System.out.println("Execution of After method is carring on");
    }

}
