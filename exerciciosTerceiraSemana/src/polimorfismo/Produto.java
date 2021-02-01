package polimorfismo;

public class Produto implements CalculaPreco {

	private String nome;
	private String codigoBarras;
	private double valorUnitario;
	private int quantidadeVendas = 0;
	
	public Produto(String nome, String codigoBarras, double valorUnitario) {
		this.nome = nome;
		this.codigoBarras = codigoBarras;
		this.valorUnitario = valorUnitario;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getCodigoBarras() {
		return codigoBarras;
	}

	public void setCodigoBarras(String codigoBarras) {
		this.codigoBarras = codigoBarras;
	}

	public double getValorUnitario() {
		return valorUnitario;
	}

	public void setValorUnitario(double valorUnitario) {
		this.valorUnitario = valorUnitario;
	}

	public int getQuantidadeVendas() {
		return quantidadeVendas;
	}

	public void setQuantidadeVendas(int quantidadeVendas) {
		this.quantidadeVendas = quantidadeVendas;
	}

	@Override
	public void calculaTotalVendas() {
			
	}
	
	
	
	
}
