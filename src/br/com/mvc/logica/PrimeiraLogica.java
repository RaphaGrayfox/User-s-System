package br.com.mvc.logica;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletRequest;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class PrimeiraLogica implements Logica{
	
	@Override
	public void executa(HttpServletResponse req, HttpServletResponse res)
			throws Exception {
		
		System.out.println("Executando a logica ...");
		System.out.println("Redirecionando pro JSP ...");
		
		RequestDispatcher rd = ((ServletRequest) req).getRequestDispatcher("/primeira-logica.jsp");
		rd.forward((ServletRequest) req, res);
	}


}
