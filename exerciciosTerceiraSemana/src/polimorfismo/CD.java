package polimorfismo;

public class CD extends Produto implements CalculaPreco {

	public CD(String nome, String codigoBarras, double valorUnitario) {
		super(nome, codigoBarras, valorUnitario);
		
	}

	@Override
	public void calculaTotalVendas() {
		System.out.println("Valor total da venda: " + this.getValorUnitario()*this.getQuantidadeVendas());
	}

}
