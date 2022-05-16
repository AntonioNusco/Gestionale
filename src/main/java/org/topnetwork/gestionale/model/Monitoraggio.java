package org.topnetwork.gestionale.model;
import javax.persistence.CascadeType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor

public class Monitoraggio {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int idMonitoraggio;
	@OneToMany(cascade = CascadeType.ALL)
	@JoinColumn(name = "FK_idApplicazione", referencedColumnName = "idApplicazione")
	private Applicazione applicazione;
	@OneToMany(cascade = CascadeType.ALL)
	@JoinColumn(name = "FK_idAppOwner", referencedColumnName = "idAppOwner")
	private AppOwner appowner;
	
}
