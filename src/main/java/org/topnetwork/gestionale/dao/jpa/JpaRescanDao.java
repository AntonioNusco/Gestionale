package org.topnetwork.gestionale.dao.jpa;

import org.topnetwork.gestionale.dao.model.RescanDao;

public class JpaRescanDao implements RescanDao {

private static JpaRescanDao instance = new JpaRescanDao();
	
	private JpaRescanDao() {}

	public static JpaRescanDao getInstance() {
		return instance;
	}
	
	
	
	
	
	
	
	
}
