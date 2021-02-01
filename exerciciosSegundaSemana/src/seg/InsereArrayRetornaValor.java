package seg;

import java.util.Scanner;

public class InsereArrayRetornaValor {

		public static void main(String[] args) {

		System.out.println("Digite a quantidade de números que deseja inserir na lista: ");
	    Scanner in = new Scanner(System.in);
	    int qtd = in.nextInt();
	    
	    int[] lista = new int[qtd];
	      
	    
	    for(int i = 0; i < lista.length ; i++) {
	    	System.out.print("Digite o número a ser inserido: ");
	    	lista[i] = in.nextInt();
	    }
	    
	    for (int i = 0 ; i < lista.length; i++) {
	    	System.out.println("Número escolhido: " + lista[i]);
	    }
	    
	    in.close();
	   
		}
}
