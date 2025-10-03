package atv6;

public class Main {

	public static void main(String[] args) {
		Celular cel = new Celular();
		
		cel.marca = "Samsung";
		cel.modelo = "Galaxy S20 FE";
		cel.preco = 800.0;
		
		System.out.println(cel.marca + " " + cel.modelo + "\n" + cel.preco + "R$");

	}

}
