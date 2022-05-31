package org.topnetwork.gestionale.appconfig;

import java.util.List;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import org.topnetwork.gestionale.dao.jpa.JpaDaoFactory;
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
		List<Rescan> rescans = JpaDaoFactory.getDaoFactory().queryRescan();
//		Gson gson = new Gson();
//		return gson.toJson(rescans);
		ObjectMapper om = new ObjectMapper();
		try {
			System.out.print(om.writeValueAsString(rescans));
			return om.writeValueAsString(rescans);
		} catch (JsonProcessingException e) {
			e.printStackTrace();
			return null;
		}
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
