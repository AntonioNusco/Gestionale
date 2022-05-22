package org.topnetwork.gestionale.appconfig;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;

@Path("test")
public class TestApi {
	
	@GET
	@Path("{name}")
	public String test(@PathParam("name") String name) {
		return name + "è bellissima";
		
	}
	
	

}
