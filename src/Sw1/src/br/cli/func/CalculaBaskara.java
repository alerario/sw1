/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.cli.func;

/**
 *
 * @author onix
 */
public class CalculaBaskara {
    
    int delta, b, a,c;
    
    public int calculaBaskara(int a, int b, int c){
        delta = b^2 - 4*a*c;
        
        return delta;

                
    }
     
}
