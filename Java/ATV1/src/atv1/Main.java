package atv1;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		double num;
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Digite o valor: ");
		num = scan.nextDouble();
		
		if (num > 0) {
			System.out.println("O valor é positivo");
		} else if (num < 0) {
			System.out.println("O valor é negativo");
		} else {
			System.out.println("O valor é nulo (igual a zero)");
		}
		
		scan.close();

	}

}
