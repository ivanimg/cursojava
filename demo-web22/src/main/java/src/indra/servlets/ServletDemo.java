package src.indra.servlets;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * Servlet implementation class ServletDemo
 */
@WebServlet("/ServletDemo")
public class ServletDemo extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ServletDemo() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
		/*PrintWriter pw = response.getWriter();
		
		pw.append("<h1>Bienvenido</h1>");
		pw.append("<p>Hola</p>");
		pw.append("");
		
		//String dire = "saludo.jsp";
        //response.sendRedirect(dire);
        RequestDispatcher requestDispatcher = request.getRequestDispatcher("saludo.jsp");
        //requestDispatcher.forward(request, response);
        
        request.getRequestDispatcher("saludo.jsp").forward(request, response);*/
		//request.getRequestDispatcher("hola.jsp").forward(request, response);
		/*HttpSession session = request.getSession();
		String login = request.getParameter("login");
		session.setAttribute("usuario", login);
		request.getRequestDispatcher("saludo2.jsp").forward(request, response);*/
		HttpSession session = request.getSession();
		String login = request.getParameter("login");
		String idiom = request.getParameter("idioma");
		session.setAttribute("usuario", login);
		
		Cookie [] cookies = request.getCookies();
		Cookie idioma = new Cookie("idioma",idiom);
		// hacemos que nuestra cookie tenga sentido durante un día
		idioma.setMaxAge(60*60*24);		
		
		for(int i=0; i<cookies.length; i++)
		{
			Cookie cookieActual = cookies[i];
			String identificador = cookieActual.getName();
			String valor = cookieActual.getValue();
			if(identificador.equals("idioma"))
			{
				session.setAttribute("idioma", valor.toString());
			}
			response.addCookie(idioma);
		}
		request.getRequestDispatcher("saludo2.jsp").forward(request, response);
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
