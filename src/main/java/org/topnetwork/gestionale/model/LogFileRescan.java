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
	@Column(name="data")
	private Date data;
	@Column
	private int nRescan;
	@Column
	private boolean ongoing;
	@Column
	private boolean archive;
	@Column
	private Integer newOb;
	@Column
	private Integer py;
	@Column
	private Integer ytd;
	@Column
	private String afpe;
	@Column
	private String yoyRolling;
	@Column
	private String last_Rescan;
	@Column
	private Date rkd;
	@Column
	private int idPreUpdate;
	@ManyToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "FK_idUtente", referencedColumnName = "idUtente")
	@JsonBackReference
	private Utente utente;
	@ManyToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "FK_idRescan", referencedColumnName = "idRescan")
	@JsonBackReference
	private Rescan rescan;
	public LogFileRescan(Date data, int nRescan, boolean ongoing, boolean archive, Integer newOb, Integer py,
			Integer ytd, String afpe, String yoyRolling, String last_Rescan, Date rkd, int idPreUpdate) {
		this.data = data;
		this.nRescan = nRescan;
		this.ongoing = ongoing;
		this.archive = archive;
		this.newOb = newOb;
		this.py = py;
		this.ytd = ytd;
		this.afpe = afpe;
		this.yoyRolling = yoyRolling;
		this.last_Rescan = last_Rescan;
		this.rkd = rkd;
		this.idPreUpdate = idPreUpdate;
	}
	
	
	
	
}
