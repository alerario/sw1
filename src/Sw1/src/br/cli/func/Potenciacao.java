/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.cli.func;


public class Potenciacao {
    public static int potencia(int base, int pot){

        int res = 1;
        
              
        do{
            res = res * base;
            pot--;    
        }while(pot > 0);
        return res;
    }
}
