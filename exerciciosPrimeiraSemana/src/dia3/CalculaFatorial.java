package dia3;

import java.util.Scanner;

public class CalculaFatorial {
		public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        System.out.println("Digite o número que você deseja saber o fatorial");
        double numeroEscolhido = in.nextDouble();
        double  resultado = 1;

        while (numeroEscolhido > 1) {
          resultado = resultado * numeroEscolhido;
          numeroEscolhido--;
        }

        System.out.println(resultado);
        
        in.close();
      }
  }

