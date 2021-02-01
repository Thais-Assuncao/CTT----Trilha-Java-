package seg;

import java.util.Scanner;

public class InsereArrayRetornaQtdPares {
	public static void main(String[] args) {
		
		System.out.println("Digite a quantidade de números que deseja verificar: ");
		Scanner scanner = new Scanner(System.in);
		int qtd = scanner.nextInt(); 
		
		int[] numeros = new int[qtd];
		int qtdNumerosPar = 0;
	    	    
		for (int i = 0; i < numeros.length; i++) {
			System.out.println("Digite um número: ");
			numeros[i] = scanner.nextInt();
		}
		
		for (int i = 0; i < numeros.length; i++) {
			if (numeros[i] % 2 == 0) {
				qtdNumerosPar += 1;
			}
		}
		System.out.println("Temos " + qtdNumerosPar + " números pares");
		scanner.close();
	}
}
