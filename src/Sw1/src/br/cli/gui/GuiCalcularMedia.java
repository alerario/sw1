/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.cli.gui;

import br.cli.func.CalcularMedia;
import java.util.Scanner;

/**
 *
 * @author macieljp
 */
public class GuiCalcularMedia {

    public GuiCalcularMedia() {

        Scanner input = new Scanner(System.in);

        System.out.println("Informe primeiro Número: ");
        int num = input.nextInt();
        System.out.println("Informe o segundo Número: ");
        int num2 = input.nextInt();

        System.out.println("Média entre os numeros: " + CalcularMedia.calcularAMedia(num, num2));
    }

}
