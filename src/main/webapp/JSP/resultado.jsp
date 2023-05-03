<%-- 
    Document   : resultado
    Created on : 02-may-2023, 21:23:54
    Author     : Sergio
--%>

<%@page import="es.albarregas.beans.Calculator"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Calculadora</title>
        <link rel="stylesheet" type="text/css" href="<%= request.getContextPath()%>/CSS/style.css" media="screen" />
    </head>
    <body>
    <body>
        <%@include file="/INC/cabecera.inc"%>
        <%
            Calculator calculator = (Calculator) request.getAttribute("cuenta");
        %>

        <h2><%=calculator.getOp1()%> <%=calculator.getSigno()%> <%=calculator.getOp2()%> = <%=calculator.getResultado()%></h2>
        <br>
        <p><a href="VolverEmpezar">Volver</a></p>
    </body>
</html>
