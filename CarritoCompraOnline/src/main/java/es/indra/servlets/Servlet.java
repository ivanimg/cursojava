package es.indra.servlets;

import java.io.IOException;
import java.sql.SQLException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import es.indra.beans.impl.Categoria;
import es.indra.main.CarritoMain;

@WebServlet("/Servlet")
public class Servlet extends HttpServlet  {

	public Servlet() {
		super();
		// TODO Auto-generated constructor stub
	}

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

		HttpSession session = req.getSession();
		String login = req.getParameter("login");
		String pass = req.getParameter("pass");
		Categoria categ = new Categoria(Integer.valueOf(req.getParameter("idC")),req.getParameter("nombreC"));
		session.setAttribute("usuario", login);
		
		try {
			CarritoMain.insertar(categ);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		doGet(req, resp);
	}

}
