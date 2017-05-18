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
public class GuiSubtrairnNumeros {
    public void subtrairnumeros(){
        int x;
        int y;
        System.out.println("============================");
        System.out.print("Digite 1 numero:");
        x = new java.util.Scanner(System.in).nextInt();
        
        System.out.print("Digite 2 numero:");
        y = new java.util.Scanner(System.in).nextInt();
        
        System.out.print("Resultado:" + new br.cli.func.subtrairnNumeros().subtrairnNumeros(x, y));
    }
}
