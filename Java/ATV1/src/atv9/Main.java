package atv9;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String[] nomes = new String[5];
		
		System.out.println("Insira 5 nomes: ");
		
		for (int i = 0; i < nomes.length; i++) {
			nomes[i] = scan.next();
		}
		
		System.out.println("Agora, insira um último nome: ");
		String sexto = scan.next();
		
		boolean found = false;
		for (int i = 0; i < nomes.length; i++) {
			if (sexto.equalsIgnoreCase(nomes[i])) {
				found = true;
				break;
			}
		} 
		
		if (found) {
			System.out.println("Este nome já estava na lista!");
		} else {
			System.out.println("Este nome não estava na lista!");
		}

		scan.close();

	}

}
