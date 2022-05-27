package org.topnetwork.gestionale.dao.jpa;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeFormatterBuilder;
import java.time.temporal.ChronoField;

import javax.persistence.EntityManager;
import javax.persistence.NoResultException;
import javax.persistence.Query;

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

	public LogFileApp lfaObjectInfoCreation(String s) {

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

		LocalDateTime date = LocalDateTime.parse(dt, DATE_FORMAT);
		
		Utente a;
		EntityManager em = JpaDaoFactory.getConnection();
		Query q = em.createQuery("select u from Utente u where u.email = :x");
		try {
			a = (Utente) q.setParameter("x", email).getSingleResult();
		}catch(NoResultException e){
			e.printStackTrace();
			return null;
		}

		LogFileApp lfa = new LogFileApp(date, a, action);
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
