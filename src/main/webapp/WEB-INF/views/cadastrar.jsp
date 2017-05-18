<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@ taglib uri="http://www.springframework.org/tags" prefix="s"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Cadastro pedido</title>
</head>
<body>
<!--  '<c:url value="/cadastrar"/>'-->
	<form action="${s:mvcUrl('CC#cadastrar').build() } " method="POST" class="form-horizontal">
		<fieldset>
			<legend>Cadastro Pedido</legend>
			<div class="form-group">
				<label class="col-md-4 control-label" for="numeroPedido">Nº
					Pedido:</label>
				<div class="col-md-4">
					<input name="numeroPedido" type="number"
						placeholder="Numero Pedido" class="form-control input-md"
						required="">
				</div>
			</div>
			<div class="form-group">
				<label class="col-md-4 control-label" for="Data">Data:</label>
				<div class="col-md-4">
						<input name="data" type="text" placeholder="Data"
							class="form-control input-md">
				</div>
			</div>
			<div class="form-group">
				<label class="col-md-4 control-label" for="nomeProduto">Nome
					Produto:</label>
				<div class="col-md-4">
					<input name="nomeProduto" type="text"
						placeholder="Nome Produto" class="form-control input-md"
						required="">
				</div>
			</div>
			<div class="form-group">
				<label class="col-md-4 control-label" for="valor">Valor:</label>
				<div class="col-md-4">
					<input name="valor" type="text" placeholder="Valor"
						class="form-control input-md" required="">
				</div>
			</div>
			<div class="form-group">
				<label class="col-md-4 control-label" for="quantidade">Quantidade:</label>
				<div class="col-md-4">
					<input name="quantidade" type="number"
						placeholder="Quantidade" class="form-control input-md" required="">
				</div>
			</div>
			<div class="form-group">
				<label class="col-md-4 control-label" for="codCliente">Cod.
					Cliente:</label>
				<div class="col-md-4">
					<input name="codCliente" type="number"
						placeholder="Código do Cliente" class="form-control input-md"
						required="">
				</div>
			</div>
			<div class="form-group">
				<label class="col-md-4 control-label" for="enviar"></label>
				<div class="col-md-4">
					<button type="submit" class="btn btn-success">Enviar
						Pedido</button>
				</div>
			</div>
		</fieldset>
	</form>
</body>
</html>