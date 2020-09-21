package dw1s5.semana6.controller;

import dw1s5.semana6.model.ListaCurso;
import dw1s5.semana6.model.ManipuladorJAXB;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.MultipartConfig;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.Part;

/**
 * Servlet implementation class ServletArquivo
 */
@WebServlet("/ServletArquivo")
@MultipartConfig
public class ServletArquivo extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ServletArquivo() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		Part part = request.getPart("arquivo");
		if(part != null && part.getContentType().equals("text/xml")) {
			ManipuladorJAXB manipuladorJAXB;
			String arquivoXSD;
			arquivoXSD = getServletContext().getRealPath("WEB-INF/valida_cursos.xsd");
			manipuladorJAXB = new ManipuladorJAXB(arquivoXSD);
			ListaCurso listaCurso = manipuladorJAXB.ler(ListaCurso.class, part.getInputStream());
			request.setAttribute("lista", listaCurso);

		}
		RequestDispatcher dispatcher = request.getRequestDispatcher("/resultado.jsp");
		dispatcher.forward(request, response);
	}


}
