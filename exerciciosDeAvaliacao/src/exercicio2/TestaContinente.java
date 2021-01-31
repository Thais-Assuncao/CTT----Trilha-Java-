package exercicio2;

public class TestaContinente {

	public static void main(String[] args) {
		
		Continente asia = new Continente("Ásia");
		Pais japao = new Pais("1", "Japão", 10000.00, 1.0);
		Pais coreia = new Pais("2", "Coreia", 5000.00, 1.3);
		Pais china = new Pais("3", "China", 20000.00, 2.2);
		
		asia.adiconaPais(japao);
		asia.adiconaPais(coreia);
		asia.adiconaPais(china);
		
		System.out.println("\n Dimensão total: " +asia.dimensaoTotal());
		
		System.out.println("\n Populção total: " + asia.populacaoTotal());
		
		System.out.println("\n Densidade populacional do continente: " + asia.densidadeTotal());
	
		System.out.println("\n Pais com maior dimensao: " +asia.maiorDimensao());

		System.out.println("\n Pais com menor dimensao: " +asia.menorDimensao());
		
		System.out.println("\n Pais com maior populacao: " +asia.maiorPopulacao());
		
		System.out.println("\n Pais com menor populacao: " +asia.menorPopulacao());
		
		System.out.println("\n Razao territorial: " +asia.razaoTerritorial());



	}
		
}
