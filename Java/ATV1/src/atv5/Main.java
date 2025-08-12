package atv5;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int num;
		
		System.out.println("Digite um valor: ");
		num = scan.nextInt();
		
		if (num % 3 == 0) {
			System.out.println("O número é ímpar");
		} else if (num % 2 == 0) {
			System.out.println("O número é par");
		}
		
		scan.close();

	}

}
