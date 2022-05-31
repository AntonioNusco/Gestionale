package org.topnetwork.gestionale.model;

import lombok.Getter;
import lombok.NoArgsConstructor;

import java.io.Serializable;
import java.sql.Date;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonBackReference;

import lombok.AllArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor

@Entity
@Table 
public class Rescan implements Serializable{
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int idRescan;
	@Column
	private int nRescan;
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
	private boolean onGoing;
	@Column
	private boolean archive;
	@Column
	private boolean exist;
	@Column
	private Date rkd;
	@ManyToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "FK_idApplicazione", referencedColumnName = "idApplicazione")
	@JsonBackReference
	private Applicazione applicazione;
	@ManyToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "FK_idAppOwner", referencedColumnName = "idAppOwner")
	@JsonBackReference
	private AppOwner appOwner;
	
	public Rescan(int idRescan, int nRescan, boolean onGoing, boolean archive, Date rkd, String afpe, Integer newOb, Integer py, Integer ytd, String yoyRolling,
			String last_Rescan, Applicazione applicazione, AppOwner appOwner,  boolean exist) {
		this.idRescan = idRescan;
		this.nRescan = nRescan;
		this.newOb = newOb;
		this.py = py;
		this.ytd = ytd;
		this.afpe = afpe;
		this.yoyRolling = yoyRolling;
		this.last_Rescan = last_Rescan;
		this.onGoing = onGoing;
		this.archive = archive;
		this.exist = exist;
		this.applicazione = applicazione;
		this.appOwner = appOwner;
		this.rkd = rkd;
	}
	
	
	
	
	
	
	
	
}
