package dia2;

import java.util.Scanner;
public class CalculaAreaRetangulo {
	public static void main(String args[])
    {
        System.out.println("Digite o valor da base do retângulo: ");
        Scanner base = new Scanner(System.in);
        double valorBase = base.nextDouble();
        
        System.out.println("Digite o valor da altura do retângulo: ");
        Scanner altura = new Scanner(System.in);
        double valorAltura = altura.nextDouble();
        
        double area = valorBase*valorAltura; 
        System.out.println("A área desse retângulo é " + area); 
        
        base.close();
        altura.close();
    }
}
