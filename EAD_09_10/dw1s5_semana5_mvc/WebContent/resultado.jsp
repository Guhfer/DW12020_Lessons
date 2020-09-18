<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" import="java.util.List,dw1s5.modelo.Pessoa"%>
<!DOCTYPE html>
<html lang="pt-BR">
	<head>
		<meta charset="UTF-8" />
		<title>Listagem de pessoas</title>
		<link rel="stylesheet" type="text/css" href="estilos.css" />
	</head>
	<body>
		<% 
			@SuppressWarnings("unchecked")
			List<Pessoa> pessoas = (List<Pessoa>)request.getAttribute("lista");
			//aqui temos certeza de que o objeto gravado como atributo da requisição é uma lista de pessoas
		%>
		<table>
			<tr>
				<th>Nome</th>
				<th>CPF</th>
				<th>E-mail</th>
			</tr>
			<%
				for(Pessoa pessoa: pessoas) {  
			%>
			<tr>
				<td><%= pessoa.getNome()%></td>
				<td><%= pessoa.getCpf()%></td>
				<td><%= pessoa.getEmail()%></td>
			</tr>
			<% } %>
		</table>
	</body>
</html>