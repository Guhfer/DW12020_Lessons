package dw1s5.servlets;

import java.io.IOException;
import java.io.PrintWriter; //Prints formatted representations of objects to a text-output stream

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class ServletTeste
 */
@WebServlet({ "/ServletTeste", "/XYZ" })
public class ServletTeste extends HttpServlet {
	
	private static final long serialVersionUID = 1L;
	
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ServletTeste() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		request.setCharacterEncoding("UTF-8");
		//Obten��o dos dados da requisi��o
		String nome = request.getParameter("nome");
		
		//constru��o da resposta
		response.setContentType("text/html;charset=UTF-8");
		PrintWriter writer = response.getWriter();
		writer.println("<html lang=\"pt-BR\">");
		writer.println("\t<head>");
		writer.println("\t\t<title>P�gina gerada dinamicamente</title>");
		writer.println("\t\t<meta charset=\"UTF-8\" />");
		writer.println("\t</head>");
		writer.println("\t<body>");
		writer.println("\t\t<p>Nome: "+nome+"</p>");
		writer.println("\t</body>");
		writer.println("</html>");
		writer.close();
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
