package atv10;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String senha = "Lcs123";
		String tentativa;
		
		boolean unlock = false;
		while (unlock == false) {
			System.out.println("Insira a senha: ");
			tentativa = scan.next();
			
			if (tentativa.equals(senha)) {
				unlock = true;
				System.out.println("Senha correta!");
			} else {
				System.out.println("Tente novamente!");
			}
		}
		
		scan.close();

	}

}
