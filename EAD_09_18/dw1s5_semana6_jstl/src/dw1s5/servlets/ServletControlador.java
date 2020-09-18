package dw1s5.servlets;

import java.io.IOException;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import dw1s5.modelo.Pessoa;
import dw1s5.modelo.PessoaUtil;

/**
 * Servlet implementation class ServletControlador
 */
@WebServlet({"/ServletControlador","/ServletPessoas"})
public class ServletControlador extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ServletControlador() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		String dados = request.getParameter("pessoas");
		System.out.println(dados);
		PessoaUtil pessoaUtil = new PessoaUtil();
		List<Pessoa> lista = pessoaUtil.getPessoas(dados);
		request.setAttribute("lista", lista);
		RequestDispatcher dispatcher = request.getRequestDispatcher("/resultado.jsp");
		dispatcher.forward(request, response);
	}
}
