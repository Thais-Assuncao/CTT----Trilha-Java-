package dia3;
import java.util.Scanner;

public class MenorValor {
    public static void main(String args[])
    {
        System.out.println("Digite o primeiro número: ");
        Scanner primeiro = new Scanner(System.in);
        int primeiroNumero = primeiro.nextInt();
        
        System.out.println("Digite o segundo número: ");
        Scanner segundo = new Scanner(System.in);
        int segundoNumero = segundo.nextInt();

    if (primeiroNumero < segundoNumero){
        System.out.println("O número " + primeiroNumero + " é menor que o número " + segundoNumero);
    }
    else {
        System.out.println("O número " + segundoNumero + " é menor que o número " + primeiroNumero);        
    }
    primeiro.close();
    segundo.close();
    }
}
