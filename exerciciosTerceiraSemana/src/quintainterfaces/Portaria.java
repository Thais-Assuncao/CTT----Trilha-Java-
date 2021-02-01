package quintainterfaces;

import java.util.Scanner;

public class Portaria {

	public void autorizaEntrada(Autorizavel autorizavel) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Bem vindo ao nosso prédio!: " );
		System.out.print("Digite sua senha: " );
		int senha = scanner.nextInt();
		
		boolean autorizado = autorizavel.autoriza(senha);
		
		if (autorizado) {
			System.out.println("Você pode entrar.");
		} else {
			System.err.println("Você não pode entrar.");
		}
		
	}
}
