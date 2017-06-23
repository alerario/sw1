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
        int k = a - b;
		int x = k;
		int ini1 = 1;
		int ini0 = 0;
        int option = ini1;
		
        int z = x;
		
        int aux = ini0;
		
        while(option !=0){
            System.out.print("Digite outro numero ou 0 para sair");
            option = new java.util.Scanner(System.in).nextInt();
            if(option != 0){
				aux = x - option;
				z = aux;
                
            }
    
        }
        
        return z;
    }
}
