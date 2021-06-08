package automation;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;

public class logger_Appender {

	public static void main(String[] args) throws FileNotFoundException
	{
		Logger log=Logger.getLogger(logger_Appender.class);
		
		FileInputStream file=new FileInputStream("D:\\Study\\Testing Class\\local\\selenium-practice\\classes\\log4j.properties");
		PropertyConfigurator.configure(file);
		
		log.info("Testing");
		log.error("Testing2");
		log.warn("Testing3");
	}

}
