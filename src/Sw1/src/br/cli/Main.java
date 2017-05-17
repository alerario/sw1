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
            if (op == 44) {
                new br.cli.gui.GuiFubonacci().CalculaFib();
            }
            if (op == 22) {
                new br.cli.gui.GuiFuncaoExponencial().elevarNumero();
            }
<<<<<<< HEAD
            
            if(op==7){
                new br.cli.gui.GuiFatorial().fatorial();
            }
            
            if(op==8){
                new br.cli.gui.GuiSubtrairnNumeros().subtrairnumeros();
            }
            
=======
>>>>>>> f20013145446a8763fc73d435ea108c679e6a6d8
            menu();
            op = new java.util.Scanner(System.in).nextInt();
        }
    }
    
    public static void menu(){
        System.out.println("##################################");
        System.out.println("0 - sair");
        System.out.println("1 - somar dois numeros");
        System.out.println("2 - subtrair dois numeros");
<<<<<<< HEAD
        System.out.println("7 - fatorial de um numero");
        System.out.println("8 - subtrair n numeros");
=======
        System.out.println("14 - Multiplicar N números");
        System.out.println("22 - Exponencial");
        System.out.println("44 - Calcular Fibonacci");

>>>>>>> f20013145446a8763fc73d435ea108c679e6a6d8
    }
    
    
}
