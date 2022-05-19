package org.topnetwork.gestionale.dao.model;

import org.topnetwork.gestionale.model.Utente;

public interface UtenteDao {

	public boolean login(Utente u);
	public boolean registrazione(String nome, String cognome , String password,String email);
	
	
	
}
