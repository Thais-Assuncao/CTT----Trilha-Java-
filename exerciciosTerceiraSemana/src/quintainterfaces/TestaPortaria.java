package quintainterfaces;

public class TestaPortaria {

	public static void main(String[] args) {
		
		Portaria portaria = new Portaria();
		
		Morador morador = new Morador("Thais", "thais@gamil.com", "12345-8989", 123, true);
		Morador moradorNaoPresente = new Morador("Rosangela", "ro@gamil.com", "12345-8449", 145, false);
		
		Visitante visitante = new Visitante("Eduardo", "dudu@gamil.com", "12345-8989", morador);
		
		//portaria.autorizaEntrada(morador);
		
		portaria.autorizaEntrada(moradorNaoPresente);
		
		portaria.autorizaEntrada(visitante);
		
	}
}