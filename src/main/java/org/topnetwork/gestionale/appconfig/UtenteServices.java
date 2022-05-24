package org.topnetwork.gestionale.appconfig;

import java.net.URI;
import java.util.ArrayList;
import java.util.List;

import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.core.Response;

import org.topnetwork.gestionale.dao.jpa.JpaDaoFactory;
import org.topnetwork.gestionale.model.Utente;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

@Path("utente")
public class UtenteServices {

	List<Utente> utenti = new ArrayList<Utente>();
	
	@GET
	@Path("lista")
	public String listaUtenti() {
		utenti = JpaDaoFactory.getDaoFactory().queryList(new Utente());
		ObjectMapper om = new ObjectMapper();
		try {
			return om.writerWithDefaultPrettyPrinter().writeValueAsString(utenti);
		} catch (JsonProcessingException e) {
			e.printStackTrace();
			return null;
		}

	}
	
	@POST
	@Path("add")
	public Response add(Utente u) {
		
		return Response.created()
	}


}
