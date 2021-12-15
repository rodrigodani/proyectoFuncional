package paraproyecto.multim.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class Fib
 */
@WebServlet("/Fib")
public class Fib extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Fib() {
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
		
		salida.println("<h1>Numero Fibonacci: "+fibonacci()+"</h1>");
		
		salida.println("</body></html> ");
		
		
		
	}
	
	

	private String fibonacci() {
		// TODO Auto-generated method stub
		String serie="";
        int c = 0;
        int a = 0;
        int b = 0;
        
        for (int i = 0; i < 4; i++) 
        {
            if (i == 0 || i == 1)
            {
                serie = serie + 0 + ", ";
                a = 1;
            }
            else {
                c = a + b;
                a = b;
                b = c;
                serie = serie + c + ", ";
            }
        }
        return serie;
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
