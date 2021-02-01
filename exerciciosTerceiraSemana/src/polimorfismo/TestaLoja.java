package polimorfismo;

public class TestaLoja {

	public static void main(String[] args) {
		
		Loja loja = new Loja();
		
		Produto cd = new CD("Biscoitinho", "BWB123", 20.0);
		Produto dvd = new DVD("Vingadores", "ASD145", 35.0);
		Produto livro = new Livro("A gata do Dalai Lama", "ERD569", 120.0);
		
		loja.calculaVendasTotaisProdutos(cd);
	}
}
