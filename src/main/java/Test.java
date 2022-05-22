
import org.apache.log4j.BasicConfigurator;
import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.apache.log4j.spi.Configurator;
import org.apache.tomcat.util.json.JSONParser;
import org.glassfish.jersey.*;
import org.topnetwork.gestionale.dao.jpa.JpaDaoFactory;
import org.topnetwork.gestionale.model.Applicazione;
import org.topnetwork.gestionale.model.Rescan;
import org.topnetwork.gestionale.model.Utente;
import org.topnetwork.gestionale.utility.Utils;

import static org.topnetwork.gestionale.utility.Utils.*;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.RollbackException;

public class Test {
		
	
	public static void main(String[] args) {
		
		Utente u = new Utente("filippo","vescovo","pwd", "email",true);
			
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("Gestionale");
		EntityManager em = emf.createEntityManager();
		try {
			EntityTransaction et = em.getTransaction();
			et.begin();
			em.persist(u);
			et.commit();
			System.out.println("ok");
		} catch (RollbackException e) {
			System.out.println("col cazzo");
		}
		
		Utils.utenteLoggato = u;

		Applicazione a = new Applicazione(0, 0, null, null, null, null, null, null, null, null, false, false, "ciao", null, null, null, null, null, null, null,
				null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null);
		Rescan r= new Rescan();
	//	System.out.println(JpaDaoFactory.getDaoFactory().save(a));
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

		
		System.out.println(new Generics<Applicazione>().queryList(a));
		
		
//		
//		trovaStoPorcoDio(1);
		
	
		

		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
