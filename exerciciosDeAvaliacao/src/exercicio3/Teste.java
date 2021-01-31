package exercicio3;

public class Teste {

	public static void main(String[] args) {
		
		Universidade instituto = new Universidade("Instituto Federal");
		
		Pessoa thais = new Pessoa("Thaís", instituto, "02/02/2011");
		
		thais.retornaDados(thais);
		
		
	}
}
