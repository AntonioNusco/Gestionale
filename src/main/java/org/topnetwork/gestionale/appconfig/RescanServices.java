package org.topnetwork.gestionale.appconfig;

import java.net.URI;
import java.net.URISyntaxException;
import java.util.List;

import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

import org.topnetwork.gestionale.dao.jpa.JpaDaoFactory;
import org.topnetwork.gestionale.dao.jpa.JpaRescanDao;
import org.topnetwork.gestionale.model.Applicazione;
import org.topnetwork.gestionale.model.Rescan;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.google.gson.Gson;

@Path("rescan")
public class RescanServices {

	@GET
	@Path("lista")
	@Produces(MediaType.APPLICATION_JSON)
	public String listaRescan() {
		List<Rescan> rescans = JpaRescanDao.getInstance().getAll();
		ObjectMapper om = new ObjectMapper();
		try {
			System.out.print(om.writeValueAsString(rescans));
			return om.writeValueAsString(rescans);
		} catch (JsonProcessingException e) {
			e.printStackTrace();
			return null;
		}
	}
	
	@POST
	@Path("add")
	public Response add(Rescan r) throws URISyntaxException {
		JpaDaoFactory.getDaoFactory().save(r);
		return Response.created(new URI("api/utente/" + r.getIdRescan())).build();
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
