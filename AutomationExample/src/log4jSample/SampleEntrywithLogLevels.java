package log4jSample;
import org.apache.log4j.BasicConfigurator;
import org.apache.log4j.Level;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;

public class SampleEntrywithLogLevels {

	public static void main(String[] args) {
		BasicConfigurator.configure();
	    Logger Mylogger = LogManager.getLogger("DebugLogger");
	    Logger LoggerChild = LogManager.getLogger("DebugLogger.Child");
	   
	  //Setting up the log level of both loggers
	      Mylogger.setLevel(Level.DEBUG);
	      Mylogger.trace("This is the trace log - DEBUG");
	      Mylogger.debug("This is debug log - DEBUG");
	      Mylogger.info("This is info log - DEBUG");
	      Mylogger.warn("This is Warn log - DEBUG");
	      Mylogger.error("This is error log - DEBUG");
	      Mylogger.fatal("This is Fatal log - DEBUG");
	 
	      Mylogger.setLevel(Level.WARN);
	      Mylogger.trace("This is the trace log - WARN");	
	      Mylogger.debug("This is debug log - WARN");
	      Mylogger.info("This is info log - WARN");
	      Mylogger.warn("This is Warn log - WARN");
	      Mylogger.error("This is error log - WARN");
	      Mylogger.fatal("This is Fatal log - WARN");
	      //Display LoggerChild levels
	      
	      LoggerChild.trace("This is the trace log - CHILD");
	      LoggerChild.debug("This is debug log - CHILD");
	      LoggerChild.info("This is info log - CHILD");
	      LoggerChild.warn("This is Warn log - CHILD");
	      LoggerChild.error("This is error log - CHILD");
	      LoggerChild.fatal("This is Fatal log - CHILD"); 
	     
	

	}

}
