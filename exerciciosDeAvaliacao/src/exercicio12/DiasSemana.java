package exercicio12;

import java.util.Scanner;

public class DiasSemana {

	public static void main(String[] args) {
		
		System.out.println("Escolha um número de 1 a 7: ");
		Scanner numero = new Scanner(System.in);
		int dia = numero.nextInt();
		
		switch (dia) {
		
		case 1:
			System.out.println("Domingo");
			break;
		case 2:
			System.out.println("Segunda");
			break;
		case 3:
			System.out.println("Terça");
			break;
		case 4:
			System.out.println("Quarta");
			break;
		case 5:
			System.out.println("Quinta");
			break;
		case 6:
			System.out.println("Sexta");
			break;
		case 7:
			System.out.println("Sábado");
			break;
		default:
			System.out.println("Escolha inválida");
			
		}
		numero.close();		
	}

	
}
