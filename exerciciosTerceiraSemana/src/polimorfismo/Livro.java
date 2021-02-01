package polimorfismo;

public class Livro extends Produto implements CalculaPreco {

	public Livro(String nome, String codigoBarras, double valorUnitario) {
		super(nome, codigoBarras, valorUnitario);
	}

	@Override
	public void calculaTotalVendas() {
		System.out.println("Valor total da venda: " + (this.getValorUnitario()-50)*this.getQuantidadeVendas());
	}

}
