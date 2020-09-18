import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet({ "/TestServlet", "/XYZ" })
public class TestServlet extends HttpServlet {

    private static final long serialVersionUID = 1L;

    /**
     * @see HttpServlet#HttpServlet()
     */
    public TestServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

    /**
     */
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        // TODO Auto-generated method stub
        request.setCharacterEncoding("UTF-8");
        //Obtenção dos dados da requisição
        String nome = request.getParameter("nome");

        //construção da resposta
        response.setContentType("text/html;charset=UTF-8");
        PrintWriter writer = response.getWriter();
        writer.println("<html lang=\"pt-BR\">");
        writer.println("\t<head>");
        writer.println("\t\t<title>Página gerada dinamicamente</title>");
        writer.println("\t\t<meta charset=\"UTF-8\" />");
        writer.println("\t</head>");
        writer.println("\t<body>");
        writer.println("\t\t<p>Nome: "+nome+"</p>");
        writer.println("\t</body>");
        writer.println("</html>");
        writer.close();
    }

    /**
     */
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        // TODO Auto-generated method stub
        doGet(request, response);
    }
}
