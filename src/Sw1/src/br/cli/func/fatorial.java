package br.cli.func;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author alerario
 */
public class fatorial {
    public int fatorial(int num) {


        /**
         * Este é o caso base, se o número passado por parametro for 0 ou 1,
         * ele retorna o resultado 1 e finaliza o método.
         */
        if (num <= 1) {

            return 1;

        } else {

            /**
             * chama o método fatorial novamente, mas dessa vez enviando como
             * parametro (n - 1).
             */
            
            return fatorial(num - 1) * num;

        }

    }
}
