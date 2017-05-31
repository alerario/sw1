
package br.cli;

import br.cli.gui.*;

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
            else if (op == 3){
                new br.cli.gui.GuiMaiorMenor().maiorMenor();
            }
            else if (op == 19) {
                new GuiParOuImpar();
            }
            else if (op == 21) {
                new GuiSomatorio();
            }
            else if (op == 25) {
                new GuiCalcularMedia();
            }
            else if (op == 44) {
                new br.cli.gui.GuiFubonacci().CalculaFib();
            }
            else if (op == 22) {
                new br.cli.gui.GuiFuncaoExponencial().elevarNumero();
            }
            else if (op == 24) {
                new br.cli.gui.GuiPorcentagem();
            }
            else if (op == 17) {
                new br.cli.gui.GuiDistPontos().calcularDistancia();
            }
            else if(op==7){
                new br.cli.gui.GuiFatorial().fatorial();
            }
            else if(op == 14){
                new br.cli.gui.GuiMultiplicarMuitosNumeros().getGUI();
            }
            else if(op==8){
               new br.cli.gui.GuiSubtrairnNumeros().subtrairnumeros();
            }
            else if(op == 20){
                new br.cli.gui.GuiMultiplicarTresNumeros().multiplicarTres();
            }
            else if(op==33){
               new br.cli.gui.GuiOrdenacao().ordenacao();
            }
            else if(op==26){
               new GuiPotenciacao();
            }
            else if(op==27){
               new GuiRaizCubica();
            }
            else if(op == 28){
                new GuiRaizQuadrada();
            }
            else if(op==55){
               new br.cli.gui.GuiAleatorio().aleatorio();
               
            }
            
             else if(op==66){
               new br.cli.gui.GuiSubtração().subtração();
            }
            
             else if(op==38){
                new GuiMultiplicar(); 
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
        System.out.println("14 - Multiplicar N números");
        System.out.println("17 - Calcular Distancia entre pontos");
        System.out.println("19 - Informa um número para verificar se é par ou impar? ");
        System.out.println("20 - Multiplicar Tres numeros");
        System.out.println("21 - Informa um número para o somatorio? "); //calcula de 1 ate o numero informado  
        System.out.println("22 - Exponencial");
        System.out.println("24 - Calcular a porcentagem de um número");//calcula a media entre 2 numeros
        System.out.println("25 - Calcular a média entre dois números? ");
        System.out.println("26 - Potencia");
        System.out.println("27 - Raiz cubica de um numero");
        System.out.println("28 - Raiz quadrada de um numero");
        System.out.println("33 - Ordenar numero aleatório");
        System.out.println("38 - Multiplicar");
        System.out.println("44 - Calcular Fibonacci");
        System.out.println("55 - numero aleatório");
    }
}

