package dia3;
import java.util.Scanner;

public class MaiorMenorMedia {
    public static void main(String[] args) {


        // 4. Construa um algoritmo que leia 10 valores inteiros e positivos e:

        // Encontre o maior valor
        // Encontre o menor valor
        // Calcule a média dos números lidos

        Scanner in = new Scanner(System.in);

        int somaDosValores = 0;

        int menorValor = Integer.MAX_VALUE;
        int maiorValor = Integer.MIN_VALUE;


      for (int i = 1; i <= 10; i++){
          System.out.printf("Informe o %d num: ",  i);
          int valor = in.nextInt();

          if (valor > maiorValor) {
            maiorValor = valor;
          }

          if (valor < menorValor) {
            menorValor = valor;
          }

          somaDosValores += valor;

          
        } 
      
        System.out.println("O maior valor digitado foi: " + maiorValor);
        System.out.println("O menor valor digitado foi: " + menorValor);
        System.out.print("A média dos valores é: " + somaDosValores / 10.0);
    
        in.close();
        
    }
    
}
