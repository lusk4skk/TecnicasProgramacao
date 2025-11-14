package swing.model.sistema_banc.Banco.model;

public class ContaCorrente extends Conta  {
	
	private double limite;
	
	public ContaCorrente(String numConta, String nome, double saldoInicial, double limite) {
		super(numConta, nome, saldoInicial);
		this.limite = limite;
	}
	
	public boolean Sacar(double valor) {
		if(valor <= 0) {
			return false;
		}
		
		if(saldo + limite  >= valor) {
			saldo -= valor;
			System.out.print("\nSaque realizado com sucesso.\n");
			return true;
		}
		else {
			System.out.print("\nSaldo insuficiente.\n");
			return false;
		}
	}

	
}
