package org.topnetwork.gestionale.dao;

import java.util.ArrayList;
import java.util.List;

import org.topnetwork.gestionale.dao.jpa.JpaDaoFactory;
import org.topnetwork.gestionale.dao.model.AppOwnerDao;
import org.topnetwork.gestionale.dao.model.ApplicazioneDao;
import org.topnetwork.gestionale.dao.model.LogFileAppDao;
import org.topnetwork.gestionale.dao.model.LogFileRescanDao;
import org.topnetwork.gestionale.dao.model.RescanDao;
import org.topnetwork.gestionale.dao.model.UtenteDao;
import org.topnetwork.gestionale.model.Applicazione;
import org.topnetwork.gestionale.model.Rescan;
import org.topnetwork.gestionale.model.Utente;


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
	
//	public abstract <E> List<E> queryList(E e);
	
//	public abstract List<Applicazione> queryApp();
	
//	public abstract ArrayList<Applicazione> queryApp2();
//	
//	public abstract ArrayList<Rescan> queryRescan();
//
//	public abstract ArrayList<Utente> queryUtenti();
//	
}
