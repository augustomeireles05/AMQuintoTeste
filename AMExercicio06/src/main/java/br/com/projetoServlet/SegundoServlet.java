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
			response.getWriter().println("ATENÇÃO! Informe ao menos três valores positivo para verificação da Existência de Triângulos!");
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
		
		
		//INÍCIO DA LÓGICA PARA CONDIÇÃO DE DOIS LADOS IGUAIS E UM ZERO (ÁREA DO QUADRADO e RETANGULO).
		
		if (valA == 0 && valB > 0 && valC > 0 && (valB == valC)) {
			area = valB * valC;
			response.getWriter().printf("Os valores de B e C podem ser lados de um QUADRADO e possui área = %.2f m². \n", area);
		} else if (valB == 0 && valC > 0 && valA > 0 && (valA == valC)) {
			area = valA * valC;
			response.getWriter().printf("Os valores de A e C podem ser lados de um QUADRADO e possui área = %.2f m². \n", area);
		} else if (valC == 0 && valC > 0 && valB > 0 && (valA == valB)) {
			area = valA * valB;
			response.getWriter().printf("Os valores de A e B podem ser lados de um QUADRADO e possui área = %.2f m². \n", area);
		} else if (valA == 0 && valB != valC) {
			area = valB * valC;
			response.getWriter().printf("Os valores de B e C podem ser lados de um RETANGULO e possui área = %.2f m². \n", area);
			
		} else if (valB == 0 && valA != valC) {
			area = valA * valC;
			response.getWriter().printf("Os valores de A e C podem ser lados de um RETANGULO e possui área = %.2f m². \n", area);
			
		} else if (valC == 0 && valA != valB) {
			area = valA * valB;
			response.getWriter().printf("Os valores de A e B podem ser lados de um RETANGULO e possui área = %.2f m². \n", area);
			
		} 
		
		//INÍCIO DA LÓGICA PARA CONDIÇÃO DE UMA RETA!
		
		if (valA == 0 && valB == 0 && valC > 0) {
			double reta = valC;
			response.getWriter().printf("Os valores inputados representam uma reta. VALOR de C = %.2f m.", reta);
		} else if (valB == 0 && valC == 0 && valA > 0) {
			double reta = valA;
			response.getWriter().printf("Os valores inputados representam uma reta. VALOR de A = %.2f m.", reta);
		} else if (valA == 0 && valC == 0 && valB > 0) {
			double reta = valB;
			response.getWriter().printf("Os valores inputados representam uma reta. VALOR de B = %.2f m.", reta);
		}
	
		
		
	}

}
