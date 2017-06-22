/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.cli.gui;

import static br.cli.func.CalculandoLogaritimo.CalculandoLogaritimo;
import java.util.Scanner;

/**
 *
 * @author Vitor
 */
public class GuiLogaritimo {
    public GuiLogaritimo(){
        Scanner input = new Scanner(System.in);
        
        System.out.println("Digite um numero ");
        int x = input.nextInt();
        
        System.out.println("O Logaritimo é :" +  CalculandoLogaritimo(x));
    }
   
    
}
