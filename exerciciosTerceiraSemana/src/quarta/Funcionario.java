package quarta;

public  abstract class Funcionario {
	public String nome;
    public String matricula;
    public double salario;


    public abstract void  calculaSalario();


    public Funcionario(String nome, String matricula, double salario) {
        super();
        this.nome = nome;
        this.matricula = matricula;
        this.salario = salario;


    }
}
