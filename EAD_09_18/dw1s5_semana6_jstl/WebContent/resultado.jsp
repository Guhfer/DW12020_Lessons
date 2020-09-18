<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions"%>
<!DOCTYPE html>
<html lang="pt-BR">
	<head>
		<meta charset="UTF-8" />
		<title>Listagem de pessoas</title>
		<link rel="stylesheet" type="text/css" href="estilos.css" />
	</head>
	<body>
		<c:choose>
			<%--<c:when test="${fn:length(lista) > 0}">--%>
			<c:when test="${not empty lista}">
				<table>
					<tr>
						<th>#</th>
						<th>Nome</th>
						<th>CPF</th>
						<th>E-mail</th>
					</tr>
					<c:forEach var="pessoa" items="${lista}" varStatus="contador">
						<tr>
							<td>${contador.count}</td>
							<td>${fn:toLowerCase(pessoa.nome)}</td>
							<td>${pessoa.cpf}</td>
							<td>${pessoa.email}</td>
						</tr>
					</c:forEach>
				</table>
			</c:when>
			<c:otherwise>
				<c:out value="Sem nenhuma pessoa registrada"></c:out>
			</c:otherwise>
		</c:choose>
				
		<%--
		<c:set var="num" value="3" />
		
		<c:choose>
			<c:when test="${num % 2 == 0}">
				<c:out value="Par"></c:out>
			</c:when>
			<c:otherwise>
				<c:out value="Ímpar"></c:out>
			</c:otherwise>
		</c:choose>
		 --%>
	</body>
</html>