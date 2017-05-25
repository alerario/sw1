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
public class Somatorio {

    public static int SomatorioDoNumero(int numero) {

        int contador = 0, soma = 0;
        while (contador < numero) {
            soma += ++contador;
        }
        return soma;

    }


}
