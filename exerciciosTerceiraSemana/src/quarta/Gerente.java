package quarta;

public class Gerente extends Funcionario {
	 public Gerente(String nome, String matricula, double salario) {
	        super(nome, matricula, salario);


	    }

	    @Override

	    public void calculaSalario() {
	        this.salario = this.salario * 2;
	        System.out.println("Slario do Gerente é: " + this.salario);
	    }



}
