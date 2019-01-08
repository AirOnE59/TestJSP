package Recup;
import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * Servlet implementation class Servlet2
 */
@WebServlet("/servlet2")
public class Servlet2 extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	@Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		HttpSession session = request.getSession();
		String attributSession = (String) session.getAttribute("attribut_session");
		String attributApplication = (String) this.getServletContext().getAttribute("attribut_application");
		String attributRequest = (String) request.getAttribute("attribut_request");

		PrintWriter pw = response.getWriter();
		StringBuffer sb = new StringBuffer();
		sb.append("<p>");
		sb.append("<b>Attribut de session : </b>" + attributSession + "</br>");
		sb.append("<b>Attribut d' application : </b>" + attributApplication + "</br>");
		sb.append("<b>Attribut request : </b>" + attributRequest + "</br>");
		sb.append("</p>");
		pw.write(sb.toString());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	@Override
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
