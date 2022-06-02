package org.topnetwork.gestionale.dao.model;

import java.util.ArrayList;
import java.util.List;

import org.topnetwork.gestionale.model.Applicazione;

public interface ApplicazioneDao {

	List<Applicazione> getAll();
	public Applicazione getFromId(int idApplicazione);
	boolean logicResave(int idApplicazione);
	boolean logicDelete(int idApplicazione);
	List<Applicazione> getDeletedApplication();

}
