/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.cli.func;

/**
 *
 * @author Vitor
 */
public class Subtração {
    public int Subtração(int b, int d){
        int x = b - d;
        int option = 1;
        int a = x;
        
        while(option !=0){
            System.out.print("Digite outro numero ou 0 para sair");
            option = new java.util.Scanner(System.in).nextInt();
            if(option != 0){
                a = x - option;
                
            }
    
        }
        
        return a;
    }
    
}
