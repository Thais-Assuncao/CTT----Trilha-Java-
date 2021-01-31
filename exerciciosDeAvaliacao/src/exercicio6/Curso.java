package exercicio6;

import java.util.ArrayList;

import exercicio2.Pais;


public class Curso {
	
	private String nome; 
	private String horario;
	private Professor professor; 
	private ArrayList<Aluno> alunos; 
		
	public Curso(String nome, String horario, Professor professor) {
		this.nome = nome;
		this.horario = horario;
		this.professor = professor;
		this.alunos = new ArrayList<Aluno>();
	}

	public ArrayList<Aluno> getAlunos() {
		return alunos;
	}
	
	public void setAlunos(Aluno aluno) {
		this.alunos.add(aluno);
	}
	
	public float calculaMediaTurma() {
		
		float somaDasMedias = 0;
		
		for (Aluno aluno : alunos) {
			somaDasMedias = somaDasMedias + aluno.calculaMedia();
		}
		return somaDasMedias/alunos.size();
		// System.out.println(("A média final da turm é: ") + somaDasMedias/alunos.size());
	}
	
	public void mediaFinal() {
		System.out.println("A média final da turma é: " + this.calculaMediaTurma());
	}
	@Override
	public String toString() {
	return "Lista de chamada do curso " + this.nome + " d@ prof " + this.professor.getNome() + "\n alunos: " + this.getAlunos();
		
	}

}

