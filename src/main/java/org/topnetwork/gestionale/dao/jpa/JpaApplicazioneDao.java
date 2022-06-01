package org.topnetwork.gestionale.dao.jpa;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.Query;

import org.topnetwork.gestionale.dao.model.ApplicazioneDao;
import org.topnetwork.gestionale.model.Applicazione;

public class JpaApplicazioneDao implements ApplicazioneDao {

	private static JpaApplicazioneDao instance = new JpaApplicazioneDao();

	private JpaApplicazioneDao() {
	}

	public static JpaApplicazioneDao getInstance() {
		return instance;
	}

	@Override
	public List<Applicazione> getAll() {
		return  JpaDaoFactory.getConnection().createQuery("Select a from Applicazione a").getResultList();

//		ArrayList<Applicazione> queryList;
//		EntityManager em = JpaDaoFactory.getConnection();
//		Query q = em.createQuery("Select a from Applicazione a");
//		queryList = (ArrayList<Applicazione>) q.getResultList();
////		System.out.print("" + queryList.toString());
//		return queryList;
	}
	
	public Applicazione getFromId(int idApplicazione) {
		return JpaDaoFactory.getConnection().find(Applicazione.class, idApplicazione);
	}
	
	
	
	
	
	
	
	
	
	

}
