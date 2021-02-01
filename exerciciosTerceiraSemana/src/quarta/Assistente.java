package quarta;

public class Assistente extends Funcionario {
	  public Assistente(String nome, String matricula, double salario) {
	        super(nome, matricula, salario);



	    }

	@Override

	    public void calculaSalario() {

	        System.out.println("Salario do Assistente é: " + this.salario);
	}


}
