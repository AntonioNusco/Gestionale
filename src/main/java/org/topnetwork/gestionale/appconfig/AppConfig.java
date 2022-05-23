package org.topnetwork.gestionale.appconfig;

import javax.ws.rs.ApplicationPath;

import org.glassfish.jersey.server.ResourceConfig;

@ApplicationPath("api")
public class AppConfig extends ResourceConfig{
	
	public AppConfig() {
		packages("org.topnetwork.gestionale.appconfig");
	}

}
