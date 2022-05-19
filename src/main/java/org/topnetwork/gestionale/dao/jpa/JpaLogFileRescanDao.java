package org.topnetwork.gestionale.dao.jpa;

import org.topnetwork.gestionale.dao.model.LogFileRescanDao;

public class JpaLogFileRescanDao implements LogFileRescanDao{

	private static JpaLogFileRescanDao instance = new JpaLogFileRescanDao();
	
	private JpaLogFileRescanDao() {}

	public static JpaLogFileRescanDao getInstance() {
		return instance;
	}
	
	
	
	
	
	
	
	
	
	
}
