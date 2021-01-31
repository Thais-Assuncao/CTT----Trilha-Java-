package exercicio5;

public class Teste {

	public static void main(String[] args) {
		
		Contato contato1 = new Contato("Eduardo", "99999-9999", "eduardo@email.com");
		Contato contato2 = new Contato("Thais", "99999-9999", "thais@email.com");
		Contato contato3 = new Contato("Rosangela", "99999-9999", "rosangela@email.com");

		Agenda agenda = new Agenda();

		agenda.setNomeAgenda("Teste");
		agenda.setContatos(contato1);
		agenda.setContatos(contato2);
		agenda.setContatos(contato3);
				
		System.out.println("Nome Agenda: " +agenda.getNomeAgenda() +" - Lista de Contatos : " +agenda.getContatos());
		
		Contato contato4 = new Contato("Vicente", "99999-9999", "rosangela@email.com");
		agenda.setContatos(contato4);
		
		System.out.println("Nome Agenda: " +agenda.getNomeAgenda() +" - Lista de Contatos : " +agenda.getContatos());
	}
}
