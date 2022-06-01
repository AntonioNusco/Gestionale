package org.topnetwork.gestionale.appconfig;

import java.util.List;

import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

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
			return om.writeValueAsString(applicazioni);
	}
	
	@GET
	@Path("{idApplicazione}")
	@Produces(MediaType.APPLICATION_JSON)
	public String getFromId(@PathParam("idApplicazione")int idApplicazione) throws JsonProcessingException {
		ObjectMapper om = new ObjectMapper();
		return om.writeValueAsString(JpaApplicazioneDao.getInstance().getFromId(idApplicazione));
	}
		
	@POST
	@Consumes(MediaType.APPLICATION_JSON)
	@Produces(MediaType.APPLICATION_JSON)
	public Applicazione add(Applicazione a) {
		JpaDaoFactory.getDaoFactory().save(a);
		return a;
	}
//	
//	@DELETE
//	@Path("delete")
//	public Response delete(Applicazione a) throws URISyntaxException {
//		JpaDaoFactory.getDaoFactory().logicDelete(a);
//		return Response.created(new URI("api/applicazione/" + a.getIdApplicazione())).build();
//		
//	}
	
	

}
