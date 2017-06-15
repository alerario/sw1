
package br.cli.gui;

import br.cli.func.CalculaBaskara;
import java.util.Scanner;

/**
 *
 * @author onix
 */
public class GuiBaskara {
    
     public void lerBaskara(){
        Scanner input = new Scanner(System.in);
        System.out.println("Informe o valor de A: ");
        
        int a = input.nextInt();
        
        System.out.println("Informe o valor de B: ");
        int b = input.nextInt();
        
        System.out.println("Informe o valor de C: ");
        int c = input.nextInt();
        
        System.out.println("Baskara: " + new CalculaBaskara().calculaBaskara(a, b, c));
    }
    
}
