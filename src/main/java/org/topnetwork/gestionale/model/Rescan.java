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
@AllArgsConstructor
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
	
	
	
	
	
	
	
	
	
}
