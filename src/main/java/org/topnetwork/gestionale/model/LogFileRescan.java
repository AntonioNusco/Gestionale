package org.topnetwork.gestionale.model;

import java.time.LocalDateTime;

import lombok.*;

@Getter
@Setter
@AllArgsConstructor
public class LogFileRescan {

	private String valorePrecedente,nuovoValore;
	private LocalDateTime data;
	private int idLogRescan;
	
}
