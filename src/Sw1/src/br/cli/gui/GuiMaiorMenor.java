/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.cli.gui;

import java.util.Scanner;

/**
 *
 * @author Paula
 */
public class GuiMaiorMenor {
   public void maiorMenor(){
        int x, y;
        System.out.println("============================");
        System.out.print("Digite 1 numero:");
        x = new java.util.Scanner(System.in).nextInt();
        System.out.print("Digite 2 numero:");
        y = new java.util.Scanner(System.in).nextInt();
        System.out.println("O maior numero:" + new br.cli.func.MaiorMenor().maiorMenor(x, y));
    }
    
}
