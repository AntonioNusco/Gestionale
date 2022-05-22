package org.topnetwork.gestionale.appconfig;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

@Path("test")
public class TestApi {

	@GET
	@Path("{name}")
	public String test(@PathParam("name") String name) {
		return name + "è bellissima";
		
	}

//	@GET
//	@Produces({ MediaType.TEXT_PLAIN })
//	@Path("/plain")
//	public static String getPlain() {
//		return "Hello World!!!";
//	}

}
