<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ page isELIgnored="false"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
Hola la persona se llama ${ persona.nombre } y tiene ${persona.edad} años </br>

El color en la posicion 1 del array de colores es: ${listaColores[1]} </br>
La persona en la posicion 0 del array se llama ${listaPersonas[0].nombre}. </br>

La suma de la persona en la posicion cero y la persona en la posicion 1 de la lista es:
${listaPersonas[0].edad} + ${listaPersona[1].edad} = ${listaPersonas[0].edad + listaPersonas[1].edad}  </br>

La persona en la posicion cero de la lista es mayor que la persona en la posicion 1: ${listaPersonas[0].edad > listaPersonas[1].edad}
</body>
</html>