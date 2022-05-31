package org.topnetwork.gestionale.dao.jpa;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeFormatterBuilder;
import java.time.temporal.ChronoField;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;
import javax.persistence.NoResultException;
import javax.persistence.Query;
import javax.persistence.RollbackException;

import org.topnetwork.gestionale.dao.model.AppOwnerDao;
import org.topnetwork.gestionale.dao.model.LogFileAppDao;
import org.topnetwork.gestionale.model.LogFileApp;
import org.topnetwork.gestionale.model.Utente;

public class JpaLogFileAppDao implements LogFileAppDao {

	private static JpaLogFileAppDao instance = new JpaLogFileAppDao();

	private JpaLogFileAppDao() {
	}

	public static JpaLogFileAppDao getInstance() {
		return instance;
	}
	
	@Override
	public List<LogFileAppDao> getAll() {
		return JpaDaoFactory.getConnection().createQuery("Select l from LogFileAppDao l").getResultList();

	}

	public LogFileApp lfaObjectInfoCreation(String s) {

		Utente a;

		final DateTimeFormatter DATE_FORMAT = new DateTimeFormatterBuilder()
				.appendPattern("yyyy-MM-dd[ [HH][:mm][:ss]]").parseDefaulting(ChronoField.HOUR_OF_DAY, 0)
				.parseDefaulting(ChronoField.MINUTE_OF_HOUR, 0).parseDefaulting(ChronoField.SECOND_OF_MINUTE, 0)
				.toFormatter();

		String[] array = s.split("\\|");

		String dt = array[0];
		String email = array[4].trim();
		String action = array[5];

		LocalDateTime date = LocalDateTime.parse(dt, DATE_FORMAT);

		EntityManager em = JpaDaoFactory.getConnection();
		EntityTransaction et = em.getTransaction();
		Query q = em.createQuery("select u from Utente u where u.email =:email");
		try {
			a = (Utente) q.setParameter("email", email).getSingleResult();
		} catch (NoResultException e) {
			e.printStackTrace();
			return null;
		}
		LogFileApp lfa = new LogFileApp(date, a, action);
		try {
			et.begin();
			em.persist(lfa);
			et.commit();
		} catch (RollbackException e) {
			e.printStackTrace();
		}
		return lfa;
	}

	public LogFileApp lfaObjectWarnCreation(String s) {

		String[] array = s.split("\\|");

		final DateTimeFormatter DATE_FORMAT = new DateTimeFormatterBuilder()
				.appendPattern("yyyy-MM-dd[ [HH][:mm][:ss]]").parseDefaulting(ChronoField.HOUR_OF_DAY, 0)
				.parseDefaulting(ChronoField.MINUTE_OF_HOUR, 0).parseDefaulting(ChronoField.SECOND_OF_MINUTE, 0)
				.toFormatter();

		String dt = array[0];
		String nome = array[2];
		String cognome = array[3];
		String email = array[4];
		String action = array[5];
		String vecchioValore;
		String nuovoValore = array[6];

		LocalDateTime date = LocalDateTime.parse(dt, DATE_FORMAT);

		Utente u = new Utente(nome, cognome, email);

		LogFileApp lfa = new LogFileApp(date, u, action);
		return lfa;
	}

}
