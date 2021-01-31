package exercicio1;


public class TestaPais {

	public static void main(String[] args) {
		
		Pais pais = new Pais("BRA", "Brasil", 8514.876, 2400000.0);
		Pais pais2 = new Pais("WAK", "Wakanda", 4000.500, 400000.0);
		
		System.out.println("Informações do " + pais.getNome() );
		System.out.println("Codigo ISO: " + pais.getCodigoIso());
		System.out.println("Dimensão km2: " + pais.getDimensao());		
		System.out.println("População: " + pais.getPopulacao());
		
				
		System.out.println("Informações do " + pais2.getNome() );
		System.out.println("Codigo ISO: " + pais2.getCodigoIso());
		System.out.println("Dimensão km2: " + pais2.getDimensao());
		System.out.println("População: " + pais2.getPopulacao());
		
		System.out.println("Os paises são iguais? " + pais.ComparaPais(pais2));
		
		System.out.println("Os paises são iguais? " + pais2.ComparaPais(pais));
		
		System.out.println("Densidade populacional de "+ pais.getNome() + " é " + pais.CalculaDensidadePopulacional());
		
		System.out.println("Densidade populacional de "+ pais2.getNome() + " é " + pais2.CalculaDensidadePopulacional());		
		
	}
}
