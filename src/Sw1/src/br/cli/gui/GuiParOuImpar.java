/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.cli.gui;

import br.cli.func.ParOuImpar;
import java.util.Scanner;

/**
 *
 * @author macieljp
 */
public class GuiParOuImpar {

    public GuiParOuImpar() {

        System.out.println("Informa um número: ");
        Scanner input = new Scanner(System.in);
        int num = input.nextInt();

        System.out.println(ParOuImpar.verificarNumeroParOuImpar(num));
    }

}
