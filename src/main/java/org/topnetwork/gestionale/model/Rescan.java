package org.topnetwork.gestionale.model;

import lombok.Getter;
import lombok.NoArgsConstructor;

import java.sql.Date;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

import lombok.AllArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor

public class Rescan {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int idRescan;
	@Column
	private int nRescan,newOb,py,ytd;
	@Column
	private String aefpe,yoyRolling,lastRescan;
	@Column
	private boolean pnGoing,archive;
	@Column
	private Date rkd;
	@OneToMany(cascade = CascadeType.ALL)
	@JoinColumn(name = "FK_idApplicazione", referencedColumnName = "idApplicazione")
	private Applicazione applicazione;
	@ManyToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "FK_idAppOwner", referencedColumnName = "idAppOwner")
	private AppOwner appowner;
	
	
	
	
	
	
	
	
	
}
