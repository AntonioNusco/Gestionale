package org.topnetwork.gestionale.dao.model;

import java.util.List;

import org.topnetwork.gestionale.model.AppOwner;

public interface AppOwnerDao {

	List<AppOwner> getAll();

	AppOwner getFromId(int idAppOwner);

}
