/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package es.albarregas.controllers;

import es.albarregas.beans.Calculator;
import es.albarregas.exceptions.DivisionPorCeroException;
import es.albarregas.models.Dividir;
import es.albarregas.models.Multiplicar;
import es.albarregas.models.Restar;
import es.albarregas.models.Sumar;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author Sergio
 */
@WebServlet(name = "FrontController", urlPatterns = {"/FrontController"})
public class FrontController extends HttpServlet {

    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

    }

    /**
     * Handles the HTTP <code>GET</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
    }

    /**
     * Handles the HTTP <code>POST</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        boolean error = false;
        String url = "JSP/resultado.jsp";
        Calculator calculator = new Calculator();

        try {
            int op1 = Integer.parseInt(request.getParameter("op1"));
            int op2 = Integer.parseInt(request.getParameter("op2"));
            String opcion = request.getParameter("opcion");

            switch (opcion) {
                case "suma":
                    Sumar suma = new Sumar();
                    calculator.setResultado(suma.sumar(op1, op2));
                    calculator.setSigno(" + ");
                    break;
                case "resta":
                    Restar resta = new Restar();
                    calculator.setResultado(resta.restar(op1, op2));
                    calculator.setSigno(" - ");
                    break;
                case "multiplicacion":
                    Multiplicar multiplicacion = new Multiplicar();
                    calculator.setResultado(multiplicacion.multiplicar(op1, op2));
                    calculator.setSigno(" * ");

                    break;
                case "division":
                    Dividir division = new Dividir();
                    try {
                        calculator.setResultado(division.dividir(op1, op2));
                        calculator.setSigno(" / ");
                    } catch (DivisionPorCeroException e) {
                        error = true;
                    }
            }//cierre switch
            if (error) {
                request.setAttribute("error", "No se puede dividir entre cero");

                url = "JSP/error.jsp";
            } else {
                calculator.setOp1(op1);
                calculator.setOp2(op2);
                request.setAttribute("cuenta", calculator);

            }
        } catch (NumberFormatException e) {
            request.setAttribute("error", "Alguno de los operandos es inválido");

            url = "JSP/error.jsp";
        }
        request.getRequestDispatcher(url).forward(request, response);

        /**
         * Returns a short description of the servlet.
         *
         * @return a String containing servlet description
         */
    }

    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
