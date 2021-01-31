package exercicio6;

public class Professor {
	
	private String nome;
	private String departamento;
	private String email;
	
	
	public Professor(String nome, String departamento, String email) {
		
		this.nome = nome;
		this.departamento = departamento;
		this.email = email;
		
		System.out.println(("Olá, eu sou o prof ") + this.nome + (" e trabalho no departamento ") + this.departamento + 
				(" se precisar falar comigo meu email é o " + this.email));
	}


	public String getNome() {
		return nome;
	}


	public void setNome(String nome) {
		this.nome = nome;
	}


	public String getDepartamento() {
		return departamento;
	}


	public void setDepartamento(String departamento) {
		this.departamento = departamento;
	}


	public String getEmail() {
		return email;
	}


	public void setEmail(String email) {
		this.email = email;
	}

	
}
