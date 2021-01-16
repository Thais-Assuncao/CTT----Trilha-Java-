package dia3;

import java.util.Scanner;

public class Jokempo {
	  public static void main(String args[]) { 
	      
		    Scanner in = new Scanner(System.in);
		    
		    System.out.println("Vamos jogar Jokempô? Escolha:"); 
		    System.out.println("Pe para pedra");
		    System.out.println("Pa para papel");
		    System.out.println("T para tesoura");

		    System.out.println("Primeiro jogador: ");
		    String primeiro = in.nextLine();
		    
		    System.out.println("Segundo jogador: ");
		    String segundo = in.nextLine();


		    switch (primeiro) {
			case "pe":
				switch (segundo) {
					case "pe": 
					System.out.println("Empate");
					break;

					case "pa":
					System.out.println("Segundo jogador é o vencedor!");
					break;

					case "t":
					System.out.println("Primeiro jogador é o vencedor!");
					break;

					default: 
				        System.out.println ("Opção inválida");
					}
		            break;
			case "pa":
				switch (segundo) {
					case "pe": 
					System.out.println("Primeiro jogador é o vencedor!");
					break;

					case "pa":
					System.out.println("Empate");
					break;

					case "t":
					System.out.println("Segundo jogador é o vencedor!");
					break;

					default: 
				        System.out.println ("Opção inválida");
					}
					break;
			case "t":
				switch (segundo) {
					case "pe": 
					System.out.println("Segundo jogador é o vencedor!");
					break;

					case "pa":
					System.out.println("Primeiro jogador é o vencedor!");
					break;

					case "t":
					System.out.println("Empate");
					break;

					default: 
				        System.out.println ("Opção inválida");
					}
					break;
			default: 
		        System.out.println ("Opção inválida");
		        break;
			}
			


		    in.close();
		   }
}
