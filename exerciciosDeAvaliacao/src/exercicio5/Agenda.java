package exercicio5;

import java.util.ArrayList;

public class Agenda {
	
	private String nomeAgenda;
	private ArrayList<Contato> contatos;
	
	public Agenda() {
		this.contatos = new ArrayList<Contato>();
	}
	
	public String getNomeAgenda() {
		return nomeAgenda;
	}
	public void setNomeAgenda(String nomeAgenda) {
		this.nomeAgenda = nomeAgenda;
	}
	public ArrayList<Contato> getContatos() {
		return contatos;
	}
	public void setContatos(Contato contatos) {
		this.contatos.add(contatos);
	}


	
	
		
}
