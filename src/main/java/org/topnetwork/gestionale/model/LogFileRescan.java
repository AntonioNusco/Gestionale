package org.topnetwork.gestionale.model;

import java.io.Serializable;
import java.time.LocalDateTime;

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

import lombok.*;

@Getter
@Setter
@NoArgsConstructor

@Entity
@Table(name= "logfilerescan")
public class LogFileRescan implements Serializable{
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int idLogRescan;
	@Column(name="valorePrecedente")
	private String valorePrecedente;
	@Column(name="nuovoValore")
	private String nuovoValore;
	@Column(name="data")
	private LocalDateTime data;
	@ManyToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "FK_idUtente", referencedColumnName = "idUtente")
	private Utente utente;
	@ManyToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "FK_idRescan", referencedColumnName = "idRescan")
	private Rescan rescan;
	public LogFileRescan(int idLogRescan, String valorePrecedente, String nuovoValore, LocalDateTime data) {
		super();
		this.idLogRescan = idLogRescan;
		this.valorePrecedente = valorePrecedente;
		this.nuovoValore = nuovoValore;
		this.data = data;
	}
	
	public LogFileRescan() {
	}
	
	
}
