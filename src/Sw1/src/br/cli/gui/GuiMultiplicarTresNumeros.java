/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.cli.gui;

/**
 *
 * @author Carol
 */
public class GuiMultiplicarTresNumeros {
    public void multiplicarTres(){
        int num1, num2, num3;
        System.out.println("============================");
        System.out.print("Digite o primeiro numero:");
        num1 = new java.util.Scanner(System.in).nextInt();
        System.out.print("Digite o segundo numero:");
        num2 = new java.util.Scanner(System.in).nextInt();
        System.out.print("Digite o terceiro numero:");
        num3 = new java.util.Scanner(System.in).nextInt();
        System.out.println("Resultado:" + new br.cli.func.MultiplicarTres().multiplicarTres(num1, num2, num3));
    }
}
