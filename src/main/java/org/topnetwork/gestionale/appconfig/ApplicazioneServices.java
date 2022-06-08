package org.topnetwork.gestionale.appconfig;

import java.util.List;

import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import org.topnetwork.gestionale.dao.jpa.JpaApplicazioneDao;
import org.topnetwork.gestionale.dao.jpa.JpaDaoFactory;
import org.topnetwork.gestionale.model.Applicazione;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

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
	public String getFromId(@PathParam("idApplicazione") int idApplicazione) throws JsonProcessingException {
		ObjectMapper om = new ObjectMapper();
		return om.writeValueAsString(JpaApplicazioneDao.getInstance().getFromId(idApplicazione));
	}

	@POST
	@Path("aggiunta")
	@Consumes(MediaType.APPLICATION_JSON)
	@Produces(MediaType.APPLICATION_JSON)
	public Applicazione add(Applicazione a) {
		JpaDaoFactory.getDaoFactory().save(a);
		return a;
	}

	@PUT
	@Path("delete/{idApplicazione}")
	@Consumes(MediaType.APPLICATION_JSON)
	@Produces(MediaType.APPLICATION_JSON)
	public String delete(@PathParam("idApplicazione") int idApplicazione) throws JsonProcessingException {
		ObjectMapper om = new ObjectMapper();
		return om.writeValueAsString(JpaApplicazioneDao.getInstance().logicDelete(idApplicazione));
	}

	@GET
	@Path("deletedapp")
	@Produces(MediaType.APPLICATION_JSON)
	public String showDeletedApp() throws JsonProcessingException {
		List<Applicazione> deletedApp = JpaApplicazioneDao.getInstance().getDeletedApplication();
		ObjectMapper om = new ObjectMapper();
		return om.writeValueAsString(deletedApp);
	}

	@PUT
	@Path("recovery/{idApplicazione}")
	@Consumes(MediaType.APPLICATION_JSON)
	@Produces(MediaType.APPLICATION_JSON)
	public String recoveryApp(@PathParam("idApplicazione") int idApplicazione) throws JsonProcessingException {
		ObjectMapper om = new ObjectMapper();
		return om.writeValueAsString(JpaApplicazioneDao.getInstance().logicResave(idApplicazione));
	}

	
}
