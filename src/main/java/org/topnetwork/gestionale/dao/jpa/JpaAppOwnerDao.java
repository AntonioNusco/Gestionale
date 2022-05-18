package org.topnetwork.gestionale.dao.jpa;

import org.topnetwork.gestionale.dao.model.AppOwnerDao;

public class JpaAppOwnerDao implements AppOwnerDao{

	private static JpaAppOwnerDao instance = new JpaAppOwnerDao();
	
	private JpaAppOwnerDao() {}

	public static JpaAppOwnerDao getInstance() {
		return instance;
	}
	
	
}
