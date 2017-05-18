/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.cli.func;

/**
 *
 * @author STHGM
 */
public class DistPontos {
    
    public double calcular(double xa, double xb, double ya, double yb){
        double d;
        double aux;
        aux = Math.pow((xb-xa), 2) + Math.pow((yb-ya), 2);
        d = Math.sqrt(aux);
        return d;
    }
}
