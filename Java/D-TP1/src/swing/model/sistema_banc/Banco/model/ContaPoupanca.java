package swing.model.sistema_banc.Banco.model;

public class ContaPoupanca extends Conta {

	public ContaPoupanca(String numConta, String nome, double saldoInicial) {
		super(numConta, nome, saldoInicial);
	}
	
	public boolean Sacar(double valor) {
		System.out.print("\nConta poupança não permite saque direto.\n");
		return false;
	}
	
}
