<%-- 
    Document   : error
    Created on : 02-may-2023, 21:23:44
    Author     : Sergio
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Calculadora</title>
        <link rel="stylesheet" type="text/css" href="<%= request.getContextPath()%>/CSS/style.css" media="screen" />

    </head>
    <body>
        <%@include file="/INC/cabecera.inc"%>
        <h2>ERROR, <%=request.getAttribute("error")%></h2>
        <br>
        <p><a href="VolverEmpezar">Volver</a></p>

    </body>
</html>
