/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package es.albarregas.models;

import es.albarregas.exceptions.DivisionPorCeroException;

/**
 *
 * @author Sergio
 */
public class Dividir {

    public int dividir(int op1, int op2) throws DivisionPorCeroException {
        int resultado = 0;
        if (op2 != 0) {
            resultado = op1 / op2;
        } else {
            throw new DivisionPorCeroException("");
        }
        return resultado;
    }

}
