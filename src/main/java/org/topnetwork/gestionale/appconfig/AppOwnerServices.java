package org.topnetwork.gestionale.appconfig;

import java.util.List;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import org.topnetwork.gestionale.dao.jpa.JpaAppOwnerDao;
import org.topnetwork.gestionale.model.AppOwner;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

@Path("appowner")
public class AppOwnerServices {

	@GET
	@Path("lista")
	@Produces(MediaType.APPLICATION_JSON)
	public String listaOwnerApp() throws JsonProcessingException {
		List<AppOwner> appOwners = JpaAppOwnerDao.getInstance().getAll();
		ObjectMapper om = new ObjectMapper();
		return om.writeValueAsString(appOwners);
	}
	
	@GET
	@Path("{idAppOwner}")
	@Produces(MediaType.APPLICATION_JSON)
	public String getFromId(@PathParam("idAppOwner")int idAppOwner) throws JsonProcessingException {
		ObjectMapper om = new ObjectMapper();
		return om.writeValueAsString(JpaAppOwnerDao.getInstance().getFromId(idAppOwner));
	}
	
}
