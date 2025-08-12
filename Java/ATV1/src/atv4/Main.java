package atv4;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		int num;
		Scanner scan = new Scanner(System.in);
		System.out.println("Digite um número");
		num = scan.nextInt();
		
		for(int i = 1; i < 11; i++) {
			System.out.println(num+ " x " +i+ " = "+ (num*i));
		}
		
		scan.close();
	}

}
