package org.topnetwork.gestionale.appconfig;

import java.util.List;

import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.Response.ResponseBuilder;

import org.json.JSONObject;
import org.topnetwork.gestionale.dao.jpa.JpaDaoFactory;
import org.topnetwork.gestionale.model.Applicazione;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.google.gson.Gson;

@Path("applicazione")
public class ApplicazioneServices {

	@GET
	@Path("lista")
	@Produces(MediaType.APPLICATION_JSON)
	public String listaApplicazioni() throws JsonProcessingException {
		List<Applicazione> applicazioni = JpaDaoFactory.getDaoFactory().queryApp();
		Gson gson = new Gson();
		return gson.toJson(applicazioni);
	}
	
	
	
	
	
	
	

}
