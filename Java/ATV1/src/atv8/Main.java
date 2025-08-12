package atv8;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n;
		int imp = 1;
		int soma = 0;
		
		System.out.println("Insira um número: ");
		n = scan.nextInt();
		int[] impares = new int[n];
		
		for (int i = 0; i < n; i++) {
			impares[i] = imp;
			imp++;
			imp++;
		}
		
		for (int i = 0; i < impares.length; i++) {
			soma += impares[i];
		}
		
		System.out.println("A soma de todos os ímpares é: " + soma);
		
		scan.close();
	}

}
