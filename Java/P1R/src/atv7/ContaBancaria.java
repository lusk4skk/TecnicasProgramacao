package atv7;
import java.util.Scanner;

public class ContaBancaria {
	Scanner sc = new Scanner(System.in);
	
	private String titular;
	private int numeroConta;
	private double saldo;
	
	// GETTERs
	public void getTitular() {
		System.out.println(this.titular);
	}
	
	public void getNumeroConta() {
		System.out.println(this.numeroConta);
	}
	
	public void getSaldo() {
		System.out.println(this.saldo);
	}
	
	// SETTERs
	public void setTitular() {
		titular = sc.next();
	}
	public void setNumeroConta() {
		numeroConta = sc.nextInt();
	}
	public void setSaldo() {
		saldo = sc.nextDouble();
	}
	
	
	
}
