package atv_em_sala;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int opc;
		boolean program = true;
		Carro meuCarro = new Carro();
		
		meuCarro.cor = "Rosa";
		meuCarro.modelo = "Renault Kwid";
		meuCarro.tanque = 10;
		
		System.out.println("O modelo do meu carro é: " + meuCarro.modelo);
		System.out.println("A cor do meu carro é: " + meuCarro.cor);
		System.out.println("A capacidade do tanque do meu carro é: " + meuCarro.tanque);
		System.out.println("");
		System.out.println("Escolha o que fazer: \n"
				  		 + "1. Ligar\n"
						 + "2. Desligar\n"
						 + "3. Acelerar\n"
						 + "4. Frear\n"
						 + "5. Buzinar.\n"
						 + "0. Fechar programa\n");
		
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
					
				case 4:
					meuCarro.frear();
					break;
					
				case 5:
					meuCarro.buzinar();
					break;
					
				case 0:
					program = false;
					break;
			}
		}
			
		scan.close();
	}

}
