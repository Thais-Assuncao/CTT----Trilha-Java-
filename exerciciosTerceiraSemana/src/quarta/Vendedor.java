package quarta;

public class Vendedor extends Funcionario {
	
	  public double comissao;

	    public Vendedor(String nome, String matricula, double salario, double comissao) {
	        super(nome, matricula, salario);
	        this.comissao = comissao;

	    }

	@Override

	    public void calculaSalario() {
	        this.salario = this.salario + comissao;
	        System.out.println("Salario do Vendedor é: " + this.salario);
	}

}
