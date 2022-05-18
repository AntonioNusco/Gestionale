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
import lombok.ToString;

@AllArgsConstructor
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
	@Override
	public String toString() {
		return "Nome Utente : "  + nome + " " + cognome + " , Email : " + email;
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
