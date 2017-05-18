/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.cli.func;
/**
 *
 * @author lucasjcs
 */
public class CalculaFibonacci {
    public int fib(int n){
        int fib;
        if(n < 2){
            return n;
        }
        else{
            return fib = fib(n-1) + fib(n-2);   
        }
        
    }
}
