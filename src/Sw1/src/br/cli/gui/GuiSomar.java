/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.cli.gui;

/**
 *
 * @author utfpr
 */
public class GuiSomar {
  
    
    public void somar2numeros(){
        int x, y;
        System.out.println("============================");
        System.out.print("Digite 1 numero:");
        x = new java.util.Scanner(System.in).nextInt();
        System.out.print("Digite outro numero:");
        y = new java.util.Scanner(System.in).nextInt();
        System.out.println("Resultado:" + new br.cli.func.Somar().somar2numeros(x, y));
    }
}
