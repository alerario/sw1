/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.cli.gui;

/**
 *
 * @author Vitor
 */
public class GuiSubtração {
    public void subtração(){
        int a;
        int b;
       
        System.out.print("Escreva o primeiro numero :");
        a = new java.util.Scanner(System.in).nextInt();
        
        System.out.print("Escreva o segundo numero:");
        b = new java.util.Scanner(System.in).nextInt();
        
        System.out.print("Resultado:" + new br.cli.func.Subtração().Subtração(a, b));
    }
    
}
