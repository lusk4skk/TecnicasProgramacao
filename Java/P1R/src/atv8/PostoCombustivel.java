package atv8;

public class PostoCombustivel {

	private String[] tiposCombustivel = { "Gasolina", "Etanol", "Diesel" };
	private double[] precosLitro = { 6.0, 4.5, 4.8 };
	private int[] litrosDisponiveis = { 37, 48, 12 };

	public void listar() {
		for (int i = 0; i < tiposCombustivel.length; i++) {
			System.out.println(tiposCombustivel[i] + " | " + precosLitro[i] + "R$ | " + litrosDisponiveis[i] + "L");
		}
	}

	public void totalEstoque() {
		double soma = 0;
		for (int i = 0; i < precosLitro.length; i++) {
			soma += (precosLitro[i] * litrosDisponiveis[i]);
		}
		System.out.println(soma);
	}

	public void MaiorMenor() {
		int maior = 0;
		int mais = 0;
		int menor = 0;
		int menos = 0;

		for (int i = 0; i < litrosDisponiveis.length; i++) {
			if (mais < litrosDisponiveis[i]) {
				mais = litrosDisponiveis[i];
				maior = i;
			}

			if (menos > litrosDisponiveis[i]) {
				menos = litrosDisponiveis[i];
				menor = i;
			}
		}

		System.out.println("Maior estoque: " + tiposCombustivel[maior]);
		System.out.println("Menor estoque: " + tiposCombustivel[menor]);
	}

	public void Vender() {
		int opc = 0;
		System.out.println("Qual?");
		this.listar();

		litrosDisponiveis[opc - 1]--;
	}

	public void Reabastecer() {
		int opc = 0;
		System.out.println("Qual?");
		this.listar();

		litrosDisponiveis[opc - 1]++;
	}

}
