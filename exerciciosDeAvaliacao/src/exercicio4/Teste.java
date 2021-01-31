package exercicio4;

public class Teste {
	
	public static void main(String[] args) {
		Televisao samsung = new Televisao();
		Televisao lg = new Televisao();
		
		ControleRemoto controle1 = new ControleRemoto(samsung);
			
		controle1.getTelevisao().aumentarVolume();
		controle1.getTelevisao().aumentarVolume();
		controle1.getTelevisao().aumentarVolume();
		controle1.getTelevisao().aumentarVolume();
		controle1.getTelevisao().aumentarVolume();
		controle1.getTelevisao().aumentarVolume();		
		
		controle1.getTelevisao().aumentarCanal();
		controle1.getTelevisao().aumentarCanal();
		controle1.getTelevisao().aumentarCanal();
		controle1.getTelevisao().aumentarCanal();
		controle1.getTelevisao().aumentarCanal();

		System.out.println("O volume da TV samsung é: " +  controle1.getTelevisao().getVolume());
		System.out.println("O canal da TV samsung é: " + controle1.getTelevisao().getCanal());
		
		controle1.getTelevisao().diminuirVolume();
		controle1.getTelevisao().diminuirVolume();
		
		System.out.println("O volume da TV samsung é: " +  controle1.getTelevisao().getVolume());
		System.out.println("O canal da TV samsung é: " + controle1.getTelevisao().getCanal());
		
		
	}

}
