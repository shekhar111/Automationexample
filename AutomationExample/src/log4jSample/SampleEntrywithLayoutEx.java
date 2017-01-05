package log4jSample;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;

public class SampleEntrywithLayoutEx {

	public static void main(String[] args) {
		Logger chance = LogManager.getLogger(SampleEntrywithLayoutEx.class.getName());
		Logger logger1 = LogManager.getLogger("Child1");
		Logger logger1Child = logger1.getLogger("Child1.ChildOfLogger1");
		Logger loggerGrandChild = LogManager.getLogger("Child1.ChildOfLogger1.GrandChild");
		
		System.out.println("logger1's full name is " + logger1.getParent().getName());
	      System.out.println("logger1Child's full name is " + logger1Child.getParent().getName());
	      System.out.println("loggerGrandChild's full name is " + loggerGrandChild.getParent().getName());
	}

}
