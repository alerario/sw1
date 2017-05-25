package br.cli.gui;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author alerario
 */
public class GuiFatorial {
    public void fatorial(){
        int x;
        System.out.println("============================");
        System.out.print("Digite 1 numero:");
        x = new java.util.Scanner(System.in).nextInt();
        System.out.println("Resultado:" + new br.cli.func.fatorial().fatorial(x));
    }
    
}
