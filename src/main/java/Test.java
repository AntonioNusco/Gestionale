
import static org.topnetwork.gestionale.utility.Utils.utenteLoggato;

import org.topnetwork.gestionale.model.Rescan;
import org.topnetwork.gestionale.model.Utente;


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

		
//		System.out.println(JpaDaoFactory.getDaoFactory().getLogFileAppDao().lfaObjectInfoCreation(s));
		//System.out.println(JpaDaoFactory.getDaoFactory().save(JpaDaoFactory.getDaoFactory().getLogFileAppDao().lfaObjectInfoCreation(s)));
	
		
//		qualcosa();
		
		
		
		

		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
	
//	public static String qualcosa() {
//		List<Applicazione> app = new ArrayList<Applicazione>();
//
//		Applicazione a = new Applicazione(0, 0, null, null, null, null, null, null, null, null, false, false, "ciao", null, null, null, null, null, null, null,
//				null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null);
//		
//		Applicazione a2 = new Applicazione(0, 0, null, null, null, null, null, null, null, null, false, false, "ciao", null, null, null, null, null, null, null,
//				null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null);
//		
//		app.add(a);
//		app.add(a2);
//		ObjectMapper om = new ObjectMapper();
//		try {
//			System.out.print(om.writeValueAsString(app));
//			return om.writeValueAsString(app);
//		} catch (JsonProcessingException e) {
//			e.printStackTrace();
//			return null;
//		}
//	}
	
	
	
}
