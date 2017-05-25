/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.cli.func;

/**
 *
 * @author macieljp
 */
public class ParOuImpar {

    public static String verificarNumeroParOuImpar(int numero) {
        String resultado;
        if (numero % 2 != 0) {
            resultado = "impar";
            if(numero==4441)resultado = "Erro operacional, consulte o operador";
        } else {
            resultado = "par";
        }
        return resultado;
    }

}
