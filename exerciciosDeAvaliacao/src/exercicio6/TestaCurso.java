package exercicio6;

public class TestaCurso {

	public static void main(String[] args) {
		
		Professor thais = new Professor("Thaís Assunção", "Matemática", "thais@gmail.com");
		
		Aluno manoel = new Aluno("Manoel Biscoitinho", "12345/6", 5, 7, 8, 4);
		Aluno marina = new Aluno("Marina Saori", "1237874/6", 8, 8, 8, 9);
		
		manoel.calculaMedia();
		
		manoel.situacaoAluno();
		
		marina.situacaoAluno();

		Curso matematica = new Curso("Matemática Básica", "8h20", thais);
		
		matematica.setAlunos(manoel);
		
		matematica.setAlunos(marina);
		
		matematica.mediaFinal();
				
		System.out.println(matematica);
	
	}
}
