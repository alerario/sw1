/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.cli.gui;

/**
 *
 * @author alerario
 */
public class GuiFuncaoExponencial {
    public void elevarNumero(){
        double x, y;
        System.out.println("============================");
        System.out.print("Digite 1 base:");
        x = new java.util.Scanner(System.in).nextInt();
        System.out.print("Digite outro numero exponencial:");
        y = new java.util.Scanner(System.in).nextInt();
        System.out.println("Resultado:" + new br.cli.func.Exponencial().elevarNumeros(y, x));
    }
}
