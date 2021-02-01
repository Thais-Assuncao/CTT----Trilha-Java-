package quinta;

/**Crie uma classe Agenda que pode armazenar 10 pessoas e que seja capaz de realizar as seguintes operações:
void armazenaPessoa(String nome, int idade, float altura);
void removePessoa(String nome);
int buscaPessoa(String nome); // informa em que posição da agenda está a pessoa
void imprimeAgenda(); // imprime os dados de todas as pessoas da agenda
void imprimePessoa(int index); // imprime os dados da pessoa que está na posição “i” da agenda.**/
	
	
public class Agenda {

	Pessoa[] pessoas;
	
	Agenda(){
		this.pessoas = new Pessoa[10];
	}
	
	void armazenaPessoa(Pessoa pessoa) {
		for( int indiceAgenda = 0; indiceAgenda < pessoas.length; indiceAgenda++) {
			 if(this.pessoas[indiceAgenda] == null) {
				 this.pessoas[indiceAgenda] = pessoa;
				 break;
			 }
		}
		
	}
	void removePessoa(Pessoa pessoa) {
		
	}
	int buscaPessoa(Pessoa pessoa) {
		return 0;
	}
	void imprimeAgenda(Pessoa pessoa){
		for (int indiceAgenda = 0; indiceAgenda < pessoas.length; indiceAgenda++) {
			System.out.println(this.pessoas);			
		}
	}
	void imprimePessoa(Pessoa pessoa) {
		
	}
}
