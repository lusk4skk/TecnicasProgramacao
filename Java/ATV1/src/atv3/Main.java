package atv3;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		int opc;
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Escolha uma opção: \n1 - Calcular área do quadrado\n2 - Calcular área do círculo");
		opc = scan.nextInt();
		switch (opc) { 
		case 1:
			double c;
			System.out.println("Digite o comprimento do quadrado: ");
			c = scan.nextDouble();
			
			double R1 = Math.pow(c, 2);
			System.out.println(R1);
			break;
		
		case 2:
			double r;
			System.out.println("Digite o raio do círculo: ");
			r = scan.nextDouble();
			
			double R2 = (3.14 * Math.pow(r, 2));
			System.out.println(R2);
			break;
		}
		
		scan.close();

	}

}
