package modelo.model;

public class Gerente extends Colaborador implements I_Funcionario {
	private boolean caixa = false;
	
	public Gerente(String nome, int codigo) {
		super(nome, codigo);
	}
	
	@Override
	public String baterPonto() {
		return "Registro realizado!";
	}
	
	public boolean isCaixa() {
		return caixa;
	}
	
	public String fecharCaixa() {
		if(this.isCaixa() ) {
			this.caixa = false;
			return "Caixa fechado";
		} else {
			return "O caixa já está fechado!";
		}
	}
	
	public String abrirCaixa() {
		if(!this.isCaixa() ) {
			this.caixa = true;
			return "Caixa aberto";
		} else {
			return "O caixa já está aberto!";
		}
	}
}
