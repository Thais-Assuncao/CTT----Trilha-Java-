package exercicio11;

import java.util.Scanner;

public class InverteString {
	
	public static void main(String[] args) {
		
			Scanner in = new Scanner(System.in);
			
			System.out.println("Digite a string que deseja inverter: ");
			String paraInverter = in.nextLine();
			
			String invertido = "";
			
			for (int i = paraInverter.length()-1; i >= 0; i--) {
				
				invertido = invertido + paraInverter.charAt(i);
				
			}
			System.out.println(invertido);
			
			in.close();
				
	}
}
