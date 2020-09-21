<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/functions" prefix="fn"%>
<!DOCTYPE html>
<html lang="pt-BR">
	<head>
		<meta charset="UTF-8">
		<title>Cursos importados</title>
		<link rel="stylesheet" type="text/css" href="estilos.css" />
	</head>
	<body>
		<h1>
			Tabela de cursos importados do XML
		</h1>
		<!--Completar aqui-->
		<c:choose>
			<c:when test="${not empty lista.cursos}">
			</c:when>

			<c:otherwise>
				<p>XML vazio ou o arquivo enviado não é um XML</p>
			</c:otherwise>
		</c:choose>
	</body>
</html>