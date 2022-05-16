package org.topnetwork.gestionale.model;

import lombok.Getter;
import lombok.NoArgsConstructor;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Setter;

@AllArgsConstructor
@Getter
@Setter
@NoArgsConstructor


@Entity
@Table
public class Utente implements Serializable{
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int idUtente;
	@Column
	private String nome, cognome, password, email, ruolo;
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
