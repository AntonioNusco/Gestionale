package org.topnetwork.gestionale.model;

import lombok.Getter;
import lombok.NoArgsConstructor;

import java.io.Serializable;
import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Setter
@Getter 
@NoArgsConstructor


@Entity
@Table
public class Utente implements Serializable{
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int idUtente;
	@Column
	private String nome, cognome, password, email;
	@Column
	private boolean ruolo;
	@OneToMany(mappedBy = "utente")
	private Set<LogFileApp> logfiles;
	@OneToMany(mappedBy = "utente")
	private Set<LogFileRescan> logFile;
	@Override
	public String toString() {
		return "Nome Utente : "  + nome + " " + cognome + " , Email : " + email;
		
	}
	
	public Utente(String nome, String cognome, String password, String email, boolean ruolo) {
		super();
		this.nome = nome;
		this.cognome = cognome;
		this.password = password;
		this.email = email;
		this.ruolo = ruolo;
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
