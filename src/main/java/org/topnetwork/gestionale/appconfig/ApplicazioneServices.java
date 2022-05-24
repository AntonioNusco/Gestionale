package org.topnetwork.gestionale.appconfig;

import java.util.List;

import javax.ws.rs.GET;
import javax.ws.rs.Path;

import org.topnetwork.gestionale.dao.jpa.JpaDaoFactory;
import org.topnetwork.gestionale.model.Applicazione;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

@Path("applicazione")
public class ApplicazioneServices {

	@GET
	@Path("lista")
	public String listaApplicazioni() {
		List<Applicazione> applicazioni = JpaDaoFactory.getDaoFactory().queryList(new Applicazione());
		ObjectMapper om = new ObjectMapper();
		try {
			return om.writeValueAsString(applicazioni);
		} catch (JsonProcessingException e) {
			e.printStackTrace();
			return null;
		}

	}
	
	
	
	
	
	
	

}