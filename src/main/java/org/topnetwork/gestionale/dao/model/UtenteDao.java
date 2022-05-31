package org.topnetwork.gestionale.dao.model;

import java.util.ArrayList;
import java.util.List;

import org.topnetwork.gestionale.model.Utente;

public interface UtenteDao {

	public Utente login(String email,String password);
	public boolean registrazione(Utente u);
	boolean registrazioneVisualizzatore(String nome, String cognome, String password, String email);
	List<Utente> getAll();
	
	
}
