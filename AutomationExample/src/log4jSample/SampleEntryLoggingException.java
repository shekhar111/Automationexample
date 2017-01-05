package log4jSample;
import org.apache.log4j.BasicConfigurator;
import org.apache.log4j.Level;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;

public class SampleEntryLoggingException {

	public static void main(String[] args) {
		BasicConfigurator.configure();
	    Logger LoggerParent = LogManager.getLogger("LoggerParent");
	    try
	     {
	    	 // We will get a divide by zero exception her
	    	 int x = 200 / 0;
	     }
	     catch(Exception exp)
	     {
	       LoggerParent.warn("Following exception was raised", exp);	 
	     } 
		

	}

}
