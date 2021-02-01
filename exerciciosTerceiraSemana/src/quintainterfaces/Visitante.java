package quintainterfaces;

public class Visitante extends Pessoa implements Autorizavel {
	
	private Morador morador;
		
	public Visitante(String nome, String email, String telefone, Morador morador) {
	super(nome, email, telefone);
	this.morador = morador;

	}

	@Override
	public boolean autoriza(int senha) {
		return senha == this.morador.getSenha() && this.morador.isPresente();
	}
	

}
