/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.cli.gui;

/**
 *
 * @author STHGM
 */
public class GuiDistPontos {
    
    public void calcularDistancia(){
        double xa, ya, xb, yb;
        System.out.println("============================");
        System.out.print("Digite o xA numero:");
        xa = new java.util.Scanner(System.in).nextDouble();
        System.out.print("Digite o xB numero:");
        xb = new java.util.Scanner(System.in).nextDouble();
        System.out.print("Digite o yA numero:");
        ya = new java.util.Scanner(System.in).nextDouble();
        System.out.print("Digite o yB numero:");
        yb = new java.util.Scanner(System.in).nextDouble();
        System.out.print("Digite outro numero:");
        System.out.println("Resultado:" + new br.cli.func.DistPontos().calcular(xa, xb, ya, yb));
    }
}
