package quarta;

import java.time.LocalDate;

public class Pessoa {

	String nome;
	String dataNascimento;
	double altura;
	
	Pessoa (String nome, String dataNascimento, double altura) {
		this.nome = nome;
		this.dataNascimento = dataNascimento;
		this.altura = altura;
	}
	
	int calculaIdade() {
		String[] dataNascimentoCortada = dataNascimento.split("/");
		int anoNascimento = Integer.parseInt(dataNascimentoCortada[2]);
		int anoAtual = LocalDate.now().getYear();
		int idade = anoAtual - anoNascimento;
		return idade;
				
	}
	void imprimeDados(){
		System.out.println("Nome: " + this.nome + "\nAtura: " + this.altura + "\nData de Nascimento: " + this.dataNascimento +
				"\nIdade: " + this.calculaIdade() );
	}
	

}
