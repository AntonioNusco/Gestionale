package org.topnetwork.gestionale.appconfig;

import java.net.URI;
import java.net.URISyntaxException;
import java.util.List;

import javax.ws.rs.Consumes;
import javax.ws.rs.DELETE;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.Response.ResponseBuilder;

import org.json.JSONObject;
import org.topnetwork.gestionale.dao.jpa.JpaApplicazioneDao;
import org.topnetwork.gestionale.dao.jpa.JpaDaoFactory;
import org.topnetwork.gestionale.model.Applicazione;
import org.topnetwork.gestionale.model.Utente;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.google.gson.Gson;

@Path("applicazione")
public class ApplicazioneServices {

	@GET
	@Path("lista")
	@Produces(MediaType.APPLICATION_JSON)
	public String listaApplicazioni() throws JsonProcessingException {
		List<Applicazione> applicazioni = JpaApplicazioneDao.getInstance().getAll();
		ObjectMapper om = new ObjectMapper();
		try {
			System.out.print(om.writeValueAsString(applicazioni));
			return om.writeValueAsString(applicazioni);
		} catch (JsonProcessingException e) {
			e.printStackTrace();
			return null;
		}
	}
	
	@POST
	@Path("add")
	public Response add(Applicazione a) throws URISyntaxException {
		JpaDaoFactory.getDaoFactory().save(a);
		return Response.created(new URI("api/applicazione/" + a.getIdApplicazione())).build();
	}
	
	@DELETE
	@Path("delete")
	public Response delete(Applicazione a) throws URISyntaxException {
		JpaDaoFactory.getDaoFactory().logicDelete(a);
		return Response.created(new URI("api/applicazione/" + a.getIdApplicazione())).build();
		
	}
	
	

}
