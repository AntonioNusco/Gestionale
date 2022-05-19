package org.topnetwork.gestionale.model;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.io.Serializable;
import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import lombok.AllArgsConstructor;


@Getter
@Setter
@NoArgsConstructor

@Entity
@Table(name = "appowner")
public class AppOwner implements Serializable {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int idAppOwner;
	@Column(name="nome")
	private String nome;
	@Column(name="cognome")
	private String cognome;
	@Column(name="email")
	private String email;
	@Column(name="cell")
	private String cell;
	@Column(name="dsUnit")
	private String dsUnit;
	@OneToMany(mappedBy="appOwner")
	private Set<Rescan> appOwners;
	@ManyToMany
	@JoinTable(
			name = "monitoraggio",
			joinColumns = @JoinColumn(name="fk_idAppOwner"),
			inverseJoinColumns = @JoinColumn(name = "fk_idApplicazione")
		)
	private Set<Applicazione> applications;
	
	public AppOwner(int idAppOwner, String nome, String cognome, String email, String cell, String dsUnit) {
		super();
		this.idAppOwner = idAppOwner;
		this.nome = nome;
		this.cognome = cognome;
		this.email = email;
		this.cell = cell;
		this.dsUnit = dsUnit;
	}
	
	
	
	
	
	

	
	
}
