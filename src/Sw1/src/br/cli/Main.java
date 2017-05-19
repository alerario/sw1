/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.cli;

import br.cli.gui.GuiCalcularMedia;
import br.cli.gui.GuiParOuImpar;
import br.cli.gui.GuiPotenciacao;
import br.cli.gui.GuiSomatorio;

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
        while (op != 0) {

            if (op == 1) {
                new br.cli.gui.GuiSomar().somar2numeros();
            }
            if (op == 3){
                new br.cli.gui.GuiMaiorMenor().maiorMenor();
            }

            if (op == 19) {
                new GuiParOuImpar();
            }
            if (op == 21) {
                new GuiSomatorio();
            }
            if (op == 25) {
                new GuiCalcularMedia();
            }

            if (op == 44) {
                new br.cli.gui.GuiFubonacci().CalculaFib();
            }
            if (op == 22) {
                new br.cli.gui.GuiFuncaoExponencial().elevarNumero();
            }
             if (op == 24) {
                new br.cli.gui.GuiPorcentagem();
            }
            
            if (op == 17) {
                new br.cli.gui.GuiDistPontos().calcularDistancia();
            }
             if(op==7){
                new br.cli.gui.GuiFatorial().fatorial();
            }
            
            if(op==8){
               new br.cli.gui.GuiSubtrairnNumeros().subtrairnumeros();
            }
            if(op==33){
               new br.cli.gui.GuiOrdenacao().ordenacao();
            }
            if(op==26){
               new GuiPotenciacao();
            }
            
            
            
            menu();
            op = new java.util.Scanner(System.in).nextInt();
        }
        System.out.println("$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$");
        System.out.println("Fim do programa!");
    }

    public static void menu() {
        System.out.println("###########################################");
        System.out.println("0 - sair");
        System.out.println("1 - somar dois numeros");
        System.out.println("2 - subtrair dois numeros");
        System.out.println("3 - Informar o maior e o menor número");
        System.out.println("7 - fatorial de um numero");
        System.out.println("8 - subtrair n numeros");
        System.out.println("22 - Exponencial");
        System.out.println("44 - Calcular Fibonacci");
        System.out.println("17 - Calcular Distancia entre pontos");
        System.out.println("19 - Informa um número para verificar se é par ou impar? ");
        System.out.println("21 - Informa um número para o somatorio? "); //calcula de 1 ate o numero informado
        System.out.println("25 - Calcular a média entre dois números? ");
        System.out.println("24 - Calcular a porcentagem de um número");//calcula a media entre 2 numeros
        System.out.println("26 - Potencia");
        System.out.println("33 - Ordenar numero aleatório");
    }

}
/*

package br.cli;

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
>>>>>>> 477aa08be892a68b019e4c9f0d924945873560a1
 */
