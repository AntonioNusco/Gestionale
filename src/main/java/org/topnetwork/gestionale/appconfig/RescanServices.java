package org.topnetwork.gestionale.appconfig;

import java.util.List;

import javax.ws.rs.GET;
import javax.ws.rs.Path;

import org.topnetwork.gestionale.dao.jpa.JpaDaoFactory;
import org.topnetwork.gestionale.model.Rescan;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

@Path("rescan")
public class RescanServices {

	@GET
	@Path("lista")
	public String listaRescan() {
		List<Rescan> rescans = JpaDaoFactory.getDaoFactory().queryList(new Rescan());
		ObjectMapper om = new ObjectMapper();
		try {
			return om.writeValueAsString(rescans);
		} catch (JsonProcessingException e) {
			e.printStackTrace();
			return null;
		}
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
