package org.topnetwork.gestionale.utility;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.topnetwork.gestionale.model.Utente;

public class Utils {

	private static final Logger logger = Logger.getLogger(Utils.class);
	
	public static void logInfo(Utente u) {
		PropertyConfigurator.configure("log4j.properties");
		if(u.isRuolo())logger.info(u.toString() + " , Ruolo : MODIFICATORE ha effettuato l'accesso");
		if(!u.isRuolo())logger.info(u.toString() + " , Ruolo : VISUALIZZATORE ha effettuato l'accesso");
	}
	
	public static void logWarn(Object o) {
		PropertyConfigurator.configure("log4j.properties");
		logger.warn(o.toString());
	}
	
	public static void logError(String s) {
		PropertyConfigurator.configure("log4j.properties");
		logger.error(s);
	}
	
	
	
	
	
	
}
