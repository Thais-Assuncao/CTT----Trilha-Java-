package dia2;
import java.util.Scanner;

public class CalculaPorcentagemEleitores {
		
	public static double calculaPercentual(double totalEleitores, double totalX) {
        
        double percentual = totalX/totalEleitores * 100;
        return percentual;
        
    }

    public static void main(String args[])
    {
        System.out.println("Digite o número total de eleitores de um município: ");
        Scanner total = new Scanner(System.in);
        double totalEleitores = total.nextDouble();
        
        System.out.println("Digite o número total de votos brancos: ");
        Scanner brancos = new Scanner(System.in);
        double totalBrancos = brancos.nextDouble();
        
        System.out.println("Digite o número total de votos nulos: ");
        Scanner nulos = new Scanner(System.in);
        double totalNulos = nulos.nextDouble();
        
        System.out.println("Digite o número total de votos válidos: ");
        Scanner validos = new Scanner(System.in);
        double totalValidos = validos.nextDouble();
        
        double percentualVotosBrancos = CalculaPorcentagemEleitores.calculaPercentual(totalEleitores, totalBrancos);
         System.out.println("O percentual de votos Brancos é " + String.format("%.2f",  percentualVotosBrancos) +"%");
         
        double percentualVotosNulos = CalculaPorcentagemEleitores.calculaPercentual(totalEleitores, totalNulos);
         System.out.println("O percentual de votos Nulos é " + String.format("%.0f",percentualVotosNulos) +"%");
         
        double percentualVotosValidos = CalculaPorcentagemEleitores.calculaPercentual(totalEleitores, totalValidos);
         System.out.println("O percentual de votos Válidos é " + String.format("%.1f", percentualVotosValidos) +"%");
                  
         total.close(); 
         brancos.close();
         nulos.close();
         validos.close();

    }
}
