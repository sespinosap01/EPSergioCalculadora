/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package es.albarregas.exceptions;

/**
 *
 * @author Sergio
 */
public class DivisionPorCeroException extends Exception {

    public DivisionPorCeroException(String mensaje) {
        super(mensaje);
    }

}
