package seg;

public class Estacionamento {

	public static void main(String[] args) {
		
		String[] vagas = new String[15];
		String[] clientes = new String[15];
		
		for (int indiceVagas = 0; indiceVagas < vagas.length; indiceVagas++) {
			vagas[indiceVagas] = "Vaga setor Laranja - " + (indiceVagas + 1);
			}
		
		for (int indiceClientes = 0; indiceClientes < clientes.length; indiceClientes++) {
			clientes[indiceClientes] = "Cliente - " + (indiceClientes + 1);
			}
		
		for (int indice = 0; indice < clientes.length; indice++) {
			System.out.println("O cliente" + clientes[indice] + " está na " + vagas[indice]);
			}
	}
}
