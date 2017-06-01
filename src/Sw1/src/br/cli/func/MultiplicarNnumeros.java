/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.cli.func;

/**
 *
 * @author Desocupado
 */
public class MultiplicarNnumeros {
    public void multplicannumeros (){
        int a = 1; 
        int b = 1;
        int z = a * b;
        int option = 1;
        
        
        while(option !=0){
            System.out.println("Digite um numero ou 0 para sair");
            option = new java.util.Scanner(System.in).nextInt();
            if(option != 0){
                z = z * option;
                
            }
    
        }
        
        System.out.println("Resultado: " + z);
    }
}