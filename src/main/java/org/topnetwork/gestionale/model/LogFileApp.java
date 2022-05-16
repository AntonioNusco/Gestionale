package org.topnetwork.gestionale.model;
import java.io.Serializable;
import java.sql.Date;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToMany;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor

@Entity
@Table
public class LogFileApp implements Serializable{
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int idLogApp;
	@Column
	private Date data;
	@Column
	private String valorePrecedente, nuovoValore;
	@ManyToMany(cascade = CascadeType.ALL)
	@JoinColumn(name = "FK_idUtente", referencedColumnName = "idUtente")
	private Utente utente;
	@ManyToMany(cascade = CascadeType.ALL)
	@JoinColumn(name = "FK_idAppliczione", referencedColumnName = "idApplicazione")
	private Applicazione applicazione;	
	
	
	
	
	
}
