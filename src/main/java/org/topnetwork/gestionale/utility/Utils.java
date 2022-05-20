package org.topnetwork.gestionale.utility;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.Query;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.topnetwork.gestionale.dao.jpa.JpaDaoFactory;
import org.topnetwork.gestionale.model.Applicazione;
import org.topnetwork.gestionale.model.Utente;

public class Utils {

	private static final Logger logger = Logger.getLogger(Utils.class);

	public static Utente utenteLoggato;

	public static void logInfo(Utente u) {
		PropertyConfigurator.configure("log4j.properties");
		if (u.isRuolo())
			logger.info(u.toString() + " , Ruolo : MODIFICATORE ha effettuato l'accesso");
		if (!u.isRuolo())
			logger.info(u.toString() + " , Ruolo : VISUALIZZATORE ha effettuato l'accesso");
	}

	public static void logWarn(Object o, String s) {
		PropertyConfigurator.configure("log4j.properties");
		logger.warn(o.toString() + s);
	}

	public static void logError(String s) {
		PropertyConfigurator.configure("log4j.properties");
		logger.error(s);
	}

	public static List<Object> queryList(Object o) {
		List<Object> queryList;
		EntityManager em = JpaDaoFactory.getConnection();
		Query q = em.createNativeQuery("Select * from " + getNomeClasse(o.getClass().toGenericString()));
		queryList = (List<Object>) q.getResultList();
		return queryList;
	}
	
//	public static void trovaStoPorcoDio(int id){
//		String a;
//		EntityManager em = JpaDaoFactory.getConnection();
//		for(id=1 ; id>=1 ; id++) {
//			Query q = em.createNativeQuery("Select noteonboarding from Applicazione where idapplicazione = :id");
//			q.setParameter("id", id);
//			 a = (String) q.getSingleResult();
//			System.out.println(a + id);
//		}
//		
//	}
	
	//il problema potrebbe essere nelle jointable (vedere cronologia chrome)

	public static String getNomeClasse(String s) {
//		String stringa;
//		int index = s.lastIndexOf('.');
//		stringa = s.substring(index+1, s.length());
//		return stringa;

		 String[] array = s.split("\\.");
				 System.out.println(array.length);
		 return array[array.length-1];

//		String stringa1 = "";
//		String stringa2 = "";
//		char[] array1 = s.toCharArray();
//		for (int i = array1.length - 1; i >= 0; i--) {
//			if (s.charAt(i) == '.')
//				break;
//			stringa1 += (s.charAt(i));
//			}
//			char[] array2 = stringa1.toCharArray();
//			for (int i2 = array2.length - 1; i2 >= 0; i2--) {
//				stringa2 += (stringa1.charAt(i2));
//			}
//			
//		return stringa2;

	}

	//query per visualizzatore non devono vedere quelli che non esistono
	//il modificatore si e può anche modificarlo
	
	
	
	
	
	
	
	
	
	
	
	
}
