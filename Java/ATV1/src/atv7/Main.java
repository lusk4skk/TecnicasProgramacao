package atv7;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int idd;
		
		System.out.println("Qual a sua idade? ");
		idd = scan.nextInt();
		
		if (idd < 18 && idd > 0) {
			System.out.println("Você é menor de idade");
		} else if (idd > 18 && idd < 60) {
			System.out.println("Você é maior de idade");
		} else if (idd > 60 && idd < 100) {
			System.out.println("Você é idoso(a)");
		} else {
			System.out.println("Como caralhos você 'tá vivo?!");
		}
		
		scan.close();
	}

}
