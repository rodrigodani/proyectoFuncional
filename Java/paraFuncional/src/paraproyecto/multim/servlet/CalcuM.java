package paraproyecto.multim.servlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.function.BiFunction;
import java.util.function.Function;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class CalcuM
 */
@WebServlet("/CalcuM")
public class CalcuM extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public CalcuM() {
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
		String op = request.getParameter("op");
		Double[][] p= {};
		salida.println("<h1>El resultado es:</h1>");
        switch (op) 
        {
            case "suma":
            	p=calculadora(new Double[][]{{1.0,2.0},{1.0,2.0}},new Double[][]{{1.0,2.0},{1.0,2.0}},suma);
            	break;
            case "resta":
            	p=calculadora(new Double[][]{{1.0,2.0},{1.0,2.0}},new Double[][]{{1.0,2.0},{1.0,2.0}},resta);
            	break;
            case "multiplicacion":
            	p=calculadora(new Double[][]{{1.0,2.0},{1.0,2.0}},new Double[][]{{1.0,2.0},{1.0,2.0}},multiplicacion);
            	break;
        }
        for (int i=0; i<p.length;i++)
        {
            for (int j = 0;j< p[i].length;j++ )
            {
            	salida.println(p[i][j]+"&nbsp;&nbsp;");
                
            }
            salida.println("</br>");
        }
	}
	private Double[][] calculadora(Double[][] mat1,Double[][] mat2,BiFunction<Double[][],Double[][],Double[][]> op) {
		// TODO Auto-generated method stub
		return op.apply(mat1,mat2);
	}
	
	public BiFunction<Double[][],Double[][],Double[][]> suma = (a,b) ->
	{
		for (int i = 0; i < a.length; i++) 
        {
            for (int j = 0; j < a[i].length; j++)
            {
                a[i][j]=a[i][j]+b[i][j];
            }
        }
        return a;	
	};
	public BiFunction<Double[][],Double[][],Double[][]> resta = (a,b) ->
	{
		for (int i = 0; i < a.length; i++) 
        {
            for (int j = 0; j < a[i].length; j++)
            {
                a[i][j]=a[i][j]-b[i][j];
            }
        }
        return a;	
	};
	public BiFunction<Double[][],Double[][],Double[][]> multiplicacion = (a,b) ->
	{
        Double[][] mul = new Double[a.length][b[0].length];

        for (int k = 0; k < a.length; k++)
        {
            for (int i = 0; i < b[k].length; i++)
            {
                double su = 0;
                for (int j = 0; j < a[i].length; j++)
                {
                    su = su + (a[k][j] * b[j][i]);
                }
                mul[k][i] = su;
            }
        }
        return mul;
	};
	
	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
