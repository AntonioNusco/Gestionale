package org.topnetwork.gestionale.dao.jpa;

import org.topnetwork.gestionale.dao.model.UtenteDao;
import org.topnetwork.gestionale.model.Utente;

public class JpaUtenteDao implements UtenteDao{

private static JpaUtenteDao instance = new JpaUtenteDao();
	
	private JpaUtenteDao() {}

	public static JpaUtenteDao getInstance() {
		return instance;
	}

	@Override
	public boolean login(Utente u) {
		
		return false;
	}

	@Override
	public boolean registrazione(String nome, String cognome, String password, String email) {
		// TODO Auto-generated method stub
		return false;
	}
	
	
	
	
	
	
	
	
	
	
}
