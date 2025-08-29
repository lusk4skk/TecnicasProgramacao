package atv_em_sala;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int opc;
		boolean program = true;
		Carro meuCarro = new Carro();
		
		meuCarro.marca = "Renault";
		meuCarro.modelo = "Kwid";
		meuCarro.ano = 2025;
		
		System.out.println("O ano do meu carro é: " + meuCarro.ano);
		System.out.println("A marca do meu carro é: " + meuCarro.marca);
		System.out.println("O modelo do meu carro é: " + meuCarro.modelo);
		System.out.println("");
		System.out.println("Escolha o que fazer: \n1. Ligar\n2. Desligar\n3. Acelerar\n0. Fechar programa\n");
		
		while (program) {
			opc = scan.nextInt();
			
			switch (opc) {
				case 1: 
					meuCarro.ligar();
					break;
					
				case 2:
					meuCarro.desligar();
					break;
	
				case 3:
					meuCarro.acelerar();
					break;
					
				case 0:
					program = false;
					break;
			}
		}
			
		scan.close();
	}

}
