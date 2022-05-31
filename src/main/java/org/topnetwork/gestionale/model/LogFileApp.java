package org.topnetwork.gestionale.model;
import java.io.Serializable;
import java.sql.Date;
import java.time.LocalDateTime;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonBackReference;

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
	private Integer idLogApp;
	@Column
	private LocalDateTime data;
	@Column
	private String valorePrecedente, nuovoValore, action;
	@ManyToOne(cascade = CascadeType.ALL , fetch = FetchType.EAGER)
	@JoinColumn(name = "FK_idUtente", referencedColumnName = "idUtente")
	@JsonBackReference
	private Utente utente;
	@ManyToOne(cascade = CascadeType.ALL , fetch = FetchType.EAGER)
	@JoinColumn(name = "FK_idApp", referencedColumnName = "idApplicazione")
	@JsonBackReference
	private Applicazione applicazione;
	
	public LogFileApp(Integer idLogApp, LocalDateTime data, String valorePrecedente, String nuovoValore) {
		this.idLogApp = idLogApp;
		this.data = data;
		this.valorePrecedente = valorePrecedente;
		this.nuovoValore = nuovoValore;
	}
	
	public LogFileApp(LocalDateTime data, Utente u, Applicazione a ,String action, String valorePrecedente, String nuovoValore) {
		this.data = data;
		this.utente=u;
		this.applicazione=a;
		this.action=action;
		this.valorePrecedente = valorePrecedente;
		this.nuovoValore = nuovoValore;
	}
	
	public LogFileApp(LocalDateTime data, Utente u, String action) {
		this.data = data;
		this.utente=u;
		this.action=action;
	}

	@Override
	public String toString() {
		return "LogFileApp [data=" + data + ", valorePrecedente=" + valorePrecedente + ", nuovoValore=" + nuovoValore
				+ ", action=" + action + ", utente=" + utente + ", applicazione=" + applicazione + "]";
	}
	
	
	
	
	
	
}
