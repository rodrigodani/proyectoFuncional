package paraproyecto.multim.servlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.function.*;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class Calcu
 */
@WebServlet("/Calcu")
public class Calcu extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Calcu() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//response.getWriter().append("Served at: ").append(request.getContextPath());
		PrintWriter salida=response.getWriter();
		salida.println("<html> <body>");
		
		salida.println("<h1>El resultado es: ");
		
        double number1= Double.parseDouble(request.getParameter("na"));
        double number2 = Double.parseDouble(request.getParameter("nb"));
        String op = request.getParameter("op");

        switch (op) 
        {
            case "suma":
            	salida.println(calculadora(number1,number2,suma)+"");
                break;
            case "resta":
            	salida.println(calculadora(number1,number2,resta)+"");
                break;
            case "multiplicacion":
            	salida.println(calculadora(number1,number2,multiplicacion)+"");
                break;
            case "division":
            	salida.println(calculadora(number1,number2,division)+"");
                break;
        
        }

		
		salida.println("</h1>");
		
		salida.println("</body></html> ");
		
		
	}

	

	private Double calculadora(double number1, double number2, BiFunction<Double, Double, Double> op) {
		// TODO Auto-generated method stub
		return op.apply(number1, number2);
	}



	public BiFunction<Double,Double, Double> suma = (a, b) -> a +b;
	public BiFunction<Double,Double, Double> resta = (a, b) -> a -b;
	public BiFunction<Double,Double, Double> multiplicacion = (a, b) -> a *b;
	public BiFunction<Double,Double, Double> division = (a, b) -> a /b;
    
	
	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
