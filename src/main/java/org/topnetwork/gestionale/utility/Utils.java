package org.topnetwork.gestionale.utility;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;

public class Utils {

	private static final Logger logger = Logger.getLogger(Utils.class);
	
	public static void logInfo(String s) {
		PropertyConfigurator.configure("log4j.properties");
		logger.info(s);
	}
	
	public static void logWarn(String s) {
		PropertyConfigurator.configure("log4j.properties");
		logger.warn(s);
	}
	
	public static void logError(String s) {
		PropertyConfigurator.configure("log4j.properties");
		logger.error(s);
	}
	
	
	
	
	
	
}
