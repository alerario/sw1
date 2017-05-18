/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.cli;

/**
 *
 * @author utfpr
 */
public class Main {
    public static void main(String[] args) {
        System.out.println("Bem vindo.");
        System.out.println("==>selecione as opcoes");
        int op;
        menu();
        op = new java.util.Scanner(System.in).nextInt();
        while(op!=0){
            
            if(op==1){
                new br.cli.gui.GuiSomar().somar2numeros();
            }else if(op == 14){
                new br.cli.gui.GuiMultiplicarMuitosNumeros().getGUI();
            }
            
            menu();
            op = new java.util.Scanner(System.in).nextInt();
        }
    }
    
    public static void menu(){
        System.out.println("##################################");
        System.out.println("0 - sair");
        System.out.println("1 - somar dois numeros");
        System.out.println("2 - subtrair dois numeros");
        System.out.println("14 - Multiplicar N números");
    }
    
    
}
