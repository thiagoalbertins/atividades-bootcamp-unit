<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title></title>
</head>
<body>

	<%
	String id = request.getParameter("id");
	if(id != null){
	out.println("ID: " + id + "<br>");
	}
	String cpf = request.getParameter("cpf");
	if(cpf != null){
	out.println("CPF: " + cpf + "<br>");
	}
	String nome = request.getParameter("nome");
	if(nome != null){
	out.println("Nome: " + nome + "<br>");
	}
	String email = request.getParameter("email");
	if(email != null){
	out.println("Email: " + email + "<br>");
	}
	String data = request.getParameter("data");
	if(data != null){
	out.println("Data: " + data + "<br>");
	}
	String sexo = request.getParameter("sexo");
	if(sexo != null){
	out.println("Sexo: " + sexo + "<br>");
	}
	String nomeSocial = request.getParameter("nome-social");
	if(nomeSocial != null){
	out.println("Nome Social: " + nomeSocial + "<br>");
	}
	String apelido = request.getParameter("apelido");
	if(apelido != null){
	out.println("Apelido: " + apelido + "<br>");
	}
	String telefone = request.getParameter("telefone");
	if(telefone != null){
	out.print("Telefone: " + telefone + "<br>");
	}
	%>
</body>
</html>