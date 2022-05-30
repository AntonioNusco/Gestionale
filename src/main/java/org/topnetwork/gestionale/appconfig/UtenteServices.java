package org.topnetwork.gestionale.appconfig;

import java.net.URI;
import java.net.URISyntaxException;
import java.util.ArrayList;
import java.util.List;
import static org.topnetwork.gestionale.utility.Utils.*;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.core.Context;
import javax.ws.rs.core.Response;

import org.topnetwork.gestionale.dao.jpa.JpaDaoFactory;
import org.topnetwork.gestionale.dao.jpa.JpaUtenteDao;
import org.topnetwork.gestionale.model.Utente;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

@Path("utente")
public class UtenteServices {

	List<Utente> utenti = new ArrayList<Utente>();
	
	@Context
	private HttpServletRequest httpRequest;

	@GET
	@Path("lista")
	public String listaUtenti() {
		utenti = JpaDaoFactory.getDaoFactory().queryList(new Utente());
		ObjectMapper om = new ObjectMapper();
		try {
			return om.writeValueAsString(utenti);
		} catch (JsonProcessingException e) {
			e.printStackTrace();
			return null;
		}
	}
		
	@POST
	@Path("add")
	public Response add(Utente u) throws URISyntaxException {
		JpaDaoFactory.getDaoFactory().save(u);
		return Response.created(new URI("api/utente/" + u.getIdUtente())).build();
	}
	
	
//	@POST
//	@Path("login")
//	public Response login(String email,String passw) throws URISyntaxException {
//		HttpSession session = httpRequest.getSession();
//			Utente u = JpaUtenteDao.getInstance().login(email, passw);
//			session.setAttribute("utenteloggato", u);
//			if(u.isRuolo()) return Response.created(new URI(null)).build();
//			return Response.created(new URI(null)).build();
//	}
	
	
	
	
	
	
	
	
	
	
	
}
