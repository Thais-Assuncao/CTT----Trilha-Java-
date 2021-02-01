package segunda;

public class TestaAnimal {

	public static void main(String[] args) {
		
		Animal cachorro = new Animal("\n Cachorro", 20f, 4, "marrom", "casa",20);
		
		cachorro.imprimeDados();
		
		Peixe peixe = new Peixe("\n Peixoto", 5, 0, "laranja", "agua", 15, "lindo");
		
		peixe.imprimeDados();
		
	}

}
