package org.topnetwork.gestionale.dao.jpa;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.NoResultException;
import javax.persistence.Query;

import org.topnetwork.gestionale.dao.DaoFactory;
import org.topnetwork.gestionale.dao.model.LogFileAppDao;
import org.topnetwork.gestionale.dao.model.UtenteDao;
import org.topnetwork.gestionale.model.Applicazione;
import org.topnetwork.gestionale.model.Utente;

public class JpaUtenteDao implements UtenteDao {

	private static JpaUtenteDao instance = new JpaUtenteDao();

	private JpaUtenteDao() {
	}

	public static JpaUtenteDao getInstance() {
		return instance;
	}

	@Override
	public Utente login(String email, String password) {
		EntityManager em = JpaDaoFactory.getConnection();
		Query q = em.createQuery("Select u from utente where u.email = :email and u.password = :password");
		q.setParameter("email", email);
		q.setParameter("password", password);
//		try {
			return (Utente) q.getSingleResult();
//		} catch (NoResultException e) {
//			return null;
//		}
	}
	

	@Override
	public boolean registrazioneVisualizzatore(String nome, String cognome, String password, String email) {
		return registrazione(new Utente(nome, cognome, password, email, false));
	}

	@Override
	public boolean registrazione(Utente u) {
		return DaoFactory.getDaoFactory().save(u);
	}

	@Override
	public List<Utente> getAll() {
		return JpaDaoFactory.getConnection().createQuery("Select u from Utente u").getResultList();
	}
	
	@Override
	public Utente getFromId(int idUtente) {
		return JpaDaoFactory.getConnection().find(Utente.class, idUtente);
	}

	
	
}
