package quarta;

public class Vaga {
	// Atributos
	int identificador;
	boolean ocupada;
	double area;
	String setor;	
	String tipo;
		
	Placa placa;	
		
		
	// M
	//Metodo Construtor
		
	Vaga(String setor, int identificador) {
			
		this.setor = setor;
			
		this.identificador = identificador;
			
		System.out.println("Oi Estou criando um vaga no setor " + setor + " com ID " + identificador);
		}
		// Metodos
		boolean estaOcupada() {
			return ocupada;
		}
		void ocupar(Placa placa) {
			this.placa = placa;
			this.ocupada = true;
		}
		void darBiscoito() {
			System.out.println("Toma um biscoito");
		}
}
