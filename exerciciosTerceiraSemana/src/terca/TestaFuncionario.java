package terca;

public class TestaFuncionario {

	public static void main(String[] args) {
		Funcionario funcionario = new Funcionario("João", 1, 1994);
		funcionario.calculaPL();
		
		funcionario.calculaPL("ABC");
		funcionario.calculaPL("DEF");
		funcionario.calculaPL("GHI");
	}
}
