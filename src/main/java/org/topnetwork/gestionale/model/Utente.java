package org.topnetwork.gestionale.model;

import lombok.Getter;
import lombok.NoArgsConstructor;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import lombok.AllArgsConstructor;
import lombok.Setter;

@AllArgsConstructor
@Getter
@Setter
@NoArgsConstructor

public class Utente {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int idUtente;
	@Column
	private String nome, cognome, password, email, ruolo;
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
