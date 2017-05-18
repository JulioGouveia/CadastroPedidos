<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@ taglib uri="http://www.springframework.org/tags" prefix="s"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>

	<h1>pedidos</h1>
	<table>
		<tr>
			<td>Codigo Cliente</td>
			<td>Data</td>
			<td>Nome Produto</td>
			<td>Numero Pedido</td>
			<td>Quantidade</td>
			<td>Valor</td>
		</tr>
		<c:forEach items="${pedidos}" var="pedido" >
		<tr>
		<fmt:formatDate pattern="dd/MM/yyyy" value="${pedido.data.time}" var="data"/>
			<td>${pedido.codCliente }</td>
			<td>${data}</td>
			<td>${pedido.nomeProduto }</td>
			<td>${pedido.numeroPedido }</td>
			<td>${pedido.quantidade }</td>
			<td>${pedido.valor }</td>
		</tr>
		</c:forEach>
	</table>
</body>
</html>