<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib tagdir="/WEB-INF/tags" prefix="caelum" %>
<!DOCTYPE html>
<html>
<head>
	<link rel="stylesheet" href="http://code.jquery.com/ui/1.10.3/themes/smoothness/jquery-ui.css">
  	<script src="http://code.jquery.com/jquery-1.9.1.js"></script>
  	<script src="http://code.jquery.com/ui/1.10.3/jquery-ui.js"></script>
  	<link rel="stylesheet" href="/resources/demos/style.css">
  
</head>
<body>
<c:import url="cabecalho.jsp"></c:import>
	<form method="post" action="adicionaContato">
		Nome: <input type="text" name="nome" /><br />
		E-mail: <input type="text" name="email" /><br />
		Endereço: <input type="text" name="endereco" /><br />
		Data Nascimento: <caelum:campoData id="dataNascimento"/> 
	
		<input type="submit" value="Gravar" />
		
	</form>
	<c:import url="rodape.jsp"></c:import>
</body>
</html>