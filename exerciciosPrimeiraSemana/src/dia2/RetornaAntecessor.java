package dia2;

import java.util.Scanner;
public class RetornaAntecessor {
    public static void main(String args[])
    {
        System.out.println("Digite um número");
        Scanner in = new Scanner(System.in);
        int numeroEscolhido = in.nextInt();
        int antecessor = numeroEscolhido - 1; 
        System.out.println("O antecessor do número " + numeroEscolhido + " é o número " + antecessor); 
    
        in.close();
    }
}
