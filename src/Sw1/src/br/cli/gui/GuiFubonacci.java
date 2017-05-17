/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.cli.gui;

import br.cli.func.CalculaFibonacci;

/**
 *
 * @author lucasjcs
 */
public class GuiFubonacci {
    public void CalculaFib(){
        int n;
        System.out.println("=========================");
        n = new java.util.Scanner(System.in).nextInt();
        System.out.println("Resultado:"+ new CalculaFibonacci().fib(n));
    }
}
