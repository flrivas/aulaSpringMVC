<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>

<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

	<form action="adicionarClientes" method="post">

		<label for="nome">Nome: </label> <input type="text" name="nome"
			id="nome"><br> <label for="ruaNroComp">RuaNroComp:
		</label> <input type="text" name="ruaNroComp" id="ruaNroComp"><br>

		<label for="bairro">Bairro: </label> <input type="text" name="bairro"
			id="bairro"><br> <label for="cidade">Cidade: </label> <input
			type="text" name="cidade" id="cidade"><br> <input
			type="submit" value="Adicionar">

	</form>

	<h2>Lista de Clientes</h2>


	<table>
		<thead>
			<tr>
				<th>Nome</th>
				<th>Savings</th>
			</tr>
		</thead>
		<tfoot>
			<tr>
				<td>Sum</td>
				<td>$180</td>
			</tr>
		</tfoot>
		<tbody>
			<tr>
				<td>January</td>
				<td>$100</td>
			</tr>
			<tr>
				<td>February</td>
				<td>$80</td>
			</tr>
		</tbody>
	</table>



</body>
</html>