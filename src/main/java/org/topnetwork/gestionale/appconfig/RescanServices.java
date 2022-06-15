package org.topnetwork.gestionale.appconfig;

import java.util.List;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import org.topnetwork.gestionale.dao.jpa.JpaRescanDao;
import org.topnetwork.gestionale.model.Rescan;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

@Path("rescan")
public class RescanServices {

	@GET
	@Path("lista")
	@Produces(MediaType.APPLICATION_JSON)
	public String listaRescan() throws JsonProcessingException {
		List<Rescan> rescans = JpaRescanDao.getInstance().getAll();
		ObjectMapper om = new ObjectMapper();
		return om.writeValueAsString(rescans);
	}

	
	

}
