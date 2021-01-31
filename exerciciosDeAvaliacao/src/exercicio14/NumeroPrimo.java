package exercicio14;

import java.util.Scanner;

public class NumeroPrimo {

	public static void main(String[] args) {
		
		System.out.println("Digite um número maior que 1: ");
		Scanner scanner = new Scanner(System.in);
		int numero = scanner.nextInt();
		
		for (int i = 2 ; i < numero ; i++) {
			
			if(numero%i == 0) {
				System.out.println("O número não é primo");
				break;
			}
			else { 
				System.out.println("O número é primo");
				break;
			}
		}
		
		scanner.close();
	}
}

