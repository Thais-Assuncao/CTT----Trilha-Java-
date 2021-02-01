package polimorfismo;

public class DVD extends Produto implements CalculaPreco{


	public DVD(String nome, String codigoBarras, double valorUnitario) {
		super(nome, codigoBarras, valorUnitario);
	}

	@Override
	public void calculaTotalVendas() {
	 System.out.println("Valor total da venda: " + (this.getValorUnitario()*this.getQuantidadeVendas()) +100);
	
	}

}
