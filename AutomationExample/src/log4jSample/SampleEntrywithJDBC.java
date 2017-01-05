package log4jSample;
import org.apache.log4j.BasicConfigurator;
import org.apache.log4j.FileAppender;
import org.apache.log4j.ConsoleAppender;
import org.apache.log4j.jdbc.JDBCAppender;
import org.apache.log4j.Layout;
import org.apache.log4j.Level;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.apache.log4j.SimpleLayout;

public class SampleEntrywithJDBC {

	public static void main(String[] args) {
		BasicConfigurator.configure();
	     Logger OurLogger = LogManager.getLogger("OurLogger");

	     //create a JDBCAppender class instance
	     JDBCAppender dataBaseAppender = new JDBCAppender();
	     //Provide connection details to the 
	     //Database appender
	     dataBaseAppender.setURL("jdbc:oracle:thin:@localhost:1521:orcl"); //Connection url
	     dataBaseAppender.setUser("HR"); //Username for the DB connection
	     dataBaseAppender.setPassword("HR"); //Password for the DB connection
	     dataBaseAppender.setDriver("oracle.jdbc.driver.OracleDriver"); // Drivers to use to connect to DB

	     //set the sql insert statement that you want to use
	     dataBaseAppender.setSql("select * from customers");   

        //activate the new options
	     dataBaseAppender.activateOptions();

	     //Attach the appender to the Logger
	     OurLogger.addAppender(dataBaseAppender);

	     int x = 0;
	     while(x < 11){
	    	 OurLogger.debug("This is just a log that I want to print " + x);
		     x++;

	}

}
}
