package cuadradoServlet;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import cuadrado.CuadradoMagico;
/**
 * Servlet implementation class Cuadrado
 */
@WebServlet("/CuadradoMagicoServlet")
public class CuadradoMagicoServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public CuadradoMagicoServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// Parse params
		int[][] m = new int[3][3];
		int c=1;
		for(int i=0; i<3; i++){
			for(int j=0; j<3; j++){
				String s = request.getParameter(Integer.toString(c));
				int n = 0;
				if(s.matches("-?\\d+(\\.\\d+)?")){
					n = Integer.parseInt(s);
				}
				m[i][j] = n;
				c++;
			}
		}
		//System.out.println(java.util.Arrays.toString(m));
		CuadradoMagico cuadrado = new CuadradoMagico(m);
		if(cuadrado.validate()){
			request.setAttribute("result", "<p class='success'>Cuadrado mágico válido</p>");
		}
		else{
			request.setAttribute("result", "<p class='invalid'>Cuadrado mágico inválido</p>");
		}
		request.getRequestDispatcher("/Formulario.jsp").forward(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
	}

}
