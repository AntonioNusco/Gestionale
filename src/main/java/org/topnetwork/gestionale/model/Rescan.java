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
	private int nRescan,newOb,py,ytd;
	@Column
	private String aefpe,yoyRolling,lastRescan;
	@Column
	private boolean pnGoing,archive,exist; 
	@Column
	private Date rkd;
	@ManyToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "FK_idApplicazione", referencedColumnName = "idApplicazione")
	private Applicazione applicazione;
	@ManyToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "FK_idAppOwner", referencedColumnName = "idAppOwner")
	private AppOwner appOwner;
	
	public Rescan(int idRescan, int nRescan, int newOb, int py, int ytd, String aefpe, String yoyRolling,
			String lastRescan, boolean pnGoing, boolean archive, boolean exist, Date rkd) {
		super();
		this.idRescan = idRescan;
		this.nRescan = nRescan;
		this.newOb = newOb;
		this.py = py;
		this.ytd = ytd;
		this.aefpe = aefpe;
		this.yoyRolling = yoyRolling;
		this.lastRescan = lastRescan;
		this.pnGoing = pnGoing;
		this.archive = archive;
		this.exist = exist;
		this.rkd = rkd;
	}
	
	
	
	
	
	
	
	
	
}
