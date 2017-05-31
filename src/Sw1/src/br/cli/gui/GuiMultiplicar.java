/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.cli.gui;

import br.cli.func.Multiplicar;
import java.util.Scanner;

/**
 *
 * @author usuario
 */
public class GuiMultiplicar {
    public GuiMultiplicar(){
        Scanner input = new Scanner(System.in);
        
        System.out.println("Informe o primeiro número: ");
        int n1 = input.nextInt();
        
        System.out.println("Informe o segundo número: ");
        int n2 = input.nextInt();
        
        System.out.println("Multiplicacao: "+Multiplicar.multiplica(n1, n2));
    }
}
