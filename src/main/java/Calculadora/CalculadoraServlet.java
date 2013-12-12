package Calculadora;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@SuppressWarnings("serial")
public class CalculadoraServlet extends HttpServlet{
	@Override
	protected void service(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		
		response.setContentType("text/html");
		java.io.PrintWriter out = response.getWriter();
		out.println("<h1> Hello word desde servlet </h1>");
		String i = request.getParameter("numero1");
		String j = request.getParameter("numero2");
		int suma = Integer.parseInt(i) + Integer.parseInt(j);
		out.println("<br><br><h1> La suma es: </h1>" +suma);
		out.close();
	}
}
