package atv8;
import java.util.Scanner;

public class Main {
	private static void inicio() {
		System.out.println("\nBem-vindo(a) ao Posto de Combsutível Java!");
		System.out.println("Escolha uma opção: \n"
						 + "1. Listar Gasolinas Disponíveis\n"
						 + "2. Valor de todos os litros\n"
						 + "3. Exibir maior e menor estoque\n"
						 + "4. Abastecer carro\n"
						 + "5. Reabastecer bomba\n"
						 + "0. Encerrar programa\n");
	}
		
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		PostoCombustivel pc = new PostoCombustivel();
		inicio();
		
		int alt;
		boolean program = true;
		
		while (program) {
			alt = sc.nextInt();
			switch (alt) {
			case 1:
				pc.listar();
				break;
				
			case 2:
				pc.totalEstoque();
				break;
			
			case 3:
				pc.MaiorMenor();
				break;
			
			case 4:
				pc.Vender();
				break;
				
			case 5:
				pc.Reabastecer();
				break;

			case 0:
				program = false;
				break;
			
			default:
				System.out.println(alt + " não é uma opção válida!");
				
			}
		}
		
		sc.close();
	}
}