package dia3;
import java.util.Scanner;

public class Calculadora {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        System.out.println("Digite a operação que deseja fazer (a, s, m, d)");
        String operacao = in.next();

        System.out.println("Digite o primeiro valor");
        float valor1 = in.nextFloat();

        System.out.println("Digite o segundo valor");
        float valor2 = in.nextFloat();
        
          switch(operacao) {
          case "a":
            float soma = valor1 + valor2;
            System.out.println("A soma entre os valores é: " + soma);
            break;
          
  	    case "s":
            float subtracao = valor1 - valor2;
            System.out.println("A subtração entre os valores é: " + subtracao);
            break;

  	    case "m":
            float multiplicacao = valor1 * valor2;
            System.out.println("A multiplicação entre os valores é: " + multiplicacao);
            break;
          
          case "d":
            if (valor2 == 0){
          System.out.println("O segundo valor não pode ser zero. Digite outro valor: ");
          float valorNovo = in.nextFloat();
          float divisao = valor1/valorNovo;
          System.out.println("A divisão entre os valores é: " + divisao);
      
        } else {
            float divisao = valor1 / valor2;
            System.out.println("A divisão entre os valores é: " + divisao);  
        }
        }
     in.close();
    }

}
