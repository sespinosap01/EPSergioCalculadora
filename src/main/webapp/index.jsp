<%-- 
    Document   : index
    Created on : 02-may-2023, 20:44:46
    Author     : Sergio
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="es">
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Calculadora</title>
        <link rel="stylesheet" type="text/css" href="<%= request.getContextPath()%>/CSS/style.css"/>

    </head>
    <body>
        <%@include file="INC/cabecera.inc"%>
        <form action="FrontController" method="POST">
            <label for="op1">Operando 1:</label>
            <input type="text" name="op1" id="op1" size="8"/><br><br>
            <label for="op2">Operando 2:</label>
            <input type="text" name="op2" id="op2" size="8"/><br><br>
            <input type="radio" name="opcion" value="suma" id="suma" checked/>
            <label for="suma">Suma</label>
            <input type="radio" name="opcion" value="resta" id="resta" />
            <label for="resta">Resta</label>
            <input type="radio" name="opcion" value="multiplicacion" id="multiplicacion" />
            <label for="multiplicacion">Multiplicación</label>
            <input type="radio" name="opcion" value="division" id="division" />
            <label for="division">División</label>            
            <br><br>
            <input type="submit" name="enviar" value="Calcular"/>
        </form>
    </body>
</html>
