package exercicio8;

import java.util.Scanner;

public class TesteException2 {

	public static void main(String[] args) {
		
		Scanner teclado = new Scanner(System.in);
		
		System.out.println("Eu sei dividir");
		
		System.out.println("'Informe o primeiro valor ");
		int x = teclado.nextInt();
		
		System.out.println("Informe o segundo valor: ");
		int y = teclado.nextInt();
		
		double a;
		double b;
		
		if (x < y) {
			a = x;
			b = y;
			double r = a/b;
			System.out.println("O resultado da divisão é: " + r );
			
		} else {
			try {		
				double r = (x/y);
				System.out.println("O resultado da divisão é: " + r );
			} catch(ArithmeticException e) {
				System.out.println("Não podemos fazer uma divisão por zero.");
				System.out.println("Escolha outro número: ");
				int z = teclado.nextInt();
				double r = (x/z);
				System.out.println("O resultado da divisão é: " + r );
			}
		}
				
		teclado.close();
	}
}
