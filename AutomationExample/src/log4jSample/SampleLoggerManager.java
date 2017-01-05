package log4jSample;
import org.apache.log4j.BasicConfigurator;
import org.apache.log4j.Category;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;

import java.util.ArrayList;
import java.util.Enumeration;

public class SampleLoggerManager {

	public static void main(String[] args) {
		Logger logger1=LogManager.getLogger("Logger1");
		Logger logger2=LogManager.getLogger("Logger2");
		Logger logger3=LogManager.getLogger("Logger3");
		BasicConfigurator.configure();
		logger1.info("This is logger 1");
		logger2.info("This is logger 2");
		logger3.info("This is logger 3");

				Enumeration loggers=LogManager.getCurrentLoggers();
		while(loggers.hasMoreElements())
		{
			logger3.info("Logger name is " + ((Category) loggers.nextElement()).getName());			
		}
		
		
		

	}

}
