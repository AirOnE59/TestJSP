package Recup;
import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * Servlet implementation class Servlet1
 */
@WebServlet("/servlet1")
public class Servlet1 extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	@Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	@Override
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		String sessionP = request.getParameter("session");
		String application = request.getParameter("application");
		String requestP = request.getParameter("request");

		request.setAttribute("attribut_request", requestP);
		this.getServletContext().setAttribute("attribut_application", application);
		HttpSession session = request.getSession();
		session.setAttribute("attribut_session", sessionP);
		this.getServletContext().getRequestDispatcher("/servlet2").forward(request, response);
		// response.sendRedirect("servlet2");
	}

}
