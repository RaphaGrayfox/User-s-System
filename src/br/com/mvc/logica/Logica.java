package br.com.mvc.logica;

import javax.servlet.http.HttpServletResponse;

public interface Logica {
	void executa (HttpServletResponse req,
			HttpServletResponse res)throws Exception;

}
