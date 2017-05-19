/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.cli.gui;

import br.cli.func.Potenciacao;
import java.util.Scanner;

/**
 *
 * @author Aluno
 */
public class GuiPotenciacao {
    public GuiPotenciacao(){
        Scanner input = new Scanner(System.in);
        System.out.println("Informa o número de base: ");
        
        int base = input.nextInt();
        
        System.out.println("Informa o número de potencia: ");
        int pot = input.nextInt();
        
        System.out.println("Potenciacao: "+Potenciacao.potencia(base, pot));
    }
}
