package org.topnetwork.gestionale.model;

import lombok.Getter;
import lombok.NoArgsConstructor;

import java.io.Serializable;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonManagedReference;

import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Setter;
import lombok.ToString;

@Setter
@Getter 
@NoArgsConstructor
@EqualsAndHashCode


@Entity
@Table(name = "utente")
public class Utente implements Serializable{
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer idUtente;
	@Column
	private String nome, cognome, password, email;
	@Column
	private boolean ruolo;
	@OneToMany(mappedBy = "utente")
	@JsonManagedReference
	private Set<LogFileApp> logfiles;
	@OneToMany(mappedBy = "utente")
	@JsonManagedReference
	private Set<LogFileRescan> logFile;
	@Override
	public String toString() {
		return nome + " | " + cognome + " | " + email ;
		
	}
	
	public Utente(String nome, String cognome, String password, String email, boolean ruolo) {
		
		this.nome = nome;
		this.cognome = cognome;
		this.password = password;
		this.email = email;
		this.ruolo = ruolo;
	}

	public Utente(String nome, String cognome, String email) {
		this.nome = nome;
		this.cognome = cognome;
		this.email = email;
	}

	

	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
