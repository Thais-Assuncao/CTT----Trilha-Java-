package seg;

import java.util.Scanner;

public class Forca {
	public static void main(String[] args) {

		String palavraSecreta = "banana";

		System.out.println("Vamos jogar Forca? Você terá 10 chances");
		System.out.println("Digite sua primeira tentativa: ");
		Scanner in = new Scanner(System.in);
		String letraEscolhida = in.next();

		int chances = 10;
		String[] tentativas = new String[10];

		for (int i = 1; i <= chances; i++) {

			if (i > 1) {
				letraEscolhida = in.next();
			}

			// tentativas[i] = in.nextLine();

			if (palavraSecreta.contains(letraEscolhida)) {

				if (i == chances) {
					System.out.printf("\n Você acertou!, Suas tentativa acabaram");
				} else {
					System.out.println("\n Você acertou! Digite outra letra: ");
					System.out.printf("Tentativa número %d: ", i + 1);
				}

			} else {
				if (i == chances) {
					System.out.printf("\n Você errou!, Suas tentativa acabaram");
				} else {
					System.out.println("\n Você errou! Digite outra letra: ");
					System.out.printf("Tentativa número %d: ", i + 1);
				}

			}

		}
		in.close();
	}
}
