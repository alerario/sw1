/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.cli.gui;

import static br.cli.func.RaizCubica.RaizCubica;
import java.util.Scanner;

/**
 *
 * @author tiiag
 */
public class GuiRaizCubica {
    public GuiRaizCubica(){
        Scanner input = new Scanner(System.in);
        
        System.out.println("Digite um número para obter a raiz cubica:");
        int x = input.nextInt();
        
        System.out.println("O resultado da raiz cubica é: " + RaizCubica(x));
    }
}
