package exercicio13;

import java.util.Scanner;

public class QtdDiasMes {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
        System.out.println("Digite o número do mês que você deseja saber a quantidade de dias: ");
        int mes = scanner.nextInt();
        System.out.println("Digite o ano que o mês escolhido pertence");
	    int ano = scanner.nextInt();
	
	    
	    switch (mes){
	        case 1:
	            System.out.println("O mês escolhido possui 31 dias.");
	            break;
	       case 2:
	    	   	if(ano %4 == 0) {
	    	   		System.out.println("Como o ano escolhido é bissexto, fevereiro tem/teve/terá 29 dias ");
	    	   	} else {
	    	   		System.out.println("O mês escolhido tem 28 dias");
	    	   	}           
	           break;
	       case 3:
	           System.out.println("O mês escolhido possui 31 dias.");
	           break;
	       case 4:
	           System.out.println("O mês escolhido possui 30 dias.");
	           break;
	       case 5:
	           System.out.println("O mês escolhido possui 31 dias.");
	           break;
	       case 6:
	           System.out.println("O mês escolhido possui 30 dias.");
	           break;
	       case 7:
	            System.out.println("O mês escolhido possui 31 dias.");
	            break;
	       case 8:
	           	System.out.println("O mês escolhido possui 31 dias.");
	           	break;
	       case 9:
	           	System.out.println("O mês escolhido possui 30 dias.");
	           	break;
	       
	       case 10:
	           	System.out.println("O mês escolhido possui 31 dias.");
	           	break;
	       case 11:
	           System.out.println("O mês escolhido possui 30 dias.");
	           break;
	       case 12:
	           System.out.println("O mês escolhido possui 31 dias.");
	       default:
	           System.out.println("Error");
	           
        scanner.close(); 
	    	} 
	}
}
