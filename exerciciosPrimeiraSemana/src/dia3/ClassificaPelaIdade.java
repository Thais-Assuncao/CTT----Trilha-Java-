package dia3;
import java.util.Scanner;

public class ClassificaPelaIdade {
    public static void main(String args[])
    {
        System.out.println("Digite a idade do nadador: ");
        Scanner in = new Scanner(System.in);

        int idade = in.nextInt();

    if (idade >= 5 && idade <= 7){
	    System.out.println("Categoria: Intantil A");
    }
    else if (idade >= 8 && idade <= 11) {
        System.out.println("Categoria: Intantil B");
    }
    else if (idade >= 12 && idade <= 13){
        System.out.println("Categoria: Juvenil A");
    }
    else if (idade >= 14 && idade <= 17){
        System.out.println("Categoria: Juvenil B");
    }
	else if (idade >= 18) {
	    System.out.println("Categoria: Adulto");
	}
	else {	
        System.out.println("Idade inválida");
        
    }
    
    in.close();
    }
}
