package automation;

import org.apache.log4j.Logger;
import org.apache.log4j.BasicConfigurator;
 
public class Log4JCrunchifyTest {
	static Logger log = Logger.getLogger(Log4JCrunchifyTest.class);
 
	public static void main(String[] args) {
		BasicConfigurator.configure();
		log.info("This is Logger Info");
	}
}