package br.cli.gui;

/**
 *
 * @author Fabricio Oliveira
 */
public class GuiMultiplicarMuitosNumeros {
  
    
    public void getGUI(){

        int x = 1;
        int continuar = 0;
        int result;
        System.out.println("============================");

        while(true){ 
        	System.out.print("Digite um numero para ser multiplicado:");
        	x = new java.util.Scanner(System.in).nextInt() * x;

        	System.out.println("Quer o resultado? (1)\nOu mais números?(0)");
        	continuar = new java.util.Scanner(System.in).nextInt();

        	if(continuar != 0){
                    break;
        	}
    	}
        
        System.out.println("Resultado: "+x);
        System.out.println("============================\n\n");


    }
}
