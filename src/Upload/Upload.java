package Upload;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Collection;

import javax.servlet.ServletException;
import javax.servlet.annotation.MultipartConfig;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.Part;



@WebServlet("/Upload")
@MultipartConfig(location="c:\\tmp", fileSizeThreshold=1024*1024, maxFileSize=1024*1024*5, maxRequestSize=1024*1024*5*5)
public class Upload extends HttpServlet {
	private static final long serialVersionUID = 1L;



	public Upload() {
		super();

	}



	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

	}



	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		Collection<Part> parts = request.getParts();
		out.write("<h2> Total partie(s) : " + parts.size() + "</h2>");

		for (Part part : parts) {

			printPart(part, out);
			part.write("samplefile");
		}

	}


	private void printPart(Part part, PrintWriter pw) {	
		StringBuffer sb = new StringBuffer();
		sb.append("<p>");
		sb.append("Nom : " + part.getName());
		sb.append("<br>");
		sb.append("Type de conenu : " + part.getContentType());
		sb.append("<br>");
		sb.append("Taille : " + part.getSize());
		sb.append("<br>");

		for (String header : part.getHeaderNames()) {
			sb.append(header + " : " + part.getHeader(header));
			sb.append("<br>");
		}
		sb.append("</p>");
		pw.write(sb.toString());
	}

}