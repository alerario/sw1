/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.cli.gui;

import br.cli.func.Divisao;
import java.util.Scanner;

/**
 *
 * @author Priihmo
 */
public class GuiDivisao {
    public GuiDivisao(){
        Scanner input = new Scanner(System.in);
        
        System.out.println("Informe o primeiro número: ");
        int n1 = input.nextInt();
        
        System.out.println("Informe o segundo número: ");
        int n2 = input.nextInt();
        
        double valor = Divisao.Divisao(n1, n2);
        if (valor != 0) 
            System.out.println("O resultado da divisão é: " + valor);
        else
            System.out.println("Impossivel dividir por zero");
        
    }
}
