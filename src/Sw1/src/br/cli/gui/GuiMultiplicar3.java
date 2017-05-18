/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.cli.gui;

/**
 *
 * @author Aluno
 */
public class GuiMultiplicar3 {
    public void guimultiplicar(){
        int x, y, z;
        System.out.println("============================");
        System.out.print("Digite um numero:");
        x = new java.util.Scanner(System.in).nextInt();
        System.out.print("Digite outro numero :");
        y = new java.util.Scanner(System.in).nextInt();
        System.out.print("Digite outro numero :");
        z = new java.util.Scanner(System.in).nextInt();
        System.out.println("Resultado:" + new br.cli.func.Multiplicar3().multiplicar3(x,y,z));
    }
}
