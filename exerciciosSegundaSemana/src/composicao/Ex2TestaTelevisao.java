package composicao;

public class Ex2TestaTelevisao {

	public static void main(String[] args) {
		
		Televisao samsung = new Televisao();
		Televisao lg = new Televisao();
		
		ControleRemoto controle = new ControleRemoto();
		
		controle.setTelevisao(samsung);
		
		controle.getTelevisao().aumentarVolume();
		controle.getTelevisao().aumentarVolume();
		
		controle.getTelevisao().aumentarCanal();
		controle.getTelevisao().aumentarCanal();
	
		System.out.println("O volume da TV samsung é: " +  controle.getTelevisao().getVolume());
		System.out.println("O canal da TV samsung é: " + controle.getTelevisao().getCanal());
		
		samsung.diminuirVolume();
		samsung.aumentarCanal();
		
		System.out.println("O volume da TV samsung é: " +  controle.getTelevisao().getVolume());
		System.out.println("O canal da TV samsung é: " + controle.getTelevisao().getCanal());
		
		controle.setTelevisao(lg);
		controle.getTelevisao().aumentarVolume();
		controle.getTelevisao().aumentarVolume();
		controle.getTelevisao().aumentarVolume();
		controle.getTelevisao().aumentarVolume();
		controle.getTelevisao().aumentarCanal();
		controle.getTelevisao().aumentarCanal();
		controle.getTelevisao().aumentarCanal();
		controle.getTelevisao().aumentarCanal();
		controle.getTelevisao().aumentarCanal();
		controle.getTelevisao().aumentarCanal();
		
		System.out.println("O volume da TV lg é: " +  controle.getTelevisao().getVolume());
		System.out.println("O canal da TV lg é: " + controle.getTelevisao().getCanal());		
		
		
	}
}
