package br.cli.gui;

import br.cli.func.PositivoOuNegativo;
import java.util.Scanner;

/**
 *
 * @author luiz-
 */
public class GuiPositivoOuNegativo {
    
    public void lerPosOuNeg(){
        Scanner input = new Scanner(System.in);

        System.out.println("Informe o valor a ser avaliado: ");
        int n = input.nextInt();
        
        System.out.println("O valor sera avaliado:");
        
        new PositivoOuNegativo().positivoOuNegativo(n);
    
    }
}
