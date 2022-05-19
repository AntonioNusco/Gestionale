package org.topnetwork.gestionale.dao.jpa;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.Query;
import javax.persistence.RollbackException;

import org.topnetwork.gestionale.dao.DaoFactory;
import org.topnetwork.gestionale.dao.model.AppOwnerDao;
import org.topnetwork.gestionale.dao.model.ApplicazioneDao;
import org.topnetwork.gestionale.dao.model.LogFileAppDao;
import org.topnetwork.gestionale.dao.model.LogFileRescanDao;
import org.topnetwork.gestionale.dao.model.RescanDao;
import org.topnetwork.gestionale.dao.model.UtenteDao;
import org.topnetwork.gestionale.model.Applicazione;
import org.topnetwork.gestionale.model.Rescan;
import org.topnetwork.gestionale.utility.*;

public class JpaDaoFactory extends DaoFactory {

	public static EntityManager getConnection() {
		try {
			Class.forName("org.postgresql.Driver");
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("Gestionale");
		EntityManager em = emf.createEntityManager();
		return em;

	}

	@Override
	public ApplicazioneDao getApplicazioneDao() {
		return JpaApplicazioneDao.getInstance();
	}

	@Override
	public AppOwnerDao getAppOwnerDao() {
		return JpaAppOwnerDao.getInstance();
	}


	@Override
	public LogFileAppDao getLogFileAppDao() {
		return JpaLogFileAppDao.getInstance();
	}

	@Override
	public LogFileRescanDao getLogFileRescanDao() {
		return JpaLogFileRescanDao.getInstance();
	}

	@Override
	public RescanDao getRescanDao() {
		return JpaRescanDao.getInstance();
	}

	@Override
	public UtenteDao getUtenteDao() {
		return JpaUtenteDao.getInstance(); 
	}
	
	@Override
	public <E> boolean save(E e) {
		EntityManager em = JpaDaoFactory.getConnection();
		EntityTransaction et = em.getTransaction();
		try {
			et.begin();
			em.persist(e);
			et.commit();
			Utils.logWarn(Utils.utenteLoggato.toString()," HA INSERITO " + e);
			return true;
		} catch (RollbackException i) {
			i.printStackTrace();
			return false;
		}
	}
	
	//mostra ulteriori infromazioni
   //come stringa al front
	

	@Override
	public <E> boolean logicDelete(E e) {
		int id = 0;
		String s = "";
		if(e instanceof Applicazione) {
			id = ((Applicazione) e).getIdApplicazione();
			s = "Applicazione";
		} else if (e instanceof Rescan) {
			id = ((Rescan) e).getIdRescan();
			s = "Rescan";
		} else return false;
		EntityManager em = JpaDaoFactory.getConnection();
		Query q = em.createQuery("update " + s + " set exist = false where id = :id");
		q.setParameter("id", id);
		EntityTransaction et = em.getTransaction();
		try {
			et.begin();
			q.executeUpdate();
			et.commit();
			Utils.logWarn(Utils.utenteLoggato.toString()," HA ELIMINATO " + e);
			return true;
		} catch (RollbackException i) {
			i.printStackTrace();
			return false;
		}
	}

	
	@Override
	public <E> boolean delete(E e) {
		EntityManager em = JpaDaoFactory.getConnection();
		EntityTransaction et = em.getTransaction();
		try {
			et.begin();
			em.remove(e);
			et.commit();
			Utils.logWarn(Utils.utenteLoggato.toString()," HA ELIMINATO DEFINITIVAMENTE" + e);
			return true;
		} catch (RollbackException i) {
			i.printStackTrace();
			return false;
		}
	}
	

	
	
	
	
	
	
	
	
	
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

