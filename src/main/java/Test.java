
import org.apache.log4j.BasicConfigurator;
import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.apache.log4j.spi.Configurator;
import org.apache.tomcat.util.json.JSONParser;
import org.glassfish.jersey.*;
import org.topnetwork.gestionale.appconfig.UtenteServices;
import org.topnetwork.gestionale.dao.jpa.JpaDaoFactory;
import org.topnetwork.gestionale.model.Applicazione;
import org.topnetwork.gestionale.model.Rescan;
import org.topnetwork.gestionale.model.Utente;
import org.topnetwork.gestionale.utility.Utils;

import static org.topnetwork.gestionale.utility.Utils.*;

import java.net.URISyntaxException;


public class Test {
		
	
	public static void main(String[] args) {
		
		Utente u2 = new Utente("france","naspi","gdgreg","fili@pigna.it",true);
			
//		EntityManagerFactory emf = Persistence.createEntityManagerFactory("Gestionale");
//		EntityManager em = emf.createEntityManager();
//		try {
//			EntityTransaction et = em.getTransaction();
//			et.begin();
//			em.persist(u);
//			et.commit();
//			System.out.println("ok");
//		} catch (RollbackException e) {
//			System.out.println("col cazzo");
//		}
		
		utenteLoggato = u2;

		Applicazione a = new Applicazione(0, 0, null, null, null, null, null, null, null, null, false, false, "ciao", null, null, null, null, null, null, null,
				null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null);
		Rescan r= new Rescan();
//		System.out.println(JpaDaoFactory.getDaoFactory().save(a));
//		System.out.println(JpaDaoFactory.getDaoFactory().logicDelete(a));
//		System.out.println(Utils.queryList(u).toString());
//		System.out.println(Utils.queryList(r).toString());
//		List<Applicazione> apps = new Generics<Applicazione>().queryList(a);
//				
//				//System.out.println(JpaDaoFactory.getDaoFactory().queryList(new 	Utente()));
//	
//		
//		for(Applicazione y : apps) {
//			System.out.println(y);
//		}

		
	
//			try {
//				System.out.println(new UtenteServices().add(u2));
//				System.out.println("si");
//			} catch (URISyntaxException e) {
//				e.printStackTrace();
//			}

		
		String s= "2022-05-26 12:39:29| INFO | france | naspi | fili@pigna.it | ha effettuato l'accesso";

		
		System.out.println(JpaDaoFactory.getDaoFactory().getLogFileAppDao().lfaObjectInfoCreation(s));
		//System.out.println(JpaDaoFactory.getDaoFactory().save(JpaDaoFactory.getDaoFactory().getLogFileAppDao().lfaObjectInfoCreation(s)));
	
		
		
		
		
		
		

		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
	
	
	
}
