package org.topnetwork.gestionale.dao;

import org.topnetwork.gestionale.dao.jpa.JpaDaoFactory;
import org.topnetwork.gestionale.dao.model.AppOwnerDao;
import org.topnetwork.gestionale.dao.model.ApplicazioneDao;
import org.topnetwork.gestionale.dao.model.LogFileAppDao;
import org.topnetwork.gestionale.dao.model.LogFileRescanDao;
import org.topnetwork.gestionale.dao.model.RescanDao;
import org.topnetwork.gestionale.dao.model.UtenteDao;


public abstract class DaoFactory {
	
	public static DaoFactory getDaoFactory() {
		return new JpaDaoFactory();
	}
	
	public abstract ApplicazioneDao getApplicazioneDao();
	public abstract AppOwnerDao getAppOwnerDao();
	public abstract LogFileAppDao getLogFileAppDao();
	public abstract LogFileRescanDao getLogFileRescanDao();
	public abstract RescanDao getRescanDao();
	public abstract UtenteDao getUtenteDao();
	
	public abstract <E> boolean save(E e);
	public abstract <E> boolean delete(E e);
	public abstract <E> boolean logicDelete(E e);

	public abstract <E> boolean update(E e, String nomeColonna, E nuovoValore);

	
	
}
