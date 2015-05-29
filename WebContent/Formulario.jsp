<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<script type="text/javascript" src="./jquery.js"></script>
<script type="text/javascript" src="./main.js"></script>
<link rel="stylesheet" href="./style.css">
<title>Insert title here</title>
</head>
<body>
<h1>Cuadrado Mágico</h1>
<form id="cuadradoForm" action="CuadradoMagicoServlet">
	<table>
		<tr><span id="message">${result}</span></tr>
		<tr>
			<td><input type="text" class="cm_cell" maxlength="1" name="1" value="4" ></td>
			<td><input type="text" class="cm_cell" maxlength="1" name="2" value="9" ></td>
			<td><input type="text" class="cm_cell" maxlength="1" name="3" value="2" ></td>
		</tr>
		<tr>
			<td><input type="text" class="cm_cell" maxlength="1" name="4" value="3" ></td>
			<td><input type="text" class="cm_cell" maxlength="1" name="5" value="5" ></td>
			<td><input type="text" class="cm_cell" maxlength="1" name="6" value="7" ></td>
		</tr>
		<tr>
			<td><input type="text" class="cm_cell" maxlength="1" name="7" value="8" ></td>
			<td><input type="text" class="cm_cell" maxlength="1" name="8" value="1" ></td>
			<td><input type="text" class="cm_cell" maxlength="1" name="9" value="6" ></td>
		</tr>
		<tr>
			<td><input type="submit" value="Verificar"></td>
			<td><input type="reset" id="formReset" value="Borrar"></td>
		</tr>
	</table>
</form>
</body>
</html>