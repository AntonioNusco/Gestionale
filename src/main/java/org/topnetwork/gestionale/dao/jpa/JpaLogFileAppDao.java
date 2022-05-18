package org.topnetwork.gestionale.dao.jpa;

import org.topnetwork.gestionale.dao.model.LogFileAppDao;

public class JpaLogFileAppDao implements LogFileAppDao {

	private static JpaLogFileAppDao instance = new JpaLogFileAppDao();
	
	private JpaLogFileAppDao() {}

	public static JpaLogFileAppDao getInstance() {
		return instance;
	}
	
	
	
	
	
	
}
