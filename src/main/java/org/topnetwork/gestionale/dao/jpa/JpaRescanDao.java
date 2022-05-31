package org.topnetwork.gestionale.dao.jpa;

import java.util.List;

import org.topnetwork.gestionale.dao.model.RescanDao;
import org.topnetwork.gestionale.model.Rescan;

public class JpaRescanDao implements RescanDao {

	private static JpaRescanDao instance = new JpaRescanDao();

	private JpaRescanDao() {
	}

	public static JpaRescanDao getInstance() {
		return instance;
	}

	@Override
	public List<Rescan> getAll() {
		return JpaDaoFactory.getConnection().createQuery("Select r from Rescan r").getResultList();
	}

}
