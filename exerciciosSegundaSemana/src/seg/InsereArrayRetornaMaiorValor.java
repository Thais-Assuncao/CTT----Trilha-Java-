package seg;

import java.util.Scanner;

public class InsereArrayRetornaMaiorValor {
	
	public static void main(String[] args) {
		System.out.println("Digite a quantidade de números que deseja verificar: ");
		Scanner scanner = new Scanner(System.in);
		int qtd = scanner.nextInt(); 
		
		int[] numeros = new int[qtd];
		int menorValor = Integer.MAX_VALUE;
	    int maiorValor = Integer.MIN_VALUE;

        for (int i = 1 ; i <= numeros.length; i++){
        	System.out.printf("Informe o %d num: ",  i);
	        int valor = scanner.nextInt();

	        if (valor > maiorValor) {
	        	maiorValor = valor;
	          }

	        if (valor < menorValor) {
	            menorValor = valor;
	          }
        }
	      System.out.println("O maior valor digitado foi: " + maiorValor);
	      System.out.println("O menor valor digitado foi: " + menorValor);
		scanner.close();

	}
}

