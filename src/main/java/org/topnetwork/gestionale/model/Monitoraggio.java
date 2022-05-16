package org.topnetwork.gestionale.model;
import java.io.Serializable;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor

@Entity
@Table
public class Monitoraggio implements Serializable{
	
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int idMonitoraggio;
	@OneToMany(cascade = CascadeType.ALL)
	@JoinColumn(name = "FK_idApplicazione", referencedColumnName = "idApplicazione")
	private int idApplicazione;
	@OneToMany(cascade = CascadeType.ALL)
	@JoinColumn(name = "FK_idAppOwner", referencedColumnName = "idAppOwner")
	private int idAppowner;
	
}
