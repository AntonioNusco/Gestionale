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
		return  JpaDaoFactory.getConnection().createQuery("Select a from Applicazione a where exist = true").getResultList();
	}
	
	@Override
	public boolean logicDelete(int idApplicazione) {
	
		EntityManager em = JpaDaoFactory.getConnection();
		Query q = em.createQuery("update Applicazione set exist = false where id = :id");
		q.setParameter("id", idApplicazione);
		EntityTransaction et = em.getTransaction();
		try {
			et.begin();
			q.executeUpdate();
			et.commit();
			em.close();
			return true;
		} catch (RollbackException i) {
			i.printStackTrace();
			return false;
		}
	}
	
	@Override
	public boolean logicResave(int idApplicazione) {
		EntityManager em = JpaDaoFactory.getConnection();
		Query q = em.createQuery("update Applicazione set exist = true where id = :id");
		q.setParameter("id", idApplicazione);
		EntityTransaction et = em.getTransaction();
		try {
			et.begin();
			q.executeUpdate();
			et.commit();
			em.close();
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
	
	@Override
	public List<Applicazione> getDeletedApplication(){
		return JpaDaoFactory.getConnection().createQuery("Select a from Applicazione a where exist = false").getResultList();
	}
	
	
	
	
	
	
	
	

}
