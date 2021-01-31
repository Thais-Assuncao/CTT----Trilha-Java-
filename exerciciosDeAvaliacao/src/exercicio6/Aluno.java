package exercicio6;

public class Aluno {

	private String nome;
	private String matricula;
	private int nota1;
	private int nota2;
	private int nota3;
	private int nota4;
	
	
	public Aluno(String nome, String matricula, int nota1, int nota2, int nota3, int nota4) {

		this.nome = nome;
		this.matricula = matricula;
		this.nota1 = nota1;
		this.nota2 = nota2;
		this.nota3 = nota3;
		this.nota4 = nota4;
	}
	
	public float calculaMedia() {
		return (this.nota1 + this.nota2 + this.nota3 + this.nota4)/4;
		
	}
	
	public void situacaoAluno() {
		if (this.calculaMedia() >=7) {
			System.out.println("O aluno " + this.nome + " teve uma média igual a " + this.calculaMedia() + " e está APROVADO");
		} else {
			System.out.println("O aluno " + this.nome + " teve uma média igual a " + this.calculaMedia() + " e está REPROVADO");
		}
	
	}
	
	@Override
	public String toString() {
	return  this.nome;
		
	}
			
}
