package dia3;
import java.util.Scanner;

public class ImparOuPar {
    public static void main(String args[])
    {
        System.out.println("Digite um número");
        Scanner numero = new Scanner(System.in);
        int numeroEscolhido = numero.nextInt();

	if (numeroEscolhido%2 == 0) {
	System.out.println("O número escolhido é par");
	}
        else {
	System.out.println("O número escolhido é ímpar");
	}
        
	numero.close();
    }
}
