package org.topnetwork.gestionale.appconfig;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.Context;
import javax.ws.rs.core.MediaType;

import org.topnetwork.gestionale.dao.jpa.JpaDaoFactory;
import org.topnetwork.gestionale.dao.jpa.JpaUtenteDao;
import org.topnetwork.gestionale.model.Utente;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

@Path("utente")
public class UtenteServices {

//	List<Utente> utenti = new ArrayList<Utente>();

	@Context
	private HttpServletRequest httpRequest;

	@GET
	@Path("lista")
	@Produces(MediaType.APPLICATION_JSON)
	public String listaUtenti() throws JsonProcessingException {
		List<Utente> utenti = JpaUtenteDao.getInstance().getAll();
		ObjectMapper om = new ObjectMapper();
		return om.writeValueAsString(utenti);
	}

	@GET
	@Path("{idUtente}")
	@Produces(MediaType.APPLICATION_JSON)
	public String getFromId(@PathParam("idUtente") int idUtente) throws JsonProcessingException {
		ObjectMapper om = new ObjectMapper();
		return om.writeValueAsString(JpaUtenteDao.getInstance().getFromId(idUtente));
	}

	@POST
	@Path("add")
	@Consumes(MediaType.APPLICATION_JSON)
	@Produces(MediaType.APPLICATION_JSON)
	public Utente add(Utente u) {
		JpaDaoFactory.getDaoFactory().save(u);
		return u;
	}

	// servizio per rendere un account modificatore

	@PUT
	@Path("updaterole/{idUtente}")
	@Consumes(MediaType.APPLICATION_JSON)
	public boolean updateRole(@PathParam("idUtente") int idUtente) {
		Utente u = JpaUtenteDao.getInstance().getFromId(idUtente);
		if (u.isRuolo() == false) {
			JpaUtenteDao.getInstance().updateRole(idUtente);
			return true;
		}
		return false;
	}

	
	@POST
	@Path("login")
	@Produces(MediaType.APPLICATION_JSON)
	@Consumes(MediaType.APPLICATION_JSON)
	public Utente login(Utente utente) {
		List<Utente> utenti = JpaUtenteDao.getInstance().getAll();
		for(Utente u : utenti) {
			if(utente.getEmail().equals(u.getEmail()) && utente.getPassword().equals(u.getPassword())) {
				HttpSession session = httpRequest.getSession();
				Utente ut = JpaUtenteDao.getInstance().login(utente.getEmail(), utente.getPassword());
				session.setAttribute("utenteloggato", ut);
				return ut;
			}
		}
		return null;
	}

	@POST
	@Path("signup")
	@Consumes(MediaType.APPLICATION_JSON)
	@Produces(MediaType.APPLICATION_JSON)
	public Utente signup(Utente u) {
		List<Utente> utenti = JpaUtenteDao.getInstance().getAll();
		for (Utente ut : utenti) {
			if (u.getEmail().equalsIgnoreCase(ut.getEmail())) {
				return null;
			}
		}
		JpaUtenteDao.getInstance().registrazione(u);
		return u;
	}
	
	
//	@PUT
//	@Path("modifica")
//	@Consumes(MediaType.APPLICATION_JSON)
//	@Produces(MediaType.APPLICATION_JSON)
//	public boolean modifica(Utente u) {
//		return JpaDaoFactory.getDaoFactory().modifica(u);
//	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}