package org.topnetwork.gestionale.dao.jpa;

import org.topnetwork.gestionale.dao.model.UtenteDao;

public class JpaUtenteDao implements UtenteDao{

private static JpaUtenteDao instance = new JpaUtenteDao();
	
	private JpaUtenteDao() {}

	public static JpaUtenteDao getInstance() {
		return instance;
	}
	
	
	
	
	
	
	
	
	
	
}
