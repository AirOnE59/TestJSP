package Session;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;


@WebServlet("/test")
public class test extends HttpServlet {
	private static final long serialVersionUID = 1L;
       


    public test() {
        super();

    }



	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		PrintWriter out = response.getWriter();
		HttpSession session= request.getSession();
		Integer count = (Integer) session.getAttribute("count");
		if (count == null) {
			count = new Integer(1);
			out.println("Vous visitez cette page pour la première fois");
		} else {
			count = new Integer(count.intValue() + 1);
		}
		session.setAttribute("count", count);
		PrintWriter pw = response.getWriter();
		pw.write("La page à été visitée : " + count + " fois");
	}


	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

	}

}
