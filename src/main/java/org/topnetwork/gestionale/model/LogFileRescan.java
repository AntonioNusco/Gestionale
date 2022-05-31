package org.topnetwork.gestionale.model;

import java.io.Serializable;
import java.sql.Date;
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

import com.fasterxml.jackson.annotation.JsonBackReference;

import lombok.*;

@Getter
@Setter
@NoArgsConstructor

@Entity
@Table(name= "logfilerescan")
public class LogFileRescan implements Serializable{
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer idLogRescan;
	@Column(name="valorePrecedente")
	private String valorePrecedente;
	@Column(name="nuovoValore")
	private String nuovoValore;
	@Column(name="data")
	private Date data;
	@Column
	private String action;
	@ManyToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "FK_idUtente", referencedColumnName = "idUtente")
	@JsonBackReference
	private Utente utente;
	@ManyToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "FK_idRescan", referencedColumnName = "idRescan")
	@JsonBackReference
	private Rescan rescan;
	
	public LogFileRescan(Integer idLogRescan, String valorePrecedente, String nuovoValore, Date data) {
		super();
		this.idLogRescan = idLogRescan;
		this.valorePrecedente = valorePrecedente;
		this.nuovoValore = nuovoValore;
		this.data = data;
	}
	
	
}
