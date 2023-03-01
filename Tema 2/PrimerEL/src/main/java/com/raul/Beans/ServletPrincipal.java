package com.raul.Beans;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class Servlet
 */
@WebServlet("/obtenerpersona")
public class ServletPrincipal extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ServletPrincipal() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		Persona p = new Persona(55, "Edurne");
		
		request.setAttribute("persona", p);
		
		List<String> listaDeColores = new ArrayList();
		listaDeColores.add("rojo");
		listaDeColores.add("verde");
		listaDeColores.add("azul");
		
		request.setAttribute("listaColores", listaDeColores);
		
		List<Persona> listaDePersonas = new ArrayList();
		listaDePersonas.add(new Persona(34, "Kike"));
		listaDePersonas.add(new Persona(44, "Jike"));
		listaDePersonas.add(new Persona(50, "Pedro"));
		listaDePersonas.add(new Persona(55, "Luis"));
		
		request.setAttribute("listaPersonas", listaDePersonas);
		
		
		RequestDispatcher dispatcher = getServletContext().getRequestDispatcher("/WEB-INF/Hola.jsp");
		dispatcher.forward(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
