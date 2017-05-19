/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.cli.gui;

/**
 *
 * @author Andressa
 */
public class GuiOrdenacao {
    
    public void ordenacao() {
        System.out.println("Numeros Ordenados");
        int[] vetor = new br.cli.func.Ordenacao().ordenacao();
        for (int i = 0; i < vetor.length; i++) {
            System.out.println(vetor[i]);
        }
        
 
    }
}
