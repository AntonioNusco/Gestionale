package org.topnetwork.gestionale.dao.jpa;

import org.topnetwork.gestionale.dao.model.LogFileRescanDao;

public class JpaLogRescanFileDao implements LogFileRescanDao{

	private static JpaLogRescanFileDao instance = new JpaLogRescanFileDao();
	
	private JpaLogRescanFileDao() {}

	public static JpaLogRescanFileDao getInstance() {
		return instance;
	}
	
	
	
	
	
	
	
	
	
	
}
