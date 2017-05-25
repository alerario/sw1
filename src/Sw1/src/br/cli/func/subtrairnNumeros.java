package br.cli.func;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author alerario
 */
public class subtrairnNumeros {
    public int subtrairnNumeros(int a, int b){
        int x = a - b;
        int option = 1;
        int z = x;
        
        while(option !=0){
            System.out.print("Digite outro numero ou 0 para sair");
            option = new java.util.Scanner(System.in).nextInt();
            if(option != 0){
                z = x - option;
                
            }
    
        }
        
        return z;
    }
}
