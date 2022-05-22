package org.topnetwork.gestionale.servlets;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.topnetwork.gestionale.dao.jpa.JpaDaoFactory;
import org.topnetwork.gestionale.model.Applicazione;
import org.topnetwork.gestionale.utility.Utils;

import com.fasterxml.jackson.databind.ObjectMapper;

@WebServlet("/api/tuttiprogetti")
public class TestServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	public TestServlet() {
		super();
	}

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		List<Applicazione> lista = JpaDaoFactory.getDaoFactory().queryList(new Applicazione());
		
	
		ObjectMapper om = new ObjectMapper();
		String s = om.writerWithDefaultPrettyPrinter().writeValueAsString(lista);
		
		 response.getWriter().append(s);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		doGet(request, response);
	}
	
	
	
	
	

}
