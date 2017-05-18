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
public class GuiPorcentagem {
     public GuiPorcentagem() {

         int x, y;
        System.out.println("============================");
        System.out.print("Digite 1 numero:");
        x = new java.util.Scanner(System.in).nextInt();
        System.out.print("Digite outro numero:");
        y = new java.util.Scanner(System.in).nextInt();
        System.out.println(""+y +" porcento de  "+x+" é:" + new br.cli.func.Porcentagem().calcularPorcentagem(x, y));
    
    }
}
