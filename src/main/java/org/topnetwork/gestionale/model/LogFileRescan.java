package org.topnetwork.gestionale.model;

import java.io.Serializable;
import java.time.LocalDateTime;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.*;

@Getter
@Setter
@AllArgsConstructor
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
	
	
}