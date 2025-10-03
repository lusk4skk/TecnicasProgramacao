package atv7;

public class Main {
	
	public static void main(String[] args) {
		ContaBancaria cb = new ContaBancaria();
		
		cb.setTitular();
		cb.setNumeroConta();
		cb.setSaldo();
		
		cb.getTitular();
		cb.getNumeroConta();
		cb.getSaldo();
		
	}

}
