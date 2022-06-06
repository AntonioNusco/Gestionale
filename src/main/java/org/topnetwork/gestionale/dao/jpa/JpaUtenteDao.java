package org.topnetwork.gestionale.dao.jpa;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;
import javax.persistence.NoResultException;
import javax.persistence.Query;
import javax.persistence.RollbackException;

import org.topnetwork.gestionale.dao.DaoFactory;
import org.topnetwork.gestionale.dao.model.UtenteDao;
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
		Query q = em.createQuery("Select u from Utente u where email = :email and password = :password");
		q.setParameter("email", email);
		q.setParameter("password", password);
		try {
			return (Utente) q.getSingleResult();
		} catch (NoResultException e) {
			return null;
		}
	}
	

	@Override
	public boolean registrazioneVisualizzatore(String nome, String cognome, String password, String email) {
		return registrazione(new Utente(nome, cognome, password, email,false));
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

	
	@Override
	public boolean updateRole(int idUtente) {
	
		EntityManager em = JpaDaoFactory.getConnection();
		Query q = em.createQuery("update Utente set ruolo = true where id = :id");
		q.setParameter("id", idUtente);
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
	
	
}
