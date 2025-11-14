package swing.model.sistema_banc.Banco.view;
import swing.model.sistema_banc.Banco.model.*;

public class Main {

	public static void main(String[] args) {
		ContaCorrente c = new ContaCorrente("00001", "Gugute", 102, 10000);
		ContaPoupanca d = new ContaPoupanca("00001", "Gugute", 100000);
		
		c.Sacar(10);
		d.Sacar(10);
		
		d.Depositar(10);
		c.Transferir(d, 10);
		
	}

}
