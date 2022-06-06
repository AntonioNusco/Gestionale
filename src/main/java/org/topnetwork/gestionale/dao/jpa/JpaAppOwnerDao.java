package org.topnetwork.gestionale.dao.jpa;

import java.util.List;

import org.topnetwork.gestionale.dao.model.AppOwnerDao;
import org.topnetwork.gestionale.model.AppOwner;
import org.topnetwork.gestionale.model.Utente;

public class JpaAppOwnerDao implements AppOwnerDao {

	private static JpaAppOwnerDao instance = new JpaAppOwnerDao();

	private JpaAppOwnerDao() {
	}

	public static JpaAppOwnerDao getInstance() {
		return instance;
	}

	@Override
	public List<AppOwner> getAll() {
		return JpaDaoFactory.getConnection().createQuery("Select a from Appowner a").getResultList();
	}
	
	@Override
	public AppOwner getFromId(int idAppOwner) {
		return JpaDaoFactory.getConnection().find(AppOwner.class, idAppOwner);
	}
	
}
