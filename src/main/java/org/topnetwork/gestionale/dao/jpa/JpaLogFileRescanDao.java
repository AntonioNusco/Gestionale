package org.topnetwork.gestionale.dao.jpa;

import java.util.List;

import org.topnetwork.gestionale.dao.model.LogFileAppDao;
import org.topnetwork.gestionale.dao.model.LogFileRescanDao;

public class JpaLogFileRescanDao implements LogFileRescanDao{

	private static JpaLogFileRescanDao instance = new JpaLogFileRescanDao();
	
	private JpaLogFileRescanDao() {}

	public static JpaLogFileRescanDao getInstance() {
		return instance;
	}
	
	@Override
	public List<LogFileRescanDao> getAll() {
		return JpaDaoFactory.getConnection().createQuery("Select l from Logfilerescan l").getResultList();

	}
	
	
	
	
	
	
	
	
}
