package log4jSample;
import org.apache.log4j.BasicConfigurator;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;

public class SampleEntry {

	//mainLogger is a logger object that we got from LogManager. All loggers are 
        //using this method only. We can consider LogManager as a factory to create
        //Logger objects
	static Logger mainLogger = LogManager.getLogger(SampleEntry.class.getName());

	public static void main(String[] args) {
        BasicConfigurator.configure();
		mainLogger.info("This is just a logger");
	}

}
