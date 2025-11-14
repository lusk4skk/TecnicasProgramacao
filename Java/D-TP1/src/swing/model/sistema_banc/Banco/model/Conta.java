package swing.model.sistema_banc.Banco.model;

public class Conta {
	
	private String numConta;
	private String nome;
	protected double saldo;
	
	public Conta(String numConta, String nome, double saldoInicial) {
		this.numConta = numConta;
		this.nome = nome;
		this.saldo = saldoInicial;
	}

	public String getNumConta() {
		return numConta;
	}

	public void setNumConta(String numConta) {
		this.numConta = numConta;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public double getSaldo() {
		return saldo;
	}

	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}
	
	//MÉTODO 1
	public boolean Sacar(double valor){
		return false;
	}
	
	//MÉTODO 2
	public void Depositar(double valor) {
		if (valor > 0) {
			saldo += valor;
			System.out.print("Depósito realizado com sucesso.");
		}
	}
			
	//MÉTODO 3
	public boolean Transferir(Conta destino, double valor){
			if(this.Sacar(valor)) {
				destino.Depositar(valor);
				return true;
			}
			return false;
		}
	
	
	
}
