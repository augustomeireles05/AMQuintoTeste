package br.com.projetoServlet;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class SegundoServlet
 */
@WebServlet("/SegundoServlet")
public class SegundoServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public SegundoServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//doGet(request, response);
		
		double valA, valB, valC;
		
		valA = Double.parseDouble(request.getParameter("valA"));
		valB = Double.parseDouble(request.getParameter("valB"));
		valC = Double.parseDouble(request.getParameter("valC"));
		
		double area;
		
		
		//INÍCIO DA LÓGICA PARA CONDIÇÃO DE EXISTÊNCIA DE UM TRIÂNGULO:
		
		if (valA <= 0 && valB <= 0 && valC <= 0) {
			response.getWriter().println("ATENÇÃO! Informe ao menos um valor positivo (MAIOR QUE ZERO)");
		} else if (valA < valB + valC && valB < valA + valC && valC < valA + valB) { //Condição de Existência do triângulo
			if (valA == valB && valB == valC) {
				response.getWriter().println("OS VALORES FORMAM UM TRIÂNGULO EQUILÁTERO!");
			} else if (valA == valB || valB == valC || valA == valC) {
				response.getWriter().println("OS VALORES FORMAM UM TRIÂNGULO ISÓCELES!");
			} else if (valA != valB && valA != valC && valC != valB) {
				response.getWriter().println("OS VALORES FORMAM UM TRIÂNGULO ESCALENO!");
			}
		} else {
			response.getWriter().println("OS DADOS INPUTADOS NÃO CONSEGUEM FORMAR UM TRIÂNGULO!");
		}
		
		// TESTE 2 2 3 - TRIANGULO ISÓCELES
		// TESTE 2 2 5 - NÃO SE PODE FORMAR UM TRIÂNGULO QUALQUER
		// TESTE 2 3 4 - TRIÂNGULO ESCALENO
		// TESTE 2 2 2 - TRIÂNGULO EQUILÁTERO
		
		
		
		
	}

}
