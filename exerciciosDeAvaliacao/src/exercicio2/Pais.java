package exercicio2;

public class Pais {
	private String codigoIso; 
	private String nome; 
	private double populacao; 
	private double dimensao; 
	private double densidade; 
	
	public Pais(String codigoIso, String nome, double populacao, double dimensao) {
		
		this.codigoIso = codigoIso;
		this.nome = nome;
		this.populacao = populacao;
		this.dimensao = dimensao;
	}

	public boolean ComparaPais(Pais pais) {
		if (this.codigoIso == pais.getCodigoIso()) {
			return true;
		} else {
			return false;
		}
//		return this.codigoIso == pais.getCodigoIso();
	}
	
	public double getCalculaDensidadePopulacional() {
		this.densidade = this.populacao/this.dimensao;
		return this.densidade;
	}

	public String getCodigoIso() {
		return codigoIso;
	}

	public void setCodigoIso(String codigoIso) {
		this.codigoIso = codigoIso;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public double getPopulacao() {
		return populacao;
	}

	public void setPopulacao(double populacao) {
		this.populacao = populacao;
	}

	public double getDimensao() {
		return dimensao;
	}

	public void setDimensao(double dimensao) {
		this.dimensao = dimensao;
	}

	@Override
	public String toString() {
		return "Pais [codigoIso=" + codigoIso + ", nome=" + nome + ", populacao=" + populacao + ", dimensao=" + dimensao
				+ "]";
	}
	
	
}
