
package br.cli.func;

/**
 *
 * @author Paula
 */
public class MaiorMenor {
    public int maiorMenor(int num, int num2) {
        int maior = 0;
        if (num > num2){
            maior = num;
        }else{
            if (num < num2){
                maior = num2;
        }
    }
    return maior;    
    }

    public void maiorMenor() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
