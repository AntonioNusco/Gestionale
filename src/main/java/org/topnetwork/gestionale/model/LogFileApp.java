package org.topnetwork.gestionale.model;
import java.sql.Date;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
@Getter
@Setter
@AllArgsConstructor
public class LogFileApp {
	private int idLogApp;
	private Date data;
	private String valorePrecedente, nuovoValore;
}
