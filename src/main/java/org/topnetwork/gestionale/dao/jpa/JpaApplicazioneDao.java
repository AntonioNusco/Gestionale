package org.topnetwork.gestionale.dao.jpa;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;
import javax.persistence.Query;
import javax.persistence.RollbackException;

import org.topnetwork.gestionale.dao.model.ApplicazioneDao;
import org.topnetwork.gestionale.model.Applicazione;
;

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
	}
	
	@Override
	public boolean logicDelete(Applicazione a) {
	
		EntityManager em = JpaDaoFactory.getConnection();
		Query q = em.createQuery("update Applicazione set exist = false where id = :id");
		q.setParameter("id", a.getIdApplicazione());
		EntityTransaction et = em.getTransaction();
		try {
			et.begin();
			q.executeUpdate();
			et.commit();
			return true;
		} catch (RollbackException i) {
			i.printStackTrace();
			return false;
		}
	}
	
	@Override
	public boolean logicResave(Applicazione a) {
		
		EntityManager em = JpaDaoFactory.getConnection();
		Query q = em.createQuery("update Applicazione set exist = true where id = :id");
		q.setParameter("id", a.getIdApplicazione());
		EntityTransaction et = em.getTransaction();
		try {
			et.begin();
			q.executeUpdate();
			et.commit();
			return true;
		} catch (RollbackException i) {
			i.printStackTrace();
			return false;
		}
	}
	
	@Override
	public Applicazione getFromId(int idApplicazione) {
		return JpaDaoFactory.getConnection().find(Applicazione.class, idApplicazione);
	}
	
	
	
	
	
	
	
	
	
	

}
