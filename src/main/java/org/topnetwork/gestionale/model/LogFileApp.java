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
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
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
	@ManyToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "FK_idUtente", referencedColumnName = "idUtente")
	private Utente utente;
	@ManyToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "FK_idAppliczione", referencedColumnName = "idApplicazione")
	private Applicazione applicazione;
	
	public LogFileApp(int idLogApp, Date data, String valorePrecedente, String nuovoValore) {
		super();
		this.idLogApp = idLogApp;
		this.data = data;
		this.valorePrecedente = valorePrecedente;
		this.nuovoValore = nuovoValore;
	}

	public LogFileApp() {
	}	
	
	
	
	
	
	
	
	
}
