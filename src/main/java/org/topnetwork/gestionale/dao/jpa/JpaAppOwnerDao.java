package org.topnetwork.gestionale.dao.jpa;

import java.util.List;

import org.topnetwork.gestionale.dao.model.AppOwnerDao;

public class JpaAppOwnerDao implements AppOwnerDao {

	private static JpaAppOwnerDao instance = new JpaAppOwnerDao();

	private JpaAppOwnerDao() {
	}

	public static JpaAppOwnerDao getInstance() {
		return instance;
	}

	@Override
	public List<AppOwnerDao> getAll() {
		return JpaDaoFactory.getConnection().createQuery("Select a from Appowner a").getResultList();

	}
}
